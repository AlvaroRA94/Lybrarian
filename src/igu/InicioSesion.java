/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("../img/logoprogram.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftColumn = new javax.swing.JPanel();
        backGroundBooks1 = new javax.swing.JLabel();
        inicioSesionMenu = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JLabel();
        minimizarButton = new javax.swing.JLabel();
        atrasButton = new javax.swing.JLabel();
        instagramIcon = new javax.swing.JLabel();
        facebookIcon = new javax.swing.JLabel();
        twitterIcon = new javax.swing.JLabel();
        ayudaIcon = new javax.swing.JLabel();
        infoIcon = new javax.swing.JLabel();
        panelRedes = new javax.swing.JLabel();
        panelInfoProgram = new javax.swing.JLabel();
        nombreTituloText1 = new javax.swing.JLabel();
        nombreTituloText = new javax.swing.JLabel();
        nombreTituloText3 = new javax.swing.JLabel();
        nombreTituloText4 = new javax.swing.JLabel();
        nombreTituloTextField = new javax.swing.JTextField();
        nombreTituloTextField2 = new javax.swing.JTextField();
        nombreTituloTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTituloText2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreTituloText6 = new javax.swing.JLabel();
        nombreTituloTextField4 = new javax.swing.JTextField();
        nombreTituloText7 = new javax.swing.JLabel();
        nombreTituloTextField5 = new javax.swing.JTextField();
        botonInicioSesion = new javax.swing.JLabel();
        crearCuentaBoton = new javax.swing.JLabel();
        cancelarBoton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftColumn.setBackground(new java.awt.Color(255, 255, 255));
        leftColumn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGroundBooks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoMain650x220.jpg"))); // NOI18N
        leftColumn.add(backGroundBooks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        getContentPane().add(leftColumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 650));

        inicioSesionMenu.setBackground(new java.awt.Color(255, 255, 255));
        inicioSesionMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Barbarian", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 106, 163));
        titulo.setText("Lybrarian)");
        inicioSesionMenu.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 310, 40));

        cerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar1.jpg"))); // NOI18N
        cerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseExited(evt);
            }
        });
        inicioSesionMenu.add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        minimizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar1.jpg"))); // NOI18N
        minimizarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarButtonMouseExited(evt);
            }
        });
        inicioSesionMenu.add(minimizarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder1.jpg"))); // NOI18N
        atrasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasButtonMouseExited(evt);
            }
        });
        inicioSesionMenu.add(atrasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        instagramIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instagram.png"))); // NOI18N
        inicioSesionMenu.add(instagramIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        facebookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook.png"))); // NOI18N
        inicioSesionMenu.add(facebookIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, -1, -1));

        twitterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gorjeo.png"))); // NOI18N
        inicioSesionMenu.add(twitterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, -1, -1));

        ayudaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacion.png"))); // NOI18N
        inicioSesionMenu.add(ayudaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        infoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoapp.png"))); // NOI18N
        inicioSesionMenu.add(infoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        panelRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panelredes.jpg"))); // NOI18N
        inicioSesionMenu.add(panelRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, -1, -1));

        panelInfoProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panelinfo.jpg"))); // NOI18N
        inicioSesionMenu.add(panelInfoProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        nombreTituloText1.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 18)); // NOI18N
        nombreTituloText1.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText1.setText("Repita el Password:");
        inicioSesionMenu.add(nombreTituloText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        nombreTituloText.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 24)); // NOI18N
        nombreTituloText.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText.setText("¿Aún no tienes cuenta?");
        inicioSesionMenu.add(nombreTituloText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        nombreTituloText3.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 18)); // NOI18N
        nombreTituloText3.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText3.setText("Introduzca un Password:");
        inicioSesionMenu.add(nombreTituloText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        nombreTituloText4.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 18)); // NOI18N
        nombreTituloText4.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText4.setText("Introduzca un Correo Electrónico:");
        inicioSesionMenu.add(nombreTituloText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        nombreTituloTextField.setBackground(new java.awt.Color(255, 255, 255));
        nombreTituloTextField.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd", 0, 14)); // NOI18N
        nombreTituloTextField.setForeground(new java.awt.Color(102, 102, 102));
        nombreTituloTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreTituloTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTituloTextFieldActionPerformed(evt);
            }
        });
        inicioSesionMenu.add(nombreTituloTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 260, 30));

        nombreTituloTextField2.setBackground(new java.awt.Color(255, 255, 255));
        nombreTituloTextField2.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd", 0, 14)); // NOI18N
        nombreTituloTextField2.setForeground(new java.awt.Color(102, 102, 102));
        nombreTituloTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreTituloTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTituloTextField2ActionPerformed(evt);
            }
        });
        inicioSesionMenu.add(nombreTituloTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 260, 30));

        nombreTituloTextField3.setBackground(new java.awt.Color(255, 255, 255));
        nombreTituloTextField3.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd", 0, 14)); // NOI18N
        nombreTituloTextField3.setForeground(new java.awt.Color(102, 102, 102));
        nombreTituloTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreTituloTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTituloTextField3ActionPerformed(evt);
            }
        });
        inicioSesionMenu.add(nombreTituloTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 260, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        inicioSesionMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 270, 10));

        nombreTituloText2.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 24)); // NOI18N
        nombreTituloText2.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText2.setText("Iniciar Sesión");
        inicioSesionMenu.add(nombreTituloText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 160, 130, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        inicioSesionMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 260, 10));

        nombreTituloText6.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 18)); // NOI18N
        nombreTituloText6.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText6.setText("Introduce Correo Electrónico:");
        inicioSesionMenu.add(nombreTituloText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        nombreTituloTextField4.setBackground(new java.awt.Color(255, 255, 255));
        nombreTituloTextField4.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd", 0, 14)); // NOI18N
        nombreTituloTextField4.setForeground(new java.awt.Color(102, 102, 102));
        nombreTituloTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreTituloTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTituloTextField4ActionPerformed(evt);
            }
        });
        inicioSesionMenu.add(nombreTituloTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 260, 30));

        nombreTituloText7.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd Md", 0, 18)); // NOI18N
        nombreTituloText7.setForeground(new java.awt.Color(255, 255, 255));
        nombreTituloText7.setText("Introduce Password:");
        inicioSesionMenu.add(nombreTituloText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        nombreTituloTextField5.setBackground(new java.awt.Color(255, 255, 255));
        nombreTituloTextField5.setFont(new java.awt.Font("TT Rounds Neue Trl Cnd", 0, 14)); // NOI18N
        nombreTituloTextField5.setForeground(new java.awt.Color(102, 102, 102));
        nombreTituloTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombreTituloTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTituloTextField5ActionPerformed(evt);
            }
        });
        inicioSesionMenu.add(nombreTituloTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 260, 30));

        botonInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoniniciosesion2.png"))); // NOI18N
        botonInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioSesionMouseExited(evt);
            }
        });
        inicioSesionMenu.add(botonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        crearCuentaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearCuentaBoton1.png"))); // NOI18N
        crearCuentaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuentaBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearCuentaBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearCuentaBotonMouseExited(evt);
            }
        });
        inicioSesionMenu.add(crearCuentaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        cancelarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBoton1.png"))); // NOI18N
        cancelarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseExited(evt);
            }
        });
        inicioSesionMenu.add(cancelarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panelfondoiniciosesionpequeno.jpg"))); // NOI18N
        inicioSesionMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 300, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panelfondoiniciosesionpequeno.jpg"))); // NOI18N
        inicioSesionMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 300, 400));

        getContentPane().add(inicioSesionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 780, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarButtonMouseClicked

    private void cerrarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarButtonMouseEntered
        cerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar2.jpg"))); // NOI18N
    }//GEN-LAST:event_cerrarButtonMouseEntered

    private void cerrarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarButtonMouseExited
        cerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar1.jpg"))); // NOI18N
    }//GEN-LAST:event_cerrarButtonMouseExited

    private void minimizarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarButtonMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_minimizarButtonMouseClicked

    private void minimizarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarButtonMouseEntered
        minimizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar2.jpg"))); // NOI18N
    }//GEN-LAST:event_minimizarButtonMouseEntered

    private void minimizarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarButtonMouseExited
        minimizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar1.jpg"))); // NOI18N
    }//GEN-LAST:event_minimizarButtonMouseExited

    private void atrasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseClicked
        MainPage abrir = new MainPage();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_atrasButtonMouseClicked

    private void atrasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseEntered
        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder2.jpg"))); // NOI18N
    }//GEN-LAST:event_atrasButtonMouseEntered

    private void atrasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasButtonMouseExited
        atrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/retroceder1.jpg"))); // NOI18N
    }//GEN-LAST:event_atrasButtonMouseExited

    private void nombreTituloTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTituloTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTituloTextFieldActionPerformed

    private void nombreTituloTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTituloTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTituloTextField2ActionPerformed

    private void nombreTituloTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTituloTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTituloTextField3ActionPerformed

    private void nombreTituloTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTituloTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTituloTextField4ActionPerformed

    private void nombreTituloTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTituloTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTituloTextField5ActionPerformed

    //EVENTOS BOTON INICIO SESION
    private void botonInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInicioSesionMouseClicked

    private void botonInicioSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseEntered
        botonInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoniniciosesion1.png"))); // NOI18N
    }//GEN-LAST:event_botonInicioSesionMouseEntered

    private void botonInicioSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioSesionMouseExited
        botonInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botoniniciosesion2.png"))); // NOI18N
    }//GEN-LAST:event_botonInicioSesionMouseExited

    //EVENTOS BOTON CREAR CUENTA
    private void crearCuentaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaBotonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCuentaBotonMouseClicked

    private void crearCuentaBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaBotonMouseEntered
        crearCuentaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearCuentaBoton2.png"))); // NOI18N
    }//GEN-LAST:event_crearCuentaBotonMouseEntered

    private void crearCuentaBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuentaBotonMouseExited
        crearCuentaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearCuentaBoton1.png"))); // NOI18N
    }//GEN-LAST:event_crearCuentaBotonMouseExited

    //EVENTOS BOTON CANCELAR
    private void cancelarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseClicked
        MainPage abrir = new MainPage();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBotonMouseClicked

    private void cancelarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseEntered
        cancelarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBoton2.png"))); // NOI18N
    }//GEN-LAST:event_cancelarBotonMouseEntered

    private void cancelarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseExited
        cancelarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelarBoton1.png"))); // NOI18N
    }//GEN-LAST:event_cancelarBotonMouseExited

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atrasButton;
    private javax.swing.JLabel ayudaIcon;
    private javax.swing.JLabel backGroundBooks1;
    private javax.swing.JLabel botonInicioSesion;
    private javax.swing.JLabel cancelarBoton;
    private javax.swing.JLabel cerrarButton;
    private javax.swing.JLabel crearCuentaBoton;
    private javax.swing.JLabel facebookIcon;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JPanel inicioSesionMenu;
    private javax.swing.JLabel instagramIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel leftColumn;
    private javax.swing.JLabel minimizarButton;
    private javax.swing.JLabel nombreTituloText;
    private javax.swing.JLabel nombreTituloText1;
    private javax.swing.JLabel nombreTituloText2;
    private javax.swing.JLabel nombreTituloText3;
    private javax.swing.JLabel nombreTituloText4;
    private javax.swing.JLabel nombreTituloText6;
    private javax.swing.JLabel nombreTituloText7;
    private javax.swing.JTextField nombreTituloTextField;
    private javax.swing.JTextField nombreTituloTextField2;
    private javax.swing.JTextField nombreTituloTextField3;
    private javax.swing.JTextField nombreTituloTextField4;
    private javax.swing.JTextField nombreTituloTextField5;
    private javax.swing.JLabel panelInfoProgram;
    private javax.swing.JLabel panelRedes;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel twitterIcon;
    // End of variables declaration//GEN-END:variables
}
