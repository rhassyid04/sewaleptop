    
package sewaelektronik;

import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class mainmenu extends javax.swing.JFrame {

     static com.mysql.jdbc.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public mainmenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jMenu1.setText("Data Unit");

        jMenuItem1.setText("Data Laptop");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Data Komputer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Data Konsumen");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Registrasi");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Data Pegawai");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Registrasi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Transaksi Sewa");

        jMenuItem5.setText("Transaksi Sewa Laptop");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Transaksi Sewa Komputer");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cetak Laporan");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem8.setText("Laporan Data Pegawai");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem11.setText("Laporan Data Konsumen");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem9.setText("Laporan Data Transaksi Laptop");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Laporan Data Transaksi Komputer");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Keluar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    DataLaptop pageDataLaptop = new DataLaptop();
    pageDataLaptop.setVisible(true);
    this.dispose();
              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    DataKomputer pageDataKomputer = new DataKomputer();
    pageDataKomputer.setVisible(true);
    this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    transaksisewalaptop pagetransaksisewa = new transaksisewalaptop();
    pagetransaksisewa.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    transaksisewakomputer pagetransaksisewakomputer = new transaksisewakomputer();
    pagetransaksisewakomputer.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
           try {
    String filePath = "/laporandatapegawai.jasper";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sewaelektronik", "root", "");

    // Create a statement
    Statement stmt = conn.createStatement();

    // Execute a query
    ResultSet rs = stmt.executeQuery("SELECT * FROM datapegawai");

    // Check if the file exists before loading it
    if (fileExists(filePath)) {
        InputStream inputStream = getClass().getResourceAsStream(filePath);
        if (inputStream != null) {
            // Create a JDBC data source
            JRDataSource dataSource = new JRResultSetDataSource(rs);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, null, dataSource);

            if (jasperPrint != null) {
                JasperViewer viewer = new JasperViewer(jasperPrint, false);
                viewer.setVisible(true);
            } else {
                System.out.println("JasperPrint is null. Report generation failed.");
            }
        } else {
            System.out.println("InputStream is null. Report file not found.");
        }
    } else {
        System.out.println("File not found: " + filePath);
    }

    // Close the connection
    conn.close();
} catch (SQLException | JRException ex) {
    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
}      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    try {
    String filePath = "/laporandatakonsumen.jasper";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sewaelektronik", "root", "");

    // Create a statement
    Statement stmt = conn.createStatement();

    // Execute a query
    ResultSet rs = stmt.executeQuery("SELECT * FROM datakonsumen");

    // Check if the file exists before loading it
    if (fileExists(filePath)) {
        InputStream inputStream = getClass().getResourceAsStream(filePath);
        if (inputStream != null) {
            // Create a JDBC data source
            JRDataSource dataSource = new JRResultSetDataSource(rs);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, null, dataSource);

            if (jasperPrint != null) {
                JasperViewer viewer = new JasperViewer(jasperPrint, false);
                viewer.setVisible(true);
            } else {
                System.out.println("JasperPrint is null. Report generation failed.");
            }
        } else {
            System.out.println("InputStream is null. Report file not found.");
        }
    } else {
        System.out.println("File not found: " + filePath);
    }

    // Close the connection
    conn.close();
} catch (SQLException | JRException ex) {
    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
}    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
try {
    String filePath = "/laporantransaksisewalaptop.jasper";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sewaelektronik", "root", "");

    // Create a statement
    Statement stmt = conn.createStatement();

    // Execute a query
    ResultSet rs = stmt.executeQuery("SELECT * FROM transaksisewalaptop");

    // Check if the file exists before loading it
    if (fileExists(filePath)) {
        InputStream inputStream = getClass().getResourceAsStream(filePath);
        if (inputStream != null) {
            // Create a JDBC data source
            JRDataSource dataSource = new JRResultSetDataSource(rs);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, null, dataSource);

            if (jasperPrint != null) {
                JasperViewer viewer = new JasperViewer(jasperPrint, false);
                viewer.setVisible(true);
            } else {
                System.out.println("JasperPrint is null. Report generation failed.");
            }
        } else {
            System.out.println("InputStream is null. Report file not found.");
        }
    } else {
        System.out.println("File not found: " + filePath);
    }

    // Close the connection
    conn.close();
} catch (SQLException | JRException ex) {
    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
try {
    String filePath = "/laporantransaksisewakomputer.jasper";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sewaelektronik", "root", "");

    // Create a statement
    Statement stmt = conn.createStatement();

    // Execute a query
    ResultSet rs = stmt.executeQuery("SELECT * FROM transaksisewakomputer");

    // Check if the file exists before loading it
    if (fileExists(filePath)) {
        InputStream inputStream = getClass().getResourceAsStream(filePath);
        if (inputStream != null) {
            // Create a JDBC data source
            JRDataSource dataSource = new JRResultSetDataSource(rs);

            // Fill the report with data
            JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, null, dataSource);

            if (jasperPrint != null) {
                JasperViewer viewer = new JasperViewer(jasperPrint, false);
                viewer.setVisible(true);
            } else {
                System.out.println("JasperPrint is null. Report generation failed.");
            }
        } else {
            System.out.println("InputStream is null. Report file not found.");
        }
    } else {
        System.out.println("File not found: " + filePath);
    }

    // Close the connection
    conn.close();
} catch (SQLException | JRException ex) {
    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
    datakonsumen pagedatakonsumen = new datakonsumen();
    pagedatakonsumen.setVisible(true);
    this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    datapegawai pagedatapegawai = new datapegawai();
    pagedatapegawai.setVisible(true);
    this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    datakonsumen pagedatapegawai = new datakonsumen();
    pagedatapegawai.setVisible(true);
    this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    datapegawai pagedatapegawai = new datapegawai();
    pagedatapegawai.setVisible(true);
    this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
    login pagelogin = new login();
    pagelogin.setVisible(true);
    this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private boolean fileExists(String filePath) {
        URL fileUrl =getClass().getResource(filePath);
        return fileUrl != null;//To change body of generated methods, choose Tools | Templates.
    }

    private static class menu {

        public menu() {
        }
    }
}
