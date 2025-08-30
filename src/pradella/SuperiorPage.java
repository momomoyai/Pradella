//File Location (inside package pradella)
package pradella;

//Import packages and classes
import dao.Operation;
import dao.ProposalDao;
import dao.UserDao;
import model.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SuperiorPage extends javax.swing.JFrame {
    
    //Initiation of variables
    public String user, userName, stat;
    private int homeBar, createBar, historyBar, activationBar, accountBar;
    CardLayout switchs;
    
    //Initiation of object instances
    UserGet userGet = new UserGet();
    UserDao userDao = new UserDao();
    TransferDat tf = new TransferDat();
    Operation op = new Operation();

    public SuperiorPage() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public SuperiorPage(String username){
        //GUI Setup
        initComponents();
        setLocationRelativeTo(null);
        switchs = (CardLayout) (panelSettings.getLayout()); 
        
        //HomePage Setup
        homeDesc.setDisabledTextColor(Color.BLACK);
        homeBar = 1;
        homeBarPanel.setVisible(true);
        homeBut.setEnabled(false);
        homeBut.setContentAreaFilled(false);
        homeBut.setForeground(Color.BLACK);

        //Subpage Setup
        panelSettings.add("homePanel", homePanel);
        panelSettings.add("checkPanel", checkPanel);
        panelSettings.add("historyPanel", historyPanel);
        panelSettings.add("activationPanel", activationPanel);
        panelSettings.add("accountPanel", accountPanel);
        createBarPanel.setVisible(false);
        historyBarPanel.setVisible(false);
        activationBarPanel.setVisible(false);
        accountBarPanel.setVisible(false);
        logoutBarPanel.setVisible(false);
        
        //User Data Setup
        userName = UserDao.getName(username);
        stat = UserDao.getStat(username);
        user = username;
        userGet.setUser(username);
        userGet = userDao.setData(userGet);
        
        //To ensure the length of the name displayed will fit the GUI
        if (userName.length() > 33){
            userName = userName.substring(0, 33);
        }
        
        //Display name and status of the user
        nameLabel.setText(userName);
        statLabel.setText(stat);
    }
   
    //Method that handles the default condition of the button - Part of Buttons Animation (when the cursor is outside the button)
    public void resetBut(){
        homeBar = 0;
        homeBarPanel.setVisible(false);
        homeBut.setEnabled(true);
        homeBut.setContentAreaFilled(false);
        homeBut.setBorderPainted(true);
        homeBut.setForeground(Color.WHITE);
        homeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeLogo.png")));
        
        createBar = 0;
        createBarPanel.setVisible(false);
        checkBut.setEnabled(true);
        checkBut.setContentAreaFilled(false);
        checkBut.setBorderPainted(true);
        checkBut.setForeground(Color.WHITE);
        checkBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ApproveLogo.png")));
        
        historyBar = 0;
        historyBarPanel.setVisible(false);
        historyBut.setEnabled(true);
        historyBut.setContentAreaFilled(false);
        historyBut.setBorderPainted(true);
        historyBut.setForeground(Color.WHITE);
        historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogo.png")));
        
        activationBar = 0;
        activationBarPanel.setVisible(false);
        activationBut.setEnabled(true);
        activationBut.setContentAreaFilled(false);
        activationBut.setBorderPainted(true);
        activationBut.setForeground(Color.WHITE);
        activationBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ActivationLogo.png")));
        
        accountBar = 0;
        accountBarPanel.setVisible(false);
        accountBut.setEnabled(true);
        accountBut.setContentAreaFilled(false);
        accountBut.setBorderPainted(true);
        accountBut.setForeground(Color.WHITE);
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogo.png")));
    }

    /* Start of NetBeans GUI-Builder Generated Code */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        userInfo = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        homeDesc = new javax.swing.JTextArea();
        homeTrans = new javax.swing.JLabel();
        homeBG = new javax.swing.JLabel();
        checkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchCheckField = new javax.swing.JTextField();
        searchCheckVar = new javax.swing.JComboBox<>();
        searchCheckBut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rejectBut = new javax.swing.JButton();
        approveBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkTable = new javax.swing.JTable();
        checkTrans = new javax.swing.JLabel();
        checkBG = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        searchProVar = new javax.swing.JComboBox<>();
        searchProField = new javax.swing.JTextField();
        searchProBut = new javax.swing.JButton();
        deleteProBut = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        hisTable = new javax.swing.JTable();
        hisTrans = new javax.swing.JLabel();
        hisBG = new javax.swing.JLabel();
        activationPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        activateTable = new javax.swing.JTable();
        activateBut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        actTrans = new javax.swing.JLabel();
        actBG = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deleteAccBut = new javax.swing.JButton();
        changeBut = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        accTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        accTrans = new javax.swing.JLabel();
        accBG = new javax.swing.JLabel();
        homeBut = new javax.swing.JButton();
        historyBut = new javax.swing.JButton();
        activationBut = new javax.swing.JButton();
        logoutBut = new javax.swing.JButton();
        accountBut = new javax.swing.JButton();
        checkBut = new javax.swing.JButton();
        logoutBarPanel = new javax.swing.JPanel();
        accountBarPanel = new javax.swing.JPanel();
        activationBarPanel = new javax.swing.JPanel();
        createBarPanel = new javax.swing.JPanel();
        historyBarPanel = new javax.swing.JPanel();
        homeBarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        sidebarLabel = new javax.swing.JLabel();
        sidebarLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pradella");
        setPreferredSize(new java.awt.Dimension(1200, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(null);

        statLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        statLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statLabel.setText("Status");
        getContentPane().add(statLabel);
        statLabel.setBounds(10, 580, 350, 30);

        nameLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 20)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(10, 550, 350, 40);

        userInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        getContentPane().add(userInfo);
        userInfo.setBounds(0, -100, 380, 880);

        panelSettings.setBackground(new java.awt.Color(153, 153, 0));
        panelSettings.setLayout(new java.awt.CardLayout());

        homePanel.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tamil MN", 1, 48)); // NOI18N
        jLabel15.setText("Home Page");
        homePanel.add(jLabel15);
        jLabel15.setBounds(380, 50, 270, 60);

        homeDesc.setColumns(20);
        homeDesc.setFont(new java.awt.Font("Mali", 1, 18)); // NOI18N
        homeDesc.setRows(5);
        homeDesc.setText("Pradella is an application used to help teachers in proposing a proposal to\nsuperiors in order to getting approval to get home. As known, the school has\nregulations, which require teachers to stay at the dorm. This regulation increases\nthe presence of teachers in the school, which affects the quality of education\nthat the students gain.\n\nThe application is aimed to increasing the efficiency in getting permission from\nthe school superiors, especially when the teacher has an urgent thing that needs\nto be at home while one or more superiors are not available at the time.\n\nThis application has two different menus, which adjust to the user's status. If the\nstatus of the users are Teachers, users can access some features, such as\ncreating proposal, viewing history of their submittion, modify their account\ndetails and logout.\n\nOtherwise, if the status of the users are Superiors, users are given features that\nTeachers don't have, such as approving/rejecting proposals, viewing history of all\nusers submittion, activate/verify users account, modify all users account details\nand logout.");
        homeDesc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        homeDesc.setEnabled(false);
        jScrollPane6.setViewportView(homeDesc);

        homePanel.add(jScrollPane6);
        jScrollPane6.setBounds(130, 140, 770, 360);

        homeTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupSidebarTransition.png"))); // NOI18N
        homePanel.add(homeTrans);
        homeTrans.setBounds(-11, 0, 400, 630);

        homeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupPageBackground.png"))); // NOI18N
        homePanel.add(homeBG);
        homeBG.setBounds(-1, 0, 1030, 630);

        panelSettings.add(homePanel, "card3");

        checkPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tamil MN", 1, 36)); // NOI18N
        jLabel2.setText("Check Proposal");
        checkPanel.add(jLabel2);
        jLabel2.setBounds(380, 40, 290, 40);
        checkPanel.add(searchCheckField);
        searchCheckField.setBounds(510, 110, 190, 23);

        searchCheckVar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "From", "To", "Place", "Activity", "Reason" }));
        searchCheckVar.setSelectedIndex(1);
        checkPanel.add(searchCheckVar);
        searchCheckVar.setBounds(400, 110, 90, 23);

        searchCheckBut.setText("Search");
        searchCheckBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCheckButActionPerformed(evt);
            }
        });
        checkPanel.add(searchCheckBut);
        searchCheckBut.setBounds(720, 110, 78, 23);

        jLabel8.setFont(new java.awt.Font("Tamil MN", 1, 24)); // NOI18N
        jLabel8.setText("Search By:");
        checkPanel.add(jLabel8);
        jLabel8.setBounds(270, 100, 140, 40);

        rejectBut.setFont(new java.awt.Font("October Tamil", 1, 18)); // NOI18N
        rejectBut.setText("Reject");
        rejectBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        rejectBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButActionPerformed(evt);
            }
        });
        checkPanel.add(rejectBut);
        rejectBut.setBounds(310, 560, 160, 30);

        approveBut.setFont(new java.awt.Font("October Tamil", 1, 18)); // NOI18N
        approveBut.setText("Approve");
        approveBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        approveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButActionPerformed(evt);
            }
        });
        checkPanel.add(approveBut);
        approveBut.setBounds(560, 560, 160, 30);

        checkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "From", "To", "Place", "Activity", "Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        checkTable.setRowHeight(50);
        jScrollPane1.setViewportView(checkTable);
        if (checkTable.getColumnModel().getColumnCount() > 0) {
            checkTable.getColumnModel().getColumn(0).setResizable(false);
            checkTable.getColumnModel().getColumn(1).setResizable(false);
            checkTable.getColumnModel().getColumn(2).setResizable(false);
            checkTable.getColumnModel().getColumn(3).setResizable(false);
            checkTable.getColumnModel().getColumn(4).setResizable(false);
            checkTable.getColumnModel().getColumn(5).setResizable(false);
            checkTable.getColumnModel().getColumn(6).setResizable(false);
        }

        checkPanel.add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 960, 360);

        checkTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupSidebarTransition.png"))); // NOI18N
        checkPanel.add(checkTrans);
        checkTrans.setBounds(-11, 0, 400, 630);

        checkBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupPageBackground.png"))); // NOI18N
        checkPanel.add(checkBG);
        checkBG.setBounds(-1, 0, 1030, 630);

        panelSettings.add(checkPanel, "card4");

        historyPanel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tamil MN", 1, 36)); // NOI18N
        jLabel3.setText("Whole Proposal History");
        historyPanel.add(jLabel3);
        jLabel3.setBounds(300, 30, 420, 60);

        jLabel9.setFont(new java.awt.Font("Tamil MN", 1, 24)); // NOI18N
        jLabel9.setText("Search By:");
        historyPanel.add(jLabel9);
        jLabel9.setBounds(270, 100, 140, 40);

        searchProVar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "From", "To", "Place", "Activity", "Reason", "Status" }));
        searchProVar.setSelectedIndex(1);
        historyPanel.add(searchProVar);
        searchProVar.setBounds(400, 110, 90, 23);
        historyPanel.add(searchProField);
        searchProField.setBounds(510, 110, 190, 23);

        searchProBut.setText("Search");
        searchProBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProButActionPerformed(evt);
            }
        });
        historyPanel.add(searchProBut);
        searchProBut.setBounds(720, 110, 78, 23);

        deleteProBut.setFont(new java.awt.Font("October Tamil", 1, 40)); // NOI18N
        deleteProBut.setText("Permanent Delete");
        deleteProBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        deleteProBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProButActionPerformed(evt);
            }
        });
        historyPanel.add(deleteProBut);
        deleteProBut.setBounds(300, 540, 440, 60);

        hisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "From", "To", "Place", "Activities", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(hisTable);
        if (hisTable.getColumnModel().getColumnCount() > 0) {
            hisTable.getColumnModel().getColumn(0).setResizable(false);
            hisTable.getColumnModel().getColumn(1).setResizable(false);
            hisTable.getColumnModel().getColumn(2).setResizable(false);
            hisTable.getColumnModel().getColumn(3).setResizable(false);
            hisTable.getColumnModel().getColumn(4).setResizable(false);
            hisTable.getColumnModel().getColumn(5).setResizable(false);
            hisTable.getColumnModel().getColumn(6).setResizable(false);
            hisTable.getColumnModel().getColumn(7).setResizable(false);
        }

        historyPanel.add(jScrollPane4);
        jScrollPane4.setBounds(30, 160, 980, 350);

        hisTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupSidebarTransition.png"))); // NOI18N
        historyPanel.add(hisTrans);
        hisTrans.setBounds(-11, 0, 400, 630);

        hisBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupPageBackground.png"))); // NOI18N
        historyPanel.add(hisBG);
        hisBG.setBounds(-1, 0, 1030, 630);

        panelSettings.add(historyPanel, "card2");

        activationPanel.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tamil MN", 1, 48)); // NOI18N
        jLabel5.setText("Account Activation");
        activationPanel.add(jLabel5);
        jLabel5.setBounds(280, 30, 470, 50);

        activateTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        activateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activateTable.setRowHeight(50);
        jScrollPane2.setViewportView(activateTable);
        if (activateTable.getColumnModel().getColumnCount() > 0) {
            activateTable.getColumnModel().getColumn(0).setResizable(false);
            activateTable.getColumnModel().getColumn(1).setResizable(false);
            activateTable.getColumnModel().getColumn(2).setResizable(false);
            activateTable.getColumnModel().getColumn(3).setResizable(false);
        }

        activationPanel.add(jScrollPane2);
        jScrollPane2.setBounds(110, 170, 790, 340);

        activateBut.setFont(new java.awt.Font("October Tamil", 1, 48)); // NOI18N
        activateBut.setText("Activate");
        activateBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        activateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateButActionPerformed(evt);
            }
        });
        activationPanel.add(activateBut);
        activateBut.setBounds(370, 530, 290, 80);

        jLabel6.setFont(new java.awt.Font("Mali", 1, 24)); // NOI18N
        jLabel6.setText("Select a row to activate the account.");
        activationPanel.add(jLabel6);
        jLabel6.setBounds(280, 120, 470, 30);

        actTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupSidebarTransition.png"))); // NOI18N
        activationPanel.add(actTrans);
        actTrans.setBounds(-11, 0, 400, 630);

        actBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupPageBackground.png"))); // NOI18N
        activationPanel.add(actBG);
        actBG.setBounds(-1, 0, 1030, 630);

        panelSettings.add(activationPanel, "card6");

        accountPanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tamil MN", 1, 48)); // NOI18N
        jLabel4.setText("Account Data");
        accountPanel.add(jLabel4);
        jLabel4.setBounds(340, 30, 330, 50);

        deleteAccBut.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        deleteAccBut.setText("Delete Account");
        deleteAccBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccButActionPerformed(evt);
            }
        });
        accountPanel.add(deleteAccBut);
        deleteAccBut.setBounds(300, 550, 180, 30);

        changeBut.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        changeBut.setText("Save Changes");
        changeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButActionPerformed(evt);
            }
        });
        accountPanel.add(changeBut);
        changeBut.setBounds(520, 550, 180, 30);

        accTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        accTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Status", "Activation", "Unique Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accTable.setRowHeight(50);
        jScrollPane5.setViewportView(accTable);
        if (accTable.getColumnModel().getColumnCount() > 0) {
            accTable.getColumnModel().getColumn(0).setResizable(false);
            accTable.getColumnModel().getColumn(1).setResizable(false);
            accTable.getColumnModel().getColumn(2).setResizable(false);
            accTable.getColumnModel().getColumn(3).setResizable(false);
            accTable.getColumnModel().getColumn(4).setResizable(false);
            accTable.getColumnModel().getColumn(5).setResizable(false);
        }

        accountPanel.add(jScrollPane5);
        jScrollPane5.setBounds(80, 150, 850, 360);

        jLabel7.setFont(new java.awt.Font("Mali", 1, 24)); // NOI18N
        jLabel7.setText("Select a row to modify the account. Press \"Enter\" before saving changes.");
        accountPanel.add(jLabel7);
        jLabel7.setBounds(50, 100, 940, 30);

        accTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupSidebarTransition.png"))); // NOI18N
        accountPanel.add(accTrans);
        accTrans.setBounds(-11, 0, 400, 630);

        accBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SupPageBackground.png"))); // NOI18N
        accountPanel.add(accBG);
        accBG.setBounds(-1, 0, 1030, 630);

        panelSettings.add(accountPanel, "card5");

        getContentPane().add(panelSettings);
        panelSettings.setBounds(170, 0, 1030, 700);

        homeBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        homeBut.setForeground(new java.awt.Color(242, 242, 242));
        homeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeLogo.png"))); // NOI18N
        homeBut.setText(" Home");
        homeBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        homeBut.setContentAreaFilled(false);
        homeBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButMouseExited(evt);
            }
        });
        homeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButActionPerformed(evt);
            }
        });
        getContentPane().add(homeBut);
        homeBut.setBounds(-80, 130, 280, 42);

        historyBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        historyBut.setForeground(new java.awt.Color(242, 242, 242));
        historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogo.png"))); // NOI18N
        historyBut.setText(" History");
        historyBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        historyBut.setContentAreaFilled(false);
        historyBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyButMouseExited(evt);
            }
        });
        historyBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButActionPerformed(evt);
            }
        });
        getContentPane().add(historyBut);
        historyBut.setBounds(-70, 210, 270, 40);

        activationBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        activationBut.setForeground(new java.awt.Color(242, 242, 242));
        activationBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ActivationLogo.png"))); // NOI18N
        activationBut.setText(" Activate");
        activationBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        activationBut.setContentAreaFilled(false);
        activationBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                activationButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                activationButMouseExited(evt);
            }
        });
        activationBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activationButActionPerformed(evt);
            }
        });
        getContentPane().add(activationBut);
        activationBut.setBounds(-60, 250, 260, 40);

        logoutBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutBut.setForeground(new java.awt.Color(242, 242, 242));
        logoutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LogoutLogo.png"))); // NOI18N
        logoutBut.setText(" Logout");
        logoutBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoutBut.setContentAreaFilled(false);
        logoutBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButMouseExited(evt);
            }
        });
        logoutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBut);
        logoutBut.setBounds(-70, 330, 270, 40);

        accountBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        accountBut.setForeground(new java.awt.Color(242, 242, 242));
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogo.png"))); // NOI18N
        accountBut.setText(" Accounts");
        accountBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        accountBut.setContentAreaFilled(false);
        accountBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountButMouseExited(evt);
            }
        });
        accountBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButActionPerformed(evt);
            }
        });
        getContentPane().add(accountBut);
        accountBut.setBounds(-50, 290, 250, 40);

        checkBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        checkBut.setForeground(new java.awt.Color(242, 242, 242));
        checkBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ApproveLogo.png"))); // NOI18N
        checkBut.setText(" Check");
        checkBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkBut.setContentAreaFilled(false);
        checkBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkButMouseExited(evt);
            }
        });
        checkBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButActionPerformed(evt);
            }
        });
        getContentPane().add(checkBut);
        checkBut.setBounds(-80, 170, 280, 40);
        getContentPane().add(logoutBarPanel);
        logoutBarPanel.setBounds(0, 330, 170, 40);
        getContentPane().add(accountBarPanel);
        accountBarPanel.setBounds(0, 290, 170, 40);
        getContentPane().add(activationBarPanel);
        activationBarPanel.setBounds(0, 250, 170, 40);
        getContentPane().add(createBarPanel);
        createBarPanel.setBounds(0, 170, 170, 40);
        getContentPane().add(historyBarPanel);
        historyBarPanel.setBounds(0, 210, 170, 40);
        getContentPane().add(homeBarPanel);
        homeBarPanel.setBounds(0, 130, 170, 40);

        logoLabel.setFont(new java.awt.Font("Wawati TC", 1, 27)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(242, 242, 242));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PradellaSidebar.png"))); // NOI18N
        logoLabel.setText("Pradella");
        getContentPane().add(logoLabel);
        logoLabel.setBounds(10, 20, 150, 70);

        sidebarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Signup Page.png"))); // NOI18N
        sidebarLabel.setText("jLabel4");
        getContentPane().add(sidebarLabel);
        sidebarLabel.setBounds(0, 0, 170, 600);

        sidebarLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Signup Page.png"))); // NOI18N
        sidebarLabel2.setText("jLabel15");
        getContentPane().add(sidebarLabel2);
        sidebarLabel2.setBounds(0, 70, 170, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* End of NetBeans GUI-Builder Generated Code */
    
    //Method which handles actions if the History Switch Button is being clicked
    private void historyButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButActionPerformed
        //Animation Settings for History Button
        resetBut();
        historyBar = 1;
        historyBarPanel.setVisible(true);
        historyBut.setEnabled(false);
        historyBut.setContentAreaFilled(false);
        historyBut.setForeground(Color.BLACK);
        historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogoB.png")));
        
        //History Page Table Setup
        String target = "hisSuperior";
        hisTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        hisTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        hisTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        hisTable.getColumnModel().getColumn(4).setPreferredWidth(60); 
        hisTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        hisTable.getColumnModel().getColumn(6).setPreferredWidth(150); 
        hisTable.getColumnModel().getColumn(7).setPreferredWidth(50);
        ProposalDao.proTable(userGet, target);
        
        //Table Customizer
        hisTable.getColumnModel().getColumn(1).setCellRenderer(new TableCustomizer());
        hisTable.getColumnModel().getColumn(4).setCellRenderer(new TableCustomizer());
        hisTable.getColumnModel().getColumn(5).setCellRenderer(new TableCustomizer());
        hisTable.getColumnModel().getColumn(6).setCellRenderer(new TableCustomizer());
              
        //Switch Subpage to History Page
        switchs.show(panelSettings, "historyPanel");
    }//GEN-LAST:event_historyButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void historyButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButMouseEntered
        if (historyBar != 1){
            historyBut.setContentAreaFilled(true);
            historyBut.setBorderPainted(false);
            historyBut.setForeground(Color.BLACK);
            historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogoB.png")));
        }
    }//GEN-LAST:event_historyButMouseEntered

    private void historyButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyButMouseExited
        if (historyBar != 1){
            historyBut.setContentAreaFilled(false);
            historyBut.setBorderPainted(true);
            historyBut.setForeground(Color.WHITE);
            historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogo.png")));
        }
    }//GEN-LAST:event_historyButMouseExited

    private void homeButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButMouseEntered
        if (homeBar != 1){
            homeBut.setContentAreaFilled(true);
            homeBut.setBorderPainted(false);
            homeBut.setForeground(Color.BLACK);
            homeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeLogoB.png")));
        }
    }//GEN-LAST:event_homeButMouseEntered

    private void homeButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButMouseExited
        if (homeBar != 1){    
            homeBut.setContentAreaFilled(false);
            homeBut.setBorderPainted(true);
            homeBut.setForeground(Color.WHITE);
            homeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeLogo.png")));
        }
    }//GEN-LAST:event_homeButMouseExited

    //Method which handles actions if the Home Switch Button is being clicked
    private void homeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButActionPerformed
        //Animation Settings for Home Button
        resetBut();
        homeBar = 1;
        homeBarPanel.setVisible(true);
        homeBut.setEnabled(false);
        homeBut.setContentAreaFilled(false);
        homeBut.setForeground(Color.BLACK);
        homeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HomeLogoB.png")));
        
        //Switch Subpage to Homepage
        switchs.show(panelSettings, "homePanel");
    }//GEN-LAST:event_homeButActionPerformed

    //Method which handles actions if the Check Switch Button is being clicked
    private void checkButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButActionPerformed
        //Animation Settings for Check Button
        resetBut();
        createBar = 1;
        createBarPanel.setVisible(true);
        checkBut.setEnabled(false);
        checkBut.setContentAreaFilled(false);
        checkBut.setForeground(Color.BLACK);
        checkBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ApproveLogoB.png")));
        hisTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        hisTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        hisTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        ProposalDao.checkTable();
        checkTable.setName("checkTable");
        
        //Table Customizer
        checkTable.getColumnModel().getColumn(1).setCellRenderer(new TableCustomizer());
        checkTable.getColumnModel().getColumn(4).setCellRenderer(new TableCustomizer());
        checkTable.getColumnModel().getColumn(6).setCellRenderer(new TableCustomizer());
        
        //Switch Subpage to Check Page
        switchs.show(panelSettings, "checkPanel");
    }//GEN-LAST:event_checkButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void checkButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButMouseEntered
        if (createBar != 1){
            checkBut.setContentAreaFilled(true);
            checkBut.setBorderPainted(false);
            checkBut.setForeground(Color.BLACK);
            checkBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ApproveLogoB.png")));
        }
    }//GEN-LAST:event_checkButMouseEntered

    private void checkButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButMouseExited
        if (createBar != 1){    
            checkBut.setContentAreaFilled(false);
            checkBut.setBorderPainted(true);
            checkBut.setForeground(Color.WHITE);
            checkBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ApproveLogo.png")));
        }
    }//GEN-LAST:event_checkButMouseExited

    //Method which handles actions if the Account Switch Button is being clicked
    private void accountButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButActionPerformed
        //Animation Settings for ___ Button
        resetBut();
        accountBar = 1;
        accountBarPanel.setVisible(true);
        accountBut.setEnabled(false);
        accountBut.setContentAreaFilled(false);
        accountBut.setForeground(Color.BLACK);
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogoB.png")));
        
        //Table Customizer
        accTable.getColumnModel().getColumn(0).setCellRenderer(new TableCustomizer());
        
        //Account Page Table Setup
        UserDao.accTable();
        
        //Switch Subpage to Account Page
        switchs.show(panelSettings, "accountPanel");
    }//GEN-LAST:event_accountButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void accountButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButMouseEntered
        if (accountBar != 1){
            accountBut.setContentAreaFilled(true);
            accountBut.setBorderPainted(false);
            accountBut.setForeground(Color.BLACK);
            accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogoB.png")));
        }
    }//GEN-LAST:event_accountButMouseEntered

    private void accountButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButMouseExited
        if (accountBar != 1){    
            accountBut.setContentAreaFilled(false);
            accountBut.setBorderPainted(true);
            accountBut.setForeground(Color.WHITE);
            accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogo.png")));
        }
    }//GEN-LAST:event_accountButMouseExited

    //Method which handles actions if the Logout Button is being clicked
    private void logoutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"Logging out will end your current session. Proceed?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
        
        //If the user confirmed to logout, the account used will be logged out
        if (confirm == 0){
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_logoutButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void logoutButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButMouseEntered
        logoutBut.setContentAreaFilled(true);
        logoutBut.setBorderPainted(false);
        logoutBut.setForeground(Color.BLACK);
        logoutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logoutLogoB.png")));
    }//GEN-LAST:event_logoutButMouseEntered

    private void logoutButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButMouseExited
        logoutBut.setContentAreaFilled(false);
        logoutBut.setBorderPainted(true);
        logoutBut.setForeground(Color.WHITE);
        logoutBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logoutLogo.png")));
    }//GEN-LAST:event_logoutButMouseExited

    //Method which handles actions if the Approve Button in Check Page is being clicked
    private void approveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"By pressing the button, the proposal you selected will be approved. Continue?", "Approval Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            DefaultTableModel df = (DefaultTableModel) checkTable.getModel();
            int selIndex = checkTable.getSelectedRow();
            String PID = df.getValueAt(selIndex, 0).toString();
            ProposalDao.approve(PID);
            String target = "checkTable";
            op.tableUpdate(target);
        }
    }//GEN-LAST:event_approveButActionPerformed

    //Method which handles actions if the Delete Button in History Page is being clicked
    private void deleteProButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"Deleting a proposal history is an irreversible action. Do you wish to continue the process?", "Delete Proposal History Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            DefaultTableModel df = (DefaultTableModel) hisTable.getModel();
            int selIndex = hisTable.getSelectedRow();
            String PID = df.getValueAt(selIndex, 0).toString();
            ProposalDao.delete(PID);
            String target = "hisTable";
            op.tableUpdate(target);
        }
    }//GEN-LAST:event_deleteProButActionPerformed

    //Method which handles actions if the Reject Button in Check Page is being clicked
    private void rejectButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"By pressing the button, the proposal you selected will be rejected. Continue?", "Rejection Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            DefaultTableModel df = (DefaultTableModel) checkTable.getModel();
            int selIndex = checkTable.getSelectedRow();
            String PID = df.getValueAt(selIndex, 0).toString();
            ProposalDao.reject(PID);
            String target = "checkTable";
            op.tableUpdate(target);
        }
    }//GEN-LAST:event_rejectButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void activationButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activationButMouseEntered
        if (activationBar != 1){
            activationBut.setContentAreaFilled(true);
            activationBut.setBorderPainted(false);
            activationBut.setForeground(Color.BLACK);
            activationBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ActivationLogoB.png")));
        }
    }//GEN-LAST:event_activationButMouseEntered

    private void activationButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activationButMouseExited
        if (activationBar != 1){    
            activationBut.setContentAreaFilled(false);
            activationBut.setBorderPainted(true);
            activationBut.setForeground(Color.WHITE);
            activationBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ActivationLogo.png")));
        }
    }//GEN-LAST:event_activationButMouseExited

    //Method which handles actions if the Activation Switch Button is being clicked
    private void activationButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activationButActionPerformed
        //Animation Settings for Activation Button
        resetBut();
        activationBar = 1;
        activationBarPanel.setVisible(true);
        activationBut.setEnabled(false);
        activationBut.setContentAreaFilled(false);
        activationBut.setForeground(Color.BLACK);
        activationBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ActivationLogoB.png")));

        //Table Customizer
        activateTable.getColumnModel().getColumn(0).setCellRenderer(new TableCustomizer());
        
        //Activation Page Table Setup
        UserDao.actTable();
        
        //Switch Subpage to Activation Page
        switchs.show(panelSettings, "activationPanel");
    }//GEN-LAST:event_activationButActionPerformed

    //Method which handles actions if the Activate Button in Activation Page is being clicked
    private void activateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"Activating this account will allow its user to log in. Activate?", "Activation Confirmation", JOptionPane.YES_NO_OPTION);
        
        //If the user confirmed to activate, the selected account will be activated
        if (confirm == 0){
            DefaultTableModel df = (DefaultTableModel) activateTable.getModel();
            int selIndex = activateTable.getSelectedRow();
        
            String accuser = df.getValueAt(selIndex, 1).toString();
            UserDao.activate(accuser);
            String target = "activateTable";
            op.tableUpdate(target);
        }
    }//GEN-LAST:event_activateButActionPerformed

    //Method which handles actions if the Delete Button in Account Page is being clicked
    private void deleteAccButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"Deleting an account is an irreversible action. Do you wish to continue the process?", "Delete Account Confirmation", JOptionPane.YES_NO_OPTION);
        
        //If the user confirmed to delete, the selected account will permanently deleted from the database
        if (confirm == 0){
            DefaultTableModel df = (DefaultTableModel)accTable.getModel();
            int selIndex = accTable.getSelectedRow();
            String acc = df.getValueAt(selIndex, 1).toString();
            UserDao.delete(acc);
            String target = "accTable";
            op.tableUpdate(target);
        }
    }//GEN-LAST:event_deleteAccButActionPerformed

    //Method which handles actions if the Change Button in Account Page is being clicked
    private void changeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButActionPerformed
        DefaultTableModel df = (DefaultTableModel) accTable.getModel();
        int selIndex = accTable.getSelectedRow();
        String checkStat = df.getValueAt(selIndex, 3).toString();
        
        //If the selected account is a Teacher account
        if (checkStat.equals("Teacher")){
            int confirm = JOptionPane.showConfirmDialog(null,"By changing the account details, you have to reverify the account to activate it. Proceed?", "Changing Account Details Confirmation", JOptionPane.YES_NO_OPTION);        
            
            //If the user confirmed to change, the selected account details will be changed and the account will be inactivated
            if (confirm == 0){            
                tf.setName(df.getValueAt(selIndex, 0).toString());
                tf.setUser(df.getValueAt(selIndex, 1).toString());
                tf.setPass(df.getValueAt(selIndex, 2).toString());
                tf.setUC(df.getValueAt(selIndex, 5).toString());
                UserDao.update(tf);
                String target = "accTable";
                op.tableUpdate(target);
            }
        }
        
        //If the selected account is a Superior account
        else if (checkStat.equals("Superior")){
            int confirm = JOptionPane.showConfirmDialog(null,"The account details you wish to update will permanently changed. Continue?", "Changing Account Details Confirmation", JOptionPane.YES_NO_OPTION);        
            
            //If the user confirmed to change, the selected account details will be changed
            if (confirm == 0){            
                tf.setName(df.getValueAt(selIndex, 0).toString());
                tf.setUser(df.getValueAt(selIndex, 1).toString());
                tf.setPass(df.getValueAt(selIndex, 2).toString());
                tf.setUC(df.getValueAt(selIndex, 5).toString());
                UserDao.updateS(tf);
                String target = "accTable";
                op.tableUpdate(target);
            }
        }
    }//GEN-LAST:event_changeButActionPerformed

    //Method which handles actions if the Search Button in Check Page is being clicked
    private void searchCheckButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCheckButActionPerformed
        //Retrieves values inserted by the user
        String var = searchCheckVar.getSelectedItem().toString();
        String field = searchCheckField.getText();
        String category = "checkTable";
        
        //Search by Variable Setup
        switch (var){
            case "ID": var = "PID"; break;
            case "From": var = "dFrom"; break;
            case "To": var = "dTo"; break;
            default: break;
        }
        
        //Search Method
        ProposalDao.search(var, field, category);
    }//GEN-LAST:event_searchCheckButActionPerformed

    //Method which handles actions if the Search Button in History Page is being clicked
    private void searchProButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProButActionPerformed
        //Retrieves values inserted by the user
        String var = searchProVar.getSelectedItem().toString();
        String field = searchProField.getText();
        String category = "hisTable";
        
        //Search by Variable Setup
        switch (var){
            case "ID": var = "PID"; break;
            case "From": var = "dFrom"; break;
            case "To": var = "dTo"; break;
            default: break;
        }
        
        //Search Method
        ProposalDao.search(var, field, category);
    }//GEN-LAST:event_searchProButActionPerformed

  
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
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperiorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accBG;
    public static javax.swing.JTable accTable;
    private javax.swing.JLabel accTrans;
    private javax.swing.JPanel accountBarPanel;
    private javax.swing.JButton accountBut;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JLabel actBG;
    private javax.swing.JLabel actTrans;
    private javax.swing.JButton activateBut;
    public static javax.swing.JTable activateTable;
    private javax.swing.JPanel activationBarPanel;
    private javax.swing.JButton activationBut;
    private javax.swing.JPanel activationPanel;
    private javax.swing.JButton approveBut;
    private javax.swing.JButton changeBut;
    private javax.swing.JLabel checkBG;
    private javax.swing.JButton checkBut;
    private javax.swing.JPanel checkPanel;
    public static javax.swing.JTable checkTable;
    private javax.swing.JLabel checkTrans;
    private javax.swing.JPanel createBarPanel;
    private javax.swing.JButton deleteAccBut;
    private javax.swing.JButton deleteProBut;
    private javax.swing.JLabel hisBG;
    public static javax.swing.JTable hisTable;
    private javax.swing.JLabel hisTrans;
    private javax.swing.JPanel historyBarPanel;
    private javax.swing.JButton historyBut;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JLabel homeBG;
    private javax.swing.JPanel homeBarPanel;
    private javax.swing.JButton homeBut;
    private javax.swing.JTextArea homeDesc;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeTrans;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoutBarPanel;
    private javax.swing.JButton logoutBut;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JButton rejectBut;
    private javax.swing.JButton searchCheckBut;
    private javax.swing.JTextField searchCheckField;
    private javax.swing.JComboBox<String> searchCheckVar;
    private javax.swing.JButton searchProBut;
    private javax.swing.JTextField searchProField;
    private javax.swing.JComboBox<String> searchProVar;
    private javax.swing.JLabel sidebarLabel;
    private javax.swing.JLabel sidebarLabel2;
    private javax.swing.JLabel statLabel;
    private javax.swing.JLabel userInfo;
    // End of variables declaration//GEN-END:variables
}
