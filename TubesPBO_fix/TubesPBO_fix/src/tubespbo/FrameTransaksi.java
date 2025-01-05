package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameTransaksi() {
        initComponents();
        loadDataTransaksi();
    }

    private void loadDataTransaksi() {
        DefaultTableModel model = (DefaultTableModel) tabelDokter.getModel();
        model.setRowCount(0); // Menghapus semua baris yang ada

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM Transactions";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String noKartu = rs.getString("no_kartu");
                String noDokter = rs.getString("doctor_id");
                String namaPasien = rs.getString("nama_pasien");
                String biaya = rs.getString("biaya");
                model.addRow(new Object[]{noKartu, noDokter, namaPasien, biaya});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data transaksi!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        btKeluar = new javax.swing.JButton();
        labelRuanganDokter = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        txtNoDokter = new javax.swing.JTextField();
        txtNamaPasien = new javax.swing.JTextField();
        btTambahTransaksi = new javax.swing.JButton();
        btHapusTransaksi = new javax.swing.JButton();
        btUbahTransaksi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btDokter = new javax.swing.JButton();
        btPasien = new javax.swing.JButton();
        btTransaksi = new javax.swing.JButton();
        txtNoKartu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDokter = new javax.swing.JTable();
        labelNokartu = new javax.swing.JLabel();
        labelNoDokter = new javax.swing.JLabel();
        labelNamaPasien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 153));
        judul.setText("Transaksi Klinik Kesehatan Teluk");

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
        labelRuanganDokter.setText("Biaya");

        btTambahTransaksi.setBackground(new java.awt.Color(0, 0, 102));
        btTambahTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTambahTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btTambahTransaksi.setText("Tambah");
        btTambahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahTransaksiActionPerformed(evt);
            }
        });

        btHapusTransaksi.setBackground(new java.awt.Color(0, 0, 102));
        btHapusTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btHapusTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btHapusTransaksi.setText("Hapus");
        btHapusTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusTransaksiActionPerformed(evt);
            }
        });

        btUbahTransaksi.setBackground(new java.awt.Color(0, 0, 102));
        btUbahTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUbahTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btUbahTransaksi.setText("Ubah");
        btUbahTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahTransaksiActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btDokter.setBackground(new java.awt.Color(204, 255, 255));
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
                "No Kartu RS", "No Dokter", "Nama Pasien", "Biaya"
            }
        ));
        jScrollPane1.setViewportView(tabelDokter);

        labelNokartu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNokartu.setText("No Kartu RS");

        labelNoDokter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNoDokter.setText("No Dokter");

        labelNamaPasien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNamaPasien.setText("Nama Pasien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judul)
                        .addGap(83, 83, 83)
                        .addComponent(btKeluar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNokartu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoKartu, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btTambahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(btUbahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(labelNokartu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoKartu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRuanganDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapusTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUbahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTambahTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        FrameDokter frameDokter = new FrameDokter();
        frameDokter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDokterActionPerformed

    private void btPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasienActionPerformed
        FramePasien framePasien = new FramePasien();
        framePasien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPasienActionPerformed

    private void btUbahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahTransaksiActionPerformed
        String noKartu = txtNoKartu.getText();
        String noDokter = txtNoDokter.getText();
        String namaPasien = txtNamaPasien.getText();
        String biaya = txtBiaya.getText();

        // Memeriksa apakah semua field kosong
        if (noKartu.isEmpty() || noDokter.isEmpty() || namaPasien.isEmpty() || biaya.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Keluar dari metode jika ada field yang kosong
        }

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Transactions SET doctor_id = ?, nama_pasien = ?, biaya = ? WHERE no_kartu = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(noDokter)); // Pastikan noDokter adalah integer
            pstmt.setString(2, namaPasien);
            pstmt.setDouble(3, Double.parseDouble(biaya)); // Pastikan biaya adalah double
            pstmt.setString(4, noKartu);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data transaksi berhasil diubah!");
                loadDataTransaksi(); // Memuat ulang data transaksi ke tabel
            } else {
                JOptionPane.showMessageDialog(this, "No Kartu tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengubah data transaksi!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUbahTransaksiActionPerformed

    private void btTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTransaksiActionPerformed

    private void btTambahTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahTransaksiActionPerformed
        String noKartu = txtNoKartu.getText();
        String noDokter = txtNoDokter.getText();
        String namaPasien = txtNamaPasien.getText();
        String biaya = txtBiaya.getText();

        if (noKartu.isEmpty() || noDokter.isEmpty() || namaPasien.isEmpty() || biaya.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Keluar dari metode jika ada field yang kosong
        }

        // Lanjutkan dengan menambahkan transaksi ke database
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Transactions (no_kartu, doctor_id, nama_pasien, biaya) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, noKartu);
            pstmt.setInt(2, Integer.parseInt(noDokter)); // Pastikan noDokter adalah integer
            pstmt.setString(3, namaPasien);
            pstmt.setDouble(4, Double.parseDouble(biaya)); // Pastikan biaya adalah double

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data transaksi berhasil ditambahkan!");
            loadDataTransaksi(); // Memuat ulang data transaksi ke tabel
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data transaksi!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btTambahTransaksiActionPerformed

    private void btHapusTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusTransaksiActionPerformed
        String noKartu = txtNoKartu.getText();

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM Transactions WHERE no_kartu = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, noKartu);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data transaksi berhasil dihapus!");
                loadDataTransaksi(); // Memuat ulang data transaksi ke tabel
            } else {
                JOptionPane.showMessageDialog(this, "No Kartu tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menghapus data transaksi!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btHapusTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDokter;
    private javax.swing.JButton btHapusTransaksi;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btPasien;
    private javax.swing.JButton btTambahTransaksi;
    private javax.swing.JButton btTransaksi;
    private javax.swing.JButton btUbahTransaksi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelNamaPasien;
    private javax.swing.JLabel labelNoDokter;
    private javax.swing.JLabel labelNokartu;
    private javax.swing.JLabel labelRuanganDokter;
    private javax.swing.JTable tabelDokter;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNoDokter;
    private javax.swing.JTextField txtNoKartu;
    // End of variables declaration//GEN-END:variables
}
