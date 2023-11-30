/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import BBDD.Obtenertrab;
import BBDD.hotelBBDD;
import DBALEX.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author mac
 */
public class FRMRESERVA extends javax.swing.JFrame {
    private Conexion bc = new Conexion();
    private hotelBBDD bd = new hotelBBDD();
    Obtenertrab trab;
    public int codigocli;
    public int codigotrab;
    /*Calendar c;
    int dia,mes,año;*/
    
    public FRMRESERVA() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        this.setSize(1082, 410);
    }
    
    public FRMRESERVA(Obtenertrab trabaj) {
        trab=trabaj;
        initComponents(); 
        this.codigotrab= trab.getCodigotrab();
        this.LBLTraba.setText(trab.getNombre());
        this.fecha_actual(DTCHINCIO);
        this.fecha_actual(DTCHFIN);
        this.ListarDatos();
        this.setLocationRelativeTo(null);
        this.setSize(1079, 410);
    }

    public void ListarDatos(){
        bc.MostrarReservas(tblreservas);
    }
    
    public void BuscaDatos(String buscar){
        bc.identificar_bsqueda(tblreservas,buscar,"Reservas");
    }
    
    public void fecha_actual(JDateChooser Jdate){
        Calendar c2 = new GregorianCalendar();
        Jdate.setCalendar(c2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PNLISTAR = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreservas = new javax.swing.JTable();
        TXTBUSCAR = new javax.swing.JTextField();
        BTNBuscar = new javax.swing.JButton();
        BTNMOSTRARRES = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNAGREGARSERV = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PNREGISTRO = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LBLTraba = new javax.swing.JLabel();
        LBLCODIGOHABI = new javax.swing.JLabel();
        DTCHFIN = new com.toedter.calendar.JDateChooser();
        DTCHINCIO = new com.toedter.calendar.JDateChooser();
        BTNRegis = new javax.swing.JButton();
        BTNLIMPIAR = new javax.swing.JButton();
        BTNNuevoReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LBLNOMBCLI = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        LBLICONRESERVA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PNLISTAR.setBackground(new java.awt.Color(255, 255, 255));
        PNLISTAR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "Consultas de Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        PNLISTAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PNLISTAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblreservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Reserva", "Num_Habitacion", "Cliente", "Trabajador", "Fech. Llegada", "Fech. Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblreservas);

        PNLISTAR.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 480, 180));
        PNLISTAR.add(TXTBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 20));

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        PNLISTAR.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        BTNMOSTRARRES.setText("Mostrar Reservas");
        BTNMOSTRARRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMOSTRARRESActionPerformed(evt);
            }
        });
        PNLISTAR.add(BTNMOSTRARRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, 40));

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });
        PNLISTAR.add(BTNEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 140, 40));

        BTNAGREGARSERV.setText("Agregar Servicios");
        PNLISTAR.add(BTNAGREGARSERV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 40));

        jLabel3.setText("Num. Ident");
        PNLISTAR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(PNLISTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 500, 330));

        PNREGISTRO.setBackground(new java.awt.Color(255, 255, 255));
        PNREGISTRO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "Registro de Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        PNREGISTRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PNREGISTRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Habitacion");
        PNREGISTRO.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Cliente");
        PNREGISTRO.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Trabajador");
        PNREGISTRO.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de Ingreso");
        PNREGISTRO.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Fecha de Salida");
        PNREGISTRO.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, -1, -1));

        LBLTraba.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LBLTraba.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PNREGISTRO.add(LBLTraba, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 130, 120, 20));

        LBLCODIGOHABI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LBLCODIGOHABI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PNREGISTRO.add(LBLCODIGOHABI, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 50, 70, 20));
        PNREGISTRO.add(DTCHFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 210, 120, -1));
        PNREGISTRO.add(DTCHINCIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 170, 120, -1));

        BTNRegis.setText("Registrar");
        BTNRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegisActionPerformed(evt);
            }
        });
        PNREGISTRO.add(BTNRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 40));

        BTNLIMPIAR.setText("Limpiar");
        PNREGISTRO.add(BTNLIMPIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 40));

        BTNNuevoReg.setText("Nuevo");
        PNREGISTRO.add(BTNNuevoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 40));

        jButton1.setText("SC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PNREGISTRO.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 50, 23));

        jButton2.setText("SH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PNREGISTRO.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, 23));

        LBLNOMBCLI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LBLNOMBCLI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PNREGISTRO.add(LBLNOMBCLI, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 90, 110, 20));

        jPanel1.add(PNREGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 890, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 90));

        LBLICONRESERVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reservahabi.jpg"))); // NOI18N
        jPanel2.add(LBLICONRESERVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 160));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Y CONSULTAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("MODULO DE RESERVAS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Frm_menu menu = new Frm_menu(trab);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FRMSELECCLI selcli = new FRMSELECCLI(this);
        selcli.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FRMSELECHABI selhab = new FRMSELECHABI(this);
        selhab.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

     private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
    
    private void BTNRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegisActionPerformed
        java.sql.Date fechai, fechaf;
        fechai = new java.sql.Date((DTCHINCIO.getDate().getTime()));
        fechaf = new java.sql.Date((DTCHFIN.getDate().getTime()));
        
        if(LBLCODIGOHABI.getText().isEmpty() || LBLNOMBCLI.getText().isEmpty() || LBLTraba.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Llene todos los campos por favor");
        }else{
            Reserva reser = new Reserva();
            reser.setID_reserva(108);
            reser.setID_habitacion(Integer.parseInt(LBLCODIGOHABI.getText()));
            reser.setID_cliente(codigocli);
            reser.setID_trabajador(codigotrab);
            reser.setFecha_inicio(fechai);
            reser.setFecha_fin(fechaf);
            bd.InsertarDatos(reser);
            bd.Cambiarestadohabi(reser.getID_habitacion());
            this.ListarDatos();
        }
        
    }//GEN-LAST:event_BTNRegisActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed

        bd.EliminarReserva(tblreservas);
        ListarDatos();
        
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNMOSTRARRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMOSTRARRESActionPerformed
        this.ListarDatos();
    }//GEN-LAST:event_BTNMOSTRARRESActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        this.BuscaDatos(this.TXTBUSCAR.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMRESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMRESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMRESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMRESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMRESERVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAGREGARSERV;
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNLIMPIAR;
    private javax.swing.JButton BTNMOSTRARRES;
    private javax.swing.JButton BTNNuevoReg;
    private javax.swing.JButton BTNRegis;
    private com.toedter.calendar.JDateChooser DTCHFIN;
    private com.toedter.calendar.JDateChooser DTCHINCIO;
    public javax.swing.JLabel LBLCODIGOHABI;
    private javax.swing.JLabel LBLICONRESERVA;
    public javax.swing.JLabel LBLNOMBCLI;
    private javax.swing.JLabel LBLTraba;
    private javax.swing.JPanel PNLISTAR;
    private javax.swing.JPanel PNREGISTRO;
    private javax.swing.JTextField TXTBUSCAR;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblreservas;
    // End of variables declaration//GEN-END:variables

}
