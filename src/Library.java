
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
        mnuMain_ViewMemb = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        frmAddMember = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        txtAddMemb_Name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radAddMemb_Male = new javax.swing.JRadioButton();
        radAddMemb_Female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddMemb_Addr = new javax.swing.JTextArea();
        btnAddMemb_Add = new javax.swing.JButton();
        txtAddMemb_PhNumb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        frmViewMember = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstViewMemb_List = new javax.swing.JList();
        txtViewMemb_Name = new javax.swing.JTextField();
        txtViewMemb_PhNumb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radViewMemb_Male = new javax.swing.JRadioButton();
        radViewMemb_Female = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtViewMemb_Addr = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtViewMemb_Search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmdLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        frmMain.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frmMain.setResizable(false);

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
        mnuMain_AddMemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_AddMembActionPerformed(evt);
            }
        });
        mnuMain_MembMgmt.add(mnuMain_AddMemb);

        mnuMain_ViewMemb.setText("View Members");
        mnuMain_ViewMemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_ViewMembActionPerformed(evt);
            }
        });
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

        frmMain.pack(); frmMain.setLocationRelativeTo(null);

        frmAddMember.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frmAddMember.setResizable(false);
        frmAddMember.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                frmAddMemberWindowClosed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add new Member");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sex");

        radAddMemb_Male.setSelected(true);
        radAddMemb_Male.setText("Male");

        radAddMemb_Female.setText("Female");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address");

        txtAddMemb_Addr.setColumns(20);
        txtAddMemb_Addr.setLineWrap(true);
        txtAddMemb_Addr.setRows(5);
        txtAddMemb_Addr.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtAddMemb_Addr);

        btnAddMemb_Add.setText("Add Member");
        btnAddMemb_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemb_AddActionPerformed(evt);
            }
        });

        txtAddMemb_PhNumb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddMemb_PhNumbKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Phone Number");

        javax.swing.GroupLayout frmAddMemberLayout = new javax.swing.GroupLayout(frmAddMember.getContentPane());
        frmAddMember.getContentPane().setLayout(frmAddMemberLayout);
        frmAddMemberLayout.setHorizontalGroup(
            frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmAddMemberLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btnAddMemb_Add)
                .addGap(0, 0, Short.MAX_VALUE))
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
                                .addComponent(radAddMemb_Male)
                                .addGap(47, 47, 47)
                                .addComponent(radAddMemb_Female))
                            .addComponent(txtAddMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmAddMemberLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(frmAddMemberLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddMemb_PhNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        frmAddMemberLayout.setVerticalGroup(
            frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmAddMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radAddMemb_Male)
                    .addComponent(radAddMemb_Female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMemb_PhNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnAddMemb_Add)
                .addGap(20, 20, 20))
        );

        frmAddMember.pack();  frmAddMember.setLocationRelativeTo(null);

        frmViewMember.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frmViewMember.setResizable(false);
        frmViewMember.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                frmViewMemberWindowClosed(evt);
            }
        });

        lstViewMemb_List.setModel(new DefaultListModel());
        lstViewMemb_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstViewMemb_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstViewMemb_ListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstViewMemb_List);
        lstViewMemb_List.setCellRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                return super.getListCellRendererComponent(list, ((Member) value).name, index, isSelected, cellHasFocus);
            }
        });

        txtViewMemb_PhNumb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtViewMemb_PhNumbKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sex");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Phone Number");

        radViewMemb_Male.setSelected(true);
        radViewMemb_Male.setText("Male");

        radViewMemb_Female.setText("Female");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Address");

        txtViewMemb_Addr.setColumns(20);
        txtViewMemb_Addr.setLineWrap(true);
        txtViewMemb_Addr.setRows(5);
        txtViewMemb_Addr.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtViewMemb_Addr);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Name");

        jButton1.setText("Update Details");

        jButton2.setText("Delete Member");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Search");

        txtViewMemb_Search.setForeground(new java.awt.Color(153, 153, 153));
        txtViewMemb_Search.setText("Search by Name");
        txtViewMemb_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtViewMemb_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtViewMemb_SearchFocusLost(evt);
            }
        });
        txtViewMemb_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtViewMemb_SearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout frmViewMemberLayout = new javax.swing.GroupLayout(frmViewMember.getContentPane());
        frmViewMember.getContentPane().setLayout(frmViewMemberLayout);
        frmViewMemberLayout.setHorizontalGroup(
            frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmViewMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtViewMemb_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmViewMemberLayout.createSequentialGroup()
                                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10))
                                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(radViewMemb_Male)
                                        .addGap(40, 40, 40)
                                        .addComponent(radViewMemb_Female))
                                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(txtViewMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 16, Short.MAX_VALUE))
                            .addGroup(frmViewMemberLayout.createSequentialGroup()
                                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtViewMemb_PhNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        frmViewMemberLayout.setVerticalGroup(
            frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmViewMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtViewMemb_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtViewMemb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(radViewMemb_Male)
                            .addComponent(radViewMemb_Female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmViewMemberLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtViewMemb_PhNumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(frmViewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        frmViewMember.pack();
        frmViewMember.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

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

    private void btnAddMemb_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemb_AddActionPerformed
        String name = txtAddMemb_Name.getText().trim();
        int sex = radAddMemb_Male.isSelected() == true ? 0 : 1;
        String address = txtAddMemb_Addr.getText().trim();
        String number = txtAddMemb_PhNumb.getText();
        if (name.isEmpty() || address.isEmpty() || number.isEmpty()) {
            JOptionPane.showMessageDialog(frmAddMember, "No field should be left empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            conn.update("insert into members values(null, '" + name + "', '" + sex + "', '" + address + "', '" + number + "');"); // Passing null for the primary key will result in auto-increment of id
            // Find the id of the new member
            ResultSet rs = conn.query("select LAST_INSERT_ID()");
            int id = rs.getInt(0);
            JOptionPane.showMessageDialog(frmAddMember, "Successfully added new member.\n Member ID: " + id, "Success", JOptionPane.INFORMATION_MESSAGE);
            frmAddMember.setVisible(false);
            frmMain.setVisible(true);
            frmMain.setLocationRelativeTo(null);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmAddMember, "Unknown database error. Failed to add new member.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddMemb_AddActionPerformed

    private void mnuMain_AddMembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_AddMembActionPerformed
        frmAddMember.setVisible(true);
        frmAddMember.setLocationRelativeTo(null);
        frmMain.setVisible(false);
    }//GEN-LAST:event_mnuMain_AddMembActionPerformed

    private void frmAddMemberWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frmAddMemberWindowClosed
        frmMain.setVisible(true);
    }//GEN-LAST:event_frmAddMemberWindowClosed

    private void txtAddMemb_PhNumbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddMemb_PhNumbKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddMemb_PhNumbKeyTyped

    private void txtViewMemb_PhNumbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewMemb_PhNumbKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtViewMemb_PhNumbKeyTyped

    private void txtViewMemb_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtViewMemb_SearchFocusGained
        if (txtViewMemb_Search.getText().compareTo("Search by Name") == 0) {
            txtViewMemb_Search.setForeground(Color.black);
            txtViewMemb_Search.setText("");
        }
    }//GEN-LAST:event_txtViewMemb_SearchFocusGained

    private void txtViewMemb_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtViewMemb_SearchFocusLost
        if (txtViewMemb_Search.getText().compareTo("") == 0) {
            txtViewMemb_Search.setForeground(new Color(153, 153, 153));
            txtViewMemb_Search.setText("Search by Name");
        }
    }//GEN-LAST:event_txtViewMemb_SearchFocusLost

    private void mnuMain_ViewMembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_ViewMembActionPerformed
        populateMemberViewList("%");
        lstViewMemb_List.setSelectedIndex(0);
        frmViewMember.setVisible(true);
        frmMain.setVisible(false);
    }//GEN-LAST:event_mnuMain_ViewMembActionPerformed

    private void lstViewMemb_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstViewMemb_ListValueChanged
        Member memb = (Member) lstViewMemb_List.getSelectedValues()[0];
        int id = memb.id;
        try {
            ResultSet rs = conn.query("select * from members where id = '" + id + "';");
            rs.next();
            txtViewMemb_Name.setText(rs.getString("name"));
            txtViewMemb_Addr.setText(rs.getString("address"));
            txtViewMemb_PhNumb.setText("" + rs.getInt("phone"));
            int sex = rs.getInt("sex");
            if (sex == 0) {
                radViewMemb_Male.setSelected(true);
            } else {
                radViewMemb_Female.setSelected(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmAddMember, "Unknown database error. Failed to populate member details.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_lstViewMemb_ListValueChanged

    private void txtViewMemb_SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtViewMemb_SearchKeyTyped
        populateBookListTable(txtViewMemb_Search.getText().trim() + ((Character) evt.getKeyChar()).toString());
        lstViewMemb_List.setSelectedIndex(0);
    }//GEN-LAST:event_txtViewMemb_SearchKeyTyped

    private void frmViewMemberWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frmViewMemberWindowClosed
        frmMain.setVisible(true);
    }//GEN-LAST:event_frmViewMemberWindowClosed

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

    private void populateMemberViewList(String wildcard) {
        clearMemberViewList();
        if (wildcard.trim().compareTo("") == 0) {
            wildcard = "%";
        }
        try {
            ResultSet rs = conn.query("select id,name from members where lcase(name) like '" + wildcard.toLowerCase() + "%' order by id;");
            while (rs.next()) {
                ((DefaultListModel) lstViewMemb_List.getModel()).addElement(new Member(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unknown database error. Failed to populate member list.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void clearBookListTable() {
        ((DefaultTableModel) tblMain_BookList.getModel()).setRowCount(0);
    }

    private void clearMemberViewList() {
        ((DefaultListModel) lstViewMemb_List.getModel()).clear();
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

    class Member {

        int id = 0;
        String name = "";

        public Member(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getString() {
            return name;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMemb_Add;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JFrame frmAddMember;
    private javax.swing.JFrame frmMain;
    private javax.swing.JFrame frmViewMember;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMain_Welcome;
    private javax.swing.JList lstViewMemb_List;
    private javax.swing.JMenuItem mnuMain_AddMemb;
    private javax.swing.JMenu mnuMain_MembMgmt;
    private javax.swing.JMenuItem mnuMain_ViewMemb;
    private javax.swing.JRadioButton radAddMemb_Female;
    private javax.swing.JRadioButton radAddMemb_Male;
    private javax.swing.JRadioButton radViewMemb_Female;
    private javax.swing.JRadioButton radViewMemb_Male;
    private javax.swing.JTable tblMain_BookList;
    private javax.swing.JTextArea txtAddMemb_Addr;
    private javax.swing.JTextField txtAddMemb_Name;
    private javax.swing.JTextField txtAddMemb_PhNumb;
    private javax.swing.JTextField txtMain_SearchBook;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextArea txtViewMemb_Addr;
    private javax.swing.JTextField txtViewMemb_Name;
    private javax.swing.JTextField txtViewMemb_PhNumb;
    private javax.swing.JTextField txtViewMemb_Search;
    // End of variables declaration//GEN-END:variables
}
