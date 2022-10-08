/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import modelo.AFD;

/**
 *
 * @author carlo
 */
public class MaquinaDeEstados
{

    Integer[] estados, estadosFinales;
    int estadoActual;
    boolean bmapa, bpolinomio;
    AFD automata;

    public MaquinaDeEstados()
    {
        bmapa = false;
        bpolinomio = false;
        estadoActual = 0;
        automata = new AFD();

    }

    public void guardarFicheroCadena(Set<String> cadena) throws IOException
    {
        FileWriter f = new FileWriter("log.txt");
        PrintWriter pw = new PrintWriter(f);
        for (String s : cadena)
        {
            System.out.println(s);
            pw.println(s);
        }
        pw.flush();
        pw.close();
        f.close();
    }

    public Set<String> generarCadena(Integer contador, Integer nivel, Set<String> cadenas, String letras) throws Exception
    {

        ///falta conectarlo a  la máquina 
        Map<String, Integer> mapa = (Map<String, Integer>) automata.getMatriz().get(nivel);
        String letrasnivel = letras;
        for (int i = 0; i < automata.getAlfabeto().size(); i++)
        {
            letras = letrasnivel;
            String letra = automata.getAlfabeto().get(i);
            mapa = (Map<String, Integer>) automata.getMatriz().get(nivel);
            int estadosig = mapa.get(letra);

            if (automata.esFinal(estadosig))
            {
                if (contador == 10)
                {
                    letras += letra;
                    if (evaluarExpresion(letras))
                    {
                        cadenas.add(letras);
                    }
                    break;

                } else
                {

                    letras += letra;
                    //if (evaluarExpresion(letras))
                    // {
                    cadenas.add(letras);
                    generarCadena(contador + 1, estadosig, cadenas, letras);
                    //}

                }
            } else
            {
                if (contador == 10)
                {
                    break;
                } else
                {
                    if (estadosig != automata.getEstadoError())
                    {

                        letras += letra;
                        generarCadena(contador + 1, estadosig, cadenas, letras);
                    }
                }
            }

        }
        return cadenas;
    }

    public boolean evaluarExpresion(String cadena) throws Exception
    {

        boolean resultado = false;
        String letra;
        HashMap<Integer, HashMap<String, Integer>> matriz = automata.getMatriz();
        HashMap<String, Integer> mapa;
        estadoActual = automata.getEstadoInicial();
        for (int i = 0; i < cadena.length(); i++)
        {
            letra = cadena.charAt(i) + "";
            if (automata.getAlfabeto().contains(letra))
            {
                mapa = matriz.get(estadoActual);
                estadoActual = mapa.get(letra);
                //System.out.println("la letra es " + letra);
                if (estadoActual == automata.getEstadoError())
                {
                    break;
                }

            } else
            {
                estadoActual = automata.getEstadoError();
                break;
            }

        }
        resultado = automata.esFinal(estadoActual);

        return resultado;

    }

}
