
package sewaelektronik;

import java.io.InputStream;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Random;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class transaksisewakomputer extends javax.swing.JFrame {
    private java.sql.Connection conn = new koneksi().connect();



    public transaksisewakomputer() {
        initComponents();
        tampildatakonsumen();
        tampildatapegawai();
        updateTableDataTransaksi();
    }
    
    private void tblDataKomputerMouseClicked(java.awt.event.MouseEvent evt) {                                          
    int row = tblDataKomputer.getSelectedRow(); // Mendapatkan baris yang dipilih
    if (row != -1) { // Pastikan baris yang dipilih valid
        String merekPC = tblDataKomputer.getValueAt(row, 0).toString(); // Mendapatkan merek mobil dari baris yang dipilih
        String typePC = tblDataKomputer.getValueAt(row, 1).toString(); // Mendapatkan tipe mobil dari baris yang dipilih
        String VGA = tblDataKomputer.getValueAt(row, 2).toString();
        String HargaSewa = tblDataKomputer.getValueAt(row, 4).toString();
        // Update teks pada label "textPilihMobil"
        textPilihPC.setText(merekPC + ", " + typePC);
        textVGA.setText(VGA);
        textHargaSewa.setText(HargaSewa);
    }
}
    
    public void tampildatakonsumen() {
        String query = "SELECT * FROM datakonsumen";
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");
             PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                ComboDataKonsumen.removeAllItems(); // Hapus item sebelumnya

                while (resultSet.next()) {
                    ComboDataKonsumen.addItem(resultSet.getString("nama_konsumen")); // Sesuaikan nama kolom jika diperlukan
                }

                System.out.println("Tampil data konsumen Berhasil");
            } catch (SQLException ex) {
                System.out.println("Tampil data konsumen \n Pesan: " + ex.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(datakonsumen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void tampildatapegawai() {
    String query = "SELECT * FROM datapegawai";
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");
             PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                ComboDataPegawai.removeAllItems(); // Hapus item sebelumnya

                while (resultSet.next()) {
                    ComboDataPegawai.addItem(resultSet.getString("Nama")); // Sesuaikan nama kolom jika diperlukan
                }

                System.out.println("Tampil data pegawai Berhasil");
            } catch (SQLException ex) {
                System.out.println("Tampil data pegawai \n Pesan: " + ex.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(datapegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    private void updateTableData(String selectedType) {
    try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
        // Sesuaikan kueri SQL untuk memilih semua baris yang sesuai dengan pilihan dropdown
        String query = "SELECT * FROM datakomputer WHERE type = ?";
        try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {
            preparedStatement.setString(1, selectedType);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Retrieve column names dynamically from the ResultSetMetaData
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }

                // Create a new table model with the column names
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                // Add all rows to the model
                while (resultSet.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = resultSet.getObject(i);
                    }
                    model.addRow(rowData);
                }

                // Set the new model to the table
                tblDataKomputer.setModel(model);
            }
        }
    } catch (SQLException e) {
        System.out.println("Gagal memperbarui tabel: " + e.getMessage());
    }
}
    private String generateOrderId() {
    // Menghasilkan 6 angka acak
    Random random = new Random();
    int orderIdInt = random.nextInt(900000) + 100000; // untuk memastikan memiliki 6 digit
    String orderId = String.valueOf(orderIdInt);

    return orderId;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DropDown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        DateBook = new com.toedter.calendar.JDateChooser();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        button = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataKomputer = new javax.swing.JTable();
        btnCheck = new javax.swing.JButton();
        textOrder = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuat = new javax.swing.JButton();
        textPilihPC = new javax.swing.JTextField();
        textHargaSewa = new javax.swing.JTextField();
        DateBookPengembalian = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        textDurasiSewa = new javax.swing.JTextField();
        textHargaTotal = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        textVGA = new javax.swing.JTextField();
        btnKembali2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboDataKonsumen = new javax.swing.JComboBox<>();
        ComboDataPegawai = new javax.swing.JComboBox();
        Invoice = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRANSAKSI SEWA KOMPUTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 38, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create Order Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 155, 112, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Peminjaman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 185, 124, -1));

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intel I5 Gen 13", "Intel I7 Gen 13", "Intel I9 Gen 13", " " }));
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });
        getContentPane().add(DropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 151, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type Komputer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 118, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 870, 234));
        getContentPane().add(DateBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 302, -1));

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 70, -1));

        btnSimpan.setBackground(new java.awt.Color(66, 120, 204));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        button.setBackground(new java.awt.Color(66, 120, 204));
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Harga Total");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, -1));

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        tblDataKomputer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDataKomputer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblDataKomputerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tblDataKomputer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 375, 190));

        btnCheck.setBackground(new java.awt.Color(66, 120, 204));
        btnCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 147, -1));

        textOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOrderActionPerformed(evt);
            }
        });
        getContentPane().add(textOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 151, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ambil Dari Data Konsumen");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 160, -1));

        btnBuat.setBackground(new java.awt.Color(66, 120, 204));
        btnBuat.setForeground(new java.awt.Color(255, 255, 255));
        btnBuat.setText("Buat");
        btnBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 145, -1));

        textPilihPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPilihPCActionPerformed(evt);
            }
        });
        getContentPane().add(textPilihPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 304, -1));

        textHargaSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaSewaActionPerformed(evt);
            }
        });
        getContentPane().add(textHargaSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 304, -1));
        getContentPane().add(DateBookPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 302, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Durasi Sewa ( /Hari)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 150, -1));

        textDurasiSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDurasiSewaActionPerformed(evt);
            }
        });
        getContentPane().add(textDurasiSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 304, -1));

        textHargaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHargaTotalActionPerformed(evt);
            }
        });
        getContentPane().add(textHargaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 304, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        textVGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVGAActionPerformed(evt);
            }
        });
        getContentPane().add(textVGA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 304, -1));

        btnKembali2.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali2.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali2.setText("Kembali");
        btnKembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembali2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("VGA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Harga");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Book Pengembalian");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 215, 124, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga Sewa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ambil Dari Data Pegawai");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ambil Dari Data Komputer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 273, 180, -1));

        ComboDataKonsumen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data Konsumen" }));
        getContentPane().add(ComboDataKonsumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 302, -1));

        ComboDataPegawai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data Pegawai" }));
        getContentPane().add(ComboDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 300, -1));

        Invoice.setBackground(new java.awt.Color(66, 120, 204));
        Invoice.setForeground(new java.awt.Color(255, 255, 255));
        Invoice.setText("Invoice");
        Invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceActionPerformed(evt);
            }
        });
        getContentPane().add(Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropDownActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    // Mendapatkan baris yang dipilih
    int selectedRow = tableOutput.getSelectedRow();
    
    if (selectedRow != -1) { // Pastikan baris dipilih
        // Mendapatkan nilai dari kolom yang dipilih
        String data_konsumen = tableOutput.getValueAt(selectedRow, 0).toString();
        String data_pegawai = tableOutput.getValueAt(selectedRow, 1).toString();
        String order_id = tableOutput.getValueAt(selectedRow, 2).toString();
        String book_pinjam = tableOutput.getValueAt(selectedRow, 3).toString();
        String book_pengembalian = tableOutput.getValueAt(selectedRow, 4).toString();
        String type = tableOutput.getValueAt(selectedRow, 5).toString();
        String VGA = tableOutput.getValueAt(selectedRow, 6).toString();
        String unit_dipilih = tableOutput.getValueAt(selectedRow, 7).toString();
        String harga_sewa = tableOutput.getValueAt(selectedRow, 8).toString();
        String durasi_sewa = tableOutput.getValueAt(selectedRow, 9).toString();
        String harga_total = tableOutput.getValueAt(selectedRow, 10).toString();
        
        try {
        // Assuming the date is in "yyyy" format, you can adjust the format if necessary
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(book_pinjam);
        DateBook.setDate(date);
        } catch (ParseException e) {
        e.printStackTrace();
        DateBook.setDate(null); // Resetting date if parsing fails
        } 
        
        try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(book_pengembalian);
        DateBookPengembalian.setDate(date);
        } catch (ParseException e) {
        e.printStackTrace();
        DateBookPengembalian.setDate(null); // Resetting date if parsing fails
        }
        
        // Mengisi nilai ke dalam field teks
        ComboDataKonsumen.setSelectedItem(data_konsumen);
        ComboDataPegawai.setSelectedItem(data_pegawai);
        textOrder.setText(order_id);
        DropDown.setSelectedItem(type);
        textPilihPC.setText(unit_dipilih);
        textVGA.setText(VGA);
        textHargaSewa.setText(harga_sewa);
        textDurasiSewa.setText(durasi_sewa);
        textHargaTotal.setText(harga_total);
        
        
        JOptionPane.showMessageDialog(null, "Data Siap di Edit!");
        } else {
            JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin diedit!");
        }
    
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String DataKonsumen = ComboDataKonsumen.getSelectedItem().toString();
        String DataPegawai = ComboDataPegawai.getSelectedItem().toString();
        String orderId = textOrder.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String bookPinjam = dateFormat.format(DateBook.getDate());
        String bookPengembalian = dateFormat.format(DateBookPengembalian.getDate());
        String type = DropDown.getSelectedItem().toString();
        String VGA = textVGA.getText();
        String PCpilih = textPilihPC.getText();
        String hargaSewa = textHargaSewa.getText();
        String durasiSewa = textDurasiSewa.getText();
        String hargaTotal = textHargaTotal.getText();

        // Mengupdate data ke database MySQL
        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "");
            
            String query = "UPDATE transaksisewakomputer SET data_pegawai = ?, book_pinjam = ?, book_pengembalian = ?, type = ?, VGA = ?, unit_dipilih = ?, Harga_Sewa = ?, Durasi_Sewa = ?, Harga_Total = ? WHERE data_konsumen = ? AND order_id = ?";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
            preparedStatement.setString(1, DataPegawai);
            preparedStatement.setString(2, bookPinjam);
            preparedStatement.setString(3, bookPengembalian);
            preparedStatement.setString(4, type);
            preparedStatement.setString(5, VGA);
            preparedStatement.setString(6, PCpilih);
            preparedStatement.setString(7, hargaSewa);
            preparedStatement.setString(8, durasiSewa);
            preparedStatement.setString(9, hargaTotal);
            preparedStatement.setString(10, DataKonsumen);
            preparedStatement.setString(11, orderId);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data berhasil diupdate!");
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");

                // Mengosongkan field input setelah pembaruan berhasil
                ComboDataKonsumen.setSelectedIndex(0);
                ComboDataPegawai.setSelectedIndex(0);
                textOrder.setText("");
                DateBook.setDate(null);
                DateBookPengembalian.setDate(null);
                textPilihPC.setText("");
                textVGA.setText("");
                textHargaSewa.setText("");
                textDurasiSewa.setText("");
                textHargaTotal.setText("");


                // Mengambil semua data dari database setelah pembaruan
                String selectQuery = "SELECT * FROM transaksisewakomputer";
                PreparedStatement selectStatement = (PreparedStatement) conn.prepareStatement(selectQuery);

                ResultSet resultSet = selectStatement.executeQuery();
                DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                model.setRowCount(0); // Clear existing data

                while (resultSet.next()) {
                    String Data_Konsumen = resultSet.getString("data_konsumen");
                    String Data_Pegawai = resultSet.getString("data_pegawai");
                    String order_id = resultSet.getString("order_id");
                    String book_pinjam = resultSet.getString("book_pinjam");
                    String book_pengembalian = resultSet.getString("book_pengembalian");
                    String typedata = resultSet.getString("type");
                    String VGAdata = resultSet.getString("VGA");
                    String unitdata = resultSet.getString("unit_dipilih");
                    String datahargasewa = resultSet.getString("Harga_Sewa");
                    String datadurasisewa = resultSet.getString("Durasi_Sewa");
                    String datahargatotal = resultSet.getString("Harga_Total");

                    model.addRow(new Object[]{Data_Konsumen, Data_Pegawai, order_id, book_pinjam, book_pengembalian, typedata, VGAdata, unitdata, datahargasewa, datadurasisewa, datahargatotal});
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

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // Get the values from the text fields
        String hargaSewaText = textHargaSewa.getText();
        String durasiSewaText = textDurasiSewa.getText();

        // Convert the values to the appropriate data types
        int hargaSewa = Integer.parseInt(hargaSewaText);
        int durasiSewa = Integer.parseInt(durasiSewaText);

        // Perform the calculations
        int result = hargaSewa * durasiSewa;

        // Display the result
        JOptionPane.showMessageDialog(null, "Hasil Perhitungan: " + result);

        // Input the result into the textHargaTotal field
        textHargaTotal.setText(String.valueOf(result));
    
    }//GEN-LAST:event_buttonActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
    String selectedType = DropDown.getSelectedItem().toString();
    updateTableData(selectedType);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void textOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOrderActionPerformed
        
    }//GEN-LAST:event_textOrderActionPerformed

    private void btnBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatActionPerformed
    String orderId = generateOrderId();
    textOrder.setText(orderId);
    }//GEN-LAST:event_btnBuatActionPerformed

    private void textPilihPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPilihPCActionPerformed

    }//GEN-LAST:event_textPilihPCActionPerformed

    private void tblDataKomputerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblDataKomputerAncestorAdded
        tblDataKomputer.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblDataKomputerMouseClicked(evt);
    }
});
    }//GEN-LAST:event_tblDataKomputerAncestorAdded

    private void textHargaSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHargaSewaActionPerformed

    private void textDurasiSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDurasiSewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDurasiSewaActionPerformed

    private void textHargaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHargaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHargaTotalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
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
                String dataKonsumen = (String) tableOutput.getValueAt(selectedRow, 0);
                String orderId = (String) tableOutput.getValueAt(selectedRow, 2);

                // Membuat pernyataan SQL untuk menghapus baris dari tabel berdasarkan nilai kolom tertentu
                String sql = "DELETE FROM transaksisewakomputer WHERE data_konsumen = ? AND order_id = ?";
                PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
                statement.setString(1, dataKonsumen);
                statement.setString(2, orderId);

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

    private void textVGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVGAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVGAActionPerformed

    private void btnKembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali2ActionPerformed
        mainmenu pagemenu = new mainmenu();
        pagemenu.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembali2ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    String DataKonsumen = ComboDataKonsumen.getSelectedItem().toString();
    String DataPegawai = ComboDataPegawai.getSelectedItem().toString();
    String orderId = textOrder.getText();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String bookPinjam = dateFormat.format(DateBook.getDate());
    String bookPengembalian = dateFormat.format(DateBookPengembalian.getDate());
    String type = DropDown.getSelectedItem().toString();
    String VGA = textVGA.getText();
    String PCpilih = textPilihPC.getText();
    String hargaSewa = textHargaSewa.getText();
    String durasiSewa = textDurasiSewa.getText();
    String hargaTotal = textHargaTotal.getText();

    // Menyimpan data ke database MySQL
    try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
        String query = "INSERT INTO transaksisewakomputer (data_konsumen, data_pegawai, order_id, book_pinjam, book_pengembalian, type, VGA, unit_dipilih, Harga_Sewa, Durasi_Sewa, Harga_Total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {
            preparedStatement.setString(1, DataKonsumen);
            preparedStatement.setString(2, DataPegawai);
            preparedStatement.setString(3, orderId);
            preparedStatement.setString(4, bookPinjam);
            preparedStatement.setString(5, bookPengembalian);
            preparedStatement.setString(6, type);
            preparedStatement.setString(7, VGA);
            preparedStatement.setString(8, PCpilih);
            preparedStatement.setString(9, hargaSewa);
            preparedStatement.setString(10, durasiSewa);
            preparedStatement.setString(11, hargaTotal);


            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data berhasil Disimpan!");
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");

                // Clear input fields
                ComboDataKonsumen.setSelectedIndex(0);
                ComboDataPegawai.setSelectedIndex(0);
                textOrder.setText("");
                DateBook.setDate(null);
                DateBookPengembalian.setDate(null);
                DropDown.setSelectedIndex(0);
                textVGA.setText("");
                textPilihPC.setText("");
                textHargaSewa.setText("");
                textDurasiSewa.setText("");
                textHargaTotal.setText("");
                

                // Memperbarui tampilan tabel dengan data terbaru
                updateTableDataTransaksi();
            }
        }
    } catch (SQLException e) {
        System.out.println("Data gagal Disimpan!");
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data ke database: " + e.getMessage());
    }
}

        private void updateTableDataTransaksi() {
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sewaelektronik", "root", "")) {
        String query = "SELECT * FROM transaksisewakomputer";
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
        System.out.println("Gagal memperbarui tabel transaksi: " + e.getMessage());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void InvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceActionPerformed
    int selectedRow = tableOutput.getSelectedRow();
    if (selectedRow != -1) {
        // Get the data from the selected row
        String dataKonsumen = tableOutput.getValueAt(selectedRow, 0).toString();
        String dataPegawai = tableOutput.getValueAt(selectedRow, 1).toString();
        String orderId = tableOutput.getValueAt(selectedRow, 2).toString();
        java.util.Date bookPinjam = (java.util.Date) tableOutput.getValueAt(selectedRow, 3);
        java.util.Date bookPengembalian = (java.util.Date) tableOutput.getValueAt(selectedRow, 4);
        String type = tableOutput.getValueAt(selectedRow, 5).toString();
        String VGA = tableOutput.getValueAt(selectedRow, 6).toString();
        String PilihPC = tableOutput.getValueAt(selectedRow, 7).toString();
        String hargaSewa = tableOutput.getValueAt(selectedRow, 8).toString();
        String durasiSewa = tableOutput.getValueAt(selectedRow, 9).toString();
        String hargaTotal = tableOutput.getValueAt(selectedRow, 10).toString();

        // Set values in the form fields
        ComboDataKonsumen.setSelectedItem("");
        ComboDataPegawai.setSelectedItem("");
        textOrder.setText("");
        DateBook.setDate(null);
        DateBookPengembalian.setDate(null);
        DropDown.setSelectedItem("");
        textVGA.setText("");
        textPilihPC.setText("");
        textHargaSewa.setText("");
        textDurasiSewa.setText("");
        textHargaTotal.setText("");
        
        
        JasperReport reports;

        String path = ".\\src\\invoicekomputer.jasper";
        try {
            // Koneksi ke database
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sewaelektronik", "root", "");

            // Query berdasarkan order_id
            String query = "SELECT * FROM transaksisewakomputer WHERE order_id = '" + orderId + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Load file .jasper
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);

            // Gunakan JRResultSetDataSource untuk mengisi data dari query
            JRDataSource dataSource = new JRResultSetDataSource(rs);
            JasperPrint jprint = JasperFillManager.fillReport(reports, null, dataSource);

            // Tampilkan laporan
            JasperViewer jviewer = new JasperViewer(jprint, false);
            jviewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);

            // Tutup koneksi
            conn.close();
        } catch (SQLException | JRException ex) {
            Logger.getLogger(mainmenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceActionPerformed
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksisewakomputer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDataKonsumen;
    private javax.swing.JComboBox ComboDataPegawai;
    private com.toedter.calendar.JDateChooser DateBook;
    private com.toedter.calendar.JDateChooser DateBookPengembalian;
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JButton Invoice;
    private javax.swing.JButton btnBuat;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali2;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTable tblDataKomputer;
    private javax.swing.JTextField textDurasiSewa;
    private javax.swing.JTextField textHargaSewa;
    private javax.swing.JTextField textHargaTotal;
    private javax.swing.JTextField textOrder;
    private javax.swing.JTextField textPilihPC;
    private javax.swing.JTextField textVGA;
    // End of variables declaration//GEN-END:variables

    private boolean fileExists(String filePath) {
        URL fileUrl = getClass().getResource(filePath);
        return fileUrl != null;
   }
}
