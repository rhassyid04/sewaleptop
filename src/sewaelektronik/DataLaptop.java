
package sewaelektronik;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.util.Date;



public class DataLaptop extends javax.swing.JFrame {

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public DataLaptop() {
        initComponents();
        updateTableData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelMerkMobil = new javax.swing.JLabel();
        LabelTypeMobil = new javax.swing.JLabel();
        LabelTahunProduksi = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        DropDown = new javax.swing.JComboBox<>();
        textMerkLaptop = new javax.swing.JTextField();
        textspek = new javax.swing.JTextField();
        LabelHargaSewa2 = new javax.swing.JLabel();
        textHargaSewa = new javax.swing.JTextField();
        LabelHargaSewa3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        textHargaSewa1 = new javax.swing.JTextField();
        LabelHargaSewa1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA LAPTOP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        labelMerkMobil.setForeground(new java.awt.Color(255, 255, 255));
        labelMerkMobil.setText("Type Laptop");
        getContentPane().add(labelMerkMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 82, -1));

        LabelTypeMobil.setForeground(new java.awt.Color(255, 255, 255));
        LabelTypeMobil.setText("Merk Laptop");
        getContentPane().add(LabelTypeMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 82, -1));

        LabelTahunProduksi.setForeground(new java.awt.Color(255, 255, 255));
        LabelTahunProduksi.setText("Tahun Produksi");
        getContentPane().add(LabelTahunProduksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 70, -1));

        btnSimpan.setBackground(new java.awt.Color(66, 120, 204));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        btnKembali.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asus", "Apple", "Acer", "Lenovo", "" }));
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });
        getContentPane().add(DropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 299, -1));
        getContentPane().add(textMerkLaptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 299, -1));

        textspek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textspekActionPerformed(evt);
            }
        });
        getContentPane().add(textspek, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 299, -1));

        LabelHargaSewa2.setForeground(new java.awt.Color(255, 255, 255));
        LabelHargaSewa2.setText("Spesifikasi");
        getContentPane().add(LabelHargaSewa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 82, -1));

        textHargaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaSewaActionPerformed(evt);
            }
        });
        getContentPane().add(textHargaSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 299, -1));

        LabelHargaSewa3.setForeground(new java.awt.Color(255, 255, 255));
        LabelHargaSewa3.setText("Harga Sewa");
        getContentPane().add(LabelHargaSewa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 82, -1));

        tableOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 600, 240));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 299, -1));
        getContentPane().add(textHargaSewa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 299, -1));

        LabelHargaSewa1.setForeground(new java.awt.Color(255, 255, 255));
        LabelHargaSewa1.setText("Harga Sewa");
        getContentPane().add(LabelHargaSewa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 82, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropDownActionPerformed

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
            String merek = (String) tableOutput.getValueAt(selectedRow, 0);
            String type = (String) tableOutput.getValueAt(selectedRow, 1);

            // Membuat pernyataan SQL untuk menghapus baris dari tabel berdasarkan nilai kolom tertentu
            String sql = "DELETE FROM datalaptop WHERE type = ? AND merk = ?";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, merek);
            statement.setString(2, type);

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

    private void textspekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textspekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textspekActionPerformed

    private void textHargaSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHargaSewaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
            String type = textMerkLaptop.getText();
            String merk = DropDown.getSelectedItem().toString();
            String spek = textspek.getText();
            java.util.Date tanggalProduksi = jDateChooser1.getDate();
            String tahunProduksi = new SimpleDateFormat("yyyy-MM-dd").format(tanggalProduksi);
            String hargaSewa = textHargaSewa.getText();

            // Mengupdate data ke database MySQL
            try {
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");

                String query = "UPDATE datalaptop SET spek = ?, tahun_produksi = ?, Harga_Sewa = ? WHERE type = ? AND merk = ?";
                PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                preparedStatement.setString(1, spek);
                preparedStatement.setString(2, tahunProduksi);
                preparedStatement.setString(3, hargaSewa);
                preparedStatement.setString(4, type);
                preparedStatement.setString(5, merk);

                int rowsUpdated = preparedStatement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data berhasil diupdate!");
                    JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");

                    // Mengosongkan field input setelah pembaruan berhasil
                    textMerkLaptop.setText("");
                    DropDown.setSelectedIndex(0);
                    textspek.setText("");
                    jDateChooser1.setDate(null);
                    textHargaSewa.setText("");

                    // Mengambil semua data dari database setelah pembaruan
                    String selectQuery = "SELECT * FROM datalaptop";
                    PreparedStatement selectStatement = (PreparedStatement) conn.prepareStatement(selectQuery);

                    ResultSet resultSet = selectStatement.executeQuery();
                    DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                    model.setRowCount(0); // Clear existing data

                    while (resultSet.next()) {
                        String typeLP = resultSet.getString("type");
                        String merkLP = resultSet.getString("merk");
                        String SpekData = resultSet.getString("spek");
                        String tahunProduksiData = resultSet.getString("tahun_produksi");
                        String hargaSewaData = resultSet.getString("Harga_Sewa");

                        model.addRow(new Object[]{typeLP, merkLP, SpekData, tahunProduksiData, hargaSewaData});
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Mendapatkan baris yang dipilih
        int selectedRow = tableOutput.getSelectedRow();

        if (selectedRow != -1) { // Pastikan baris dipilih
            // Mendapatkan nilai dari kolom yang dipilih
            String type = tableOutput.getValueAt(selectedRow, 0).toString();
            String merk = tableOutput.getValueAt(selectedRow, 1).toString();
            String spek = tableOutput.getValueAt(selectedRow, 2).toString();
            String tahunProduksi = tableOutput.getValueAt(selectedRow, 3).toString();
            String hargasewa = tableOutput.getValueAt(selectedRow, 4).toString();

            try {
                // Assuming the date is in "yyyy" format, you can adjust the format if necessary
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(tahunProduksi);
                jDateChooser1.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                jDateChooser1.setDate(null); // Resetting date if parsing fails
            }

            // Mengisi nilai ke dalam field teks
            textMerkLaptop.setText(type);
            DropDown.setSelectedItem(merk);
            textspek.setText(spek);
            textHargaSewa.setText(hargasewa);
            JOptionPane.showMessageDialog(null, "Data Siap di Edit!");
        } else {
            JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin diedit!");
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String type = textMerkLaptop.getText();
        String merk = DropDown.getSelectedItem().toString();
        String spek = textspek.getText();
        java.util.Date tanggalProduksi = jDateChooser1.getDate();
        String tahunProduksi = new SimpleDateFormat("yyyy-MM-dd").format(tanggalProduksi);
        String hargaSewa = textHargaSewa.getText();

        // Menyimpan data ke database MySQL
        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");

            String query = "INSERT INTO datalaptop (type, merk, spek, tahun_produksi, harga_sewa) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, merk);
            preparedStatement.setString(3, spek);
            preparedStatement.setString(4, tahunProduksi);
            preparedStatement.setString(5, hargaSewa);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data berhasil Disimpan!");
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                textMerkLaptop.setText("");
                textspek.setText("");
                jDateChooser1.setDate(null);
                textHargaSewa.setText("");

                // Memperbarui tampilan tabel dengan data terbaru
                updateTableData();
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Data gagal Disimpan!");
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data ke database: " + e.getMessage());
        }
        }
        private void updateTableData() {
            try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
                String query = "SELECT * FROM datalaptop";
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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataLaptop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JLabel LabelHargaSewa1;
    private javax.swing.JLabel LabelHargaSewa2;
    private javax.swing.JLabel LabelHargaSewa3;
    private javax.swing.JLabel LabelTahunProduksi;
    private javax.swing.JLabel LabelTypeMobil;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMerkMobil;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField textHargaSewa;
    private javax.swing.JTextField textHargaSewa1;
    private javax.swing.JTextField textMerkLaptop;
    private javax.swing.JTextField textspek;
    // End of variables declaration//GEN-END:variables
}
