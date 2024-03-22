/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author OWNER
 */
public class MenuUtama extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        konek = Koneksi.koneksiDB();
        mulai();
        tampilWaktu();
        
    }
    
    public void mulai() {
        Register.setEnabled(false);
        Logout.setEnabled(false);
        Master.setEnabled(false);
        Transaksi.setEnabled(false);
        Laporan.setEnabled(false);
        txtJam.setEnabled(false);
        txtTanggal.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegister.setEnabled(false);
        btnProduk.setEnabled(false);
        btnPelanggan.setEnabled(false);
        btnPenjualan.setEnabled(false);
    }
    
    public void tampilWaktu() {
        Thread clock = new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal = new  SimpleDateFormat("yyyy-MM-dd");
                    txtJam.setText(Jam.format(cal.getTime()));
                    txtTanggal.setText(Tanggal.format(cal.getTime()));
                    try { sleep(1000);                    
               }catch (InterruptedException ex) {
                 Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null,ex);
                }
         }
         }
        };
        clock.start();
    }
           

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FormLogin = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        cmbAkses = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnPelanggan = new javax.swing.JButton();
        btnProduk = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        txtJam = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Beranda = new javax.swing.JMenu();
        Login = new javax.swing.JMenuItem();
        Register = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        Master = new javax.swing.JMenu();
        Produk = new javax.swing.JMenuItem();
        Pelanggan = new javax.swing.JMenuItem();
        Transaksi = new javax.swing.JMenu();
        Penjualan = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        LaporanTransaksi = new javax.swing.JMenuItem();
        Tentang = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUser.setText("Silahkan Login Dulu !!!");

        btnRegister.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\a1.png")); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUser)
                .addGap(304, 304, 304)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 150, 870);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Pelanggan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 670, 60, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Produk");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 670, 60, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Penjualan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 670, 60, 16);

        FormLogin.setTitle("FormMenuUtama\n");
        FormLogin.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LOGIN");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hak Akses");

        cmbAkses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Salah Satu-", "Admin", "Petugas" }));
        cmbAkses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAksesActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnMasuk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMasuk.setText("MASUK");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\a.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(cmbAkses, 0, 144, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnBatal)
                        .addGap(58, 58, 58)
                        .addComponent(btnMasuk)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel15)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal)
                    .addComponent(btnMasuk))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FormLoginLayout = new javax.swing.GroupLayout(FormLogin.getContentPane());
        FormLogin.getContentPane().setLayout(FormLoginLayout);
        FormLoginLayout.setHorizontalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FormLoginLayout.setVerticalGroup(
            FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(FormLogin);
        FormLogin.setBounds(180, 70, 420, 450);

        btnPelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\cs1.png")); // NOI18N
        btnPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPelangganActionPerformed(evt);
            }
        });
        getContentPane().add(btnPelanggan);
        btnPelanggan.setBounds(180, 560, 90, 100);

        btnProduk.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\pr1.png")); // NOI18N
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });
        getContentPane().add(btnProduk);
        btnProduk.setBounds(350, 560, 90, 100);

        btnPenjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\pnj1.png")); // NOI18N
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPenjualan);
        btnPenjualan.setBounds(520, 560, 90, 100);

        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });
        getContentPane().add(txtJam);
        txtJam.setBounds(500, 10, 120, 40);
        getContentPane().add(txtTanggal);
        txtTanggal.setBounds(630, 10, 120, 40);

        Beranda.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\22.png")); // NOI18N
        Beranda.setText("Beranda");

        Login.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\login4.png")); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Beranda.add(Login);

        Register.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\77.png")); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Beranda.add(Register);

        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\99.png")); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        Beranda.add(Logout);

        jMenuBar1.add(Beranda);

        Master.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\33.png")); // NOI18N
        Master.setText(" Master");

        Produk.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\88.png")); // NOI18N
        Produk.setText("Produk");
        Produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukActionPerformed(evt);
            }
        });
        Master.add(Produk);

        Pelanggan.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\10.png")); // NOI18N
        Pelanggan.setText("Pelanggan");
        Pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganActionPerformed(evt);
            }
        });
        Master.add(Pelanggan);

        jMenuBar1.add(Master);

        Transaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\44.png")); // NOI18N
        Transaksi.setText("Transaksi");

        Penjualan.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\10.png")); // NOI18N
        Penjualan.setText("Penjualan");
        Penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjualanActionPerformed(evt);
            }
        });
        Transaksi.add(Penjualan);

        jMenuBar1.add(Transaksi);

        Laporan.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\55.png")); // NOI18N
        Laporan.setText("Laporan");

        LaporanTransaksi.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\rekap.png")); // NOI18N
        LaporanTransaksi.setText("Rekap Laporan");
        LaporanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanTransaksiActionPerformed(evt);
            }
        });
        Laporan.add(LaporanTransaksi);

        jMenuBar1.add(Laporan);

        Tentang.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\help.png")); // NOI18N
        Tentang.setText("Help");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\66.png")); // NOI18N
        jMenuItem1.setText("Tentang");
        Tentang.add(jMenuItem1);

        jMenuBar1.add(Tentang);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPelangganActionPerformed
