package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameDokter extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameDokter() {
        initComponents();
        loadDataDokter();
    }

    private void loadDataDokter() {
    DefaultTableModel model = (DefaultTableModel) tabelDokter.getModel();
    model.setRowCount(0); // Menghapus data lama

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "SELECT * FROM doctors";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String noDokter = rs.getString("doctor_id");
            String namaDokter = rs.getString("nama");
            String jadwal = rs.getString("jadwal");
            String ruangan = rs.getString("ruangan");
            model.addRow(new Object[]{noDokter, namaDokter, jadwal, ruangan});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        btKeluar = new javax.swing.JButton();
        labelRuanganDokter = new javax.swing.JLabel();
        labelNamaDokter = new javax.swing.JLabel();
        labelJadwal = new javax.swing.JLabel();
        txtRuanganDokter = new javax.swing.JTextField();
        txtNamaDokter = new javax.swing.JTextField();
        txtJadwalDokter = new javax.swing.JTextField();
        btTambahDokter = new javax.swing.JButton();
        btHapusDokter = new javax.swing.JButton();
        btUbahDokter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btDokter = new javax.swing.JButton();
        btPasien = new javax.swing.JButton();
        btTransaksi = new javax.swing.JButton();
        labelNoDokter = new javax.swing.JLabel();
        txtNoDokter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 153));
        judul.setText("Dokter Klinik Kesehatan Teluk");

        btKeluar.setBackground(new java.awt.Color(255, 0, 51));
        btKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        labelRuanganDokter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelRuanganDokter.setText("Ruangan");

        labelNamaDokter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNamaDokter.setText("Nama Dokter");

        labelJadwal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelJadwal.setText("Jadwal");

        btTambahDokter.setBackground(new java.awt.Color(0, 0, 102));
        btTambahDokter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTambahDokter.setForeground(new java.awt.Color(255, 255, 255));
        btTambahDokter.setText("Tambah");
        btTambahDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahDokterActionPerformed(evt);
            }
        });

        btHapusDokter.setBackground(new java.awt.Color(0, 0, 102));
        btHapusDokter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btHapusDokter.setForeground(new java.awt.Color(255, 255, 255));
        btHapusDokter.setText("Hapus");
        btHapusDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusDokterActionPerformed(evt);
            }
        });

        btUbahDokter.setBackground(new java.awt.Color(0, 0, 102));
        btUbahDokter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUbahDokter.setForeground(new java.awt.Color(255, 255, 255));
        btUbahDokter.setText("Ubah");
        btUbahDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahDokterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btDokter.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btDokter.setForeground(new java.awt.Color(0, 0, 102));
        btDokter.setText("Dokter");
        btDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDokterActionPerformed(evt);
            }
        });

        btPasien.setBackground(new java.awt.Color(204, 255, 255));
        btPasien.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btPasien.setForeground(new java.awt.Color(0, 0, 102));
        btPasien.setText("Pasien");
        btPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPasienActionPerformed(evt);
            }
        });

        btTransaksi.setBackground(new java.awt.Color(204, 255, 255));
        btTransaksi.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btTransaksi.setForeground(new java.awt.Color(0, 0, 102));
        btTransaksi.setText("Transaksi");
        btTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDokter)
                    .addComponent(btPasien))
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btPasien)
                .addGap(46, 46, 46)
                .addComponent(btDokter)
                .addGap(46, 46, 46)
                .addComponent(btTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNoDokter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNoDokter.setText("No Dokter");

        tabelDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Dokter", "Nama Dokter", "Jadwal", "Ruangan"
            }
        ));
        jScrollPane1.setViewportView(tabelDokter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btKeluar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJadwalDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btTambahDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHapusDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(btUbahDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(judul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btKeluar)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJadwalDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapusDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUbahDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTambahDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        FrameLogin frameLogin = new FrameLogin();
        frameLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDokterActionPerformed

    private void btPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasienActionPerformed
        FramePasien framePasien = new FramePasien();
        framePasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPasienActionPerformed

    private void btUbahDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahDokterActionPerformed
        int selectedRow = tabelDokter.getSelectedRow();
        if (selectedRow != -1) {
            String noDokter = txtNoDokter.getText();
            String namaDokter = txtNamaDokter.getText();
            String jadwal = txtJadwalDokter.getText();
            String ruangan = txtRuanganDokter.getText();

            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "UPDATE doctors SET nama = ?, jadwal = ?, ruangan = ? WHERE doctor_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, namaDokter);
                pstmt.setString(2, jadwal);
                pstmt.setString(3, ruangan);
                pstmt.setString(4, noDokter);
                pstmt.executeUpdate();
                loadDataDokter(); // Memuat ulang data setelah pengubahan
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih dokter yang ingin diubah.");
        }
    }//GEN-LAST:event_btUbahDokterActionPerformed

    private void btTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransaksiActionPerformed
        FrameTransaksi frameTransaksi = new FrameTransaksi();
        frameTransaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTransaksiActionPerformed

    private void btTambahDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahDokterActionPerformed
       String noDokter = txtNoDokter.getText();
    String namaDokter = txtNamaDokter.getText();
    String jadwal = txtJadwalDokter.getText();
    String ruangan = txtRuanganDokter.getText();

    if (noDokter.isEmpty() || namaDokter.isEmpty() || jadwal.isEmpty() || ruangan.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = DatabaseConnection.getConnection()) {
        String sql = "INSERT INTO doctors (doctor_id, nama, jadwal, ruangan) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, noDokter);
        pstmt.setString(2, namaDokter);
        pstmt.setString(3, jadwal);
        pstmt.setString(4, ruangan);
        pstmt.executeUpdate();
        loadDataDokter(); // Memuat ulang data setelah penambahan
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btTambahDokterActionPerformed

    private void btHapusDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusDokterActionPerformed
        int selectedRow = tabelDokter.getSelectedRow();
        if (selectedRow != -1) {
            String noDokter = tabelDokter.getValueAt(selectedRow, 0).toString();
            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "DELETE FROM doctors WHERE doctor_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, noDokter);
                pstmt.executeUpdate();
                loadDataDokter(); // Memuat ulang data setelah penghapusan
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih dokter yang ingin dihapus.");
        }
    }//GEN-LAST:event_btHapusDokterActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDokter;
    private javax.swing.JButton btHapusDokter;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btPasien;
    private javax.swing.JButton btTambahDokter;
    private javax.swing.JButton btTransaksi;
    private javax.swing.JButton btUbahDokter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelJadwal;
    private javax.swing.JLabel labelNamaDokter;
    private javax.swing.JLabel labelNoDokter;
    private javax.swing.JLabel labelRuanganDokter;
    private javax.swing.JTable tabelDokter;
    private javax.swing.JTextField txtJadwalDokter;
    private javax.swing.JTextField txtNamaDokter;
    private javax.swing.JTextField txtNoDokter;
    private javax.swing.JTextField txtRuanganDokter;
    // End of variables declaration//GEN-END:variables
}
