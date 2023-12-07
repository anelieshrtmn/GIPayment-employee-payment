/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiGaji;

/**
 *
 * @author USER
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        laporanButton = new javax.swing.JButton();
        datakaryawanButton = new javax.swing.JButton();
        rekapdataButton = new javax.swing.JButton();
        gajikaryawanButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 147, 198));
        setTitle("OPTION MENU");

        laporanButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        laporanButton.setText("LAPORAN GAJI");
        laporanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanButtonActionPerformed(evt);
            }
        });

        datakaryawanButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        datakaryawanButton.setText("DATA KARYAWAN");
        datakaryawanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakaryawanButtonActionPerformed(evt);
            }
        });

        rekapdataButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rekapdataButton.setText("REKAP DATA");
        rekapdataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapdataButtonActionPerformed(evt);
            }
        });

        gajikaryawanButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gajikaryawanButton.setText("GAJI KARYAWAN");
        gajikaryawanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gajikaryawanButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(laporanButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(datakaryawanButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rekapdataButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(gajikaryawanButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(laporanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(datakaryawanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(rekapdataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gajikaryawanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(datakaryawanButton)
                .addGap(26, 26, 26)
                .addComponent(rekapdataButton)
                .addGap(37, 37, 37)
                .addComponent(gajikaryawanButton)
                .addGap(35, 35, 35)
                .addComponent(laporanButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datakaryawanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakaryawanButtonActionPerformed
        DataKaryawan dataKaryawan = new DataKaryawan();
        dataKaryawan.setVisible(true);
        this.getDesktopPane().add(dataKaryawan);
        this.dispose();
    }//GEN-LAST:event_datakaryawanButtonActionPerformed

    private void gajikaryawanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gajikaryawanButtonActionPerformed
        GajiKaryawan gaji = new GajiKaryawan();
        gaji.setVisible(true);
        this.getDesktopPane().add(gaji);
        this.dispose();
    }//GEN-LAST:event_gajikaryawanButtonActionPerformed

    private void laporanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanButtonActionPerformed
        LaporanGaji laporanGaji = new LaporanGaji();
        laporanGaji.setVisible(true);
        this.getDesktopPane().add(laporanGaji);
        this.dispose();
    }//GEN-LAST:event_laporanButtonActionPerformed

    private void rekapdataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapdataButtonActionPerformed
        RekapData rekapData = new RekapData();
        rekapData.setVisible(true);
        this.getDesktopPane().add(rekapData);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_rekapdataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datakaryawanButton;
    private javax.swing.JButton gajikaryawanButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton laporanButton;
    private javax.swing.JButton rekapdataButton;
    // End of variables declaration//GEN-END:variables
}