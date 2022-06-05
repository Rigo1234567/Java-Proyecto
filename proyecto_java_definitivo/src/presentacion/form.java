
package presentacion;

import clases.csprestamopresonal;
import clases.csprestamovivienda;
import clases.cspymes;
import clases.funciones;
import clases.funciones_prestamos_aprobados;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class form extends javax.swing.JFrame {
    
     
    

    public form() {
        initComponents();
        this.setLocationRelativeTo(null);
        funciones.CargarClientes();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        prestamos = new javax.swing.ButtonGroup();
        estadoclientes = new javax.swing.ButtonGroup();
        pnldatos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtingreso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtidentificacion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtmeses = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        txtprimerapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsegundoapellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pnlprestamos = new javax.swing.JPanel();
        pnlpersonal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidadproductos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbestadoclientes = new javax.swing.JComboBox<>();
        pnlvivienda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtmetroscuadrados = new javax.swing.JTextField();
        pnlpymes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtcantidadempleados = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbtnvivienda = new javax.swing.JRadioButton();
        rbtpersonal = new javax.swing.JRadioButton();
        rbtnpymes = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel9.setText("edad");

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel11.setText("meses a cancelar");

        txtidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentificacionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel7.setText("identificacion");

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel12.setText("ingreso mensual");

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel10.setText("monto prestamo");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel8.setText("nombre");

        btn1.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        btn1.setText("ingresar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jLabel6.setText("PRIMER APELLIDO");

        jLabel13.setFont(new java.awt.Font("Showcard Gothic", 0, 10)); // NOI18N
        jLabel13.setText("segundo apellido");

        javax.swing.GroupLayout pnldatosLayout = new javax.swing.GroupLayout(pnldatos);
        pnldatos.setLayout(pnldatosLayout);
        pnldatosLayout.setHorizontalGroup(
            pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosLayout.createSequentialGroup()
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnldatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnldatosLayout.createSequentialGroup()
                                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnldatosLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel8))
                                    .addGroup(pnldatosLayout.createSequentialGroup()
                                        .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(37, 37, 37)
                                        .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(txtidentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(txtprimerapellido))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnldatosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnldatosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(pnldatosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnldatosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmeses, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnldatosLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnldatosLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnldatosLayout.setVerticalGroup(
            pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtmeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlprestamosLayout = new javax.swing.GroupLayout(pnlprestamos);
        pnlprestamos.setLayout(pnlprestamosLayout);
        pnlprestamosLayout.setHorizontalGroup(
            pnlprestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlprestamosLayout.setVerticalGroup(
            pnlprestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jLabel2.setText("cantidad de productos");

        txtcantidadproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadproductosActionPerformed(evt);
            }
        });

        jLabel1.setText("estado cliente");

        cmbestadoclientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "nuevo" }));

        javax.swing.GroupLayout pnlpersonalLayout = new javax.swing.GroupLayout(pnlpersonal);
        pnlpersonal.setLayout(pnlpersonalLayout);
        pnlpersonalLayout.setHorizontalGroup(
            pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpersonalLayout.createSequentialGroup()
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlpersonalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbestadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlpersonalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcantidadproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlpersonalLayout.setVerticalGroup(
            pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbestadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlpersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidadproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel3.setText("metros cuadrados vivenda");

        txtmetroscuadrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmetroscuadradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlviviendaLayout = new javax.swing.GroupLayout(pnlvivienda);
        pnlvivienda.setLayout(pnlviviendaLayout);
        pnlviviendaLayout.setHorizontalGroup(
            pnlviviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlviviendaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmetroscuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlviviendaLayout.setVerticalGroup(
            pnlviviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlviviendaLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnlviviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmetroscuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setText("cantidad de empleados");

        javax.swing.GroupLayout pnlpymesLayout = new javax.swing.GroupLayout(pnlpymes);
        pnlpymes.setLayout(pnlpymesLayout);
        pnlpymesLayout.setHorizontalGroup(
            pnlpymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpymesLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(txtcantidadempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlpymesLayout.setVerticalGroup(
            pnlpymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlpymesLayout.createSequentialGroup()
                .addGroup(pnlpymesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcantidadempleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        btnback.setText("REGRESAR");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("tipo de préstamo");

        prestamos.add(rbtnvivienda);
        rbtnvivienda.setText("vivienda");
        rbtnvivienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtpersonalItemStateChanged(evt);
            }
        });
        rbtnvivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnviviendaActionPerformed(evt);
            }
        });

        prestamos.add(rbtpersonal);
        rbtpersonal.setText("personal");
        rbtpersonal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtpersonalItemStateChanged(evt);
            }
        });
        rbtpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtpersonalActionPerformed(evt);
            }
        });

        prestamos.add(rbtnpymes);
        rbtnpymes.setText("pymes");
        rbtnpymes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtpersonalItemStateChanged(evt);
            }
        });
        rbtnpymes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnpymesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(pnldatos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(rbtpersonal)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnvivienda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnpymes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlpymes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                .addComponent(pnlprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnldatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtpersonal)
                            .addComponent(rbtnpymes)
                            .addComponent(rbtnvivienda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlvivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlpymes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnback)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void txtidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentificacionActionPerformed
        if (txtidentificacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"no puede dejar campos vacios" );            
        }
        
    }//GEN-LAST:event_txtidentificacionActionPerformed
