/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Vista extends javax.swing.JFrame
{

    /**
     * Creates new form Vista
     */
    public enum TipoMaquina
    {
        MAPA, POLINOMIO, NINGUNO
    }
    TipoMaquina tm;
    MaquinaDeEstadosMapa mdemapa;
    MaquinaDeEstadosPolinomio mdepolinomio;

    public Vista()
    {
        tm = TipoMaquina.NINGUNO;

        mdemapa = new MaquinaDeEstadosMapa();
        mdemapa.cargarMaquina();
        mdepolinomio = new MaquinaDeEstadosPolinomio();
        mdepolinomio.cargarMaquina();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        comprobarCadena = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        PrimeraExpr = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SegundaExpr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        textoaComprobar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Comprobar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        generar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultado1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        comprobarCadena.setBackground(new java.awt.Color(255, 255, 255));
        comprobarCadena.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jPanel7.setBackground(new java.awt.Color(0, 204, 255));

        PrimeraExpr.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        PrimeraExpr.setForeground(new java.awt.Color(255, 255, 255));
        PrimeraExpr.setText("    Primera Expresión ");
        PrimeraExpr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrimeraExpr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PrimeraExprMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PrimeraExpr, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrimeraExpr, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setForeground(new java.awt.Color(153, 255, 255));

        SegundaExpr.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        SegundaExpr.setForeground(new java.awt.Color(255, 255, 255));
        SegundaExpr.setText("   Segunda Expresión");
        SegundaExpr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SegundaExpr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                SegundaExprMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SegundaExpr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SegundaExpr, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Segunda exprexión: (D*X)?((M|N)D*Y)?");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Primera exprexión: X(N?)D+(Y(N?)D+)?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        comprobarCadena.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 720));

        resultado.setBackground(new java.awt.Color(248, 247, 247));
        resultado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        resultado.setForeground(new java.awt.Color(204, 204, 204));
        resultado.setText("Resultado");
        resultado.setBorder(null);
        resultado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resultadoActionPerformed(evt);
            }
        });
        comprobarCadena.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 300, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        comprobarCadena.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 510, 10));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        comprobarCadena.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        textoaComprobar.setBackground(new java.awt.Color(248, 247, 247));
        textoaComprobar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        textoaComprobar.setBorder(null);
        textoaComprobar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textoaComprobarActionPerformed(evt);
            }
        });
        comprobarCadena.add(textoaComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 510, 40));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        Comprobar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Comprobar.setForeground(new java.awt.Color(255, 255, 255));
        Comprobar.setText("      Comprobar");
        Comprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprobar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ComprobarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        comprobarCadena.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Introduzca su cadena a validar");
        comprobarCadena.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 270, 50));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        generar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        generar.setForeground(new java.awt.Color(255, 255, 255));
        generar.setText("   Generar cadena");
        generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                generarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(generar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        comprobarCadena.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 170, 50));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel4.setText("ALCALÁ DE HENARES");
        comprobarCadena.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 560, 50));

        resultado1.setBackground(new java.awt.Color(248, 247, 247));
        resultado1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        resultado1.setForeground(new java.awt.Color(204, 204, 204));
        resultado1.setText("Resultado");
        resultado1.setBorder(null);
        resultado1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resultado1ActionPerformed(evt);
            }
        });
        comprobarCadena.add(resultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comprobarCadena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comprobarCadena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resultadoActionPerformed
    {//GEN-HEADEREND:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void textoaComprobarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textoaComprobarActionPerformed
    {//GEN-HEADEREND:event_textoaComprobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoaComprobarActionPerformed

    private void ComprobarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ComprobarMouseClicked
    {//GEN-HEADEREND:event_ComprobarMouseClicked
        String cadena = textoaComprobar.getText();
        boolean resultadoboolean = false;
        if (!cadena.isEmpty())
        {
            try
            {
                if (tm == TipoMaquina.MAPA)
                {
                    resultadoboolean = mdemapa.evaluarExpresion(cadena);

                } else if (tm == TipoMaquina.POLINOMIO)
                {
                    resultadoboolean = mdepolinomio.evaluarExpresion(cadena);
                }
                String r = (resultadoboolean) ? "Es valida" : "No es valida";
                resultado.setForeground(Color.BLACK);
                resultado.setText(r);
            } catch (Exception ex)
            {
                resultado.setText(ex.toString());
            }
        }
        System.out.println("comprobar cadena");


    }//GEN-LAST:event_ComprobarMouseClicked

    private void generarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_generarMouseClicked
    {//GEN-HEADEREND:event_generarMouseClicked
        try
        {
            
            Set<String> set = new HashSet<String>();
            if (tm == TipoMaquina.MAPA)
            {
                set = mdemapa.generarCadena(0, 0, set, "");
                mdemapa.guardarFicheroCadena(set);
            } else if (tm == TipoMaquina.POLINOMIO)
            {
                set = mdepolinomio.generarCadena(0, 0, set, "");
                mdepolinomio.guardarFicheroCadena(set);
            } else
            {
                resultado.setForeground(Color.BLACK);
                resultado.setText("Selecciona una expresión");
            }

        } catch (Exception ex)
        {
            resultado.setText(ex.toString());
        }
        System.out.println("generar cadena");


    }//GEN-LAST:event_generarMouseClicked

    private void PrimeraExprMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PrimeraExprMouseClicked
    {//GEN-HEADEREND:event_PrimeraExprMouseClicked

        tm = TipoMaquina.MAPA;
        System.out.println("Primera expresion mapa");
    }//GEN-LAST:event_PrimeraExprMouseClicked

    private void SegundaExprMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_SegundaExprMouseClicked
    {//GEN-HEADEREND:event_SegundaExprMouseClicked

        tm = TipoMaquina.POLINOMIO;
        System.out.println("Segunda expresion polinomios");
    }//GEN-LAST:event_SegundaExprMouseClicked

    private void resultado1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resultado1ActionPerformed
    {//GEN-HEADEREND:event_resultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultado1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comprobar;
    private javax.swing.JLabel PrimeraExpr;
    private javax.swing.JLabel SegundaExpr;
    private javax.swing.JPanel comprobarCadena;
    private javax.swing.JLabel generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField resultado1;
    private javax.swing.JTextField textoaComprobar;
    // End of variables declaration//GEN-END:variables
}
