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
public class MaquinaDeEstadosPolinomio extends MaquinaDeEstados
{

    public MaquinaDeEstadosPolinomio()
    {
        super();

    }

    public void cargarMaquina()
    {

        automata.cargarListaAlfabeto("DXDNMY");
        automata.setEstadoError(4);
        estados = new Integer[]
        {
            0, 1, 2, 3, 4, 5
        };
        estadosFinales = new Integer[]
        {
            0, 3, 5
        };
        automata.cargarListaEstados(estados);
        automata.cargarEstadosfinales(estadosFinales);
        automata.inicializarMatriz();
        automata.cargarDatoMatriz(0, "X", 3);
        automata.cargarDatoMatriz(0, "D", 1);
        automata.cargarDatoMatriz(0, "N", 2);
        automata.cargarDatoMatriz(0, "M", 2);
        automata.cargarDatoMatriz(0, "Y", 4);

        automata.cargarDatoMatriz(1, "X", 3);
        automata.cargarDatoMatriz(1, "D", 1);
        automata.cargarDatoMatriz(1, "N", 4);
        automata.cargarDatoMatriz(1, "M", 4);
        automata.cargarDatoMatriz(1, "Y", 4);

        automata.cargarDatoMatriz(1, "X", 4);
        automata.cargarDatoMatriz(2, "D", 2);
        automata.cargarDatoMatriz(2, "N", 3);
        automata.cargarDatoMatriz(2, "M", 3);
        automata.cargarDatoMatriz(2, "Y", 5);

        automata.cargarDatoMatriz(3, "X", 4);
        automata.cargarDatoMatriz(3, "D", 4);
        automata.cargarDatoMatriz(3, "N", 2);
        automata.cargarDatoMatriz(3, "M", 2);
        automata.cargarDatoMatriz(3, "Y", 4);
    }

}