new FormPelanggan().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnPelangganActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
FormLogin.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
new FormRegister().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
new MenuUtama().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void ProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukActionPerformed
new FormProduk().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_ProdukActionPerformed

    private void PelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganActionPerformed
new FormPelanggan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_PelangganActionPerformed

    private void PenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjualanActionPerformed
new FormPenjualan().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_PenjualanActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
new FormRegister().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
new FormProduk().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
new FormPenjualan().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
try {
    String sql = "select * from login where Username='"+txtUsername.getText()+"'and Password='"+txtPassword.getText()+"' and HakAkses='"+cmbAkses.getSelectedItem()+"'";
            pst = konek.prepareStatement(sql);
            rst = pst.executeQuery();
            if(rst.next()) {
                if(txtUsername.getText().equals(rst.getString("Username"))&& txtPassword.getText().equals(rst.getString("Password"))&& cmbAkses.getSelectedItem().equals(rst.getString("HakAkses"))); 
                if(cmbAkses.getSelectedItem().equals("Admin")) {     
               
        Register.setEnabled(true);
        Logout.setEnabled(true);
        Master.setEnabled(true);
        Transaksi.setEnabled(true);
        Laporan.setEnabled(true);
        txtJam.setEnabled(false);
        txtTanggal.setEnabled(false);
        FormLogin.setVisible(false);
        btnRegister.setEnabled(true);
        btnProduk.setEnabled(true);
        btnPelanggan.setEnabled(true);
        btnPenjualan.setEnabled(true);
}else if (cmbAkses.getSelectedItem().equals("Petugas")) {
        Logout.setEnabled(true);
        Master.setEnabled(true);
        Transaksi.setEnabled(true);
        Laporan.setEnabled(true);
        txtJam.setEnabled(true);
        txtTanggal.setEnabled(true);
        FormLogin.setVisible(true);
        btnRegister.setEnabled(true);
        btnProduk.setEnabled(true);
        btnPelanggan.setEnabled(true);
        btnPenjualan.setEnabled(true);
        Register.setEnabled(false);
        txtTanggal.setEnabled(false);
        FormLogin.setEnabled(false);
        btnRegister.setEnabled(false);
        }
{
    JOptionPane.showMessageDialog(null,"Selamat Datang"+txtUsername.getText()+"");
    String text = txtUsername.getText();
    lblUser.setText(text);
}
    } else {
    JOptionPane.showMessageDialog(null,"Gagal Masuk.Periksa Kembali Username/Password/HakAkses");
    txtUsername.setText("");
    txtPassword.setText("");
    cmbAkses.setSelectedItem("-Pilih Salah Satu-");
}
}catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Login Gagal");
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
new MenuUtama().setVisible(true);//TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
     }//GEN-LAST:event_txtJamActionPerformed

    private void cmbAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAksesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAksesActionPerformed

    private void LaporanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanTransaksiActionPerformed
new FormLaporanTransaksi().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_LaporanTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Beranda;
    private javax.swing.JInternalFrame FormLogin;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem LaporanTransaksi;
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Master;
    private javax.swing.JMenuItem Pelanggan;
    private javax.swing.JMenuItem Penjualan;
    private javax.swing.JMenuItem Produk;
    private javax.swing.JMenuItem Register;
    private javax.swing.JMenu Tentang;
    private javax.swing.JMenu Transaksi;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnPelanggan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduk;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbAkses;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtJam;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}