
package Visual;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import Modelo.Usuario;
import javax.swing.JOptionPane;
/**
 *
 * @author palmachis7
 */
public class Visual_Venta extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos;
    Thread hilo;
    Usuario u;
    /**
     * Creates new form Venta
     */
    public Visual_Venta() {
        initComponents();
       lblFecha.setText(fecha());
      hilo= new Thread(this);
       hilo.start();
        setVisible(true);
        this.setLocationRelativeTo(null);
         lblUsuario.setText("admin");
        
    }
    
    
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaactual =new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
       
    }

    public void run(){
    //while
    Thread current =Thread.currentThread();
    while(current==hilo){
    hora();
    lblHora.setText(hora+":"+minutos+":"+segundos);
    
    }
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCli = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        lblCod = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JTextField();
        spCantidad = new javax.swing.JSpinner();
        lblTitulo = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JTextField();
        btnEliminar3 = new javax.swing.JButton();
        btnEliminar4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblStock = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_32px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 40, 40));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 74, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-barcode.png"))); // NOI18N
        jLabel11.setText("Cod Producto:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 20));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 74, 150));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-numerology_square.png"))); // NOI18N
        jLabel16.setText("Cantidad:");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(60, 74, 150));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-bonds.png"))); // NOI18N
        jLabel20.setText("Precio:");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 74, 150));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-open_box_filled.png"))); // NOI18N
        jLabel21.setText("Stock:");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, -1));

        lblCli.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCli.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(lblCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 20));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 150, 20));

        lblCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 20));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 202, 150, -1));
        jPanel1.add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 20));

        lblTitulo.setBackground(new java.awt.Color(60, 74, 150));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(60, 74, 150));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REALIZAR VENTA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 620, -1));

        btnBuscarProducto.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarProducto.setForeground(new java.awt.Color(60, 74, 150));
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search_more.png"))); // NOI18N
        btnBuscarProducto.setToolTipText("");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 50, 30));

        btnBuscarCliente.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarCliente.setForeground(new java.awt.Color(60, 74, 150));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-search_more.png"))); // NOI18N
        btnBuscarCliente.setToolTipText("");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 82, 50, 30));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 74, 150));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_id_card_filled_18px.png"))); // NOI18N
        jLabel22.setText("Cod Cliente:");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 130, -1));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 74, 150));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-client_management.png"))); // NOI18N
        jLabel23.setText("Cliente:");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 130, -1));

        lblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 170, 20));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(60, 74, 150));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Atendido por:");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, -1));

        lblProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        lblProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblProductoActionPerformed(evt);
            }
        });
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, 20));

        btnEliminar3.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar3.setForeground(new java.awt.Color(60, 74, 150));
        btnEliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_add_filled_16px.png"))); // NOI18N
        btnEliminar3.setText("Nueva Venta");
        btnEliminar3.setToolTipText("");
        btnEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 170, -1));

        btnEliminar4.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar4.setForeground(new java.awt.Color(60, 74, 150));
        btnEliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-sell_filled.png"))); // NOI18N
        btnEliminar4.setText("Realizar Ventas");
        btnEliminar4.setToolTipText("");
        btnEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 170, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 74, 150));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-money_bag_pound.png"))); // NOI18N
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStock.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        lblStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblStockActionPerformed(evt);
            }
        });
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 170, 20));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 74, 150));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-clothes.png"))); // NOI18N
        jLabel25.setText("Producto:");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 130, -1));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 74, 150));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Fecha:");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 70, -1));

        lblFecha.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, 20));

        lblHora.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 90, 20));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(60, 74, 150));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Hora:");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 40, -1));

        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        PrincipalAdmin p =  new PrincipalAdmin();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
         lblProducto.setText("pantalones");
         lblStock.setText("2");
         lblPrecio.setText("190");
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        lblCliente.setText("Juan 123");
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void lblProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductoActionPerformed

    private void btnEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar3ActionPerformed
        lblProducto.setText("");
         lblStock.setText("");
         lblPrecio.setText(""); 
         lblCli.setText("");
         lblCod.setText(" ");
         lblCliente.setText("");
         txtTotal.setText("");
         
    }//GEN-LAST:event_btnEliminar3ActionPerformed

    private void btnEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar4ActionPerformed
       int precio= Integer.parseInt(lblPrecio.getText());
        int cantidad = (Integer) spCantidad.getValue();       
        int  total=precio*cantidad;
       String totals=  Integer.toString(total);
      txtTotal.setText(totals);
        JOptionPane.showMessageDialog(this, "Venta realizada con exito");
    }//GEN-LAST:event_btnEliminar4ActionPerformed

    private void lblStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStockActionPerformed

    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYY");
        return formatofecha.format(fecha);
        

    }
    
    
    
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
            java.util.logging.Logger.getLogger(Visual_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCli;
    private javax.swing.JTextField lblCliente;
    private javax.swing.JTextField lblCod;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTextField lblPrecio;
    private javax.swing.JTextField lblProducto;
    private javax.swing.JTextField lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
