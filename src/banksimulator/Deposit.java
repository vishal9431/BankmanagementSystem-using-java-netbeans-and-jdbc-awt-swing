/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package banksimulator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.time.*;
import java.sql.*;

/**
 *
 * @author deshm
 */
public class Deposit extends javax.swing.JFrame implements ActionListener ,KeyListener{

    /**
     * Creates new form Deposit
     */
    JButton btndeposit,btncancel;
    String id;
    JTextField txtamount ;
    public Deposit(String i) {
        initComponents();
        id = i;
        addImageToLabel();
        
        JLabel l1 = new JLabel("Enter amount to be deposited");
        l1.setBounds(120, 250, 300, 22);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        lblLogo.add(l1);
        
        txtamount = new JTextField();
        txtamount.setBounds(120, 290, 220, 25);
        txtamount.setBackground(Color.WHITE);
        txtamount.setForeground(Color.BLACK);
        txtamount.setFont(new Font("System",Font.BOLD,16));
        lblLogo.add(txtamount);
        txtamount.addKeyListener(this);
        
        btndeposit = new JButton("Deposit");
        btndeposit.setBounds(245, 400, 100, 40);
        btndeposit.setBackground(Color.WHITE);
        btndeposit.setForeground(Color.BLACK);
        btndeposit.setFont(new Font("System",Font.BOLD,14));
        lblLogo.add(btndeposit);
        btndeposit.addActionListener(this);

        btncancel = new JButton("Cancel");
        btncancel.setBounds(120, 400, 100, 40);
        btncancel.setBackground(Color.WHITE);
        btncancel.setForeground(Color.BLACK);
        btncancel.setFont(new Font("System",Font.BOLD,14));
        lblLogo.add(btncancel);
        btncancel.addActionListener(this);
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
        jPanel3 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposit");
        setUndecorated(true);

        lblLogo.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void addImageToLabel()
    {
        BufferedImage img;
        try
        {
            img = ImageIO.read(new File("C:\\Users\\deshm\\Downloads\\atm2.jpeg"));
            Image dimg = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageicon = new ImageIcon(dimg);
            lblLogo.setIcon(imageicon);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btncancel)
        {
            this.dispose();
        }
        
        if(e.getSource() == btndeposit)
        {
            try
            {
                String trans="";
                int amount=0;
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","sa123");
                Statement st = c.createStatement();
                String query = "select * from transection where id = "+id+" ; ";
                ResultSet rs = st.executeQuery(query);
                int a = Integer.parseInt(txtamount.getText());
                if(a<100 || txtamount.getText()=="")
                {
                    JOptionPane.showMessageDialog(this, "Enter amount greater than or equal to 100");
                    txtamount.setText("");
                    return;
                }
                if(rs.next())
                {
                    amount = Integer.parseInt(rs.getString("amount"));
                }
                else
                {
                    query = "insert into transection values ( "+id+",'"+txtamount.getText()+"',"+Integer.parseInt(txtamount.getText())+",'"+LocalDate.now()+"');";
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Deposited Successfully");
                    this.dispose();
                    new Transection(id).setVisible(true);
                    return;
                }
                
                int depo;
                depo = Integer.parseInt(txtamount.getText());
                amount = amount+depo;
                query = "insert into transection values ( "+id+","+depo+","+amount+",'"+LocalDate.now()+"');";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Deposited Successfully");
                new Transection(id).setVisible(true);
                this.dispose();
            }
            catch(Exception ex)
            {
                
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent evt) {
         char ch;
        ch = evt.getKeyChar();
        if(Character.isDigit(ch) == false)
        {
            evt.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
