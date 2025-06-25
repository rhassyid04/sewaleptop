
package sewaelektronik;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

    public class datapegawai extends javax.swing.JFrame {
    
     static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public datapegawai() {
        initComponents();
        updateTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textAlamatEmail = new javax.swing.JTextField();
        textTempatLahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textNotlpn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textJenisKelamin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        textUmur = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAlamat = new javax.swing.JTextArea();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        textNamaPegawai = new javax.swing.JTextField();
        textTanggalLahir = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA PEGAWAI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 43, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 173, 75, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tempat Lahir");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 203, 93, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal lahir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 235, 93, -1));

        textAlamatEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlamatEmailActionPerformed(evt);
            }
        });
        getContentPane().add(textAlamatEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 166, -1));

        textTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTempatLahirActionPerformed(evt);
            }
        });
        getContentPane().add(textTempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 166, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No HP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 263, 93, -1));

        textNotlpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotlpnActionPerformed(evt);
            }
        });
        getContentPane().add(textNotlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 166, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 295, 93, -1));

        textJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        getContentPane().add(textJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 166, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Umur");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 325, 93, -1));

        textUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUmurActionPerformed(evt);
            }
        });
        getContentPane().add(textUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 166, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 358, 93, -1));

        textAlamat.setColumns(20);
        textAlamat.setRows(5);
        jScrollPane1.setViewportView(textAlamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        btnKembali.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 70, -1));

        btnSimpan.setBackground(new java.awt.Color(66, 120, 204));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        tableOutput.setModel(new javax.swing.table.DefaultTableModel(
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
        tableOutput.setFocusable(false);
        jScrollPane4.setViewportView(tableOutput);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 560, 130));

        textNamaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(textNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 166, -1));
        getContentPane().add(textTanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 166, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textAlamatEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlamatEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlamatEmailActionPerformed

    private void textTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTempatLahirActionPerformed

    private void textNotlpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotlpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNotlpnActionPerformed

    private void textUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUmurActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        mainmenu pagemenu = new mainmenu();
        pagemenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tableOutput.getSelectedRow();

        // Pastikan ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus");
            return;
        }

        // Konfirmasi penghapusan
        int option = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                // Menghubungkan ke database
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");

                // Mendapatkan nilai kolom yang digunakan sebagai kriteria untuk penghapusan
                String nama = (String) tableOutput.getValueAt(selectedRow, 0);

                // Membuat pernyataan SQL untuk menghapus baris dari tabel berdasarkan nilai kolom tertentu
                String sql = "DELETE FROM datapegawai WHERE Nama = ?";
                PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
                statement.setString(1, nama);

                // Mengeksekusi pernyataan DELETE
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Data berhasil dihapus!");
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    // Hapus baris dari model tabel
                    DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus Data");
                }

                // Tutup koneksi ke database
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Data gagal dihapus!");
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectedRow = tableOutput.getSelectedRow();

    if (selectedRow != -1) { // Pastikan baris dipilih
        // Mendapatkan nilai dari kolom yang dipilih
        String namapegawai = tableOutput.getValueAt(selectedRow, 0).toString();
        String alamat_email = tableOutput.getValueAt(selectedRow, 1).toString();
        String tempatlahir = tableOutput.getValueAt(selectedRow, 2).toString();
        String tahunLahir = tableOutput.getValueAt(selectedRow, 3).toString();
        String no_tlpn = tableOutput.getValueAt(selectedRow, 4).toString();
        String jenis_kelamin = tableOutput.getValueAt(selectedRow, 5).toString();
        String umur = tableOutput.getValueAt(selectedRow, 6).toString();
        String alamat = tableOutput.getValueAt(selectedRow, 7).toString();

        try {
            // Assuming the date is in "yyyy" format, you can adjust the format if necessary
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(tahunLahir);
            textTanggalLahir.setDate(date);
            } catch (ParseException e) {
            e.printStackTrace();
            textTanggalLahir.setDate(null); // Resetting date if parsing fails
        }
                // Mengisi nilai ke dalam field teks
                textNamaPegawai.setText(namapegawai);
                textAlamat.setText(alamat);
                textTempatLahir.setText(tempatlahir);
                textAlamatEmail.setText(alamat_email);
                textNotlpn.setText(no_tlpn);
                textJenisKelamin.setSelectedItem(jenis_kelamin);
                textUmur.setText(umur);

                JOptionPane.showMessageDialog(null, "Data ter-edit!");
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin diedit!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
            String namapegawai = textNamaPegawai.getText();
            String alamatemail = textAlamatEmail.getText();
            String tempatlahir= textTempatLahir.getText();
            java.util.Date tanggalLahir = textTanggalLahir.getDate();
            String tahunLahir = new SimpleDateFormat("yyyy-MM-dd").format(tanggalLahir);
            String notlpn = textNotlpn.getText();
            String jeniskelamin = textJenisKelamin.getSelectedItem().toString();
            String umur = textUmur.getText();
            String alamat = textAlamat.getText();

            // Mengupdate data ke database MySQL
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");

                String query = "UPDATE datapegawai SET Email = ?, Tempat_Lahir = ?, Tanggal_Lahir = ?, No_HP = ?, Jenis_Kelamin = ?, Umur = ?, Alamat = ? WHERE Nama = ?";
                PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                preparedStatement.setString(1, alamatemail);
                preparedStatement.setString(2, tempatlahir);
                preparedStatement.setString(3, tahunLahir);
                preparedStatement.setString(4, notlpn);
                preparedStatement.setString(5, jeniskelamin);
                preparedStatement.setString(6, umur);
                preparedStatement.setString(7, alamat);
                preparedStatement.setString(8, namapegawai);

                int rowsUpdated = preparedStatement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data berhasil diupdate!");
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");

                    // Mengosongkan field input setelah pembaruan berhasil
                    textNamaPegawai.setText("");
                    textAlamatEmail.setText("");
                    textTempatLahir.setText("");
                    textTanggalLahir.setDate(null);
                    textNotlpn.setText("");
                    textJenisKelamin.setSelectedIndex(0);
                    textUmur.setText("");
                    textAlamat.setText("");

                    // Mengambil semua data dari database setelah pembaruan
                    String selectQuery = "SELECT * FROM datapegawai";
                    PreparedStatement selectStatement = (PreparedStatement) conn.prepareStatement(selectQuery);

                    ResultSet resultSet = selectStatement.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                    model.setRowCount(0); // Clear existing data

                    while (resultSet.next()) {
                        String datakonsumen = resultSet.getString("Nama");
                        String dataemail = resultSet.getString("Email");
                        String datatempat = resultSet.getString("Tempat_Lahir");
                        String datatanggal = resultSet.getString("Tanggal_Lahir");
                        String No_HP = resultSet.getString("No_HP");
                        String datakelamin = resultSet.getString("Jenis_Kelamin");
                        String dataumur = resultSet.getString("Umur");
                        String dataalamat = resultSet.getString("Alamat");

                        model.addRow(new Object[]{datakonsumen, dataemail, datatempat, datatanggal, No_HP, datakelamin, dataumur, dataalamat});
                    }
                } else {
                    System.out.println("Tidak ada perubahan pada data.");
                    JOptionPane.showMessageDialog(null, "Tidak ada perubahan pada data.");
                }

            } catch (SQLException e) {
                System.out.println("Data gagal diupdate!");
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengupdate data ke database: " + e.getMessage());
        }   
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
            String namapegawai = textNamaPegawai.getText();
            String alamat = textAlamat.getText();
            String tempatlahir = textTempatLahir.getText();
            java.util.Date tanggalProduksi = textTanggalLahir.getDate();
            String tanggallahir = new SimpleDateFormat("yyyy-MM-dd").format(tanggalProduksi);
            String alamat_email = textAlamatEmail.getText();
            String notlpn = textNotlpn.getText();
            String jenis_kelamin = textJenisKelamin.getSelectedItem().toString();
            String umur = textUmur.getText();

            // Menyimpan data ke database MySQL
            try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
                String query = "INSERT INTO datapegawai (Nama, Email, Tempat_Lahir, Tanggal_Lahir, No_HP, Jenis_Kelamin, Umur, Alamat) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {
                    preparedStatement.setString(1, namapegawai);
                    preparedStatement.setString(2, alamat_email);
                    preparedStatement.setString(3, tempatlahir);
                    preparedStatement.setString(4, tanggallahir);
                    preparedStatement.setString(5, notlpn);
                    preparedStatement.setString(6, jenis_kelamin);
                    preparedStatement.setString(7, umur);
                    preparedStatement.setString(8, alamat);

                    int rowsInserted = preparedStatement.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Data berhasil Disimpan!");
                        JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");

                        // Clear input fields
                        textNamaPegawai.setText("");
                        textAlamat.setText("");
                        textTempatLahir.setText("");
                        textAlamatEmail.setText("");
                        textNotlpn.setText("");
                        textUmur.setText("");

                        // Memperbarui tampilan tabel dengan data terbaru
                        updateTableData();
                    }
                }
            } catch (SQLException e) {
                System.out.println("Data gagal Disimpan!");
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data ke database: " + e.getMessage());
            }
        }

        private void updateTableData() {
            try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
                String query = "SELECT * FROM datapegawai";
                try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                    // Retrieve column names dynamically from the ResultSetMetaData
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    String[] columnNames = new String[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames[i - 1] = metaData.getColumnName(i);
                    }

                    // Create a new table model with the column names
                    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                    // Add rows to the model
                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet.getObject(i);
                        }
                        model.addRow(rowData);
                    }

                    // Set the new model to the table
                    tableOutput.setModel(model);
                }
            } catch (SQLException e) {
                System.out.println("Gagal memperbarui tabel: " + e.getMessage());
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void textNamaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaPegawaiActionPerformed

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
            java.util.logging.Logger.getLogger(datapegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datapegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datapegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datapegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datapegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextArea textAlamat;
    private javax.swing.JTextField textAlamatEmail;
    private javax.swing.JComboBox<String> textJenisKelamin;
    private javax.swing.JTextField textNamaPegawai;
    private javax.swing.JTextField textNotlpn;
    private com.toedter.calendar.JDateChooser textTanggalLahir;
    private javax.swing.JTextField textTempatLahir;
    private javax.swing.JTextField textUmur;
    // End of variables declaration//GEN-END:variables
}
