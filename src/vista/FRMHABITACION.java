package vista;

import BBDD.Obtenertrab;
import DBCALVOPIÑA.ConexionC;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mac
 */
public class FRMHABITACION extends javax.swing.JFrame {
    Obtenertrab trab;
     
    public FRMHABITACION() {
        initComponents();
        this.esconderpanel();
        setLocationRelativeTo(null);
        //this.setSize(546,491);
    }
    
    public FRMHABITACION(Obtenertrab trabaj) {
        trab=trabaj;
        initComponents();
        setLocationRelativeTo(null);
        this.esconderpanel();
        this.jPanelREGISTRAR.setVisible(true);
        //this.setSize(546,491);
    }
    

    
    public void esconderpanel(){
        this.jPanelBUSCARPRECIO.setVisible(false);
        this.jPanelELIMINAR.setVisible(false);
        this.jPanelMODIFICAR.setVisible(false);
        this.jPanelREGISTRAR.setVisible(false);
    }
    
    public void PintarBotones(){
        //[131,219,226]
        this.jButtonREGISTRAR.setBackground(new Color(131,219,226));
        this.jButtonBuscar.setBackground(new Color(131,219,226));
        this.EDITAR.setBackground(new Color(131,219,226));
        this.ELIMINAR.setBackground(new Color(131,219,226));
    }
    
