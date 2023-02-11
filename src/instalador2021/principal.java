/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instalador2021;

import java.awt.Color;
import java.awt.Cursor;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class principal extends javax.swing.JFrame {

    int comandoUsado = 1;
    cambioColor icono = new cambioColor();
    x64Panel eventx64 = new x64Panel();
    officePanel eventOffice = new officePanel();
    activadoresPanel eventActivadores = new activadoresPanel();
    herramientasPanel eventHerramientas = new herramientasPanel();
    x32Panel eventx32 = new x32Panel();

    /**
     * Creates new form principal
     */
    public principal() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/iconoPC.png")).getImage());
        this.setResizable(false);
        contenido.setBackground(new Color(0, 0, 0, 0));
        contenido.setVisible(false);
        escritorio.setBackground(new Color(0, 0, 0, 0));
        //barraSuperior.setBackground(new Color(45,67,166, 100));
        //setBackground(new Color(0, 0, 0, 0)); // se necesita undecorated para que funcione

        if (comandoUsado == 1) {
            obtenerInformacion("Manufacturer=", "WMIC baseboard Get /Format:List", datoFabricante);
            obtenerInformacion("Product=", "WMIC baseboard Get /Format:List", datoModelo);
            obtenerInformacion("Name=Intel", "WMIC CPU Get /Format:List", datoProcesador);
            obtenerInformacion("Name=AMD", "WMIC CPU Get /Format:List", datoProcesador);
            obtenerInformacion("Nombre del sistema operativo:", "systeminfo", datoSistemaOperativo);
            obtenerInformacion("Cantidad total de memoria", "systeminfo", datoRam);
            obtenerInformacion("Tipo de sistema:", "systeminfo", datoArquitectura);
            comandoUsado = 0;
        }

        escritorio.add(eventx64);
        eventx64.setVisible(false);

        escritorio.add(eventOffice);
        eventOffice.setVisible(false);

        escritorio.add(eventActivadores);
        eventActivadores.setVisible(false);

        escritorio.add(eventHerramientas);
        eventHerramientas.setVisible(false);

        escritorio.add(eventx32);
        eventx32.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JPanel();
        logoBotton = new javax.swing.JLabel();
        barraMenu = new javax.swing.JPanel();
        x64Button = new javax.swing.JLabel();
        OfficeButton = new javax.swing.JLabel();
        ActivadoresButton = new javax.swing.JLabel();
        HerramientasButton = new javax.swing.JLabel();
        x86Button = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        datoFabricante = new javax.swing.JLabel();
        datoModelo = new javax.swing.JLabel();
        datoProcesador = new javax.swing.JLabel();
        datoSistemaOperativo = new javax.swing.JLabel();
        datoRam = new javax.swing.JLabel();
        datoArquitectura = new javax.swing.JLabel();
        humanDeskIcon = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        contenido = new javax.swing.JPanel();
        fondodeContenido = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instalador 2021");
        setBackground(new java.awt.Color(24, 42, 126));
        setMinimumSize(new java.awt.Dimension(716, 538));
        setPreferredSize(new java.awt.Dimension(716, 538));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(33, 189, 202));
        logo.setPreferredSize(new java.awt.Dimension(54, 54));

        logoBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        logoBotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoBottonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoBottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoBottonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(logoBotton)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(logoLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(logoBotton)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        barraMenu.setBackground(new java.awt.Color(45, 67, 166));
        barraMenu.setPreferredSize(new java.awt.Dimension(54, 446));
        barraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x64Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x64.png"))); // NOI18N
        x64Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x64ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x64ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x64ButtonMouseExited(evt);
            }
        });
        barraMenu.add(x64Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 33, -1, -1));

        OfficeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/office.png"))); // NOI18N
        OfficeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OfficeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OfficeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OfficeButtonMouseExited(evt);
            }
        });
        barraMenu.add(OfficeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 117, -1, -1));

        ActivadoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/activadores.png"))); // NOI18N
        ActivadoresButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivadoresButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ActivadoresButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ActivadoresButtonMouseExited(evt);
            }
        });
        barraMenu.add(ActivadoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 201, -1, -1));

        HerramientasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/herramientas.png"))); // NOI18N
        HerramientasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HerramientasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HerramientasButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HerramientasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HerramientasButtonMouseExited(evt);
            }
        });
        barraMenu.add(HerramientasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 285, -1, -1));

        x86Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x86.png"))); // NOI18N
        x86Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x86ButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x86ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x86ButtonMouseExited(evt);
            }
        });
        barraMenu.add(x86Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 369, -1, -1));

        getContentPane().add(barraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, -1, -1));

        barraSuperior.setBackground(new java.awt.Color(39, 62, 176));
        barraSuperior.setPreferredSize(new java.awt.Dimension(646, 54));

        datoFabricante.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoFabricante.setForeground(new java.awt.Color(255, 255, 255));
        datoFabricante.setText("Fabricante");

        datoModelo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoModelo.setForeground(new java.awt.Color(255, 255, 255));
        datoModelo.setText("Modelo");

        datoProcesador.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoProcesador.setForeground(new java.awt.Color(255, 255, 255));
        datoProcesador.setText("Procesador");

        datoSistemaOperativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoSistemaOperativo.setForeground(new java.awt.Color(255, 255, 255));
        datoSistemaOperativo.setText("SO");

        datoRam.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoRam.setForeground(new java.awt.Color(255, 255, 255));
        datoRam.setText("RAM");

        datoArquitectura.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        datoArquitectura.setForeground(new java.awt.Color(255, 255, 255));
        datoArquitectura.setText("Base");

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datoFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datoProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(datoSistemaOperativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datoArquitectura, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoRam, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoFabricante)
                    .addComponent(datoProcesador)
                    .addComponent(datoRam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoModelo)
                    .addComponent(datoSistemaOperativo)
                    .addComponent(datoArquitectura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 0, -1, -1));

        humanDeskIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Desk.png"))); // NOI18N
        getContentPane().add(humanDeskIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 128, -1, -1));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 82, 590, 390));

        contenido.setBackground(new java.awt.Color(84, 115, 232));
        contenido.setPreferredSize(new java.awt.Dimension(600, 400));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondodeContenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RectanguloFondo.png"))); // NOI18N
        contenido.add(fondodeContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 77, -1, -1));

        fondo.setBackground(new java.awt.Color(24, 42, 126));
        fondo.setPreferredSize(new java.awt.Dimension(646, 446));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 54, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void x64ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x64ButtonMouseClicked
        icono.cambiarColorIcono(x64Button);
        icono.RegresarColorIcono(OfficeButton);
        icono.RegresarColorIcono(ActivadoresButton);
        icono.RegresarColorIcono(HerramientasButton);
        icono.RegresarColorIcono(x86Button);
        contenido.setVisible(true);
        humanDeskIcon.setVisible(false);
        escritorio.setVisible(true);

        eventx64.setVisible(true);
        eventOffice.setVisible(false);
        eventActivadores.setVisible(false);
        eventHerramientas.setVisible(false);
        eventx32.setVisible(false);


    }//GEN-LAST:event_x64ButtonMouseClicked

    private void OfficeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeButtonMouseClicked

        icono.RegresarColorIcono(x64Button);
        icono.cambiarColorIcono(OfficeButton);
        icono.RegresarColorIcono(ActivadoresButton);
        icono.RegresarColorIcono(HerramientasButton);
        icono.RegresarColorIcono(x86Button);
        contenido.setVisible(true);
        humanDeskIcon.setVisible(false);
        escritorio.setVisible(true);

        eventx64.setVisible(false);
        eventOffice.setVisible(true);
        eventActivadores.setVisible(false);
        eventHerramientas.setVisible(false);
        eventx32.setVisible(false);


    }//GEN-LAST:event_OfficeButtonMouseClicked

    private void ActivadoresButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivadoresButtonMouseClicked
        icono.RegresarColorIcono(x64Button);
        icono.RegresarColorIcono(OfficeButton);
        icono.cambiarColorIcono(ActivadoresButton);
        icono.RegresarColorIcono(HerramientasButton);
        icono.RegresarColorIcono(x86Button);
        contenido.setVisible(true);
        humanDeskIcon.setVisible(false);
        escritorio.setVisible(true);

        eventx64.setVisible(false);
        eventOffice.setVisible(false);
        eventActivadores.setVisible(true);
        eventHerramientas.setVisible(false);
        eventx32.setVisible(false);
    }//GEN-LAST:event_ActivadoresButtonMouseClicked

    private void HerramientasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasButtonMouseClicked
        icono.RegresarColorIcono(x64Button);
        icono.RegresarColorIcono(OfficeButton);
        icono.RegresarColorIcono(ActivadoresButton);
        icono.cambiarColorIcono(HerramientasButton);
        icono.RegresarColorIcono(x86Button);
        contenido.setVisible(true);
        humanDeskIcon.setVisible(false);
        escritorio.setVisible(true);

        eventx64.setVisible(false);
        eventOffice.setVisible(false);
        eventActivadores.setVisible(false);
        eventHerramientas.setVisible(true);
        eventx32.setVisible(false);
    }//GEN-LAST:event_HerramientasButtonMouseClicked

    private void x86ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x86ButtonMouseClicked
        icono.RegresarColorIcono(x64Button);
        icono.RegresarColorIcono(OfficeButton);
        icono.RegresarColorIcono(ActivadoresButton);
        icono.RegresarColorIcono(HerramientasButton);
        icono.cambiarColorIcono(x86Button);
        contenido.setVisible(true);
        humanDeskIcon.setVisible(false);
        escritorio.setVisible(true);

        eventx64.setVisible(false);
        eventOffice.setVisible(false);
        eventActivadores.setVisible(false);
        eventHerramientas.setVisible(false);
        eventx32.setVisible(true);
    }//GEN-LAST:event_x86ButtonMouseClicked

    private void x64ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x64ButtonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_x64ButtonMouseEntered

    private void x64ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x64ButtonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_x64ButtonMouseExited

    private void OfficeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeButtonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_OfficeButtonMouseEntered

    private void OfficeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OfficeButtonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_OfficeButtonMouseExited

    private void HerramientasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasButtonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_HerramientasButtonMouseEntered

    private void HerramientasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerramientasButtonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_HerramientasButtonMouseExited

    private void x86ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x86ButtonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_x86ButtonMouseEntered

    private void x86ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x86ButtonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_x86ButtonMouseExited

    private void ActivadoresButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivadoresButtonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_ActivadoresButtonMouseEntered

    private void ActivadoresButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivadoresButtonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_ActivadoresButtonMouseExited

    private void logoBottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoBottonMouseClicked
        contenido.setVisible(false);
        escritorio.setVisible(false);
        icono.RegresarColorIcono(x64Button);
        icono.RegresarColorIcono(OfficeButton);
        icono.RegresarColorIcono(ActivadoresButton);
        icono.RegresarColorIcono(HerramientasButton);
        icono.RegresarColorIcono(x86Button);
        humanDeskIcon.setVisible(true);
        reiniciarPrograma();


    }//GEN-LAST:event_logoBottonMouseClicked

    private void logoBottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoBottonMouseEntered
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_logoBottonMouseEntered

    private void logoBottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoBottonMouseExited
        this.setCursor(new Cursor(DEFAULT_CURSOR));
    }//GEN-LAST:event_logoBottonMouseExited

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });

    }

    public void reiniciarPrograma() {
        this.dispose();
        String[] arguments = new String[]{};
        main.main(arguments);
    }

    public void obtenerInformacion(String palabra, String comando, JLabel texto) {

        try {
            Procesos Buscador = new Procesos();
            String dato = Buscador.consoleInfo(palabra, comando);
            texto.setText(texto.getText() + dato);
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActivadoresButton;
    private javax.swing.JLabel HerramientasButton;
    private javax.swing.JLabel OfficeButton;
    private javax.swing.JPanel barraMenu;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel datoArquitectura;
    private javax.swing.JLabel datoFabricante;
    private javax.swing.JLabel datoModelo;
    private javax.swing.JLabel datoProcesador;
    private javax.swing.JLabel datoRam;
    private javax.swing.JLabel datoSistemaOperativo;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fondodeContenido;
    private javax.swing.JLabel humanDeskIcon;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logoBotton;
    private javax.swing.JLabel x64Button;
    private javax.swing.JLabel x86Button;
    // End of variables declaration//GEN-END:variables

}
