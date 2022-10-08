/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import modelo.AFD;

/**
 *
 * @author carlo
 */
public class MaquinaDeEstadosMapa extends MaquinaDeEstados
{

  

    public MaquinaDeEstadosMapa()
    {
        super();
       
    }

    public void cargarMaquina()
    {

        automata.cargarListaAlfabeto("XYDN");
        automata.setEstadoError(4);
        estados = new Integer[]
        {
            0, 1, 2, 3, 4, 5, 6, 7
        };
        estadosFinales = new Integer[]
        {
            2, 6
        };
        automata.cargarListaEstados(estados);
        automata.cargarEstadosfinales(estadosFinales);
        automata.inicializarMatriz();

        automata.cargarDatoMatriz(0, "X", 1);

        automata.cargarDatoMatriz(1, "D", 2);
        automata.cargarDatoMatriz(1, "N", 3);

        automata.cargarDatoMatriz(2, "D", 2);
        automata.cargarDatoMatriz(2, "Y", 5);

        automata.cargarDatoMatriz(3, "D", 2);

        automata.cargarDatoMatriz(5, "D", 6);
        automata.cargarDatoMatriz(5, "N", 7);

        automata.cargarDatoMatriz(6, "D", 6);

        automata.cargarDatoMatriz(7, "D", 6);
        automata.cargarDatoMatriz(7, "D", 6);

    }

   
}
