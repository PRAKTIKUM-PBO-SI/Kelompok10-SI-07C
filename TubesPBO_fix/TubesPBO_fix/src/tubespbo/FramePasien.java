package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FramePasien extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FramePasien() {
        initComponents();
        loadDataPasien();
    }

    private void loadDataPasien() {
        DefaultTableModel model = (DefaultTableModel) tabelPasien.getModel();
        model.setRowCount(0); // Menghapus data lama

        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM Patients";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String noKartu = rs.getString("no_kartu");
                String nama = rs.getString("nama");
                String keluhan = rs.getString("keluhan");
                String obat = rs.getString("obat");
                model.addRow(new Object[]{noKartu, nama, keluhan, obat});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        btKeluar = new javax.swing.JButton();
        labelObat = new javax.swing.JLabel();
        labelNamaPasien = new javax.swing.JLabel();
        labelKeluhan = new javax.swing.JLabel();
        txtObat = new javax.swing.JTextField();
        txtNamaPasien = new javax.swing.JTextField();
        txtKeluhan = new javax.swing.JTextField();
        btTambahPasien = new javax.swing.JButton();
        btHapusPasien = new javax.swing.JButton();
        btUbahPasien = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btDokter = new javax.swing.JButton();
        btPasien = new javax.swing.JButton();
        btTransaksi = new javax.swing.JButton();
        labelNokartu = new javax.swing.JLabel();
        txtNokartu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPasien = new javax.swing.JTable();
        labelNoDokter = new javax.swing.JLabel();
        txtNoDokter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 153));
        judul.setText("Pasien Klinik Kesehatan Teluk");

        btKeluar.setBackground(new java.awt.Color(255, 0, 51));
        btKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        labelObat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelObat.setText("Obat");

        labelNamaPasien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNamaPasien.setText("Nama Pasien");

        labelKeluhan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelKeluhan.setText("Keluhan");

        btTambahPasien.setBackground(new java.awt.Color(0, 0, 102));
        btTambahPasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTambahPasien.setForeground(new java.awt.Color(255, 255, 255));
        btTambahPasien.setText("Tambah");
        btTambahPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahPasienActionPerformed(evt);
            }
        });

        btHapusPasien.setBackground(new java.awt.Color(0, 0, 102));
        btHapusPasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btHapusPasien.setForeground(new java.awt.Color(255, 255, 255));
        btHapusPasien.setText("Hapus");
        btHapusPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusPasienActionPerformed(evt);
            }
        });

        btUbahPasien.setBackground(new java.awt.Color(0, 0, 102));
        btUbahPasien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUbahPasien.setForeground(new java.awt.Color(255, 255, 255));
        btUbahPasien.setText("Ubah");
        btUbahPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahPasienActionPerformed(evt);
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

        labelNokartu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNokartu.setText("No Kartu RS");

        txtNokartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNokartuActionPerformed(evt);
            }
        });

        tabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Kartu RS", "Nama Pasien", "Keluhan", "Obat"
            }
        ));
        jScrollPane1.setViewportView(tabelPasien);

        labelNoDokter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNoDokter.setText("No Dokter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btKeluar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelObat, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNokartu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNokartu, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtObat, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btTambahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btHapusPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(btUbahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtNokartu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapusPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUbahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTambahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.dispose(); // Menutup FramePasien
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDokterActionPerformed
        FrameDokter frameDokter = new FrameDokter();
        frameDokter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDokterActionPerformed

    private void btPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPasienActionPerformed

    private void btUbahPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahPasienActionPerformed
        int selectedRow = tabelPasien.getSelectedRow();
        if (selectedRow >= 0) {
            String noKartu = tabelPasien.getValueAt(selectedRow, 0).toString();
            String namaPasien = txtNamaPasien.getText();
            String keluhan = txtKeluhan.getText();
            String obat = txtObat.getText();

            // Validasi input
            if (namaPasien.isEmpty() || keluhan.isEmpty() || obat.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Keluar dari metode jika ada field yang kosong
            }

            updatePasienInDatabase(noKartu, namaPasien, keluhan, obat);
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih pasien yang ingin diubah.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUbahPasienActionPerformed

    private void btTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransaksiActionPerformed
        FrameTransaksi frameTransaksi = new FrameTransaksi();
        frameTransaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTransaksiActionPerformed

    private void btTambahPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahPasienActionPerformed
        String noKartu = txtNokartu.getText();
        String namaPasien = txtNamaPasien.getText();
        String keluhan = txtKeluhan.getText();
        String obat = txtObat.getText();

        // Validasi input
        if (noKartu.isEmpty() || namaPasien.isEmpty() || keluhan.isEmpty() || obat.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Keluar dari metode jika ada field yang kosong
        }

        // Membuat objek Pasien
        Pasien pasien = new Pasien(namaPasien, noKartu, keluhan, obat);
        addPasienToDatabase(pasien);
    }//GEN-LAST:event_btTambahPasienActionPerformed

    private void btHapusPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusPasienActionPerformed
        int selectedRow = tabelPasien.getSelectedRow();
        if (selectedRow >= 0) {
            String noKartu = tabelPasien.getValueAt(selectedRow, 0).toString();
            deletePasienFromDatabase(noKartu);
        } else {
            JOptionPane.showMessageDialog(this, "Silakan pilih pasien yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btHapusPasienActionPerformed

    private void txtNokartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNokartuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNokartuActionPerformed
    private void addPasienToDatabase(Pasien pasien) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Patients (no_kartu, nama, keluhan, obat) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pasien.getNoKartu());
            pstmt.setString(2, pasien.getNama());
            pstmt.setString(3, pasien.getKeluhan());
            pstmt.setString(4, pasien.getObat());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data pasien berhasil ditambahkan!");
            loadDataPasien();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deletePasienFromDatabase(String noKartu) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM Patients WHERE no_kartu = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, noKartu);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data pasien berhasil dihapus!");
            loadDataPasien();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updatePasienInDatabase(String noKartu, String namaPasien, String keluhan, String obat) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Patients SET nama = ?, keluhan = ?, obat = ? WHERE no_kartu = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, namaPasien);
            pstmt.setString(2, keluhan);
            pstmt.setString(3, obat);
            pstmt.setString(4, noKartu);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data pasien berhasil diubah!");
            loadDataPasien();
        } catch (SQLException e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(FramePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDokter;
    private javax.swing.JButton btHapusPasien;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btPasien;
    private javax.swing.JButton btTambahPasien;
    private javax.swing.JButton btTransaksi;
    private javax.swing.JButton btUbahPasien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelKeluhan;
    private javax.swing.JLabel labelNamaPasien;
    private javax.swing.JLabel labelNoDokter;
    private javax.swing.JLabel labelNokartu;
    private javax.swing.JLabel labelObat;
    private javax.swing.JTable tabelPasien;
    private javax.swing.JTextField txtKeluhan;
    private javax.swing.JTextField txtNamaPasien;
    private javax.swing.JTextField txtNoDokter;
    private javax.swing.JTextField txtNokartu;
    private javax.swing.JTextField txtObat;
    // End of variables declaration//GEN-END:variables
}