// declaracion de boton calcular
// se hacen las respectivas valoraciones    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
       // lo que hacemos es que creamos un cuadro de interrogación en caso de que aprobar el préstamo sea verdadero
       //y que el cliente acepte las condiciones proceederemos a guardar el cliente en el archivo préstamos aprobados
        try{
            
            int idencot=(int)(Math.random()*1000+0);
        LocalDate txtfecha  = LocalDate.now();
         
        int edad = Integer.parseInt(txtedad.getText());
        
        int monto=Integer.parseInt(txtmonto.getText());
        
            if (txtidentificacion.getText().isEmpty() || txtnombre.getText().isEmpty() || txtmeses.getText().isEmpty() || txtingreso.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"no puede dejar campos vacios" );
        return;
        }
             if (txtprimerapellido.getText().isEmpty() && txtsegundoapellido.getText().isEmpty() && txtidentificacion.getText().isEmpty() && txtnombre.getText().isEmpty() && txtmeses.getText().isEmpty() && txtingreso.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"no puede dejar campos vacios" );
        return;
        }
            
            
            if (edad < 18 || edad > 100 ){
        JOptionPane.showMessageDialog(null," error debes tener una edad entre 18 y 100 años" );
        return;
        }
            if (monto < 300000 || monto > 15000000 ){
        JOptionPane.showMessageDialog(null,"solo se pueden hacer solicitudes de prestamo entre 300 mil y 15 millones" );
        return;
        }
            
           
            
            if (txtnombre.getText().length() > 50  ){
        JOptionPane.showMessageDialog(null,"el campo nombre no puede tener mas de 50 caracteres" );
        return;
        }
             if (txtidentificacion.getText().length()>10){
        JOptionPane.showMessageDialog(null,"el campo identificacion debe ser 10 caracteres o menos" );
        return;
        }
           // aquí se crea el objeto original pero en este caso no lo usamos
           // cotizacion registro = new cotizacion(txtidentificacion.getText(),txtnombre.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText()));
         
         
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"debe digitar solo numeros en los campos numéricos" );
        }
        
        // dependiendo de cual botón esté seleccionado se van a hacer las respectuvas
        //validaciones
        if (rbtpersonal.isSelected()){
            
            try{
                
                int idencot=(int)(Math.random()*1000+0);
        LocalDate txtfecha  = LocalDate.now();
                int estadocliente=cmbestadoclientes.getSelectedIndex();
            int cantidadproductos=Integer.parseInt(txtcantidadproductos.getText());
            if(estadocliente==0){
                csprestamopresonal per = new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText()));
                funciones.AgregarClientes(new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
           JOptionPane.showMessageDialog(null, per.ver());
            
           int respuesta = JOptionPane.showConfirmDialog(null, "desea continuar con la solicitud");
           int respuesta_entidad = JOptionPane.showConfirmDialog(null, "aprobar el préstamo");
             if (respuesta == 0 && respuesta_entidad == 0){
                    funciones_prestamos_aprobados.AgregarClientes(new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                    
                    JOptionPane.showMessageDialog(null, "felicidades tu prestamo fue aprobado");
                }
             if (respuesta == 1 || respuesta_entidad == 1){
                    JOptionPane.showMessageDialog(null, "su solicitud fue cancelada o no aprobada de igual manera gracias por usar nuestros servicios");
                }
            }
            
            
            if(estadocliente==1){
                funciones_prestamos_aprobados.AgregarClientes(new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                csprestamopresonal per = new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText()));
                
           JOptionPane.showMessageDialog(null, per.most());
            
            int respuesta = JOptionPane.showConfirmDialog(null, "desea continuar con la solicitud");
            int respuesta_entidad = JOptionPane.showConfirmDialog(null, "aprobar el préstamo");
             if (respuesta == 0 && respuesta_entidad == 0){
                    funciones_prestamos_aprobados.AgregarClientes(new csprestamopresonal( estadocliente, cantidadproductos,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                    JOptionPane.showMessageDialog(null, "felicidades tu prestamo fue aprobado");
                }
             if (respuesta == 1 || respuesta_entidad == 1){
                    JOptionPane.showMessageDialog(null, "su solicitud fue cancelada o no aprobada de igual manera gracias por usar nuestros servicios");
                }
           
            }    
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "no puede poner letras en campos numericos");
            }
            
            
        }
        
        
        if (rbtnvivienda.isSelected()){
            
            try{
                
                int idencot=(int)(Math.random()*1000+0);
        LocalDate txtfecha  = LocalDate.now();
                int metroscuadrados=Integer.parseInt(txtmetroscuadrados.getText());
            
                
             funciones.AgregarClientes(new csprestamovivienda( metroscuadrados,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
             csprestamovivienda viv = new csprestamovivienda( metroscuadrados,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText()));
            JOptionPane.showMessageDialog(null, viv.mostrar());
            
                int respuesta = JOptionPane.showConfirmDialog(null, "desea continuar con la solicitud");
                int respuesta_entidad = JOptionPane.showConfirmDialog(null, "aprobar el préstamo");
                if (respuesta == 0 && respuesta_entidad==0 ){
                    funciones_prestamos_aprobados.AgregarClientes(new csprestamovivienda( metroscuadrados,  txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                    JOptionPane.showMessageDialog(null, "felicidades tu prestamo fue aprobado");
                }
                if (respuesta == 1 || respuesta_entidad==1){
                    JOptionPane.showMessageDialog(null, "su solicitud fue cancelada o no aprobadade igual manera gracias por usar nuestros servicios");
                }
            
            
            
            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "no puede poner letras en campos numericos");
            }
            
        }
        
        
        
        if (rbtnpymes.isSelected()){
            
            
             
            
            try{
                
                int cantidadempleados;
                int idencot=(int)(Math.random()*1000+0);
        LocalDate txtfecha  = LocalDate.now();
                if(txtcantidadempleados.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "error no puede dejar campos vacios");
                }
                 if (funciones.BuscarClientes(txtidentificacion.getText())) {
                JOptionPane.showMessageDialog(null, "Ese identificador ya existe");
                return;
            }
               
                funciones.AgregarClientespymes(new cspymes(Integer.parseInt(txtcantidadempleados.getText()), txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                
            cspymes pym = new cspymes( Integer.parseInt(txtcantidadempleados.getText()), txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText()));
            //funciones.escribir(pym.toString());
            funciones.CargarClientes();
            JOptionPane.showMessageDialog(null, pym.mostrar());
            
            
            
             int respuesta = JOptionPane.showConfirmDialog(null, "desea continuar con la solicitud");
                int respuesta_entidad = JOptionPane.showConfirmDialog(null, "aprobar el préstamo");
                if (respuesta == 0 && respuesta_entidad==0){
                    funciones_prestamos_aprobados.AgregarClientes(new cspymes(Integer.parseInt(txtcantidadempleados.getText()), txtidentificacion.getText(),txtnombre.getText(),txtprimerapellido.getText(),txtsegundoapellido.getText(),Integer.parseInt(txtedad.getText()),Integer.parseInt(txtingreso.getText()),idencot,txtfecha,Integer.parseInt(txtmonto.getText()),Integer.parseInt(txtmeses.getText())));
                    
                    JOptionPane.showMessageDialog(null, "felicidades tu prestamo fue aprobado");
                    
                }
                if (respuesta == 1 || respuesta_entidad== 1){
                    JOptionPane.showMessageDialog(null, " su solicitud fue cancelada o no aprobada de igual manera gracias por usar nuestros servicios");
                }
            
            
            
            
            
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "error no puede digitar letras en campos numericos");
            }
            
           
        }
        
        
        
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtcantidadproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadproductosActionPerformed
        if (txtcantidadproductos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"no puede dejar campos vacios" );
            
        }
    }//GEN-LAST:event_txtcantidadproductosActionPerformed

    
    // dependiendo del radio button que esté seleccionado se mostrará cada panel
    private void rbtpersonalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtpersonalItemStateChanged
        if (rbtpersonal.isSelected()){
            pnlpersonal.setVisible(true);      
        }else {
            pnlpersonal.setVisible(false);
        }
        
        if (rbtnvivienda.isSelected()){
            pnlvivienda.setVisible(true);      
        }else {
            pnlvivienda.setVisible(false);
        }
        if (rbtnpymes.isSelected()){
            pnlpymes.setVisible(true);      
        }else {
            pnlpymes.setVisible(false);
        }
        
        
        
            
    }//GEN-LAST:event_rbtpersonalItemStateChanged

    private void rbtnviviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnviviendaActionPerformed
        if (rbtnvivienda.isSelected()){
            pnlvivienda.setVisible(true);      
        }else {
            pnlvivienda.setVisible(false);
        }
    }//GEN-LAST:event_rbtnviviendaActionPerformed

    private void txtmetroscuadradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmetroscuadradosActionPerformed
        if (txtmetroscuadrados.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"no puede dejar campos vacios" );
            
        }
    }//GEN-LAST:event_txtmetroscuadradosActionPerformed

    private void rbtpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtpersonalActionPerformed
        if (rbtpersonal.isSelected()){
            pnlpersonal.setVisible(true);      
        }else {
            pnlpersonal.setVisible(false);
        }
    }//GEN-LAST:event_rbtpersonalActionPerformed

   // aquí declaramos que cuando el formulario se inicie rbtpersonal esté selleccionado
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rbtpersonal.setSelected(true);
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void rbtnpymesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnpymesActionPerformed
        if(rbtnpymes.isSelected()){
            pnlpymes.setVisible(true);
        }else{
             pnlpymes.setVisible(false);
        }
    }//GEN-LAST:event_rbtnpymesActionPerformed

    
    public static void main(String args[]) {
        
        


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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cmbestadoclientes;
    private javax.swing.ButtonGroup estadoclientes;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
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
    private javax.swing.JPanel pnldatos;
    private javax.swing.JPanel pnlpersonal;
    private javax.swing.JPanel pnlprestamos;
    private javax.swing.JPanel pnlpymes;
    private javax.swing.JPanel pnlvivienda;
    private javax.swing.ButtonGroup prestamos;
    private javax.swing.JRadioButton rbtnpymes;
    private javax.swing.JRadioButton rbtnvivienda;
    private javax.swing.JRadioButton rbtpersonal;
    private javax.swing.JTextField txtcantidadempleados;
    private javax.swing.JTextField txtcantidadproductos;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtingreso;
    private javax.swing.JTextField txtmeses;
    private javax.swing.JTextField txtmetroscuadrados;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprimerapellido;
    private javax.swing.JTextField txtsegundoapellido;
    // End of variables declaration//GEN-END:variables
}
