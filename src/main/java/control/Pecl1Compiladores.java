/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Vista;

/**
 *
 * @author carlo
 */
public class Pecl1Compiladores
{

    public static void main(String[] args)
    {
        boolean pro = true;
        if (pro)
        {
            pro();
        } else
        {
           // debug();
        }

    }

    public static void pro()
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Vista().setVisible(true);
            }
        });

    }

 /*   public static void debug()
    {
        MaquinaDeEstados mde = new MaquinaDeEstados();
        try
        {

           
            boolean resultado = mde.evaluarExpresion("XNDYDDDD");
            System.out.println("La expresion es : " + resultado);
            //mde.generarCadena();
        } catch (Exception ex)
        {
            System.out.println(ex);
        }
    }*/
}
