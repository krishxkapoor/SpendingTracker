package CODE;

import java.sql.*;
import javax.swing.*;

public final class Viewspendings extends javax.swing.JFrame {

    public Viewspendings() {
        initComponents();
        setSize(732, 638);
        jd1.setDate(new java.util.Date());
        jd2.setDate(new java.util.Date());
        displayCategory();
        jd3.setDate(new java.util.Date());
        jd4.setDate(new java.util.Date());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jd2 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jd1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        search1 = new javax.swing.JButton();
        totalamt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jd4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jd3 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        search2 = new javax.swing.JButton();
        totalamt2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jcb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 84, 32);
        jPanel1.add(jd2);
        jd2.setBounds(100, 130, 210, 32);
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(480, 250, 210, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("To");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 350, 84, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("From:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 84, 32);

        jd1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jd1PropertyChange(evt);
            }
        });
        jPanel1.add(jd1);
        jd1.setBounds(100, 88, 210, 32);

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 300, 300);

        search1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search1.setText("SEARCH");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel1.add(search1);
        search1.setBounds(10, 190, 90, 40);

        totalamt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalamt.setText("0");
        jPanel1.add(totalamt);
        totalamt.setBounds(190, 190, 100, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 190, 80, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("View Spending Date Wise");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 300, 50);

        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 20, 300, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 60, 320, 550);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("View Spending Category wise");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 0, 300, 50);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 300, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TO:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 150, 84, 32);
        jPanel3.add(jd4);
        jd4.setBounds(100, 150, 210, 32);
        jPanel3.add(jDateChooser5);
        jDateChooser5.setBounds(480, 250, 210, 32);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("To");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(580, 350, 84, 32);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("From:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 110, 84, 32);

        jd3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jd3PropertyChange(evt);
            }
        });
        jPanel3.add(jd3);
        jd3.setBounds(100, 110, 210, 32);

        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt2);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 250, 300, 280);

        search2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search2.setText("SEARCH");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        jPanel3.add(search2);
        search2.setBounds(10, 200, 90, 40);

        totalamt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalamt2.setText("0");
        jPanel3.add(totalamt2);
        totalamt2.setBounds(200, 200, 100, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Amount");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(110, 200, 80, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Category");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 70, 70, 30);

        jcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel3.add(jcb);
        jcb.setBounds(100, 70, 210, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(370, 60, 320, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jd1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jd1PropertyChange
        jd2.setSelectableDateRange(jd1.getDate(), new java.util.Date());
        jd2.setDate(jd1.getDate());
    }//GEN-LAST:event_jd1PropertyChange
    void displayCategory() {
        try {
            ResultSet rs = DBLoader.executeQuery("select * from categoryinfo");
            while (rs.next()) {
                jcb.addItem(rs.getString("category"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        try {
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jt.getModel();
            java.sql.Date dt1 = new java.sql.Date(jd1.getDate().getTime());
            java.sql.Date dt2 = new java.sql.Date(jd2.getDate().getTime());
            ResultSet rs = DBLoader.executeQuery("select * from spending where spending_date>='" + dt1 + "' and spending_date<='" + dt2 + "' order by spending_date asc");

            int total = 0;
            int rc = dtm.getRowCount();
            while (rc-- != 0) {
                dtm.removeRow(0);
            }

            while (rs.next()) {
                Object o[] = {
                    rs.getDate("spending_date"),
                    rs.getString("category"),
                    rs.getInt("amount")
                };
                dtm.addRow(o);
                total += rs.getInt("amount");

            }
            totalamt.setText(total + "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search1ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        try {
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jt2.getModel();
            int rc = dtm.getRowCount();
            while (rc-- != 0) {
                dtm.removeRow(0);
            }
            String c = (String) jcb.getSelectedItem();
            java.sql.Date dt3 = new java.sql.Date(jd3.getDate().getTime());
            java.sql.Date dt4 = new java.sql.Date(jd4.getDate().getTime());
            ResultSet rs = DBLoader.executeQuery("select * from spending where spending_date>='" + dt3 + "' and spending_date<='" + dt4 + "' and category ='" + c + "' order by spending_date asc");

            int total = 0;

            while (rs.next()) {
                Object o[] = {
                    rs.getDate("spending_date"),
                    rs.getString("category"),
                    rs.getInt("amount")
                };
                dtm.addRow(o);
                total += rs.getInt("amount");

            }
            totalamt2.setText(total + "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_search2ActionPerformed

    private void jd3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jd3PropertyChange
        jd4.setSelectableDateRange(jd3.getDate(), new java.util.Date());
        jd4.setDate(jd3.getDate());
    }//GEN-LAST:event_jd3PropertyChange
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcb;
    private com.toedter.calendar.JDateChooser jd1;
    private com.toedter.calendar.JDateChooser jd2;
    private com.toedter.calendar.JDateChooser jd3;
    private com.toedter.calendar.JDateChooser jd4;
    private javax.swing.JTable jt;
    private javax.swing.JTable jt2;
    private javax.swing.JButton search1;
    private javax.swing.JButton search2;
    private javax.swing.JLabel totalamt;
    private javax.swing.JLabel totalamt2;
    // End of variables declaration//GEN-END:variables
}
