
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class VentanaLoginn extends javax.swing.JFrame {
    private int intentosFallidos = 0;

    /**
     * Creates new form VentanaLoginn
     */
    public VentanaLoginn() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAcceso = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        txtContrasenna = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        lblIntentos = new javax.swing.JLabel();
        btnOlvidado = new javax.swing.JButton();
        btnBloqueado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Acceso");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userInicio.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario: ");

        jSeparator1.setBackground(new java.awt.Color(112, 145, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userLabel.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/key.png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(112, 145, 255));

        btnAcceso.setBackground(new java.awt.Color(60, 78, 234));
        btnAcceso.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAcceso.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceso.setText("Iniciar sesión");
        btnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoActionPerformed(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(60, 78, 234));
        btnRegistro.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        txtContrasenna.setBackground(new java.awt.Color(112, 145, 255));
        txtContrasenna.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtContrasenna.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenna.setToolTipText("");
        txtContrasenna.setBorder(null);

        txtUsuario.setBackground(new java.awt.Color(112, 145, 255));
        txtUsuario.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);

        lblIntentos.setBackground(new java.awt.Color(112, 145, 255));
        lblIntentos.setText(" ");

        btnOlvidado.setBackground(new java.awt.Color(112, 145, 255));
        btnOlvidado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnOlvidado.setForeground(new java.awt.Color(255, 255, 255));
        btnOlvidado.setText("¿Olvidaste la contraseña?");
        btnOlvidado.setBorder(null);
        btnOlvidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidadoActionPerformed(evt);
            }
        });

        btnBloqueado.setBackground(new java.awt.Color(112, 145, 255));
        btnBloqueado.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnBloqueado.setForeground(new java.awt.Color(255, 255, 255));
        btnBloqueado.setText("¿Usuario bloqueado?");
        btnBloqueado.setBorder(null);
        btnBloqueado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloqueadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(txtContrasenna)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(txtUsuario)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcceso)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lblIntentos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBloqueado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))
                            .addGap(240, 240, 240))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(255, 255, 255))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnOlvidado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(195, 195, 195)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro)
                .addGap(22, 22, 22)
                .addComponent(btnOlvidado)
                .addGap(28, 28, 28)
                .addComponent(btnBloqueado)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        this.setVisible(false);
        VentanaRegistro registro = new VentanaRegistro();
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoActionPerformed
        String usuario = txtUsuario.getText().strip();
        String contrasenna = txtContrasenna.getText().strip();
        //Verifica que los campos no esten vacios
        if(usuario.isEmpty() || contrasenna.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Valida las credenciales
        boolean validarCredencial = Usuario.validarCredenciales(usuario, contrasenna);
        
        if(!validarCredencial){
            intentosFallidos++;
            lblIntentos.setText("Intentos Fallidos: " + intentosFallidos);
            if(intentosFallidos > 3){
                if(!Usuario.bloquearUsuarioPorNombre(usuario)){ //cambio
                    return;
                }
                JOptionPane.showMessageDialog(null, "El usuario ha sido bloqueado.", "Error", JOptionPane.ERROR_MESSAGE);
                intentosFallidos = 0;
                lblIntentos.setText("");
            }
        }
        else{
            intentosFallidos = 0;
            lblIntentos.setText("");
            this.setVisible(false);
            VentanaTienda tienda = new VentanaTienda();
            tienda.setVisible(true);
        }
        txtUsuario.setText("");
        txtContrasenna.setText("");
    }//GEN-LAST:event_btnAccesoActionPerformed

    private void btnOlvidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidadoActionPerformed
        // Función para enviar correo
        //CORREO:tiendatec178@gmail.com CONTRASENNA:TIENDATEC1234### app password: algoNOSE12345888@332?:@* / yexy ujhz dxld yqes
        String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario:");
        if(usuario == null){
            return;
        }
        else if(usuario.isEmpty()) {
            return;
        }
        else if(!Usuario.getUsuarios().stream().anyMatch(u -> u.getNombreUsuario().equals(usuario))){
            JOptionPane.showMessageDialog(null, "El usuario no existe. Intente con otro.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico:");
        if(correo == null){
            return;
        }
        else if(correo.isEmpty()) {
            return; // El usuario canceló o no ingresó nada
        }

        // Obtener la lista de usuarios directamente de la clase Usuario
        for (Usuario user : Usuario.getUsuarios()) {
            if (user.getNombreUsuario().equals(usuario)) {
                String contra = user.getContrasenna();

                // Configuración del correo
                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

                final String remitente = "tiendatec178@gmail.com";
                final String contraAPP = "yexyujhzdxldyqes"; //yexy ujhz dxld yqes

                try {
                    // Crear la sesión
                    Session session = Session.getInstance(props, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(remitente, contraAPP);
                        }
                    });

                    // Crear el mensaje
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(remitente));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo));
                    message.setSubject("Recuperación de cuenta");
                    message.setText(String.format("Hola %s!\n Te recordamos tu contraseña.\n\n Tu contraseña era: %s", usuario, contra));

                    // Enviar el mensaje
                    Transport.send(message);

                    JOptionPane.showMessageDialog(null, "Se envió el correo de recuperación exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } catch (MessagingException e) {
                    JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        
    }//GEN-LAST:event_btnOlvidadoActionPerformed

    private void btnBloqueadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloqueadoActionPerformed
        int decision = JOptionPane.showConfirmDialog(null, "¿Desea desbloquear su cuenta?", "Desbloquear Cuenta", JOptionPane.YES_NO_OPTION);
        if(decision == JOptionPane.YES_NO_OPTION){
            intentosFallidos = 0;
            lblIntentos.setText("");
            String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario para confirmar:");
            Usuario.desBloquearUsuarioPorNombre(usuario);
            JOptionPane.showMessageDialog(null, "Se ha desbloqueado su usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBloqueadoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLoginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceso;
    private javax.swing.JButton btnBloqueado;
    private javax.swing.JButton btnOlvidado;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JPasswordField txtContrasenna;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
