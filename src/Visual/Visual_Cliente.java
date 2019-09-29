
package Visual;

import Clases.Cliente;
import Otros.Limpiar_txt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palmachris7
 */
public class Visual_Cliente extends javax.swing.JFrame {
    int x,y;
    
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Cliente>  lista= new ArrayList<Cliente>();
    int id;
    private String ruta_txt = "usuario.txt"; 
     Limpiar_txt lt = new Limpiar_txt();
    public Visual_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        
            
    }   

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtTelf = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "DIRECCION", "ESTADO"
            }
        ));
        tabla.setRowHeight(30);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(60, 74, 150)));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 440));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 74, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_name_18px.png"))); // NOI18N
        jLabel10.setText("Nombres:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 74, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_id_card_filled_18px.png"))); // NOI18N
        jLabel11.setText("Dni:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 74, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_address_18px_2.png"))); // NOI18N
        jLabel12.setText("Direccion: ");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 74, 150));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_unknown_status_filled_18px.png"))); // NOI18N
        jLabel13.setText("Estado: ");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, 30));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 250, 20));

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 20));

        txtTelf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, -1));

        txtDir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDir.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "NOMBRES", "DIRECCION", "TELEFONO", "ESTADO"
            }
        ));
        tabla1.setAutoscrolls(false);
        tabla1.setRowHeight(30);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        tabla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 660, 150));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setForeground(new java.awt.Color(60, 74, 150));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_16px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 100, -1));

        BtnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        BtnLimpiar.setForeground(new java.awt.Color(60, 74, 150));
        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_erase_16px.png"))); // NOI18N
        BtnLimpiar.setText("Borrar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 190, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 74, 150));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_phone_filled_18px.png"))); // NOI18N
        jLabel14.setText("Telefono:");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR ", "1", "0" }));
        cboEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 250, -1));

        btnActualizar.setBackground(new java.awt.Color(153, 153, 153));
        btnActualizar.setForeground(new java.awt.Color(60, 74, 150));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_edit_property_16px.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 110, -1));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setForeground(new java.awt.Color(60, 74, 150));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_add_filled_16px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 190, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_32px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        jLabel1.setBackground(new java.awt.Color(60, 74, 150));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 74, 150));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       
        
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaKeyPressed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int fila = tabla1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            id = Integer.parseInt(tabla1.getValueAt(fila, 0).toString());
            String dni = tabla1.getValueAt(fila, 1).toString();
            String nom = tabla1.getValueAt(fila, 2).toString();
             String telf = tabla1.getValueAt(fila, 2).toString();
            String dir = tabla1.getValueAt(fila, 3).toString();
            String es = tabla1.getValueAt(fila, 4).toString();
            txtDni.setText(dni);
            txtNom.setText(nom);
            txtDir.setText(dir);
            txtTelf.setText(telf);
            cboEstado.setSelectedItem(es);
        }
    }//GEN-LAST:event_tabla1MouseClicked

    private void tabla1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla1KeyPressed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cliente cliente = new Cliente(txtDni.getText(),txtDni.getText(),txtNom.getText(),txtDir.getText(),txtTelf.getText(),cboEstado.getSelectedItem().toString());
       lista.add(cliente);
        mostrar();
        limpiarTabla();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       PrincipalAdmin p = new PrincipalAdmin();
      p.setVisible(true);
      this.dispose();
      p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
int selectedRowIndex = tabla1.getSelectedRow();
lista.remove(selectedRowIndex);
        DefaultTableModel model = (DefaultTableModel)tabla1.getModel();
       model.removeRow(selectedRowIndex);
          limpiarTabla();
       nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
       int selectedRowIndex = tabla1.getSelectedRow();
        lista.get(selectedRowIndex).setCod(txtDni.getText());
        lista.get(selectedRowIndex).setNom(txtNom.getText());
        lista.get(selectedRowIndex).setDir(txtDir.getText());
        lista.get(selectedRowIndex).setTelefono(txtTelf.getText());
       
        
        mostrar();
       limpiarTabla();
       nuevo();

        // get the selected row index
       
       
      
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        nuevo();
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

  
            
       
    
    public void mostrar(){
        
     String matriz[][]=new String [lista.size()][6];
     for (int i=0;i<lista.size();i++){
         matriz[i][0]=lista.get(i).getCod();
         matriz[i][1]=lista.get(i).getDni();
         matriz[i][2]=lista.get(i).getNom();
         matriz[i][3]=lista.get(i).getDir();
         matriz[i][4]=lista.get(i).getEstado();
          matriz[i][5]=lista.get(i).getTelefono();
         
           tabla1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "DNI", "NOMBRES", "DIRECCION", "TELEFONO","ESTADO"
            }
        ));
     }
    }
    
     
    
    
    
   
       
       
     int filas;  

  
    public void eliminar(){
  
  
  
  
  }
    
    
   void limpiarTabla() {
        for (int a = 0; a < modelo.getRowCount(); a++) {
            modelo.removeRow(a);
            a = a - 1;
        }
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual_Cliente().setVisible(true);
            }
        });
    }
    
    
   
        void nuevo() {
        txtNom.setText("");
        txtDir.setText("");
        txtDni.setText("");
        txtTelf.setText("");
        cboEstado.setSelectedItem("SELECCIONAR");
        txtNom.requestFocus();
    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables

   
}
