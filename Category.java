package CODE;

import java.sql.*;
import javax.swing.JOptionPane;

public class Category extends javax.swing.JFrame {

    public Category() {
        initComponents();
        setSize(699, 586);
        getEnteries();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        JTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT = new javax.swing.JTable();
        DELETE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Category");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 0, 520, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 620, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Category");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 56, 130, 40);

        ADD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD);
        ADD.setBounds(498, 58, 130, 40);

        JTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFActionPerformed(evt);
            }
        });
        jPanel1.add(JTF);
        JTF.setBounds(152, 57, 334, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 650, 120);

        JT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 650, 340);

        DELETE.setBackground(new java.awt.Color(255, 255, 204));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE);
        DELETE.setBounds(15, 503, 650, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try {
            String Category = JTF.getText();
            if (!Category.equals("")) {
                ResultSet rs = DBLoader.executeQuery("select * from categoryinfo where category ='" + Category + "' ");

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Category Already Exist");

                } else {
                    rs.moveToInsertRow();

                    rs.updateString("category", Category);

                    rs.insertRow();

                    JOptionPane.showMessageDialog(this, "Category Added Successfuly");
                    getEnteries();
                }
            } else {
                JOptionPane.showMessageDialog(this, " Please Enter Values");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        int ri = JT.getSelectedRow();//index of selected row..if row is not selected then it gives -1
        if (ri != -1) {
            int id = (int) JT.getValueAt(ri, 0);
            int r = JOptionPane.showConfirmDialog(rootPane, "Do You Really Want To Delete? ", "Deletion Confirmation", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                String category1 = (String) JT.getValueAt(ri, 1);
                try {
                    ResultSet rs = DBLoader.executeQuery("select * from categoryinfo where category = '" + category1 + "' ");
                    if (rs.next()) {
                        rs.deleteRow();
                        JOptionPane.showMessageDialog(rootPane, "Category deleted successfully");
                        getEnteries();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void JTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFActionPerformed
        try {
            String Category = JTF.getText();
            if (!Category.equals("")) {
                ResultSet rs = DBLoader.executeQuery("select * from categoryinfo where category ='" + Category + "' ");

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Category Already Exist");

                } else {
                    rs.moveToInsertRow();

                    rs.updateString("category", Category);

                    rs.insertRow();

                    JOptionPane.showMessageDialog(this, "Category Added Successfuly");
                    getEnteries();
                }
            } else {
                JOptionPane.showMessageDialog(this, " Please Enter Values");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_JTFActionPerformed
    void getEnteries() {
        try {
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) JT.getModel();
            int rc = dtm.getRowCount();
            while (rc-- != 0) {
                dtm.removeRow(rc);
            }
            ResultSet rs = DBLoader.executeQuery("select * from categoryinfo");
            int sno = 0;
            while (rs.next()) {
                JT.clearSelection();

                String category = rs.getString("Category");
                Object o[] = {++sno, category};
                dtm.addRow(o);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton DELETE;
    private javax.swing.JTable JT;
    private javax.swing.JTextField JTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
