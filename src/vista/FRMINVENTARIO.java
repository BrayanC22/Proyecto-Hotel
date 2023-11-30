package vista;

import BBDD.Obtenertrab;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FRMINVENTARIO extends javax.swing.JFrame {
    Obtenertrab trab;
    
    public FRMINVENTARIO() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.esconderpaneles();
        setLocationRelativeTo(null);
    }
    
    public FRMINVENTARIO(Obtenertrab trabaj) {
        trab=trabaj;
        initComponents();
        this.setLocationRelativeTo(null);
        this.esconderpaneles();
        this.PNRegart.setVisible(true);
    }
    
    public void esconderpaneles(){
        this.PNActualizarart.setVisible(false);
        this.PNBusqueda.setVisible(false);
        this.PNInventario.setVisible(false);
        this.PNRegart.setVisible(false); 
    }
    public void formateartabla(JTable tabla){
        DefaultTableModel model= new DefaultTableModel();
        tabla.setModel(model);
        model.addColumn("Nombre Articulo");
        model.addColumn("Tipo Articulo");
        model.addColumn("Cantidad");
        model.addColumn("Descripcion");
    }
    
    public void PintarBotones(){
        //[131,219,226]
        this.BTNAgart.setBackground(new Color(131,219,226));
        this.BTNBuscart.setBackground(new Color(131,219,226));
        this.BTNActart.setBackground(new Color(131,219,226));
        this.BTNVisualInv.setBackground(new Color(131,219,226));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNopciones = new javax.swing.JPanel();
        BTNVisualInv = new javax.swing.JButton();
        BTNAgart = new javax.swing.JButton();
        BTNBuscart = new javax.swing.JButton();
        BTNActart = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        PNInventario = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblArticulo2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        PNBusqueda = new javax.swing.JPanel();
        TXTnomarte2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblArticulo1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        BTNbuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PNActualizarart = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TXTnomarte = new javax.swing.JTextField();
        CMBtiparte = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SPNcante = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreae = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblArticulo = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        TXTnomarte1 = new javax.swing.JTextField();
        BTNbuscar = new javax.swing.JButton();
        PNRegart = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TXTnomart = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CMBtipart = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TXTIDarticulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SPNcant = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PNopciones.setBackground(new java.awt.Color(255, 255, 255));
        PNopciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PNopciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNVisualInv.setBackground(new java.awt.Color(131, 219, 226));
        BTNVisualInv.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BTNVisualInv.setText("Visualizar Inventario");
        BTNVisualInv.setBorder(null);
        BTNVisualInv.setBorderPainted(false);
        BTNVisualInv.setContentAreaFilled(false);
        BTNVisualInv.setOpaque(true);
        BTNVisualInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVisualInvActionPerformed(evt);
            }
        });
        PNopciones.add(BTNVisualInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 360, 157, 40));

        BTNAgart.setBackground(new java.awt.Color(131, 219, 226));
        BTNAgart.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BTNAgart.setText("Agregar Artículo");
        BTNAgart.setBorder(null);
        BTNAgart.setBorderPainted(false);
        BTNAgart.setContentAreaFilled(false);
        BTNAgart.setOpaque(true);
        BTNAgart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgartActionPerformed(evt);
            }
        });
        PNopciones.add(BTNAgart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 180, 157, 40));

        BTNBuscart.setBackground(new java.awt.Color(131, 219, 226));
        BTNBuscart.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BTNBuscart.setText("Buscar Artículo");
        BTNBuscart.setBorder(null);
        BTNBuscart.setBorderPainted(false);
        BTNBuscart.setContentAreaFilled(false);
        BTNBuscart.setOpaque(true);
        BTNBuscart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscartActionPerformed(evt);
            }
        });
        PNopciones.add(BTNBuscart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 240, 157, 40));

        BTNActart.setBackground(new java.awt.Color(131, 219, 226));
        BTNActart.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BTNActart.setText("Actualizar Artículo");
        BTNActart.setBorder(null);
        BTNActart.setBorderPainted(false);
        BTNActart.setContentAreaFilled(false);
        BTNActart.setOpaque(true);
        BTNActart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActartActionPerformed(evt);
            }
        });
        PNopciones.add(BTNActart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 300, 157, 40));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        PNopciones.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        getContentPane().add(PNopciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        PNInventario.setBackground(new java.awt.Color(255, 255, 255));
        PNInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblArticulo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Articulo", "Tipo de Articulo", "Cantidad", "Descripcion"
            }
        ));
        tblArticulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticulo2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblArticulo2);

        PNInventario.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, 260));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("INVENTARIO");
        PNInventario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("Total:");
        PNInventario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        lblTotal.setText("_____");
        PNInventario.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        getContentPane().add(PNInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 430));

        PNBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        PNBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PNBusqueda.add(TXTnomarte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 30));

        tblArticulo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Articulo", "Tipo de Articulo", "Cantidad", "Descripcion"
            }
        ));
        tblArticulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticulo1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblArticulo1);

        PNBusqueda.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 200));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        PNBusqueda.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));

        BTNbuscar1.setText("Buscar");
        PNBusqueda.add(BTNbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Busqueda de Artículo");
        PNBusqueda.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        getContentPane().add(PNBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 430));

        PNActualizarart.setBackground(new java.awt.Color(255, 255, 255));
        PNActualizarart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Descripción");
        PNActualizarart.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        PNActualizarart.add(TXTnomarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 150, 30));

        PNActualizarart.add(CMBtiparte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de Artículo");
        PNActualizarart.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Nombre Artículo");
        PNActualizarart.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        PNActualizarart.add(SPNcante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 60, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad");
        PNActualizarart.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jTextAreae.setColumns(20);
        jTextAreae.setRows(5);
        jScrollPane2.setViewportView(jTextAreae);

        PNActualizarart.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, 70));

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setText("Actualizar");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);
        PNActualizarart.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 170, 40));

        tblArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Articulo", "Tipo de Articulo", "Cantidad", "Descripcion"
            }
        ));
        tblArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticuloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblArticulo);

        PNActualizarart.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 360, 100));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));
        PNActualizarart.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));
        PNActualizarart.add(TXTnomarte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        BTNbuscar.setText("Buscar");
        PNActualizarart.add(BTNbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 30));

        getContentPane().add(PNActualizarart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 430));

        PNRegart.setBackground(new java.awt.Color(255, 255, 255));
        PNRegart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descripción");
        PNRegart.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        PNRegart.add(TXTnomart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID Artículo");
        PNRegart.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        PNRegart.add(CMBtipart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Artículo");
        PNRegart.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        PNRegart.add(TXTIDarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nombre Artículo");
        PNRegart.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        PNRegart.add(SPNcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 60, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        PNRegart.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        PNRegart.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 190, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Registro de Artículo");
        PNRegart.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        getContentPane().add(PNRegart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticuloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblArticuloMouseClicked

    private void tblArticulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticulo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblArticulo1MouseClicked

    private void tblArticulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticulo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblArticulo2MouseClicked

    private void BTNAgartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgartActionPerformed
        this.PintarBotones();
        this.BTNAgart.setBackground(new Color(255,204,204));
        this.esconderpaneles();
        this.PNRegart.setVisible(true);
    }//GEN-LAST:event_BTNAgartActionPerformed

    private void BTNBuscartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscartActionPerformed
        this.PintarBotones();
        this.BTNBuscart.setBackground(new Color(255,204,204));
        this.esconderpaneles();
        this.PNBusqueda.setVisible(true);
    }//GEN-LAST:event_BTNBuscartActionPerformed

    private void BTNActartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActartActionPerformed
        this.PintarBotones();
        this.BTNActart.setBackground(new Color(255,204,204));
        this.esconderpaneles();
        this.PNActualizarart.setVisible(true);
    }//GEN-LAST:event_BTNActartActionPerformed

    private void BTNVisualInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVisualInvActionPerformed
        this.PintarBotones();
        this.BTNVisualInv.setBackground(new Color(255,204,204));
        this.esconderpaneles();
        this.PNInventario.setVisible(true);
    }//GEN-LAST:event_BTNVisualInvActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Frm_menu menu = new Frm_menu(trab);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FRMINVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMINVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMINVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMINVENTARIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMINVENTARIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNActart;
    private javax.swing.JButton BTNAgart;
    private javax.swing.JButton BTNBuscart;
    private javax.swing.JButton BTNVisualInv;
    private javax.swing.JButton BTNbuscar;
    private javax.swing.JButton BTNbuscar1;
    private javax.swing.JComboBox<String> CMBtipart;
    private javax.swing.JComboBox<String> CMBtiparte;
    private javax.swing.JPanel PNActualizarart;
    private javax.swing.JPanel PNBusqueda;
    private javax.swing.JPanel PNInventario;
    private javax.swing.JPanel PNRegart;
    private javax.swing.JPanel PNopciones;
    private javax.swing.JSpinner SPNcant;
    private javax.swing.JSpinner SPNcante;
    private javax.swing.JTextField TXTIDarticulo;
    private javax.swing.JTextField TXTnomart;
    private javax.swing.JTextField TXTnomarte;
    private javax.swing.JTextField TXTnomarte1;
    private javax.swing.JTextField TXTnomarte2;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreae;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblArticulo;
    private javax.swing.JTable tblArticulo1;
    private javax.swing.JTable tblArticulo2;
    // End of variables declaration//GEN-END:variables
}