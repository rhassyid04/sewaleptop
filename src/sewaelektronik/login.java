
package sewaelektronik;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class login extends javax.swing.JFrame {


    public login() {
        initComponents();
    }

    public static Connection con;
    public static Statement stm; {
        try {
            String url ="jdbc:mysql://localhost:3306/sewaelektronik";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tUser = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tPass = new javax.swing.JPasswordField();
        ShowPass = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Silahkan Login / Registrasi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 33, -1, -1));

        tUser.setBorder(null);
        tUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUserActionPerformed(evt);
            }
        });
        getContentPane().add(tUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 104, 170, 20));

        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(null);
        btnSubmit.setBorderPainted(false);
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 70, 20));

        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 202, 70, 20));

        tPass.setBorder(null);
        tPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPassActionPerformed(evt);
            }
        });
        getContentPane().add(tPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 148, 170, 20));

        ShowPass.setForeground(new java.awt.Color(255, 255, 255));
        ShowPass.setText("Show Password");
        ShowPass.setBorder(null);
        ShowPass.setContentAreaFilled(false);
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 490, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUserActionPerformed
    private void tPass(java.awt.event.KeyEvent evt) {                                      
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Lakukan proses submit di sini
        submit();
    }
}
    private void submit() {
    String user = tUser.getText();
    String pass = tPass.getText();
    if (user.equals("") && pass.equals("")) {
        JOptionPane.showMessageDialog(null, "username/password tidak boleh kosong", "kesalahan",
                JOptionPane.ERROR_MESSAGE);
    } else {
        if (user.equals("admin") && pass.equals("1234")) {
            System.out.println("Login Berhasil");
            JOptionPane.showMessageDialog(null, "login berhasil");
            mainmenu mainmenu = new mainmenu();
            this.dispose();
            mainmenu.setVisible(true);
        } else {
            System.out.println("Login Gagal");
            JOptionPane.showMessageDialog(null, "login gagal");
        }
    }
}
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
    submit();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
    boolean showPassword = ShowPass.isSelected();
    if(showPassword) {
        tPass.setEchoChar((char)0);
    } else {
        tPass.setEchoChar('*');
}
    }//GEN-LAST:event_ShowPassActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPassActionPerformed
    int xx,xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();        
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation (x - xx, y - xy);        
// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tPass;
    private javax.swing.JTextField tUser;
    // End of variables declaration//GEN-END:variables
}
