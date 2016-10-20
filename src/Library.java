
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Library extends javax.swing.JFrame {

    MySqlConnection conn = new MySqlConnection("library");

    private String loggedInUser = "";
    private int curBookEdit = 0;  // The current book being edited
    private int bookAddOrEdit = -1; // 0 = add, 1 = edit

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
        mnuMain_BookMgmt = new javax.swing.JMenu();
        mnuMain_AddBook = new javax.swing.JMenuItem();
        mnuMain_DelBook = new javax.swing.JMenuItem();
        mnuMain_EditBook = new javax.swing.JMenuItem();
        mnuMain_IssueBook = new javax.swing.JMenuItem();
        mnuMain_ReturnBook = new javax.swing.JMenuItem();
        mnuBookMgmt_Refresh = new javax.swing.JMenuItem();
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
        btnViewMember_Update = new javax.swing.JButton();
        btnViewMember_Delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtViewMemb_Search = new javax.swing.JTextField();
        frmEditBook = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        txtEditBook_Name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEditBook_Author = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEditBook_Publisher = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEditBook_Location = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtEditBook_Stock = new javax.swing.JTextField();
        btnEditBook_Confirm = new javax.swing.JButton();
        lblEditBook_Status = new javax.swing.JLabel();
        grpViewMember_Sex = new javax.swing.ButtonGroup();
        frmBookDetails = new javax.swing.JFrame();
        jLabel20 = new javax.swing.JLabel();
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMain_BookList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        mnuMain_BookMgmt.setText("Book Management");

        mnuMain_AddBook.setText("Add Book");
        mnuMain_AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_AddBookActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuMain_AddBook);

        mnuMain_DelBook.setText("Delete Book");
        mnuMain_DelBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_DelBookActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuMain_DelBook);

        mnuMain_EditBook.setText("Edit Book");
        mnuMain_EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_EditBookActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuMain_EditBook);

        mnuMain_IssueBook.setText("Issue Book");
        mnuMain_IssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_IssueBookActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuMain_IssueBook);

        mnuMain_ReturnBook.setText("Return Book");
        mnuMain_ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMain_ReturnBookActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuMain_ReturnBook);

        mnuBookMgmt_Refresh.setText("Refresh List");
        mnuBookMgmt_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBookMgmt_RefreshActionPerformed(evt);
            }
        });
        mnuMain_BookMgmt.add(mnuBookMgmt_Refresh);

        jMenuBar1.add(mnuMain_BookMgmt);

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
                .addGroup(frmAddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        grpViewMember_Sex.add(radViewMemb_Male);
        radViewMemb_Male.setSelected(true);
        radViewMemb_Male.setText("Male");

        grpViewMember_Sex.add(radViewMemb_Female);
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

        btnViewMember_Update.setText("Update Details");
        btnViewMember_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMember_UpdateActionPerformed(evt);
            }
        });

        btnViewMember_Delete.setText("Delete Member");
        btnViewMember_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMember_DeleteActionPerformed(evt);
            }
        });

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
                        .addComponent(btnViewMember_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewMember_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(btnViewMember_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewMember_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(frmViewMemberLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        frmViewMember.pack();
        frmViewMember.setLocationRelativeTo(null);

        frmEditBook.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        frmEditBook.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                frmEditBookWindowClosing(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Book Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Author");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Publisher");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Location");

        txtEditBook_Location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditBook_LocationKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Stock");

        txtEditBook_Stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditBook_StockKeyTyped(evt);
            }
        });

        btnEditBook_Confirm.setText("Add/Edit book");
        btnEditBook_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBook_ConfirmActionPerformed(evt);
            }
        });

        lblEditBook_Status.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        lblEditBook_Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditBook_Status.setText("Add new Book");

        javax.swing.GroupLayout frmEditBookLayout = new javax.swing.GroupLayout(frmEditBook.getContentPane());
        frmEditBook.getContentPane().setLayout(frmEditBookLayout);
        frmEditBookLayout.setHorizontalGroup(
            frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmEditBookLayout.createSequentialGroup()
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmEditBookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEditBook_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmEditBookLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(frmEditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(89, 89, 89)
                                    .addComponent(txtEditBook_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(frmEditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditBook_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(frmEditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditBook_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(frmEditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditBook_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(frmEditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEditBook_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(frmEditBookLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnEditBook_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmEditBookLayout.setVerticalGroup(
            frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmEditBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditBook_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtEditBook_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtEditBook_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEditBook_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEditBook_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmEditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtEditBook_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEditBook_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frmEditBook.pack();
        frmEditBook.setLocationRelativeTo(null);

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout frmBookDetailsLayout = new javax.swing.GroupLayout(frmBookDetails.getContentPane());
        frmBookDetails.getContentPane().setLayout(frmBookDetailsLayout);
        frmBookDetailsLayout.setHorizontalGroup(
            frmBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmBookDetailsLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel20)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        frmBookDetailsLayout.setVerticalGroup(
            frmBookDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmBookDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(275, Short.MAX_VALUE))
        );

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
            rs.next();
            int id = rs.getInt(1);
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
        if (lstViewMemb_List.getModel().getSize() == 0) {
            txtViewMemb_Name.setText("");
            txtViewMemb_Addr.setText("");
            txtViewMemb_PhNumb.setText("");
            radViewMemb_Male.setSelected(true);
            return;
        } else if (lstViewMemb_List.getModel().getSize() != 0 && lstViewMemb_List.getSelectedValues().length == 0) {
            lstViewMemb_List.setSelectedIndex(0);
        }
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

    private void mnuMain_DelBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_DelBookActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMain_BookList.getModel();
        int row = tblMain_BookList.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frmMain, "Select a book to delete!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (JOptionPane.showConfirmDialog(frmMain, "Are you sure want to delete the selected book?", "Delete book?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            int id = (Integer) ((Vector) model.getDataVector().get(row)).get(0);
            String name = ((String) ((Vector) model.getDataVector().get(row)).get(1)).trim();
            try {
                ResultSet rs = conn.query("select bookid from borrowedBooks where bookid='" + id + "';");
                if (!rs.next()) {
                    conn.update("delete from books where id = '" + id + "';");
                    JOptionPane.showMessageDialog(frmMain, "Successfully delete book '" + name + "'!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    populateBookListTable(txtMain_SearchBook.getText().trim());
                } else {
                    JOptionPane.showMessageDialog(frmMain, "This book is currently borrowed by a member! Cannot delete!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(frmMain, "Unknown database error. Failed to delete book.", "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnuMain_DelBookActionPerformed

    private void mnuMain_EditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_EditBookActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMain_BookList.getModel();
        int row = tblMain_BookList.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frmMain, "Select a book to edit!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = (Integer) ((Vector) model.getDataVector().get(row)).get(0);
        try {
            ResultSet rs = conn.query("select * from books where id = '" + id + "';");
            lblEditBook_Status.setText("Edit Book");
            rs.next();
            txtEditBook_Name.setText(rs.getString("name"));
            txtEditBook_Author.setText(rs.getString("author"));
            txtEditBook_Publisher.setText(rs.getString("publisher"));
            txtEditBook_Location.setText(rs.getString("location"));
            txtEditBook_Stock.setText("" + rs.getInt("bookCount"));
            btnEditBook_Confirm.setText("Edit Book");
            curBookEdit = id;
            bookAddOrEdit = 1;
            frmEditBook.setVisible(true);
            frmMain.setVisible(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmMain, "Unknown database error. Failed to edit book.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuMain_EditBookActionPerformed

    private void frmEditBookWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frmEditBookWindowClosing
        if (JOptionPane.showConfirmDialog(frmEditBook, "Are you sure you want to close the window? Your changes won't be saved!", "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            frmEditBook.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            frmMain.setVisible(true);
        }
    }//GEN-LAST:event_frmEditBookWindowClosing

    private void btnEditBook_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBook_ConfirmActionPerformed
        String name = txtEditBook_Name.getText();
        String author = txtEditBook_Author.getText();
        String publisher = txtEditBook_Publisher.getText();
        String location = txtEditBook_Location.getText();
        int stock = Integer.parseInt(txtEditBook_Stock.getText());
        try {
            if (bookAddOrEdit == 0) {
                conn.update("insert into books values(null, '" + name + "', '" + author + "', '" + publisher + "', '" + location + "', '" + stock + "', '" + stock + "');");
                JOptionPane.showMessageDialog(frmEditBook, "Book '" + name + "' has been sucessfully added!", "Book Added", JOptionPane.INFORMATION_MESSAGE);
                frmEditBook.setVisible(false);
                frmMain.setVisible(true);
            } else if (bookAddOrEdit == 1) {
                ResultSet rs = conn.query("select bookcount, instock from books where id='" + curBookEdit + "';");
                if (rs.next()) {
                    int booksLent = rs.getInt("bookcount") - rs.getInt("instock");
                    int newStock = stock - rs.getInt("bookcount");
                    if (booksLent > stock) {
                        JOptionPane.showMessageDialog(frmEditBook, "The stock of this book will be less than the current lent number!\nMake sure the stock is greater than or equal to the number lent", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        conn.update("update books set name='" + name + "', author='" + author + "', publisher='" + publisher + "', location='" + location + "', bookCount='" + stock + "', instock=instock+" + newStock + " where id='" + curBookEdit + "';");
                    }
                }
            }
            populateBookListTable(txtMain_SearchBook.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmEditBook, "Unknown database error. Failed to edit book details.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditBook_ConfirmActionPerformed

    private void mnuBookMgmt_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBookMgmt_RefreshActionPerformed
        populateBookListTable(txtMain_SearchBook.getText());
    }//GEN-LAST:event_mnuBookMgmt_RefreshActionPerformed

    private void btnViewMember_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMember_DeleteActionPerformed
        if (lstViewMemb_List.getModel().getSize() == 0) {
            txtViewMemb_Name.setText("");
            txtViewMemb_Addr.setText("");
            txtViewMemb_PhNumb.setText("");
            radViewMemb_Male.setSelected(true);
            return;
        }
        Member memb = (Member) lstViewMemb_List.getSelectedValues()[0];
        int id = memb.id;
        try {
            conn.query("delete from members where id = '" + id + "';");
            JOptionPane.showMessageDialog(frmViewMember, "Member '" + memb.name + "' has been deleted", "Member deleted", JOptionPane.INFORMATION_MESSAGE);
            populateMemberViewList(txtViewMemb_Search.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmAddMember, "Unknown database error. Failed to delete member.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnViewMember_DeleteActionPerformed

    private void btnViewMember_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMember_UpdateActionPerformed
        if (lstViewMemb_List.getModel().getSize() == 0) {
            txtViewMemb_Name.setText("");
            txtViewMemb_Addr.setText("");
            txtViewMemb_PhNumb.setText("");
            radViewMemb_Male.setSelected(true);
            return;
        }
        Member memb = (Member) lstViewMemb_List.getSelectedValues()[0];
        int id = memb.id;
        try {
            String name = txtViewMemb_Name.getText();
            String addr = txtViewMemb_Addr.getText();
            String ph = txtViewMemb_PhNumb.getText();
            int sex = radViewMemb_Male.isSelected() == true ? 0 : 1;
            conn.query("update members set name='" + name + "', address='" + addr + "', phone='" + ph + "', sex='" + sex + "' where id = '" + id + "';");
            JOptionPane.showMessageDialog(frmViewMember, "Member '" + memb.name + "' has been updated!", "Member deleted", JOptionPane.INFORMATION_MESSAGE);
            populateMemberViewList(txtViewMemb_Search.getText());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frmAddMember, "Unknown database error. Failed to update member details.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnViewMember_UpdateActionPerformed

    private void mnuMain_AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_AddBookActionPerformed
        lblEditBook_Status.setText("Add New Book");
        txtEditBook_Name.setText("");
        txtEditBook_Author.setText("");
        txtEditBook_Publisher.setText("");
        txtEditBook_Stock.setText("");
        txtEditBook_Location.setText("");
        btnEditBook_Confirm.setText("Add book");
        frmEditBook.setVisible(true);
        frmMain.setVisible(false);
        bookAddOrEdit = 0;
    }//GEN-LAST:event_mnuMain_AddBookActionPerformed

    private void txtEditBook_StockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditBook_StockKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditBook_StockKeyTyped

    private void txtEditBook_LocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditBook_LocationKeyTyped
        if (txtEditBook_Location.getText().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEditBook_LocationKeyTyped

    private void mnuMain_IssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_IssueBookActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMain_BookList.getModel();
        int row = tblMain_BookList.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frmMain, "Select a book to issue!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int userId = Integer.parseInt(JOptionPane.showInputDialog(frmMain, "Enter user ID", "Book Issue", JOptionPane.INFORMATION_MESSAGE));
        int bookId = (Integer) ((Vector) model.getDataVector().get(row)).get(0);
        int available = (Integer) ((Vector) model.getDataVector().get(row)).get(5);
        String bookName = (String) ((Vector) model.getDataVector().get(row)).get(1);
        if (available <= 0) {
            JOptionPane.showMessageDialog(frmMain, "This book is not available for lending!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ResultSet rs = conn.query("select name from members where id='" + userId + "';");
            if (rs.next()) {
                String name = rs.getString(1);
                rs = conn.query("select * from borrowedBooks where bookId='" + bookId + "' and userId = '" + userId + "' and issued='" + 1 + "';");
                if (!rs.next()) {
                    // This book isn't currently borrowed by the user, issue it
                    conn.update("insert into borrowedBooks values('" + bookId + "', '" + userId + "', now(), now() + 7, 1);");
                    //conn.update("update borrowedBooks set bookId='" + bookId + "', userId='" + userId + "', dateofissue=date(now()), dateofreturn=date(now()) + 7, issued=1 where bookId='" + bookId+"' and userId='" + userId + "';");
                    conn.update("update books set inStock = inStock - 1 where id='" + bookId + "';");
                    populateBookListTable(txtMain_SearchBook.getText());
                    JOptionPane.showMessageDialog(frmMain, "Book '" + bookName + "' has been issued to " + name + "!");
                } else {
                    JOptionPane.showMessageDialog(frmMain, "This book has already been borrowed by the user!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frmMain, "Invalid user ID!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unknown database error. Failed to issue book.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuMain_IssueBookActionPerformed

    private void mnuMain_ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMain_ReturnBookActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblMain_BookList.getModel();
        int row = tblMain_BookList.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(frmMain, "Select a book to issue!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int userId = Integer.parseInt(JOptionPane.showInputDialog(frmMain, "Enter user ID", "Book Issue", JOptionPane.INFORMATION_MESSAGE));
        int bookId = (Integer) ((Vector) model.getDataVector().get(row)).get(0);
        int available = (Integer) ((Vector) model.getDataVector().get(row)).get(5);
        String bookName = (String) ((Vector) model.getDataVector().get(row)).get(1);
        try {
            ResultSet rs = conn.query("select name from members where id='" + userId + "';");
            if (rs.next()) {
                String name = rs.getString(1);
                rs = conn.query("select * from borrowedBooks where bookId='" + bookId + "' and userId='" + userId + "';");
                if (rs.next()) {
                    if (rs.getInt("issued") == 1) {
                        Date returnDate = rs.getDate("dateOfReturn");
                        Date today = new Date(System.currentTimeMillis());
                        int fine = 0;
                        if (today.after(returnDate)) {
                            long diffEpoch = today.getTime() - returnDate.getTime();
                            long diffDays = diffEpoch / 86400000; // Divisor is the number of milliseconds in a day
                            fine = (int) diffDays * 25; // Rs 25 a day
                        }

                        conn.update("delete from borrowedBooks where userId='" + userId + "' and bookId='" + bookId + "';");
                        //conn.update("update borrowedBooks set issued = 0 where userId='" +userId + "' and bookId = '" + bookId + "';");
                        conn.update("update books set instock = instock + 1 where id='" + bookId + "';");
                        populateBookListTable(txtMain_SearchBook.getText());
                        String confirmMsg = "Book '" + bookName + "' has been sucessfully returned by " + name;
                        if (fine != 0) {
                            confirmMsg += "\nPlease collect a fine of Rs " + fine + " for late return of the book!";
                        }
                        JOptionPane.showMessageDialog(frmMain, confirmMsg, "Book returned", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(frmMain, "This member hasn't borrowed the selected book!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frmMain, "Invalid user ID!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Unknown database error. Failed to return book.", "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuMain_ReturnBookActionPerformed

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
        if (wildcard.trim().compareTo("Search by Name") == 0 || wildcard.trim().compareTo("") == 0) {
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
    private javax.swing.JButton btnEditBook_Confirm;
    private javax.swing.JButton btnViewMember_Delete;
    private javax.swing.JButton btnViewMember_Update;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JFrame frmAddMember;
    private javax.swing.JFrame frmBookDetails;
    private javax.swing.JFrame frmEditBook;
    private javax.swing.JFrame frmMain;
    private javax.swing.JFrame frmViewMember;
    private javax.swing.ButtonGroup grpViewMember_Sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblEditBook_Status;
    private javax.swing.JLabel lblMain_Welcome;
    private javax.swing.JList lstViewMemb_List;
    private javax.swing.JMenuItem mnuBookMgmt_Refresh;
    private javax.swing.JMenuItem mnuMain_AddBook;
    private javax.swing.JMenuItem mnuMain_AddMemb;
    private javax.swing.JMenu mnuMain_BookMgmt;
    private javax.swing.JMenuItem mnuMain_DelBook;
    private javax.swing.JMenuItem mnuMain_EditBook;
    private javax.swing.JMenuItem mnuMain_IssueBook;
    private javax.swing.JMenu mnuMain_MembMgmt;
    private javax.swing.JMenuItem mnuMain_ReturnBook;
    private javax.swing.JMenuItem mnuMain_ViewMemb;
    private javax.swing.JRadioButton radAddMemb_Female;
    private javax.swing.JRadioButton radAddMemb_Male;
    private javax.swing.JRadioButton radViewMemb_Female;
    private javax.swing.JRadioButton radViewMemb_Male;
    private javax.swing.JTable tblMain_BookList;
    private javax.swing.JTextArea txtAddMemb_Addr;
    private javax.swing.JTextField txtAddMemb_Name;
    private javax.swing.JTextField txtAddMemb_PhNumb;
    private javax.swing.JTextField txtEditBook_Author;
    private javax.swing.JTextField txtEditBook_Location;
    private javax.swing.JTextField txtEditBook_Name;
    private javax.swing.JTextField txtEditBook_Publisher;
    private javax.swing.JTextField txtEditBook_Stock;
    private javax.swing.JTextField txtMain_SearchBook;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextArea txtViewMemb_Addr;
    private javax.swing.JTextField txtViewMemb_Name;
    private javax.swing.JTextField txtViewMemb_PhNumb;
    private javax.swing.JTextField txtViewMemb_Search;
    // End of variables declaration//GEN-END:variables
}
