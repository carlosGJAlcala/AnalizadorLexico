/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

/**
 *
 * @author carlo
 */
public class AFD
{

    List<String> alfabeto;
    List<Integer> estados;
    List<Integer> estadosFinales;

    HashMap matriz;

    int estadoInicial, estadoError;

    public AFD()
    {

        alfabeto = new ArrayList<String>();
        estados = new ArrayList<Integer>();
        estadosFinales = new ArrayList<Integer>();
        estadoInicial = 0;
        estadoError = -1;
        matriz = new HashMap<Integer, HashMap<String, Integer>>();
    }

    public void cargarAlfabeto(char letra)
    {
        String letraS = "" + letra;
        alfabeto.add(letraS);
    }

    public void cargarEstado(int estado)
    {
        estados.add(estado);
    }

    public void establecerEstadoInicial(int estadoini)
    {
        estadoInicial = estadoini;
    }

    public void establecerEstadosFinales(int estadofinal)
    {
        estadosFinales.add(estadofinal);
    }

    public void inicializarMatriz()
    {
        inicializarMatrizFilas();
        inicializarMatrizColumnas();

    }

    public void inicializarMatrizFilas()
    {
        for (Integer i : estados)
        {
            matriz.put(i, new HashMap<String, Integer>());
        }
    }

    public void inicializarMatrizColumnas()
    {
        HashMap<String, Integer> mapa;
        for (Integer i : estados)
        {
            for (String s : alfabeto)
            {
                mapa = (HashMap) matriz.get(i);
                mapa.put(s, estadoError);
            }
        }
    }

    public void cargarDatoMatriz(Integer fila, String columna, Integer valor)
    {
        HashMap<String, Integer> mapa;

        mapa = (HashMap) matriz.get(fila);
        mapa.replace(columna, valor);

    }

    public boolean esFinal(Integer estado)
    {
        return estadosFinales.contains(estado);

    }

    public void cargarListaAlfabeto(String alfabeto)
    {
        for (int i = 0; i < alfabeto.length(); i++)
        {
            char a = alfabeto.charAt(i);
            cargarAlfabeto(a);
        }
    }

    public void cargarListaEstados(Integer[] estadosnew)
    {
        for (Integer i : estadosnew)
        {
            cargarEstado(i);
        }

    }

    public void cargarEstadosfinales(Integer[] estadosfinales)
    {
        for (Integer i : estadosfinales)
        {
            establecerEstadosFinales(i);
        }
    }

    public void setEstadoError(int estadoError)
    {
        this.estadoError = estadoError;
    }

    public int getEstadoInicial()
    {
        return estadoInicial;
    }

    public List<String> getAlfabeto()
    {
        return alfabeto;
    }

    public HashMap getMatriz()
    {
        return matriz;
    }

    public int getEstadoError()
    {
        return estadoError;
    }
    

}
