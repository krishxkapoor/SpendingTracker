package CODE;

import java.sql.*;
import javax.swing.JOptionPane;

public class SpendingTracker extends javax.swing.JFrame {

    public SpendingTracker() {
        initComponents();
        setSize(914, 661);
        displayCategory();
        Date.setSelectableDateRange(null, new java.util.Date());
        getEnteries();
        Date.setDate(new java.util.Date());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcb = new javax.swing.JComboBox<>();
        jb = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtf3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Vspending = new javax.swing.JMenuItem();
        vCategory = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(730, 590, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("This month spending:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 580, 710, 30);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("category");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(486, 72, 94, 30);
        jPanel1.add(Date);
        Date.setBounds(120, 72, 140, 30);

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATE:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 72, 80, 30);

        jtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfKeyTyped(evt);
            }
        });
        jPanel1.add(jtf);
        jtf.setBounds(370, 72, 110, 30);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Amount:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 72, 80, 30);

        jPanel1.add(jcb);
        jcb.setBounds(602, 74, 140, 30);

        jb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jb.setText("Add new category");
        jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActionPerformed(evt);
            }
        });
        jPanel1.add(jb);
        jb.setBounds(602, 122, 142, 30);

        ADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD);
        ADD.setBounds(780, 72, 72, 27);

        jLabel1.setBackground(java.awt.Color.cyan);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Expence");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 54);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 120, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 890, 190);

        remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove);
        remove.setBounds(740, 210, 120, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("This month spending:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 210, 730, 40);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Total Amount");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 0, 151, 50);

        jtf3.setText("0");
        jPanel3.add(jtf3);
        jtf3.setBounds(190, 10, 520, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 560, 890, 50);

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Category", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 890, 280);

        jMenu3.setText("MASTER");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        Vspending.setText("View  All Spending");
        Vspending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VspendingActionPerformed(evt);
            }
        });
        jMenu3.add(Vspending);

        vCategory.setText("Add/View Category");
        vCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vCategoryActionPerformed(evt);
            }
        });
        jMenu3.add(vCategory);

        Exit.setText("Exit App");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu3.add(Exit);

        About.setText("About App");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu3.add(About);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActionPerformed
        Category c = new Category();
        c.setVisible(true);
    }//GEN-LAST:event_jbActionPerformed
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        try {
            java.util.Date dt = Date.getDate();
            String st = jtf.getText();
            String st1 = (String) jcb.getSelectedItem();
            if (dt != null && st != null && st1 != null) {
                int amount = Integer.parseInt(st);
                ResultSet rs = DBLoader.executeQuery("select * from spending");
                rs.moveToInsertRow();
                rs.updateObject("spending_date", dt);
                rs.updateString("amount", st);
                rs.updateString("category", st1);
                rs.insertRow();
                JOptionPane.showMessageDialog(rootPane, "Successfully ADDED Expense");
                getEnteries();
            } else {
                JOptionPane.showMessageDialog(null, "please fill all details");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ADDActionPerformed
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed
    private void vCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vCategoryActionPerformed
        new Category().setVisible(true);
    }//GEN-LAST:event_vCategoryActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        displayCategory();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfKeyTyped
        char ch = evt.getKeyChar();
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfKeyTyped

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            int ri = jt.getSelectedRow();
            if (ri != -1) {
                int r = JOptionPane.showConfirmDialog(rootPane, "Do You Really Want To Delete? ", "Deletion Confirmation", JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION) {
                    int id = (int) jt.getValueAt(ri, 0);
                    ResultSet rs = DBLoader.executeQuery("select * from spending where spendingId='" + id + "'");
                    if (rs.next()) {
                        rs.deleteRow();
                        JOptionPane.showMessageDialog(this, "Deleted sucessfully");
                        getEnteries();
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void VspendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VspendingActionPerformed
        new Viewspendings().setVisible(true);
    }//GEN-LAST:event_VspendingActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        JOptionPane.showMessageDialog(this,"Desing and Developed by Krish Kapoor");
    }//GEN-LAST:event_AboutActionPerformed
    void displayCategory() {
        try {
            jcb.removeAllItems();
            ResultSet rs = DBLoader.executeQuery("select * from categoryinfo");
            while (rs.next()) {
                jcb.addItem(rs.getString("category"));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    void getEnteries() {
        try {
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) jt.getModel();
            int rc = dtm.getRowCount();
            while (rc-- != 0) {
                dtm.removeRow(0);
            }
            java.time.LocalDate cd = java.time.LocalDate.now();
            java.time.LocalDate bd = cd.minusDays(30);
            ResultSet rs = DBLoader.executeQuery("select * from spending where spending_date<='" + cd + "' and spending_date>='" + bd + "'");
            int total = 0;
            while (rs.next()) {
                Object o[] = {
                    rs.getInt("spendingId"),
                    rs.getString("category"),
                    rs.getDate("spending_date"),
                    rs.getInt("amount")
                };
                total += rs.getInt("amount");
                dtm.addRow(o);
            }
            jtf3.setText(total + "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpendingTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JMenuItem About;
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Vspending;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jb;
    private javax.swing.JComboBox<String> jcb;
    private javax.swing.JTable jt;
    private javax.swing.JTextField jtf;
    private javax.swing.JTextField jtf3;
    private javax.swing.JButton remove;
    private javax.swing.JMenuItem vCategory;
    // End of variables declaration//GEN-END:variables
}
