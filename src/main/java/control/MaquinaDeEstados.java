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

    /* public String generarCadenaR(Integer contador, Integer nivel, AFD auto, Set<String> cadenas)
    {
        Map<String, Integer> mapa = (Map<String, Integer>) auto.getMatriz().get(nivel);
        String letras="";
        for (int i = 0; i < auto.getAlfabeto().size(); i++)
        {

            String letra = auto.getAlfabeto().get(i);
            int estadosig = mapa.get(letra);
            if (auto.getEstadoInicial() == nivel)
            {
                letras = "";
            }
            if (auto.esFinal(nivel))
            {
                if (contador == 10)
                {
                    letras += letra;
                    cadenas.add(letras);
                    return null;

                } else
                {
                    letras += letra;
                    cadenas.add(letras);
                    if (estadosig != auto.getEstadoError())
                    {
                        generarCadena2(contador+1, estadosig, auto, cadenas);
                    }
                }
            } else
            {
                if (contador == 10)
                {
                    break;
                } else
                {
                    if (estadosig != auto.getEstadoError())
                    {
                        generarCadena2(contador++, estadosig, auto, cadenas);
                    }
                }
            }

        }
      

        return null;
    }
     */
    public void guardarFicheroCadena(Set<String> cadena, String nombreFichero) throws IOException
    {
        FileWriter f = new FileWriter("log.txt");
        PrintWriter pw = new PrintWriter(f);
        for (String s : cadena)
        {
            System.out.println(s);
            // pw.println(s);
        }
        pw.flush();
        pw.close();
        f.close();
    }

    public Set<String> generarCadena2(Integer contador, Integer nivel, Set<String> cadenas, String letras) throws Exception
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

            if (automata.getEstadoInicial() == nivel && "N".equals(letra))
            {
                System.out.println("");
            }

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

                    if (estadosig != automata.getEstadoError())
                    {
                        letras += letra;
                        if (evaluarExpresion(letras))
                        {
                            cadenas.add(letras);
                            generarCadena2(contador + 1, estadosig, cadenas, letras);
                        }

                    }
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
                        generarCadena2(contador + 1, estadosig, cadenas, letras);
                    }
                }
            }

        }
        return cadenas;
    }

    public Set generarCadena() throws Exception
    {

        Set<String> cadenasNoDuplicadas = new HashSet<String>();
        int contador = 0;
        int numeroaletorio = 0;
        String cadena = "";

        String letra;
        HashMap<Integer, HashMap<String, Integer>> matriz = automata.getMatriz();
        HashMap<String, Integer> mapa;

        while (cadenasNoDuplicadas.size() < 50)
        // for (int j = 0; j < 1000; j++)
        {
            estadoActual = automata.getEstadoInicial();
            int estadoNew = 0;
            contador = 0;
            int contadorw = 0;
            cadena = "";
            boolean NestadoFinal = true;
            while ((contadorw < 10) && NestadoFinal)
            {

                mapa = matriz.get(estadoActual);

                do
                {

                    numeroaletorio = (int) (Math.random() * (mapa.size()));
                    letra = automata.getAlfabeto().get(numeroaletorio);
                    estadoNew = mapa.get(letra);
                    contador++;
                } while (contador < 250 && estadoNew == 4);
                contador = 0;
                cadena += letra;
                if (estadoNew != 4)
                {
                    estadoActual = estadoNew;
                }
                if (automata.esFinal(estadoActual))
                {
                    if (((int) Math.random() * 1000) % 2 == 0)
                    {
                        NestadoFinal = false;
                    }
                }

            }
            if (automata.esFinal(estadoActual))
            {
                cadenasNoDuplicadas.add(cadena);
            }

        }
        System.out.println("*****************");
        return cadenasNoDuplicadas;
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
