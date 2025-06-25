
package sewaelektronik;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;


public class datakonsumen extends javax.swing.JFrame {

     static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public datakonsumen() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNamaPegawai = new javax.swing.JTextField();
        textNik = new javax.swing.JTextField();
        textAlamat = new javax.swing.JTextField();
        textJabatan = new javax.swing.JTextField();
        textAlamatEmail = new javax.swing.JTextField();
        textNotlpn = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM REGISTRASI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 70, 180, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Konsumen");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 93, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 93, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pekerjaan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 93, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 93, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No Telephone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 93, -1));
        getContentPane().add(textNamaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 230, -1));
        getContentPane().add(textNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 230, -1));
        getContentPane().add(textAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 230, -1));
        getContentPane().add(textJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 230, -1));
        getContentPane().add(textAlamatEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 230, -1));

        textNotlpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNotlpnActionPerformed(evt);
            }
        });
        getContentPane().add(textNotlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 230, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 70, -1));

        btnSimpan.setBackground(new java.awt.Color(66, 120, 204));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        btnKembali.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

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
        jScrollPane1.setViewportView(tableOutput);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 510, 200));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            String namakonsumen = (String) tableOutput.getValueAt(selectedRow, 0);

            // Membuat pernyataan SQL untuk menghapus baris dari tabel berdasarkan nilai kolom tertentu
            String sql = "DELETE FROM datakonsumen WHERE nama_konsumen = ?";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, namakonsumen);

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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
            String namakonsumen = textNamaPegawai.getText();
            String nik = textNik.getText();
            String alamat = textAlamat.getText();
            String jabatan = textJabatan.getText();
            String alamat_email = textAlamatEmail.getText();
            String notlpn = textNotlpn.getText();

            // Mengupdate data ke database MySQL
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");

                String query = "UPDATE datakonsumen SET NIK = ?, Alamat = ?, Pekerjaan = ?, Email = ?, No_HP = ? WHERE nama_konsumen = ?";
                PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                preparedStatement.setString(1, nik);
                preparedStatement.setString(2, alamat);
                preparedStatement.setString(3, jabatan);
                preparedStatement.setString(4, alamat_email);
                preparedStatement.setString(5, notlpn);
                preparedStatement.setString(6, namakonsumen);

                int rowsUpdated = preparedStatement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data berhasil diupdate!");
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");

                    // Mengosongkan field input setelah pembaruan berhasil
                    textNamaPegawai.setText("");
                    textNik.setText("");
                    textAlamat.setText("");
                    textJabatan.setText("");
                    textAlamatEmail.setText("");
                    textNotlpn.setText("");

                    // Mengambil semua data dari database setelah pembaruan
                    String selectQuery = "SELECT * FROM datakonsumen";
                    PreparedStatement selectStatement = (PreparedStatement) conn.prepareStatement(selectQuery);

                    ResultSet resultSet = selectStatement.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                    model.setRowCount(0); // Clear existing data

                    while (resultSet.next()) {
                        String datakonsumen = resultSet.getString("nama_konsumen");
                        String datanik = resultSet.getString("NIK");
                        String dataalamat = resultSet.getString("Alamat");
                        String datajabatan = resultSet.getString("Pekerjaan");
                        String dataemail = resultSet.getString("Email");
                        String No_HP = resultSet.getString("No_HP");

                        model.addRow(new Object[]{datakonsumen, datanik, dataalamat, datajabatan, dataemail, No_HP});
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

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        mainmenu pagemenu = new mainmenu();
        pagemenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int selectedRow = tableOutput.getSelectedRow();
    
    if (selectedRow != -1) { // Pastikan baris dipilih
        // Mendapatkan nilai dari kolom yang dipilih
        String namapegawai = tableOutput.getValueAt(selectedRow, 0).toString();
        String nik = tableOutput.getValueAt(selectedRow, 1).toString();
        String alamat = tableOutput.getValueAt(selectedRow, 2).toString();
        String jabatan = tableOutput.getValueAt(selectedRow, 3).toString();
        String alamat_email = tableOutput.getValueAt(selectedRow, 4).toString();
        String notlpn = tableOutput.getValueAt(selectedRow, 5).toString();

        // Mengisi nilai ke dalam field teks
        textNamaPegawai.setText(namapegawai);
        textNik.setText(nik);
        textAlamat.setText(alamat);
        textJabatan.setText(jabatan);
        textAlamatEmail.setText(alamat_email);
        textNotlpn.setText(notlpn);

        JOptionPane.showMessageDialog(null, "Data ter-edit!");
    } else {
        JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin diedit!");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void textNotlpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNotlpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNotlpnActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String namakonsumen = textNamaPegawai.getText();
        String nik = textNik.getText();
        String alamat = textAlamat.getText();
        String jabatan = textJabatan.getText();
        String alamat_email = textAlamatEmail.getText();
        String notlpn = textNotlpn.getText();

        // Menyimpan data ke database MySQL
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
            String query = "INSERT INTO datakonsumen (nama_konsumen, NIK, Alamat, Pekerjaan, Email, No_HP) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {
                preparedStatement.setString(1, namakonsumen);
                preparedStatement.setString(2, nik);
                preparedStatement.setString(3, alamat);
                preparedStatement.setString(4, jabatan);
                preparedStatement.setString(5, alamat_email);
                preparedStatement.setString(6, notlpn);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil Disimpan!");
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");

                    // Clear input fields
                    textNamaPegawai.setText("");
                    textNik.setText("");
                    textAlamat.setText("");
                    textJabatan.setText("");
                    textAlamatEmail.setText("");
                    textNotlpn.setText("");

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
                String query = "SELECT * FROM datakonsumen";
                try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                    // Retrieve column names dynamically from the ResultSetMetaData
                    ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
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
            }    // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datakonsumen().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textAlamatEmail;
    private javax.swing.JTextField textJabatan;
    private javax.swing.JTextField textNamaPegawai;
    private javax.swing.JTextField textNik;
    private javax.swing.JTextField textNotlpn;
    // End of variables declaration//GEN-END:variables
}