    public void buscar(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            
            this.jTableBuscar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();
            
            String sql = "SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("ID HOTEL");
            modelo.addColumn("ID TIPO HABITACION");
            modelo.addColumn("ID ESTADO HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");

            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            //jTextFieldIDRESERVA.setVisible(false);
            //jTextFieldIDHOTEL.setVisible(false);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void cargarmodificar(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            
            jTableModificar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();
            
            String sql = "SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("ID HOTEL");
            modelo.addColumn("ID TIPO HABITACION");
            modelo.addColumn("ID ESTADO HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");

            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            //jTextFieldIDRESERVA.setVisible(false);
            //jTextFieldIDHOTEL.setVisible(false);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public void cargareliminar(){
        DefaultTableModel modelo = new DefaultTableModel();
            try {
            jTableEliminar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();
            
            String sql = "SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("ID HOTEL");
            modelo.addColumn("ID TIPO HABITACION");
            modelo.addColumn("ID ESTADO HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");

            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonREGISTRAR = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanelREGISTRAR = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIDHABITACION = new javax.swing.JTextField();
        jTextFieldPRECIO = new javax.swing.JTextField();
        jButtonlIMPIARCAMPOS = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldIDHOTEL = new javax.swing.JTextField();
        jTextFieldIDTIPOHABITACION = new javax.swing.JTextField();
        jTextFielESTADOHABITACION = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxEXTRA = new javax.swing.JComboBox<>();
        jPanelMODIFICAR = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButtonModificarGuardar = new javax.swing.JButton();
        jButtonRegresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIDTIPOHABITACION1 = new javax.swing.JTextField();
        jTextFieldIDHABITACION1 = new javax.swing.JTextField();
        jTextFieldExtra = new javax.swing.JTextField();
        jTextFieldPRECIO1 = new javax.swing.JTextField();
        jTextFieldIDHOTEL1 = new javax.swing.JTextField();
        jTextFieldIDESTADOHABITACION = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldIngreseID1 = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jPanelBUSCARPRECIO = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscar = new javax.swing.JTable();
        jTextFieldBUSCARPRECIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButtonConfirmar2 = new javax.swing.JButton();
        jPanelELIMINAR = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEliminar = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jButtonELIMINAR1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldIngreseID2 = new javax.swing.JTextField();
        jButtonConfirmar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonREGISTRAR.setBackground(new java.awt.Color(131, 219, 226));
        jButtonREGISTRAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonREGISTRAR.setText("REGISTRAR");
        jButtonREGISTRAR.setBorderPainted(false);
        jButtonREGISTRAR.setContentAreaFilled(false);
        jButtonREGISTRAR.setOpaque(true);
        jButtonREGISTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonREGISTRARMouseClicked(evt);
            }
        });
        jButtonREGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREGISTRARActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 40));

        jButtonBuscar.setBackground(new java.awt.Color(131, 219, 226));
        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setOpaque(true);
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseClicked(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 40));

        EDITAR.setBackground(new java.awt.Color(131, 219, 226));
        EDITAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EDITAR.setText("MODIFICAR");
        EDITAR.setBorderPainted(false);
        EDITAR.setContentAreaFilled(false);
        EDITAR.setOpaque(true);
        EDITAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITARMouseClicked(evt);
            }
        });
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });
        jPanel1.add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 40));

        ELIMINAR.setBackground(new java.awt.Color(131, 219, 226));
        ELIMINAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.setBorderPainted(false);
        ELIMINAR.setContentAreaFilled(false);
        ELIMINAR.setOpaque(true);
        ELIMINAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELIMINARMouseClicked(evt);
            }
        });
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        jPanel1.add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 160, 40));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cama-matrimonial (2).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 430));

        jPanelREGISTRAR.setBackground(new java.awt.Color(114, 195, 209));
        jPanelREGISTRAR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "REGISTRAR"));
        jPanelREGISTRAR.setForeground(new java.awt.Color(1, 1, 1));

        jLabel2.setText("ID TIPO HABITACION ");

        jLabel4.setText("EXTRA");

        jLabel7.setText("PRECIO");

        jTextFieldIDHABITACION.setToolTipText("");

        jButtonlIMPIARCAMPOS.setText("LIMPIAR CAMPOS");
        jButtonlIMPIARCAMPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonlIMPIARCAMPOSMouseClicked(evt);
            }
        });
        jButtonlIMPIARCAMPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlIMPIARCAMPOSActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel10.setText("ID HOTEL ");

        jLabel11.setText("ID HABITACION ");

        jTextFieldIDTIPOHABITACION.setToolTipText("3 TIPOS: 1 , 2 , 3");

        jTextFielESTADOHABITACION.setToolTipText("2 ESTADOS: 11 OCUPADA, 12 DISPONIBLE");
        jTextFielESTADOHABITACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielESTADOHABITACIONActionPerformed(evt);
            }
        });

        jLabel8.setText("ID ESTADO HABITACION");

        jComboBoxEXTRA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HABITACION MAXIMO 8 PERSONAS", "HABITACION MAXIMO 4 PERSONAS", "HABITACION MAXIMO 2 PERSONAS" }));

        javax.swing.GroupLayout jPanelREGISTRARLayout = new javax.swing.GroupLayout(jPanelREGISTRAR);
        jPanelREGISTRAR.setLayout(jPanelREGISTRARLayout);
        jPanelREGISTRARLayout.setHorizontalGroup(
            jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelREGISTRARLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldIDHOTEL, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIDHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIDTIPOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFielESTADOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBoxEXTRA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonlIMPIARCAMPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );
        jPanelREGISTRARLayout.setVerticalGroup(
            jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelREGISTRARLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldIDHOTEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldIDHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDTIPOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFielESTADOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelREGISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEXTRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonlIMPIARCAMPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelREGISTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 660, 430));

        jPanelMODIFICAR.setBackground(new java.awt.Color(114, 195, 209));
        jPanelMODIFICAR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MODIFICAR"));
        jPanelMODIFICAR.setToolTipText("");

        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID HABITACION", "ID HOTEL", "ID TIPO HABITACION", "ID ESTADO HABITACION", "PRECIO", "EXTRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableModificar.setCellSelectionEnabled(true);
        jTableModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModificarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableModificar);

        jLabel12.setText("LISTA DE HABITACIONES REGISTRADAS");

        jButtonModificarGuardar.setText("GUARDAR");
        jButtonModificarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarGuardarActionPerformed(evt);
            }
        });

        jButtonRegresar1.setText("REGRESAR");
        jButtonRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresar1MouseClicked(evt);
            }
        });
        jButtonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresar1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID TIPO HABITACION");

        jLabel3.setText("ID HABITACION");

        jLabel5.setText("EXTRA");

        jLabel6.setText("PRECIO");

        jLabel9.setText("ID HOTEL");

        jLabel13.setText("ID ESTADO");

        jTextFieldIDTIPOHABITACION1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDTIPOHABITACION1ActionPerformed(evt);
            }
        });

        jTextFieldIDHABITACION1.setEditable(false);

        jTextFieldIDHOTEL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDHOTEL1ActionPerformed(evt);
            }
        });

        jLabel14.setText("BUSCAR POR ID HABITACION:");

        jButtonConfirmar.setText("CONFIRMAR");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMODIFICARLayout = new javax.swing.GroupLayout(jPanelMODIFICAR);
        jPanelMODIFICAR.setLayout(jPanelMODIFICARLayout);
        jPanelMODIFICARLayout.setHorizontalGroup(
            jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIDHABITACION1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldIDHOTEL1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIDTIPOHABITACION1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonModificarGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel5))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldIDESTADOHABITACION)
                                            .addComponent(jTextFieldPRECIO1)
                                            .addComponent(jTextFieldExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButtonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jTextFieldIngreseID1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonConfirmar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMODIFICARLayout.setVerticalGroup(
            jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngreseID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jButtonConfirmar))
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldIDHOTEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPRECIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanelMODIFICARLayout.createSequentialGroup()
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldIDHABITACION1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldIDESTADOHABITACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIDTIPOHABITACION1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMODIFICARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificarGuardar)
                    .addComponent(jButtonRegresar1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 660, 430));

        jPanelBUSCARPRECIO.setBackground(new java.awt.Color(114, 195, 209));
        jPanelBUSCARPRECIO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BUSCAR"));
        jPanelBUSCARPRECIO.setPreferredSize(new java.awt.Dimension(660, 430));

        jTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE HOTEL", "ID HABITACION", "PRECIO", "EXTRA", "NOMBRE ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuscar.setToolTipText("");
        jTableBuscar.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTableBuscar);

        jTextFieldBUSCARPRECIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBUSCARPRECIOActionPerformed(evt);
            }
        });

        jLabel15.setText("BUSCAR POR PRECIO:");

        jButtonConfirmar2.setText("CONFIRMAR");
        jButtonConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBUSCARPRECIOLayout = new javax.swing.GroupLayout(jPanelBUSCARPRECIO);
        jPanelBUSCARPRECIO.setLayout(jPanelBUSCARPRECIOLayout);
        jPanelBUSCARPRECIOLayout.setHorizontalGroup(
            jPanelBUSCARPRECIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBUSCARPRECIOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanelBUSCARPRECIOLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBUSCARPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButtonConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelBUSCARPRECIOLayout.setVerticalGroup(
            jPanelBUSCARPRECIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBUSCARPRECIOLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelBUSCARPRECIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBUSCARPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanelBUSCARPRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 660, 430));

        jPanelELIMINAR.setBackground(new java.awt.Color(114, 195, 209));
        jPanelELIMINAR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ELIMINAR"));
        jPanelELIMINAR.setPreferredSize(new java.awt.Dimension(660, 430));

        jTableEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID HABITACION", "ID HOTEL", "ID TIPO HABITACION", "ID ESTADO HABITACION", "PRECIO", "EXTRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableEliminar.setCellSelectionEnabled(true);
        jScrollPane3.setViewportView(jTableEliminar);

        jLabel16.setText("LISTAS DE HABITACIONES");

        jButtonELIMINAR1.setText("ELIMINAR");
        jButtonELIMINAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonELIMINAR1ActionPerformed(evt);
            }
        });

        jLabel17.setText("BUSCAR POR ID HABITACION:");

        jButtonConfirmar1.setText("CONFIRMAR");
        jButtonConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelELIMINARLayout = new javax.swing.GroupLayout(jPanelELIMINAR);
        jPanelELIMINAR.setLayout(jPanelELIMINARLayout);
        jPanelELIMINARLayout.setHorizontalGroup(
            jPanelELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelELIMINARLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanelELIMINARLayout.createSequentialGroup()
                        .addComponent(jTextFieldIngreseID2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonConfirmar1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelELIMINARLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanelELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelELIMINARLayout.createSequentialGroup()
                        .addComponent(jButtonELIMINAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelELIMINARLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelELIMINARLayout.setVerticalGroup(
            jPanelELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelELIMINARLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelELIMINARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngreseID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jButtonConfirmar1))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonELIMINAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        getContentPane().add(jPanelELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonREGISTRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonREGISTRARMouseClicked

    }//GEN-LAST:event_jButtonREGISTRARMouseClicked

    
    private void jButtonREGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREGISTRARActionPerformed
        this.PintarBotones();
        this.jButtonREGISTRAR.setBackground(new Color(255,204,204));
        this.esconderpanel();
        this.jPanelREGISTRAR.setVisible(true);        
    }//GEN-LAST:event_jButtonREGISTRARActionPerformed

    private void jButtonlIMPIARCAMPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonlIMPIARCAMPOSMouseClicked
        jTextFieldPRECIO.setText("");
        jTextFieldIDHABITACION.setText("");
        jTextFieldIDHOTEL.setText("");
        jTextFieldIDTIPOHABITACION.setText("");
        jTextFielESTADOHABITACION.setText("");
    }//GEN-LAST:event_jButtonlIMPIARCAMPOSMouseClicked

    private void jButtonlIMPIARCAMPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlIMPIARCAMPOSActionPerformed

    }//GEN-LAST:event_jButtonlIMPIARCAMPOSActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionC conn = new ConexionC();
        Connection con = conn.getConexion();

        try {

            ps = con.prepareStatement("INSERT INTO Habitacion (ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra) VALUES(?,?,?,?,?,?)");
            ps.setString(1, jTextFieldIDHABITACION.getText());
            ps.setString(2, jTextFieldIDHOTEL.getText());
            ps.setString(3, jTextFieldIDTIPOHABITACION.getText());
            ps.setString(4, jTextFielESTADOHABITACION.getText());
            ps.setString(5, jTextFieldPRECIO.getText());
            ps.setString(6, jComboBoxEXTRA.getSelectedItem().toString());

            int res = ps.executeUpdate();

            if(res>0){
                JOptionPane.showMessageDialog(null,"La Habitacion se ha guardado correctamente");
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"La Habitacion no se ha guardado");

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFielESTADOHABITACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielESTADOHABITACIONActionPerformed

    }//GEN-LAST:event_jTextFielESTADOHABITACIONActionPerformed

    private void jTableModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModificarMouseClicked

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ConexionC objCon = new ConexionC();
            Connection conn = objCon.getConexion();

            int Fila = jTableModificar.getSelectedRow();
            String ID = jTableModificar.getValueAt(Fila,0).toString();

            ps = conn.prepareStatement("SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion WHERE ID_Habitacion=?");
            ps.setString(1, ID);
            rs = ps.executeQuery();

            while (rs.next()) {
                jTextFieldIDHABITACION1.setText(rs.getString("ID_Habitacion"));
                jTextFieldIDHOTEL1.setText(rs.getString("ID_HOTEL"));
                jTextFieldIDTIPOHABITACION1.setText(rs.getString("ID_TIPO_HABITACION"));
                jTextFieldIDESTADOHABITACION.setText(rs.getString("ID_ESTADO_HABITACION"));
                jTextFieldPRECIO1.setText(rs.getString("precio"));
                jTextFieldExtra.setText(rs.getString("extra"));

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jTableModificarMouseClicked

    private void jButtonModificarGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarGuardarActionPerformed

        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionC conn = new ConexionC();
        Connection con = conn.getConexion();

        int Fila = jTableModificar.getSelectedRow();

        try {
            ps = con.prepareStatement("UPDATE Habitacion SET ID_HOTEL=?,ID_TIPO_HABITACION=?,ID_ESTADO_HABITACION=?,Precio=?,extra=? WHERE ID_Habitacion=?");

            ps.setString(6,jTextFieldIDHABITACION.getText());
            ps.setString(1, jTextFieldIDHOTEL.getText());
            ps.setString(2, jTextFieldIDTIPOHABITACION.getText());
            ps.setString(3, jTextFieldIDESTADOHABITACION.getText());
            ps.setString(4, jTextFieldPRECIO.getText());
            ps.setString(5, jTextFieldExtra.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null,"La Habitacion se ha modificado correctamente");
            jTableModificar.setValueAt(jTextFieldIDHABITACION.getText(), Fila, 0);
            jTableModificar.setValueAt(jTextFieldIDHOTEL.getText(), Fila, 1);
            jTableModificar.setValueAt(jTextFieldIDTIPOHABITACION.getText(), Fila, 2);
            jTableModificar.setValueAt(jTextFieldIDESTADOHABITACION.getText(), Fila, 3);
            jTableModificar.setValueAt(jTextFieldPRECIO.getText(), Fila, 4);
            jTableModificar.setValueAt(jTextFieldExtra.getText(), Fila, 5);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Habitacion no se ha modificado");
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButtonModificarGuardarActionPerformed

    private void jButtonRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresar1MouseClicked
        dispose();
    }//GEN-LAST:event_jButtonRegresar1MouseClicked

    private void jTextFieldIDTIPOHABITACION1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDTIPOHABITACION1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDTIPOHABITACION1ActionPerformed

    private void jTextFieldIDHOTEL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDHOTEL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDHOTEL1ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed

        String campo = jTextFieldIngreseID1.getText();
        String where = "";

        if(!"".equals(campo)){
            where = "WHERE ID_Habitacion = '" + campo + "'";
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTableModificar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();

            String sql = "SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion " + where;

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("ID HOTEL");
            modelo.addColumn("ID TIPO HABITACION");
            modelo.addColumn("ID ESTADO HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");

            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresar1ActionPerformed

    private void jTextFieldBUSCARPRECIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBUSCARPRECIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBUSCARPRECIOActionPerformed

    private void jButtonConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar2ActionPerformed

        String campo = jTextFieldBUSCARPRECIO.getText();
        String and = "";

        if(!"".equals(campo)){
            and = "AND Precio = '" + campo + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTableBuscar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();

            String sql = "SELECT nom_hotel,id_habitacion,precio,extra,nom_estado\n" + "FROM Habitacion \n" + "INNER JOIN Hotel\n" + "ON habitacion.id_hotel=hotel.id_hotel\n" +
            "INNER JOIN Estado_Habitacion\n" + "ON habitacion.id_estado_habitacion=Estado_Habitacion.id_estado_habitacion" + " " + and;

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("NOMBRE HOTEL");
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");
            modelo.addColumn("NOMBRE ESTADO");

            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButtonConfirmar2ActionPerformed

    private void jButtonELIMINAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonELIMINAR1ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        try {
            ConexionC ojbcon = new ConexionC();
            Connection conn = ojbcon.getConexion();

            int fila = jTableEliminar.getSelectedRow();
            String Id = jTableEliminar.getValueAt(fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM Habitacion WHERE ID_Habitacion=?");
            ps.setString(1, Id);
            ps.execute();

            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(null,"Se ha eliminado la Habitacion");

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButtonELIMINAR1ActionPerformed

    private void jButtonConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar1ActionPerformed

        String campo = jTextFieldIngreseID1.getText();
        String where = "";

        if(!"".equals(campo)){
            where = "WHERE ID_Habitacion = '" + campo + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jTableEliminar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionC conn = new ConexionC();
            Connection con = conn.getConexion();

            String sql = "SELECT ID_Habitacion,ID_HOTEL,ID_TIPO_HABITACION,ID_ESTADO_HABITACION,precio,extra FROM Habitacion " + where;

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID HABITACION");
            modelo.addColumn("ID HOTEL");
            modelo.addColumn("ID TIPO HABITACION");
            modelo.addColumn("ID ESTADO HABITACION");
            modelo.addColumn("PRECIO");
            modelo.addColumn("EXTRA");

            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i =0; i< cantidadColumnas ; i++){
                    filas[i]= rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButtonConfirmar1ActionPerformed

    private void jButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarMouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        this.PintarBotones();
        this.jButtonBuscar.setBackground(new Color(255,204,204));
        this.esconderpanel();
        this.jPanelBUSCARPRECIO.setVisible(true);
        this.buscar();
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void EDITARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EDITARMouseClicked

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        this.PintarBotones();
        this.EDITAR.setBackground(new Color(255,204,204));
        this.esconderpanel();
        this.jPanelMODIFICAR.setVisible(true);
        this.cargarmodificar();
        
    }//GEN-LAST:event_EDITARActionPerformed

    private void ELIMINARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELIMINARMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ELIMINARMouseClicked

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        this.PintarBotones();
        this.ELIMINAR.setBackground(new Color(255,204,204));
        this.esconderpanel();
        this.jPanelELIMINAR.setVisible(true);
        this.cargareliminar();
        
    }//GEN-LAST:event_ELIMINARActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMHABITACION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMHABITACION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDITAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonConfirmar1;
    private javax.swing.JButton jButtonConfirmar2;
    private javax.swing.JButton jButtonELIMINAR1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificarGuardar;
    private javax.swing.JButton jButtonREGISTRAR;
    private javax.swing.JButton jButtonRegresar1;
    private javax.swing.JButton jButtonlIMPIARCAMPOS;
    private javax.swing.JComboBox<String> jComboBoxEXTRA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBUSCARPRECIO;
    private javax.swing.JPanel jPanelELIMINAR;
    private javax.swing.JPanel jPanelMODIFICAR;
    private javax.swing.JPanel jPanelREGISTRAR;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableBuscar;
    private javax.swing.JTable jTableEliminar;
    private javax.swing.JTable jTableModificar;
    private javax.swing.JTextField jTextFielESTADOHABITACION;
    private javax.swing.JTextField jTextFieldBUSCARPRECIO;
    private javax.swing.JTextField jTextFieldExtra;
    private javax.swing.JTextField jTextFieldIDESTADOHABITACION;
    private javax.swing.JTextField jTextFieldIDHABITACION;
    private javax.swing.JTextField jTextFieldIDHABITACION1;
    private javax.swing.JTextField jTextFieldIDHOTEL;
    private javax.swing.JTextField jTextFieldIDHOTEL1;
    private javax.swing.JTextField jTextFieldIDTIPOHABITACION;
    private javax.swing.JTextField jTextFieldIDTIPOHABITACION1;
    private javax.swing.JTextField jTextFieldIngreseID1;
    private javax.swing.JTextField jTextFieldIngreseID2;
    private javax.swing.JTextField jTextFieldPRECIO;
    private javax.swing.JTextField jTextFieldPRECIO1;
    // End of variables declaration//GEN-END:variables
}
