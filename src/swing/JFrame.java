
package swing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import signosZodiacales.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import signosChinos.*;

public class JFrame extends javax.swing.JFrame {

    public JFrame()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFSignoZCObtenido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTFYearUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTFDiaIngresado = new javax.swing.JTextField();
        jTFMesIngresado = new javax.swing.JTextField();
        jTFYearIngresado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBMesUser = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBDiaUser = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescripChino = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFSignoZObtenido = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(900, 800));

        jTFSignoZCObtenido.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFSignoZCObtenido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFSignoZCObtenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSignoZCObtenidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Tu signo Chino es:");

        jButton1.setBackground(new java.awt.Color(0, 123, 255));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar Información");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTFYearUser.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFYearUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFYearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFYearUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Ingresa tu año de nacimiento:");

        jSeparator1.setBackground(new java.awt.Color(255, 87, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("La fecha de nacimiento que ingresate es:");

        jTFDiaIngresado.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFDiaIngresado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFDiaIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiaIngresadoActionPerformed(evt);
            }
        });

        jTFMesIngresado.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFMesIngresado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFMesIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMesIngresadoActionPerformed(evt);
            }
        });

        jTFYearIngresado.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFYearIngresado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFYearIngresado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFYearIngresadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Ingresa tu mes de nacimiento:");

        jCBMesUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jCBMesUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMesUserActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Ingresa tu día de nacimiento:");

        jCBDiaUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4 ", "5 ", "6 ", "7 ", "8 ", "9", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31" }));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Signo Zodiacal");

        jTADescripChino.setColumns(20);
        jTADescripChino.setRows(5);
        jScrollPane1.setViewportView(jTADescripChino);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Descripción:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Tu signo zodiacal:");

        jTFSignoZObtenido.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTFSignoZObtenido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFSignoZObtenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSignoZObtenidoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(220, 63, 59));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Osorio Benavides Carlos Daniel");

        jLabel11.setText("Referencia:");

        jLabel12.setText("https://www.univision.com/entretenimiento/horoscopo-chino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(223, 223, 223))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jTFDiaIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jCBDiaUser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBMesUser, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFYearUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jTFMesIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jTFYearIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFSignoZCObtenido, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFSignoZObtenido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFYearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBMesUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDiaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDiaIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTFMesIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFYearIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSignoZObtenido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFSignoZCObtenido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(876, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFSignoZCObtenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSignoZCObtenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSignoZCObtenidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        
        //Formato de fecha
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("MM-dd");
        
        //Variables a utiliar
        String mes;
        String dia;
        Date dateUser = null;
        CalendarioZodiacal calendarioZodiacal = null;
        boolean bandera = false;
        
        // Estableciendo fecha de nacimiento del usuario 
        mes = (String)jCBMesUser.getSelectedItem();
        dia = (String)jCBDiaUser.getSelectedItem();
                     
        try
        {
           dateUser = sdf.parse(mes+"-"+dia); 
        }catch(ParseException ex)
        {
            System.out.println("Fecha incorrecta");
        }       
        
        //Imprimir datos de la fecha del usuario en consola
        System.out.println(dateUser);
        
        //Clase que contiene los signos chinos y nos ayudara a determinar el signo
        //del usuario
        CalendarioChino calendarioChino = new CalendarioChino();
        try {
            calendarioZodiacal = new CalendarioZodiacal();
        } catch (ParseException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Obteniendo el año ingresado por el usuario
        String yearUserJTF= (String)jTFYearUser.getText();
        System.out.println(yearUserJTF);
        
        int yearUser = 0;
        
        try
        {           
            yearUser = Integer.parseInt(jTFYearUser.getText());
            
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Año invalido");
        }
                
        //Comparando año de nacimiento para obtener signo chino
        String description = calendarioChino.compararYear(yearUser);
        calendarioChino.imprimirSignoChino();
        
        //Comparando para obtener un signo zodiacal
        //Clase que nos valida los signos zodiacales        
        ValidarSignosZ accionesCalendarioZ = null;
        
        try
        {
            accionesCalendarioZ = new ValidarSignosZ();
        }catch(ParseException ex)
        {
            System.out.println("ERROR");
        }
        
        //Estableciendo testo de signo zodiacal
        jTFSignoZObtenido.setText(accionesCalendarioZ.validarSignoZodiacal(dateUser)); 
  
        // Estableciendo texto para mostrar el sirno chino obtenido
        jTFSignoZCObtenido.setText(calendarioChino.getSignoChinoUser().getSigno());
                       
        //Asignamos texto que aparecera en panatalls
        jTFDiaIngresado.setText(dia);
        jTFMesIngresado.setText(mes);
        jTFYearIngresado.setText(yearUserJTF);
        jTADescripChino.setText(description);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFDiaIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiaIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDiaIngresadoActionPerformed

    private void jTFMesIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMesIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMesIngresadoActionPerformed

    private void jTFYearIngresadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFYearIngresadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFYearIngresadoActionPerformed

    private void jCBMesUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMesUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMesUserActionPerformed

    private void jTFYearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFYearUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFYearUserActionPerformed

    private void jTFSignoZObtenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSignoZObtenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSignoZObtenidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Botón Salir
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
                
            }
        });     
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBDiaUser;
    private javax.swing.JComboBox<String> jCBMesUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTADescripChino;
    private javax.swing.JTextField jTFDiaIngresado;
    private javax.swing.JTextField jTFMesIngresado;
    private javax.swing.JTextField jTFSignoZCObtenido;
    private javax.swing.JTextField jTFSignoZObtenido;
    private javax.swing.JTextField jTFYearIngresado;
    private javax.swing.JTextField jTFYearUser;
    // End of variables declaration//GEN-END:variables
}
