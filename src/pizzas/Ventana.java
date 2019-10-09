/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Emmanuel
 */
public class Ventana extends javax.swing.JFrame {

    Acerca_De acerca;
    Icon icHawaiana, icVegetariana,icItaliana, icPeperoni, icSarten;
    private ArrayList <Pedido> pedido= null;
    
    public Ventana() {
        initComponents();
       acerca = new Acerca_De(this, true);
        calcularPrecio();
        pedido = new ArrayList<>();
        
       llenarPedidos();
       
       /*icHawaiana = new ImageIcon(getClass().getResource("hawaiana.jpg"));
       icItaliana = new ImageIcon(getClass().getResource("italiana.jpg"));
       icPeperoni = new ImageIcon(getClass().getResource("peperoni.jpg"));
       icSarten = new ImageIcon(getClass().getResource("sarten.jpg"));
       icVegetariana = new ImageIcon(getClass().getResource("vegetariana.jpg"));
       */
       
       
       lbl_imagen.setSize(200,200);
       
       //      HAWAIANA
       //Se obtiene la imagen de donde la tengamos
        ImageIcon imgIconHw = new ImageIcon(getClass().getResource("hawaiana.jpg"));
        //Escala la imagen
        Image imgEscaladaHw = imgIconHw.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icHawaiana = new ImageIcon(imgEscaladaHw);
        //Se setea la imagen en el Label
        lbl_imagen.setIcon(icHawaiana);
       
        //      ITALIANA
        //Se obtiene la imagen de donde la tengamos
        ImageIcon imgIconIt = new ImageIcon(getClass().getResource("italiana.jpg"));
        //Escala la imagen
        Image imgEscaladaIt = imgIconIt.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icItaliana = new ImageIcon(imgEscaladaIt);
        //Se setea la imagen en el Label
        lbl_imagen.setIcon(icItaliana);
        
        //      PEPERONI
        //Se obtiene la imagen de donde la tengamos
        ImageIcon imgIconPe = new ImageIcon(getClass().getResource("peperoni.jpg"));
        //Escala la imagen
        Image imgEscaladaPe = imgIconPe.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icPeperoni = new ImageIcon(imgEscaladaPe);
        //Se setea la imagen en el Label
        lbl_imagen.setIcon(icPeperoni);
       
        //      SARTEN
        //Se obtiene la imagen de donde la tengamos
        ImageIcon imgIconSa = new ImageIcon(getClass().getResource("sarten.jpg"));
        //Escala la imagen
        Image imgEscaladaSa = imgIconSa.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icSarten = new ImageIcon(imgEscaladaSa);
        //Se setea la imagen en el Label
        lbl_imagen.setIcon(icSarten);
        
        //      VEGETARIANA
        //Se obtiene la imagen de donde la tengamos
        ImageIcon imgIconVe = new ImageIcon(getClass().getResource("vegetariana.jpg"));
        //Escala la imagen
        Image imgEscaladaVe = imgIconVe.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icVegetariana = new ImageIcon(imgEscaladaVe);
        //Se setea la imagen en el Label
        lbl_imagen.setIcon(icVegetariana);
        
    }
    //Onjetos de prueba
    private void llenarPedidos(){
            
        pedido.add( new Pedido("Emmanuel", "Hawaiana", "Grande", "Queso", 110));
        pedido.add( new Pedido("pepe", "peperoni", "mediana", "Biscochos", 220));
        pedido.add( new Pedido("jose", "sartén", "chica", "hot Papas", 250));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cbxSeleccionarPizza = new javax.swing.JComboBox<>();
        rbChica = new javax.swing.JRadioButton();
        rbMediana = new javax.swing.JRadioButton();
        rbGrande = new javax.swing.JRadioButton();
        rbFamiliar = new javax.swing.JRadioButton();
        cbExtraQueso = new javax.swing.JCheckBox();
        cbOrillaRellena = new javax.swing.JCheckBox();
        cbHotPapas = new javax.swing.JCheckBox();
        cbBiscochos = new javax.swing.JCheckBox();
        tfNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentasDia = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lbTotalVentas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbPrecioTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taNota = new javax.swing.JTextArea();
        btn_imprimir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 107, 213));

        jButton2.setText("Acerca de");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione como quiere su pizza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 14))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setName("Seleccione Pizza"); // NOI18N

        cbxSeleccionarPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione Pizza --", "Hawaiana", "Vegetariana", "Peperoni", "Italiana", "De Sartén" }));
        cbxSeleccionarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarPizzaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbChica);
        rbChica.setSelected(true);
        rbChica.setText("Chica");
        rbChica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMediana);
        rbMediana.setText("Mediana");
        rbMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbGrande);
        rbGrande.setText("Grande");
        rbGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFamiliar);
        rbFamiliar.setText("Familiar");
        rbFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        cbExtraQueso.setText("Extra queso");
        cbExtraQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        cbOrillaRellena.setText("Orilla Rellena");
        cbOrillaRellena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        cbHotPapas.setText("Hot Papas");
        cbHotPapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        cbBiscochos.setText("Biscochos");
        cbBiscochos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChicaActionPerformed(evt);
            }
        });

        tfNombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNombreClienteFocusGained(evt);
            }
        });

        jLabel1.setText("Nombre Cliente");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview"));

        lbl_imagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSeleccionarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbChica)
                            .addComponent(rbMediana)
                            .addComponent(rbGrande)
                            .addComponent(rbFamiliar))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbExtraQueso)
                            .addComponent(cbBiscochos)
                            .addComponent(cbHotPapas)
                            .addComponent(cbOrillaRellena))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(341, 341, 341))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cbxSeleccionarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbChica)
                            .addComponent(cbExtraQueso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMediana)
                            .addComponent(cbOrillaRellena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbGrande)
                            .addComponent(cbHotPapas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbFamiliar)
                            .addComponent(cbBiscochos))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Generar Pedido", jPanel3);

        tbVentasDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Cliente", "Pizza", "Tamaño", "Extras", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbVentasDia);

        jLabel3.setText("Ventas Del Dia");

        lbTotalVentas.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbTotalVentas.setText("0.00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbTotalVentas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENTAS", jPanel4);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tunga", 0, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        lbPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecioTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPrecioTotal.setText("0.00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pague:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzas/repartidor2.png"))); // NOI18N
        jButton1.setText("Pedir Pizza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));

        taNota.setColumns(20);
        taNota.setFont(new java.awt.Font("Courier 10 Pitch", 0, 13)); // NOI18N
        taNota.setRows(5);
        jScrollPane2.setViewportView(taNota);

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_imprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_imprimir)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton2)
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSeleccionarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarPizzaActionPerformed
        lbl_imagen.setIcon(null);
        switch(cbxSeleccionarPizza.getSelectedIndex()){
            case 0:
                lbl_imagen.setIcon(null);
                break;            
            case 1:
                lbl_imagen.setIcon(icHawaiana);
                break;
            case 2:
                lbl_imagen.setIcon(icVegetariana);
                break;
            case 3:
                lbl_imagen.setIcon(icPeperoni);
                break;
            case 4:
                lbl_imagen.setIcon(icItaliana);
                break;
            case 5:
                lbl_imagen.setIcon(icSarten);
                break;
        }
        
        calcularPrecio();
    }//GEN-LAST:event_cbxSeleccionarPizzaActionPerformed

    private void rbChicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChicaActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_rbChicaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nombreCliente = tfNombreCliente.getText();
    
    String tamaño = null;
    if(rbChica.isSelected()) tamaño = "Chica";
    if(rbMediana.isSelected()) tamaño = "Mediana";
    if(rbGrande.isSelected()) tamaño = "Grande";
    if(rbFamiliar.isSelected()) tamaño = "Familiar";
    
    String extras = "";
    if(cbExtraQueso.isSelected()) extras+= " ExtraQueso ";
    if(cbHotPapas.isSelected()) extras+= " HotPapas ";
    if(cbOrillaRellena.isSelected()) extras+= " OrillaRellena ";
    if(cbBiscochos.isSelected()) extras+= " Biscochos ";
    
    String saborPizza = null;
    saborPizza = cbxSeleccionarPizza.getItemAt(cbxSeleccionarPizza.getSelectedIndex());
    
    if(cbxSeleccionarPizza.getSelectedIndex() != 0){
    
        int a =0;
        if(tfNombreCliente.getText() == null || tfNombreCliente.getText().equals(""))
        a = JOptionPane.showConfirmDialog(rootPane, "Continuar sin nombre?");
        
        if(a == 0){
            double precio = Double.parseDouble(lbPrecioTotal.getText());
            pedido.add( new Pedido(nombreCliente, saborPizza, tamaño, extras, precio));

            int r=0;
            for (Pedido p : pedido) {

                    tbVentasDia.setValueAt(p.getNombreCliente(), r, 0);
                    tbVentasDia.setValueAt(p.getSaborPizza(), r, 1);
                    tbVentasDia.setValueAt(p.getTamaño(), r, 2);
                    tbVentasDia.setValueAt(p.getExtras(), r, 3);
                    tbVentasDia.setValueAt(p.getPrecio(), r, 4);
                    r++;
                    int ventas = 0;
                for (Pedido q: pedido) {
                    ventas += q.getPrecio();
                    lbTotalVentas.setText(String.valueOf(ventas));
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Su pizza va en camino");
        }else{
            tfNombreCliente.setBackground(Color.red);
        }
    }
    else {
    JOptionPane.showMessageDialog(rootPane, "Seleccione su pizza por favor");
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNombreClienteFocusGained
        tfNombreCliente.setBackground(Color.WHITE);
    }//GEN-LAST:event_tfNombreClienteFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        acerca.setTitle("Acerca de pizzeria patito");
        acerca.setResizable(false);
        acerca.setLocationRelativeTo(null);
        acerca.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        
        try {
            taNota.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //Navegador de archivos
        JFileChooser browser = new JFileChooser();
        
        //Regresa 0 si se obtiene el archivo con exito
        //Regresa 1 si se da click en cancelar o cerrar
        int resultado = browser.showSaveDialog(null);
        
        //Filtro de dialogo de archivos
        FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivo de texto", "txt");
        
        //Se aplica filtro al explorador de archivos
        browser.setFileFilter(filtro);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbBiscochos;
    private javax.swing.JCheckBox cbExtraQueso;
    private javax.swing.JCheckBox cbHotPapas;
    private javax.swing.JCheckBox cbOrillaRellena;
    private javax.swing.JComboBox<String> cbxSeleccionarPizza;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbPrecioTotal;
    private javax.swing.JLabel lbTotalVentas;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JRadioButton rbChica;
    private javax.swing.JRadioButton rbFamiliar;
    private javax.swing.JRadioButton rbGrande;
    private javax.swing.JRadioButton rbMediana;
    private javax.swing.JTextArea taNota;
    private javax.swing.JTable tbVentasDia;
    private javax.swing.JTextField tfNombreCliente;
    // End of variables declaration//GEN-END:variables

    public void calcularPrecio() {
        
        final int CHICA = 0, MEDIANA = 1, GRANDE = 2, FAMILIAR =3;
        int precio = 0;
        int tam=0;
        if (rbChica.isSelected()) 
            tam =CHICA;
        else if (rbMediana.isSelected())
            tam=MEDIANA;
        else if (rbGrande.isSelected())
            tam=GRANDE;
        else if (rbFamiliar.isSelected())
            tam=FAMILIAR;
        
        switch (cbxSeleccionarPizza.getSelectedIndex()){
            case 0:
                switch(tam) {
                    case CHICA: precio = 90; break;
                    case MEDIANA: precio = 120; break;
                    case GRANDE: precio = 170; break;
                    case FAMILIAR: precio = 260; break;
                }
                break;
            case 1:
                switch(tam) {
                    case CHICA: precio = 90; break;
                    case MEDIANA: precio = 120; break;
                    case GRANDE: precio = 170; break;
                    case FAMILIAR: precio = 260; break;
                }
                break;
            case 2:
                switch(tam) {
                    case CHICA: precio = 90; break;
                    case MEDIANA: precio = 120; break;
                    case GRANDE: precio = 170; break;
                    case FAMILIAR: precio = 260; break;
                }
                break;
            case 3:
                switch(tam) {
                    case CHICA: precio = 90; break;
                    case MEDIANA: precio = 120; break;
                    case GRANDE: precio = 170; break;
                    case FAMILIAR: precio = 260; break;
                }
                break;
            case 4:
                switch(tam) {
                    case CHICA: precio = 90; break;
                    case MEDIANA: precio = 120; break;
                    case GRANDE: precio = 170; break;
                    case FAMILIAR: precio = 260; break;
                }
                break;
        }
        if (cbExtraQueso.isSelected()) precio += 10;
        if (cbOrillaRellena.isSelected()) precio += 10;
        if (cbHotPapas.isSelected()) precio += 10;
        if (cbBiscochos.isSelected()) precio += 10;
        
        lbPrecioTotal.setText(String.valueOf(precio));
        
        genera_Nota();
    }
    
    public void genera_Nota(){
        taNota.setText("=== Pizzería patito===\n");
        taNota.append("----------------------");
    }
}
