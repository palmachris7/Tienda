/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;
import Controlador.Proceso_Usuario;
import Modelo.Usuario;
import Otros.Limpiar_txt;
import Otros.imgTabla;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palmachris7
 */
public class Visual_Usuario_ extends javax.swing.JFrame {
 int x,y;
    
    Limpiar_txt lt = new Limpiar_txt();
    
    private String ruta_txt = "usuario.txt"; 
    
    Usuario p;
    Proceso_Usuario rp;
    
    int clic_tabla;
    public Visual_Usuario_() {
        initComponents();
        this.setLocationRelativeTo(null);
        rp = new Proceso_Usuario();
        
        try{
            cargar_txt();
            listarRegistro();
        }catch(Exception ex){
            mensaje("No existe el archivo txt");
        }
    }

  public void cargar_txt(){
       // File ruta = new File(ruta_txt);
        try{
           FileInputStream   fis = new FileInputStream(ruta_txt );
           ObjectInputStream in = new ObjectInputStream(fis);
           if(in!= null){
               rp=(Proceso_Usuario)in.readObject();
               in.close();
               
           }
           /* FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);
            
            
            String linea = null;
            while((linea = bu.readLine())!=null){
                StringTokenizer st = new StringTokenizer(linea, ",");
                p = new Producto();
                p.setCodigo(Integer.parseInt(st.nextToken()));
                p.setNombre(st.nextToken());
                p.setPrecio(Double.parseDouble(st.nextToken()));
                p.setDescripcion(st.nextToken());
                rp.agregarRegistro(p);
            }
            bu.close();*/
        }catch(Exception ex){
            mensaje("Error al cargar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void grabar_txt(){
       // FileWriter fw;
       // PrintWriter pw;
       FileOutputStream fos;
       ObjectOutputStream out;
        try{
           // fw = new FileWriter(ruta_txt);
            //pw = new PrintWriter(fw);
            fos =new FileOutputStream(ruta_txt);
            out= new ObjectOutputStream(fos);
            if (out != null){
            
                    out.writeObject(rp);
                    out.close();
            
            }
            
            
          /*  
            for(int i = 0; i < rp.cantidadRegistro(); i++){
                p = rp.obtenerRegistro(i);
                pw.println(String.valueOf(p.getCodigo()+", "+p.getNombre()+", "+p.getPrecio()+", "+p.getDescripcion()));
            }
             pw.close();*/
            
        }catch(Exception ex){
            mensaje("Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void ingresarRegistro(File ruta){
        try{
            if(leerUsuario() == null)mensaje("Ingresar Usuario");
            else if(leerNombre() == null)mensaje("Ingresar Nombre");
            else if(leerContraseña() == null)mensaje("Ingresar Contraseña");
            else if(leerCorreo() == null) mensaje("Ingresar Correo");
            else{
                p = new Usuario(leerUsuario(),leerContraseña(), leerNombre(), leerCorreo(), leerTelefono(),leerDni(),leerFoto(ruta));
                if(rp.buscaCodigo(p.getDni())!= -1)mensaje("Este codigo ya existe");
                else rp.agregarRegistro(p);
                
                grabar_txt();
                listarRegistro();
             //   lt.limpiar_texto(panel); 
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
   /* public void modificarRegistro(File ruta){
        try{
            if(leerCodigo() == -666)mensaje("Ingresar codigo entero");
            else if(leerNombre() == null)mensaje("Ingresar Nombre");
            else if(leerPrecio() == -666) mensaje("Ingresar Precio");
            else if(leerDescripcion() == null)mensaje("Ingresar Descripcion");
            else{
                int codigo = rp.buscaCodigo(leerCodigo());
                if(txtRuta.getText().equalsIgnoreCase(""))
                    p = new Producto(leerDni(), leerNombre(), leerTelefono(), leerDescripcion(),leerFoto2(codigo));
                else p =new Producto(leerCodigo(), leerNombre(), leerPrecio(), leerDescripcion(),leerFoto(ruta));
                
                if(codigo == -1)rp.agregarRegistro(p);
                else rp.modificarRegistro(codigo, p);
                
                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(panel);
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }*/
    
    public void eliminarRegistro(){
        try{
            if(leerDni() == -666) mensaje("Ingrese codigo entero");
            
            else{
                int codigo = rp.buscaCodigo(leerDni());
                if(codigo == -1) mensaje("codigo no existe");
                
                else{
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto","Si/No",0);
                    if(s == 0){
                        rp.eliminarRegistro(codigo);
                        
                        grabar_txt();
                        listarRegistro();
                        lt.limpiar_texto(jPanel1);
                    }
                }
                
                
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("Dni");
        dt.addColumn("Nombre");
        dt.addColumn("Contraseña");
        dt.addColumn("Usuario");
        dt.addColumn("Foto");
        
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0; i < rp.cantidadRegistro(); i++){
            p = rp.obtenerRegistro(i);
            fila[0] = p.getDni();
            fila[1] = p.getNombre();
            fila[2] = p.getPassword();
            fila[3] = p.getUsername();
            try{
                byte[] bi = p.getFoto();
                BufferedImage image=null;
                InputStream in=new ByteArrayInputStream(bi);
                image=ImageIO.read(in);
                ImageIcon img = new ImageIcon(image.getScaledInstance( 60,60,0));
                fila[4]=new JLabel(img);
                
            }catch(Exception ex){
                fila[4]= "No hay Imagen";
            
            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public String leerTelefono(){
        try{
           
            String telefono = txtTelefono.getText().trim().replace(" ", "_");
            return telefono;
        }catch(Exception ex){
            return null;
        }
    }
  
    public String leerNombre(){
        try{
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }
    
    public int leerDni(){
        try{
          
             int dni = Integer.parseInt(txtDni.getText().trim());
            return dni;
        }catch(Exception ex){
            return -666;
        }
    }
    
    public String leerCorreo(){
        try{
            
            String correo = txtCorreo.getText().trim().replace(" ", "_");
            return correo;
        }catch(Exception ex){
            return null;
        }
    }
    
     public String leerUsuario(){
        try{
            
            String usuario = txtUsuario.getText().trim().replace(" ", "_");
            return usuario;
        }catch(Exception ex){
            return null;
        }
    }
     
      public String leerContraseña(){
        try{
           
            String contraseña = txtContraseña.getText().trim().replace(" ", "_");
            return contraseña;
        }catch(Exception ex){
            return null;
        }
    }
      
      
    
    public byte[] leerFoto(File ruta){
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            return icono;
        }catch(Exception ex){
            return null;
        }
    }
    
    
   public byte[] leerFoto2(int codigo){
            p = rp.obtenerRegistro(codigo);
            try{
               return p.getFoto();
            }catch(Exception ex){
               return null;
            }
        }

    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jDateChooserNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        lblRegresar = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseDragged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(60, 74, 150));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar:");
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 420, 20));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 470, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, -1));

        jTabbedPane1.addTab("Lista Usuario", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 130));

        jButton1.setText("Subir Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 74, 150));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Nombre: ");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(60, 74, 150));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Usuario:");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 74, 150));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Fecha de Nacimiento:");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, -1));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 74, 150));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Dni:");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, -1));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(60, 74, 150));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Correo:");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, -1));
        jPanel2.add(jDateChooserNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(60, 74, 150));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Contraseña: ");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(60, 74, 150));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Telefono: ");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 250, 20));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 250, 20));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 20));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 20));

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(60, 74, 150)));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 250, 20));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setForeground(new java.awt.Color(60, 74, 150));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_add_filled_16px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, -1));

        BtnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        BtnLimpiar.setForeground(new java.awt.Color(60, 74, 150));
        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_erase_16px.png"))); // NOI18N
        BtnLimpiar.setText("Nuevo");
        jPanel2.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, -1));

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_undo_32px.png"))); // NOI18N
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
        });
        jPanel2.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 30));

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtRuta.setBorder(null);
        jPanel2.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 155, 25));

        jTabbedPane1.addTab("Registra Usuario", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 552, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        jf.setFileFilter(fil);
        jf.setCurrentDirectory(new File("Fotos"));
        int el = jf.showOpenDialog(this);
        if(el == JFileChooser.APPROVE_OPTION){
        txtRuta.setText(jf.getSelectedFile().getAbsolutePath());
         lblFoto.setIcon(new ImageIcon(txtRuta.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        PrincipalAdmin p = new PrincipalAdmin();
        p.setVisible(true);
        this.dispose();
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         PrincipalAdmin p = new PrincipalAdmin();
        p.setVisible(true);
        this.dispose();
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         this.eliminarRegistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
         x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jTabbedPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseDragged
       this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jTabbedPane1MouseDragged

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
            java.util.logging.Logger.getLogger(Visual_Usuario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual_Usuario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual_Usuario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual_Usuario_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visual_Usuario_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooserNacimiento;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
