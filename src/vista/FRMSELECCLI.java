/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Control.*;
import DBALEX.*;

/**
 *
 * @author mac
 */
public class FRMSELECCLI extends javax.swing.JFrame {
    private Conexion bd = new Conexion();
    FRMRESERVA resv;
    public Obtenercliente respuesta;
     
    public FRMSELECCLI() {
        initComponents();
        this.ListarDatos();
    }

    public FRMSELECCLI(FRMRESERVA reser){
        resv= reser;
        initComponents();
        this.ListarDatos();
    }
    
    public void ListarDatos(){
        bd.MostrarClientes(tblclientes);
    }
    
    public void BuscaDatos(String buscar){
        bd.identificar_bsqueda(tblclientes,buscar,"Clientes");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TXTBUSCAR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        BTNSELEC = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        BTNMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Num. Identifiacion:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(TXTBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 15, 110, 30));

        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Cliente", "Sexo", "Tipo Ident", "Num. Ident", "Nombre", "Apellido", "Celular", "Correo", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblclientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 470, 180));

        BTNSELEC.setText("Seleccionar");
        BTNSELEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSELECActionPerformed(evt);
            }
        });
        jPanel1.add(BTNSELEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 40));

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        BTNMostrar.setText("Mostrar Todo");
        BTNMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSELECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSELECActionPerformed
        respuesta= bd.seleccionarcli(tblclientes);
        if(resv.isShowing()){
            resv.LBLNOMBCLI.setText(respuesta.getNombre());
            //resv.LBLCODIGOCLI.setText(Integer.toString(respuesta.getCodigo()));
            resv.codigocli=respuesta.getCodigo();
            this.setVisible(false);
        }
        else{
            System.out.println("ERROR ALEX-100: NO hay una ventana abierta para recibir el dato");
        }
    }//GEN-LAST:event_BTNSELECActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        BuscaDatos(this.TXTBUSCAR.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMostrarActionPerformed
        this.ListarDatos();
    }//GEN-LAST:event_BTNMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FRMSELECCLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMSELECCLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMSELECCLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMSELECCLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMSELECCLI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNMostrar;
    private javax.swing.JButton BTNSELEC;
    private javax.swing.JTextField TXTBUSCAR;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblclientes;
    // End of variables declaration//GEN-END:variables
}
