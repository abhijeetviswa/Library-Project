
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.table.DefaultTableModel;

public class Library extends javax.swing.JFrame {

    MySqlConnection conn = new MySqlConnection("library");

    private String loggedInUser = "";

    public Library() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmMain = new javax.swing.JFrame();
        lblMain_Welcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMain_SearchBook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain_BookList = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMain_MembMgmt = new javax.swing.JMenu();
        mnuMain_AddMemb = new javax.swing.JMenuItem();
        mnuMain_DelMemb = new javax.swing.JMenuItem();
        mnuMain_ViewMemb = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        frmAddMember = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        txtAddMemb_Name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtAddMemb_Day = new javax.swing.JTextField();
        txtMembAdd_Year = new javax.swing.JTextField();
        cmbMembAdd_Month = new javax.swing.JComboBox();
        btnAddMemb_Add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmdLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        lblMain_Welcome.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        lblMain_Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMain_Welcome.setText("Welcome Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Search for a book by Name");

        txtMain_SearchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMain_SearchBookKeyTyped(evt);
            }
        });

        tblMain_BookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "Author", "Publisher", "Location", "Available Stock"
            }
        ));
        jScrollPane1.setViewportView(tblMain_BookList);

        mnuMain_MembMgmt.setText("Member Management");

        mnuMain_AddMemb.setText("Add Member");
        mnuMain_MembMgmt.add(mnuMain_AddMemb);

        mnuMain_DelMemb.setText("Delete Member");
        mnuMain_MembMgmt.add(mnuMain_DelMemb);

        mnuMain_ViewMemb.setText("View Members");
        mnuMain_MembMgmt.add(mnuMain_ViewMemb);

        jMenuBar1.add(mnuMain_MembMgmt);

        jMenu2.setText("Book Management");
        jMenuBar1.add(jMenu2);

        frmMain.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout frmMainLayout = new javax.swing.GroupLayout(frmMain.getContentPane());
        frmMain.getContentPane().setLayout(frmMainLayout);
        frmMainLayout.setHorizontalGroup(
            frmMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmMainLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(txtMain_SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(frmMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMain_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        frmMainLayout.setVerticalGroup(
            frmMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMain_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMain_SearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        frmMain.pack();
        frmMain.setLocationRelativeTo(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        txtAddMemb_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddMemb_NameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add new Member");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sex");

        jRadioButton1.setText("Male");

        jRadioButton2.setText("Female");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date of Birth");

        txtAddMemb_Day.setForeground(new java.awt.Color(204, 204, 204));
        txtAddMemb_Day.setText("Day");
        txtAddMemb_Day.setMinimumSize(new java.awt.Dimension(6, 25));
        txtAddMemb_Day.setPreferredSize(new java.awt.Dimension(25, 25));

        txtMembAdd_Year.setForeground(new java.awt.Color(204, 204, 204));
        txtMembAdd_Year.setText("Year");
        txtMembAdd_Year.setMinimumSize(new java.awt.Dimension(6, 25));
        txtMembAdd_Year.setPreferredSize(new java.awt.Dimension(25, 25));

        cmbMembAdd_Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmbMembAdd_Month.setSelectedIndex(-1);

        btnAddMemb_Add.setText("Add Member");

        javax.swing.GroupLayout frmAddMemberLayout = new javax.swing.GroupLayout(frmAddMember.getContentPane());
        frmAddMember.getContentPane().setLayout(frmAddMemberLayout);
        frmAddMemberLayout.setHorizontalGroup(
            frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmAddMemberLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmAddMemberLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmAddMemberLayout.createSequentialGroup()
                        .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmAddMemberLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(47, 47, 47)
                                .addComponent(jRadioButton2))
                            .addComponent(txtAddMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmAddMemberLayout.createSequentialGroup()
                        .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmAddMemberLayout.createSequentialGroup()
                                .addComponent(txtAddMemb_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMembAdd_Month, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMembAdd_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
            .addGroup(frmAddMemberLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnAddMemb_Add)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frmAddMemberLayout.setVerticalGroup(
            frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmAddMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMemb_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMembAdd_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cmbMembAdd_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddMemb_Add)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        cmbMembAdd_Month.setRenderer(new BasicComboBoxRenderer() {
            @Override
            public Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                if (value == null || index == -1) {
                    return super.getListCellRendererComponent(list, "Month", index, isSelected, cellHasFocus);
                } else {
                    return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                }
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel1.setText("Library Management Project");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        cmdLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdLogin)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed

        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // Check the username and password against the database
        try {
            ResultSet rs = conn.query("select * from users where lcase(username) ='" + username.toLowerCase() + "' and password = '" + password + "';");
            if (rs.next()) {
                // We have a valid login
                loggedInUser = rs.getString("username");
                this.setVisible(false);
                lblMain_Welcome.setText("Welcome " + loggedInUser);
                frmMain.setVisible(true);
                populateBookListTable("");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!", "Authentication Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unknown database error. Failed to authenticate user.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void txtMain_SearchBookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMain_SearchBookKeyTyped
        populateBookListTable(txtMain_SearchBook.getText().trim() + ((Character) evt.getKeyChar()).toString());
    }//GEN-LAST:event_txtMain_SearchBookKeyTyped

    private void txtAddMemb_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddMemb_NameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddMemb_NameKeyTyped

    private void populateBookListTable(String wildcard) {
        clearBookListTable();
        if (wildcard.trim().compareTo("") == 0) {
            wildcard = "%";
        }
        try {
            ResultSet rs = conn.query("select * from books where lcase(name) like '" + wildcard.toLowerCase() + "%' order by id;");
            while (rs.next()) {
                ((DefaultTableModel) tblMain_BookList.getModel()).addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("author"), rs.getString("publisher"), rs.getString("location"), rs.getInt("inStock")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unknown database error. Failed to populate book list.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void clearBookListTable() {
        ((DefaultTableModel) tblMain_BookList.getModel()).setRowCount(0);
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMemb_Add;
    private javax.swing.JComboBox cmbMembAdd_Month;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JFrame frmAddMember;
    private javax.swing.JFrame frmMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblMain_Welcome;
    private javax.swing.JMenuItem mnuMain_AddMemb;
    private javax.swing.JMenuItem mnuMain_DelMemb;
    private javax.swing.JMenu mnuMain_MembMgmt;
    private javax.swing.JMenuItem mnuMain_ViewMemb;
    private javax.swing.JTable tblMain_BookList;
    private javax.swing.JTextField txtAddMemb_Day;
    private javax.swing.JTextField txtAddMemb_Name;
    private javax.swing.JTextField txtMain_SearchBook;
    private javax.swing.JTextField txtMembAdd_Year;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
