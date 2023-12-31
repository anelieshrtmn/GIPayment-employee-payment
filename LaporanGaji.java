/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package AplikasiGaji;

import static AplikasiGaji.ConnectionDb.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lisa
 */
public class LaporanGaji extends javax.swing.JInternalFrame {

    static DefaultTableModel getTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form LaporanGaji
     */
    public LaporanGaji() {
        initComponents();
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        cariButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        LabelIDGaji = new javax.swing.JLabel();
        cariIDGajiTxt = new javax.swing.JTextField();
        cetakButton = new javax.swing.JButton();
        keMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datagajiTable = new javax.swing.JTable();

        setTitle("Laporan Gaji");

        cariButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cariButton.setForeground(new java.awt.Color(0, 42, 140));
        cariButton.setText("Cari");
        cariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariButtonActionPerformed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hapusButton.setForeground(new java.awt.Color(0, 42, 140));
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        LabelIDGaji.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelIDGaji.setForeground(new java.awt.Color(255, 255, 255));
        LabelIDGaji.setText("No Gaji");

        cariIDGajiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariIDGajiTxtActionPerformed(evt);
            }
        });

        cetakButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cetakButton.setForeground(new java.awt.Color(0, 42, 140));
        cetakButton.setText("Cetak");
        cetakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakButtonActionPerformed(evt);
            }
        });

        keMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        keMenuButton.setForeground(new java.awt.Color(0, 42, 140));
        keMenuButton.setText("Ke Menu Utama");
        keMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keMenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATA PENGGAJIAN KARYAWAN");

        datagajiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Karyawan", "Nama Karyawan", "No Gaji", "Jabatan", "Gaji Pokok", "Lembur ", "Periode", "Jumlah Tak Hadir", "Potongan Absen", "Potongan Asuransi", "Gaji Total"
            }
        ));
        jScrollPane1.setViewportView(datagajiTable);

        jDesktopPane1.setLayer(cariButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(hapusButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelIDGaji, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cariIDGajiTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cetakButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(keMenuButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(LabelIDGaji)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariIDGajiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cetakButton))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cariButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(keMenuButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 248, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(226, 226, 226))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIDGaji)
                    .addComponent(cariIDGajiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cetakButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariButton)
                    .addComponent(hapusButton)
                    .addComponent(keMenuButton))
                .addGap(50, 50, 50))
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

    private void keMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keMenuButtonActionPerformed
        // TODO add your handling code here:
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_keMenuButtonActionPerformed

    private void cariButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariButtonActionPerformed
        try {
            //String nama = carinamaTxt.getText();
            String ID = cariIDGajiTxt.getText();
            //String queryNama = "SELECT * FROM gaji_karyawan WHERE Nama_Karyawan = '" + nama + "'";
            String queryID = "SELECT * FROM gaji_karyawan WHERE ID_Gaji = '" + ID + "'";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(queryID);
            // menampilkan data pada komponen tabel
            DefaultTableModel model = (DefaultTableModel) datagajiTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = { rs.getString("ID_Karyawan"),
                    rs.getString("Nama_Karyawan"),
                    rs.getString("ID_Gaji"), 
                    rs.getString("Jabatan"), 
                    rs.getString("Gaji_Pokok"),
                    rs.getString("Lembur"),
                    rs.getString("Periode_Gaji"),
                    rs.getString("Jumlah_Tak_Hadir"),
                    rs.getString("Potongan_Kehadiran"),
                    rs.getString("Potongan_Asuransi"), 
                    rs.getString("Gaji_Total")};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LaporanGaji.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cariButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        try {
            int selectedRow = datagajiTable.getSelectedRow();

                // mengambil nilai dari kolom ID pada baris yang dipilih
                String nama = datagajiTable.getValueAt(selectedRow, 0).toString();

                // membuat query SQL untuk menghapus data dari tabel
                String query = "DELETE FROM gaji_karyawan WHERE Nama_Karyawan = '" + nama + "'";

                // membuat statement dan mengeksekusi query SQL
                Statement stat = conn.createStatement();
                stat.executeUpdate(query);

                // menghapus baris pada tabel yang telah dihapus dari database
                DefaultTableModel model = (DefaultTableModel) datagajiTable.getModel();
                model.removeRow(selectedRow);
            } catch (SQLException ex) {
                Logger.getLogger(LaporanGaji.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void cariIDGajiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariIDGajiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariIDGajiTxtActionPerformed

    public Object[] getSelectedRowData() {
        int selectedRow = datagajiTable.getSelectedRow();
        if (selectedRow != -1) {
            int columnCount = datagajiTable.getColumnCount();
            Object[] rowData = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                rowData[i] = datagajiTable.getValueAt(selectedRow, i);
            }
            return rowData;
        }
        return null;
    }
    
    private void cetakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakButtonActionPerformed
            SlipGaji slip = new SlipGaji();

            // Mendapatkan data dari selectedRow di Frame1
            Object[] selectedData = getSelectedRowData();

            // Menampilkan data di Frame2
            if (selectedData != null) {
                slip.setLabelData(selectedData[0].toString(),
                        selectedData[1].toString(), 
                        selectedData[2].toString(),
                        selectedData[3].toString(),
                        selectedData[4].toString(),
                        selectedData[5].toString(),
                        selectedData[6].toString(),
                        selectedData[8].toString(),
                        selectedData[9].toString(),
                        selectedData[10].toString()
                );
            }
            // Menampilkan Frame2
            slip.setVisible(true);
    }//GEN-LAST:event_cetakButtonActionPerformed

    public void showTable(){
        try{
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/data_karyawan","user","pass");
            Statement stat = (Statement)ConnectionDb.connectDatabase().createStatement();
            String sql = "select * from gaji_karyawan";
            ResultSet rs = stat.executeQuery(sql);
            DefaultTableModel tableModel;
            tableModel = (DefaultTableModel)datagajiTable.getModel();
            while(rs.next()){
                tableModel.addRow(new Object[] {
                   rs.getString(1),rs.getString(2),rs.getString(3),
                   rs.getString(4),rs.getString(5),rs.getString(6),
                   rs.getString(7),rs.getString(8),rs.getString(9),
                   rs.getString(10),rs.getString(11)
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataKaryawan.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelIDGaji;
    private javax.swing.JButton cariButton;
    private javax.swing.JTextField cariIDGajiTxt;
    private javax.swing.JButton cetakButton;
    private javax.swing.JTable datagajiTable;
    private javax.swing.JButton hapusButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keMenuButton;
    // End of variables declaration//GEN-END:variables

    private void showtTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
