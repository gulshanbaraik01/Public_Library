/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Gulshan
 */
public class Borrow extends javax.swing.JInternalFrame {

    /**
     * Creates new form Borrow
     */
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Borrow() {
        initComponents();
        con = (Connection) DBCon.getConnection();
        autoId();
        
        LocalDate today = LocalDate.now();
        LocalDate reday = today.plus(10, ChronoUnit.DAYS);
        txt_idate.setText(today.toString());
        txt_rdate.setText(reday.toString());
        
        tablelord();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_lend = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_mid = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_mtype = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_bid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_bname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_btype = new javax.swing.JTextField();
        txt_rno = new javax.swing.JTextField();
        clear_button = new javax.swing.JButton();
        issue_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_idate = new javax.swing.JTextField();
        txt_rdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1020, 540));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_lend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_lend);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 900, 170));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel7.setText("Member Id :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText("Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel9.setText("Member Type :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, -1));

        txt_mid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_mid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_midKeyReleased(evt);
            }
        });
        jPanel1.add(txt_mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, -1));

        txt_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, -1));

        txt_mtype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txt_mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel10.setText("Book Id :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, -1));

        txt_bid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 130, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel11.setText("Name :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, -1));

        txt_bname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txt_bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 130, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setText("Type :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 110, -1));

        txt_btype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txt_btype, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 130, -1));

        txt_rno.setEditable(false);
        txt_rno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(txt_rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 220, 40));

        clear_button.setBackground(new java.awt.Color(153, 153, 255));
        clear_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(clear_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 220, 40));

        issue_button.setBackground(new java.awt.Color(153, 153, 255));
        issue_button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        issue_button.setText("Issue");
        issue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(issue_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 220, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 260, 260));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel13.setText("Issue Date :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel14.setText("Return Date :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        txt_idate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_idate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idateActionPerformed(evt);
            }
        });
        jPanel1.add(txt_idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, -1));

        txt_rdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txt_rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 150, -1));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 620, 60));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 24, 300, 190));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 24, 300, 190));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 460));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 488));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        
        clear();
        
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void txt_idateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idateActionPerformed

    private void txt_midKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_midKeyReleased
        
        try
        {
            String sql = "SELECT `mname`, `type` FROM `addmember` WHERE mid='"+txt_mid.getText()+"'";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next())
            {
                txt_name.setText(rs.getString("mname"));
                txt_mtype.setText(rs.getString("type"));
            }
            else
            {
                txt_name.setText("");
                txt_mtype.setText("");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_txt_midKeyReleased

    private void txt_bidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bidKeyReleased
        
        try
        {
            String sql = "SELECT `bname`, `book_type` FROM `addbook` WHERE bid='"+txt_bid.getText()+"'";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next())
            {
                txt_bname.setText(rs.getString("bname"));
                txt_btype.setText(rs.getString("book_type"));
            }
            else
            {
                txt_bname.setText("");
                txt_btype.setText("");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_txt_bidKeyReleased

    private void issue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_buttonActionPerformed
        
        String rnno = txt_rno.getText();
        String mid = txt_mid.getText();
        String bid = txt_bid.getText();
        String idate = txt_idate.getText();
        String rdate = txt_rdate.getText();
        
        try
        {
            String sql = "INSERT INTO `booklend`(`record_no`, `mid`, `bid`, `issue_date`, `return_date`, mark) VALUES ('"+rnno+"', '"+mid+"', '"+bid+"', '"+idate+"', '"+rdate+"', '0')";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(rootPane, "Successfully Added !! ");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        tablelord();
        clear();
        update();
        tablelord();
    }//GEN-LAST:event_issue_buttonActionPerformed

    
    private void autoId()
    {
        try
        {
            String sql = "SELECT `record_no` FROM `bookLend` ORDER BY record_no DESC LIMIT 1";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next())
            {
                String rnno = rs.getString("record_no");
                int co = rnno.length();
                String txt = rnno.substring(0, 2);
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txt_rno.setText(ftxt);
            }
            else
            {
                txt_rno.setText("RN1000");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }
    
    private void tablelord()
    {
        try
        {
            String sql = "SELECT `record_no`, `mid`, `bid`, `issue_date`, `return_date` FROM `booklend`";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            table_lend.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    private void clear()
    {
        txt_mid.setText("");
        txt_name.setText("");
        txt_mtype.setText("");
        txt_bid.setText("");
        txt_bname.setText("");
        txt_btype.setText("");
    }
    
    private void update()
    {
        try
        {
            String sql = "UPDATE ``addbook` SET `mark = '1' WHERE bid = '"+txt_bid.getText()+"'";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(rootPane, "Successfully Updated !! ");
            //tablelord();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_button;
    private javax.swing.JButton issue_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable table_lend;
    private javax.swing.JTextField txt_bid;
    private javax.swing.JTextField txt_bname;
    private javax.swing.JTextField txt_btype;
    private javax.swing.JTextField txt_idate;
    private javax.swing.JTextField txt_mid;
    private javax.swing.JTextField txt_mtype;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_rdate;
    private javax.swing.JTextField txt_rno;
    // End of variables declaration//GEN-END:variables
}
