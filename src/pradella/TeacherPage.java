//File Location (inside package pradella)
package pradella;

//Import packages and classes
import dao.ProposalDao;
import dao.UserDao;
import model.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TeacherPage extends javax.swing.JFrame {
     
    public String user, userName, stat;
    private int homeBar, createBar, historyBar, accountBar;
    CardLayout switchs;

/* The usage of two arrays instead of one in order 
   to prevent error in data caused by the same 
   usage in variable (tested during the development) */
    private String[] dayFList = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
    private String[] dayTList = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};

    //Initiation of object instances
    UserGet userGet = new UserGet();
    UserDao userDao = new UserDao();
    TransferDat tf = new TransferDat();

    public TeacherPage() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public TeacherPage(String username){
        //GUI Setup
        initComponents();
        setLocationRelativeTo(null);
        switchs = (CardLayout) (panelSettings.getLayout()); 
        
        //Iterating over years from 2000-2999 to simpler the insertion of year values to the array
        String yearFSet [] = new String [1000];
        for (int i = 0; i < yearFSet.length; i++){
            yearFSet[i] = Integer.toString(i+2000);
            }
        String yearTSet [] = new String [1000];
        for (int i = 0; i < yearTSet.length; i++){
            yearTSet[i] = Integer.toString(i+2000);
            }
        
        //HomePage Setup
        homeDesc.setDisabledTextColor(Color.BLACK);
        homeBar = 1;
        homeBarPanel.setVisible(true);
        homeBut.setEnabled(false);
        homeBut.setContentAreaFilled(false);
        homeBut.setForeground(Color.BLACK);
        
        //Year-CreatePage Setup
        DefaultComboBoxModel<String> yearFModel = new DefaultComboBoxModel<>(yearFSet);
        DefaultComboBoxModel<String> yearTModel = new DefaultComboBoxModel<>(yearTSet);
        yearFromBox.setModel(yearFModel);
        yearToBox.setModel(yearTModel);
        
        //Subpage Setup
        panelSettings.add("homePanel", homePanel);
        panelSettings.add("createPanel", createPanel);
        panelSettings.add("historyPanel", historyPanel);
        panelSettings.add("accountPanel", accountPanel);
        createBarPanel.setVisible(false);
        historyBarPanel.setVisible(false);
        accountBarPanel.setVisible(false);
        logoutBarPanel.setVisible(false);
        
        //User Data Setup
        userName = UserDao.getName(username);
        stat = UserDao.getStat(username);
        user = username;
        userGet.setName(userName);
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
        createBut.setEnabled(true);
        createBut.setContentAreaFilled(false);
        createBut.setBorderPainted(true);
        createBut.setForeground(Color.WHITE);
        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddLogo.png")));
        
        historyBar = 0;
        historyBarPanel.setVisible(false);
        historyBut.setEnabled(true);
        historyBut.setContentAreaFilled(false);
        historyBut.setBorderPainted(true);
        historyBut.setForeground(Color.WHITE);
        historyBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/HistoryLogo.png")));
        
        accountBar = 0;
        accountBarPanel.setVisible(false);
        accountBut.setEnabled(true);
        accountBut.setContentAreaFilled(false);
        accountBut.setBorderPainted(true);
        accountBut.setForeground(Color.WHITE);
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogo.png")));
    }
    
    //Method that resets the field used in Teacher-Account Page to it's default condition
    public void resetInfo(){
        accNameField.setText(userGet.getName());
        accUsernameField.setText(userGet.getUser());
        accPassField.setText(userGet.getPass());
        accStatField.setText(userGet.getStat());
    }

    /* Start of NetBeans GUI-Builder Generated Code */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        statLabel = new javax.swing.JLabel();
        userInfo = new javax.swing.JLabel();
        panelSettings = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        homeDesc = new javax.swing.JTextArea();
        homeTrans = new javax.swing.JLabel();
        homeBG = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayFromBox = new javax.swing.JComboBox<>();
        yearFromBox = new javax.swing.JComboBox<>();
        resetCreateBut = new javax.swing.JButton();
        submitCreateBut = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dayToBox = new javax.swing.JComboBox<>();
        monthFromBox = new javax.swing.JComboBox<>();
        monthToBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reasonArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        placeArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        activitiesArea = new javax.swing.JTextArea();
        yearToBox = new javax.swing.JComboBox<>();
        createTrans = new javax.swing.JLabel();
        createBG = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        hisTable = new javax.swing.JTable();
        hisTrans = new javax.swing.JLabel();
        hisBG = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accStatField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accUsernameField = new javax.swing.JTextField();
        accNameField = new javax.swing.JTextField();
        inactiveBut = new javax.swing.JButton();
        defaultBut = new javax.swing.JButton();
        changeBut = new javax.swing.JButton();
        accPassField = new javax.swing.JPasswordField();
        accTrans = new javax.swing.JLabel();
        accBG = new javax.swing.JLabel();
        homeBut = new javax.swing.JButton();
        historyBut = new javax.swing.JButton();
        logoutBut = new javax.swing.JButton();
        accountBut = new javax.swing.JButton();
        createBut = new javax.swing.JButton();
        logoutBarPanel = new javax.swing.JPanel();
        accountBarPanel = new javax.swing.JPanel();
        createBarPanel = new javax.swing.JPanel();
        historyBarPanel = new javax.swing.JPanel();
        homeBarPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        sidebarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pradella");
        setPreferredSize(new java.awt.Dimension(903, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        nameLabel.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 20)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(10, 510, 350, 40);

        statLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        statLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statLabel.setText("Status");
        getContentPane().add(statLabel);
        statLabel.setBounds(10, 540, 350, 30);

        userInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        getContentPane().add(userInfo);
        userInfo.setBounds(0, 0, 390, 600);

        panelSettings.setBackground(new java.awt.Color(153, 153, 0));
        panelSettings.setLayout(new java.awt.CardLayout());

        homePanel.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tamil MN", 1, 36)); // NOI18N
        jLabel15.setText("Home Page");
        homePanel.add(jLabel15);
        jLabel15.setBounds(270, 30, 200, 60);

        homeDesc.setColumns(20);
        homeDesc.setFont(new java.awt.Font("Mali", 1, 18)); // NOI18N
        homeDesc.setRows(5);
        homeDesc.setText("Pradella is an application used to help teachers in proposing a \nproposal to superiors in order to getting approval to get home.\nAs known, the school has regulations, which require teachers to \nstay at the dorm. This regulation increases the presence of\nteachers in the school, which affects the quality of education\nthat the students gain.\n\nThe application is aimed to increasing the efficiency in getting \npermission from the school superiors, especially when the\nteacher has an urgent thing that needs to be at home while one\nor more superiors are not available at the time.\n\nThis application has two different menus, which adjust to the\nuser's status. If the status of the users are Teachers, users can\naccess some features, such as creating proposal, viewing history\nof their submittion, modify their account details and logout.\n\nOtherwise, if the status of the users are Superiors, users are\ngiven features that Teachers don't have, such as\napproving/rejecting proposals, viewing history of all users\nsubmittion, activate/verify users account, modify all users\naccount details and logout.");
        homeDesc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        homeDesc.setEnabled(false);
        jScrollPane5.setViewportView(homeDesc);

        homePanel.add(jScrollPane5);
        jScrollPane5.setBounds(60, 130, 630, 360);

        homeTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SidebarTransition.png"))); // NOI18N
        homePanel.add(homeTrans);
        homeTrans.setBounds(-11, 0, 400, 600);

        homeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PageBackground.png"))); // NOI18N
        homePanel.add(homeBG);
        homeBG.setBounds(-1, 0, 740, 600);

        panelSettings.add(homePanel, "card3");

        createPanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Time Range");
        createPanel.add(jLabel6);
        jLabel6.setBounds(80, 110, 110, 23);

        jLabel2.setFont(new java.awt.Font("Tamil MN", 1, 36)); // NOI18N
        jLabel2.setText("Create Proposal");
        createPanel.add(jLabel2);
        jLabel2.setBounds(220, 40, 290, 40);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Reason");
        createPanel.add(jLabel5);
        jLabel5.setBounds(80, 340, 70, 23);

        dayFromBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D" }));
        createPanel.add(dayFromBox);
        dayFromBox.setBounds(240, 170, 50, 23);

        yearFromBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year" }));
        yearFromBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFromBoxActionPerformed(evt);
            }
        });
        createPanel.add(yearFromBox);
        yearFromBox.setBounds(80, 170, 72, 23);

        resetCreateBut.setFont(new java.awt.Font("October Tamil", 1, 18)); // NOI18N
        resetCreateBut.setText("Reset");
        resetCreateBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        resetCreateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCreateButActionPerformed(evt);
            }
        });
        createPanel.add(resetCreateBut);
        resetCreateBut.setBounds(200, 470, 140, 30);

        submitCreateBut.setFont(new java.awt.Font("October Tamil", 1, 18)); // NOI18N
        submitCreateBut.setText("Submit");
        submitCreateBut.setMargin(new java.awt.Insets(7, 14, 0, 14));
        submitCreateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCreateButActionPerformed(evt);
            }
        });
        createPanel.add(submitCreateBut);
        submitCreateBut.setBounds(380, 470, 160, 30);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel7.setText("From");
        createPanel.add(jLabel7);
        jLabel7.setBounds(80, 140, 40, 30);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setText("To");
        createPanel.add(jLabel8);
        jLabel8.setBounds(80, 210, 40, 30);

        dayToBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D" }));
        createPanel.add(dayToBox);
        dayToBox.setBounds(240, 240, 50, 23);

        monthFromBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mon" }));
        monthFromBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFromBoxActionPerformed(evt);
            }
        });
        createPanel.add(monthFromBox);
        monthFromBox.setBounds(160, 170, 70, 23);

        monthToBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mon" }));
        monthToBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthToBoxActionPerformed(evt);
            }
        });
        createPanel.add(monthToBox);
        monthToBox.setBounds(160, 240, 70, 23);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        createPanel.add(jSeparator1);
        jSeparator1.setBounds(350, 100, 10, 250);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Place");
        createPanel.add(jLabel9);
        jLabel9.setBounds(390, 110, 70, 23);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Activities");
        createPanel.add(jLabel10);
        jLabel10.setBounds(390, 210, 80, 23);

        reasonArea.setColumns(20);
        reasonArea.setRows(5);
        jScrollPane1.setViewportView(reasonArea);

        createPanel.add(jScrollPane1);
        jScrollPane1.setBounds(80, 370, 600, 80);

        placeArea.setColumns(20);
        placeArea.setRows(5);
        jScrollPane2.setViewportView(placeArea);

        createPanel.add(jScrollPane2);
        jScrollPane2.setBounds(390, 140, 290, 40);

        activitiesArea.setColumns(20);
        activitiesArea.setRows(5);
        jScrollPane3.setViewportView(activitiesArea);

        createPanel.add(jScrollPane3);
        jScrollPane3.setBounds(390, 240, 290, 60);

        yearToBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year" }));
        yearToBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearToBoxActionPerformed(evt);
            }
        });
        createPanel.add(yearToBox);
        yearToBox.setBounds(80, 240, 72, 23);

        createTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SidebarTransition.png"))); // NOI18N
        createPanel.add(createTrans);
        createTrans.setBounds(-11, 0, 400, 600);

        createBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PageBackground.png"))); // NOI18N
        createPanel.add(createBG);
        createBG.setBounds(-1, 0, 740, 600);

        panelSettings.add(createPanel, "card4");

        historyPanel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tamil MN", 1, 36)); // NOI18N
        jLabel3.setText("Proposal History");
        historyPanel.add(jLabel3);
        jLabel3.setBounds(230, 40, 300, 60);

        hisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To", "Place", "Activities", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        historyPanel.add(jScrollPane4);
        jScrollPane4.setBounds(30, 120, 670, 370);

        hisTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SidebarTransition.png"))); // NOI18N
        historyPanel.add(hisTrans);
        hisTrans.setBounds(-11, 0, 400, 600);

        hisBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PageBackground.png"))); // NOI18N
        historyPanel.add(hisBG);
        hisBG.setBounds(-1, 0, 740, 600);

        panelSettings.add(historyPanel, "card2");

        accountPanel.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tamil MN", 1, 48)); // NOI18N
        jLabel4.setText("My Account");
        accountPanel.add(jLabel4);
        jLabel4.setBounds(240, 40, 300, 50);

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setText("Username");
        accountPanel.add(jLabel12);
        jLabel12.setBounds(170, 190, 100, 40);

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel14.setText("Status");
        accountPanel.add(jLabel14);
        jLabel14.setBounds(170, 310, 100, 40);

        accStatField.setEditable(false);
        accountPanel.add(accStatField);
        accStatField.setBounds(300, 320, 270, 23);

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setText("Password");
        accountPanel.add(jLabel13);
        jLabel13.setBounds(170, 250, 100, 40);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("Name");
        accountPanel.add(jLabel11);
        jLabel11.setBounds(170, 130, 100, 40);
        accountPanel.add(accUsernameField);
        accUsernameField.setBounds(300, 200, 270, 23);
        accountPanel.add(accNameField);
        accNameField.setBounds(300, 140, 270, 23);

        inactiveBut.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        inactiveBut.setText("Inactivate Account");
        inactiveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactiveButActionPerformed(evt);
            }
        });
        accountPanel.add(inactiveBut);
        inactiveBut.setBounds(390, 410, 190, 30);

        defaultBut.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        defaultBut.setText("Reset To Default");
        defaultBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButActionPerformed(evt);
            }
        });
        accountPanel.add(defaultBut);
        defaultBut.setBounds(160, 410, 190, 30);

        changeBut.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        changeBut.setText("Save Changes");
        changeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButActionPerformed(evt);
            }
        });
        accountPanel.add(changeBut);
        changeBut.setBounds(280, 470, 180, 30);
        accountPanel.add(accPassField);
        accPassField.setBounds(300, 260, 270, 23);

        accTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SidebarTransition.png"))); // NOI18N
        accountPanel.add(accTrans);
        accTrans.setBounds(-11, 0, 400, 600);

        accBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PageBackground.png"))); // NOI18N
        accountPanel.add(accBG);
        accBG.setBounds(-1, 0, 740, 600);

        panelSettings.add(accountPanel, "card5");

        getContentPane().add(panelSettings);
        panelSettings.setBounds(170, 0, 730, 600);

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
        logoutBut.setBounds(-70, 290, 270, 40);

        accountBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        accountBut.setForeground(new java.awt.Color(242, 242, 242));
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogo.png"))); // NOI18N
        accountBut.setText(" Account");
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
        accountBut.setBounds(-60, 250, 260, 40);

        createBut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createBut.setForeground(new java.awt.Color(242, 242, 242));
        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddLogo.png"))); // NOI18N
        createBut.setText(" Create");
        createBut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createBut.setContentAreaFilled(false);
        createBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createButMouseExited(evt);
            }
        });
        createBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButActionPerformed(evt);
            }
        });
        getContentPane().add(createBut);
        createBut.setBounds(-70, 170, 270, 40);
        getContentPane().add(logoutBarPanel);
        logoutBarPanel.setBounds(0, 290, 170, 40);
        getContentPane().add(accountBarPanel);
        accountBarPanel.setBounds(0, 250, 170, 40);
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
        String target = "hisTeacher";
        hisTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        hisTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        hisTable.getColumnModel().getColumn(2).setPreferredWidth(60); 
        hisTable.getColumnModel().getColumn(3).setPreferredWidth(70);
        hisTable.getColumnModel().getColumn(4).setPreferredWidth(150); 
        hisTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        ProposalDao.proTable(userGet, target);
        
        //Table Customizer
        hisTable.getColumnModel().getColumn(2).setCellRenderer(new TableCustomizer());
        hisTable.getColumnModel().getColumn(3).setCellRenderer(new TableCustomizer());
        hisTable.getColumnModel().getColumn(4).setCellRenderer(new TableCustomizer());
              
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
        
        //Switch Subpage to Home Page
        switchs.show(panelSettings, "homePanel");
    }//GEN-LAST:event_homeButActionPerformed

     //Method which handles actions if the Create Switch Button is being clicked
    private void createButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButActionPerformed
        //Animation Settings for Create Button
        resetBut();
        createBar = 1;
        createBarPanel.setVisible(true);
        createBut.setEnabled(false);
        createBut.setContentAreaFilled(false);
        createBut.setForeground(Color.BLACK);
        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddLogoB.png")));
        
        //Switch Subpage to Create Page
        switchs.show(panelSettings, "createPanel");
    }//GEN-LAST:event_createButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void createButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButMouseEntered
        if (createBar != 1){
            createBut.setContentAreaFilled(true);
            createBut.setBorderPainted(false);
            createBut.setForeground(Color.BLACK);
            createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddLogoB.png")));
        }
    }//GEN-LAST:event_createButMouseEntered

    private void createButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButMouseExited
        if (createBar != 1){    
            createBut.setContentAreaFilled(false);
            createBut.setBorderPainted(true);
            createBut.setForeground(Color.WHITE);
            createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AddLogo.png")));
        }
    }//GEN-LAST:event_createButMouseExited

    //Method which handles actions if the Account Switch Button is being clicked
    private void accountButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButActionPerformed
        //Animation Settings for Account Button
        resetBut();
        accountBar = 1;
        accountBarPanel.setVisible(true);
        accountBut.setEnabled(false);
        accountBut.setContentAreaFilled(false);
        accountBut.setForeground(Color.BLACK);
        accountBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AccountLogoB.png")));
        
        //Account Page Fields Setup
        resetInfo();
        
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

    //Method which handles actions if Date To Month ComboBox is modified by the user
    private void monthToBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthToBoxActionPerformed
        //Get the value of the month selected by the user
        int monthIndex = monthToBox.getSelectedIndex();
        
        //Set the day date the user can select by iteration
        String d30 [] = new String [Integer.parseInt(dayTList[monthIndex])];
        for (int i = 0; i < d30.length; i++){
            d30[i] = Integer.toString(i+1);
        }
            
        //Insert the value of the iteration result to the Date To Day ComboBox
        DefaultComboBoxModel<String> dayModel = new DefaultComboBoxModel<>(d30);
        dayToBox.setModel(dayModel);
    }//GEN-LAST:event_monthToBoxActionPerformed

    //Method which handles actions if the Submit Button in Create Page is being clicked
    private void submitCreateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitCreateButActionPerformed
        if (!placeArea.getText().equals("") && !activitiesArea.getText().equals("") && !reasonArea.getText().equals("")){
            int confirm = JOptionPane.showConfirmDialog(null, "Your proposal is ready to be submitted. Are you sure you want to proceed?", "Confirmation of Proposal Submission", JOptionPane.YES_NO_OPTION);
            
            //If the user confirmed to submit, the proposal details will inserted into the database
            if (confirm == 0){  
                
                
                //Day Format Converter
                //Retrieve the day value from each ComboBox
                String dayF = (String) dayFromBox.getSelectedItem(), dayT = (String) dayToBox.getSelectedItem();
                
                //Change the format of value that only has 1 digit to add '0' besides it
                
                //Date From Day value
                if (dayF.length() == 1){
                    dayF = "0" + dayF;
                }
                //Date To Day value
                if (dayT.length() == 1){
                    dayT = "0" + dayT;
                }
                
                
                //Month Format Converter
                //Retrieve the month value from each ComboBox
                String monthFEx = (String) monthFromBox.getSelectedItem(), monthTEx = (String) monthToBox.getSelectedItem(), monthFConv = null, monthTConv = null;
                
                //Change the format of value that previously by name into numbers format
                
                //Date From Month value
                switch (monthFEx){
                    case "Jan": monthFConv = "01"; break;
                    case "Feb": monthFConv = "02"; break;
                    case "Mar": monthFConv = "03"; break;
                    case "Apr": monthFConv = "04"; break;
                    case "May": monthFConv = "05"; break;
                    case "Jun": monthFConv = "06"; break;    
                    case "Jul": monthFConv = "07"; break;
                    case "Aug": monthFConv = "08"; break;
                    case "Sep": monthFConv = "09"; break;
                    case "Oct": monthFConv = "10"; break;
                    case "Nov": monthFConv = "11"; break;
                    case "Dec": monthFConv = "12"; break;      
                }
                //Date To Month value
                switch (monthTEx){
                    case "Jan": monthTConv = "01"; break;
                    case "Feb": monthTConv = "02"; break;
                    case "Mar": monthTConv = "03"; break;
                    case "Apr": monthTConv = "04"; break;
                    case "May": monthTConv = "05"; break;
                    case "Jun": monthTConv = "06"; break;    
                    case "Jul": monthTConv = "07"; break;
                    case "Aug": monthTConv = "08"; break;
                    case "Sep": monthTConv = "09"; break;
                    case "Oct": monthTConv = "10"; break;
                    case "Nov": monthTConv = "11"; break;
                    case "Dec": monthTConv = "12"; break; 
                }
                
                
                //Merge the day, month, and year into a single date with '/' as the separator
                String dateFrom = dayF + "/" + monthFConv + "/" + (String) yearFromBox.getSelectedItem();
                String dateTo = dayT + "/" + monthTConv + "/" + (String) yearToBox.getSelectedItem();
                
                try {
                    //Proposal Submission Method
                    UserDao.subPro(userName, dateFrom, dateTo, placeArea.getText(), activitiesArea.getText(), reasonArea.getText());
                    JOptionPane.showMessageDialog(null, "Proposal submitted. Superiors be in touch soon.");
                    
                    //Reset the value assigned in each ComboBox and Fields
                    DefaultComboBoxModel<String> dayFModel = new DefaultComboBoxModel<>(new String[]{"D"});
                    DefaultComboBoxModel<String> dayTModel = new DefaultComboBoxModel<>(new String[]{"D"});
                    DefaultComboBoxModel<String> monthFModel = new DefaultComboBoxModel<>(new String[]{"Mon"});
                    DefaultComboBoxModel<String> monthTModel = new DefaultComboBoxModel<>(new String[]{"Mon"});
                    dayFromBox.setModel(dayFModel);
                    dayToBox.setModel(dayTModel);
                    monthFromBox.setModel(monthFModel);
                    monthToBox.setModel(monthTModel);
                    placeArea.setText("");
                    activitiesArea.setText("");
                    reasonArea.setText("");
                }
                
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error!");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please fill out all the required criteria.",  "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitCreateButActionPerformed

    //Method which handles actions if the Reset Button in Create Page is being clicked
    private void resetCreateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCreateButActionPerformed
        if (!placeArea.getText().equals("") || !activitiesArea.getText().equals("") || !reasonArea.getText().equals("")){    
            int confirm = JOptionPane.showConfirmDialog(null,"You are about to reset all entered data. Are you sure you want to proceed?", "Reset Confirmation", JOptionPane.YES_NO_OPTION);
                
            //If the user confirmed to reset, the assigned value will cleared
            if (confirm == 0){
                
                //Reset the value assigned in each ComboBox and Fields
                DefaultComboBoxModel<String> dayFModel = new DefaultComboBoxModel<>(new String[]{"D"});
                DefaultComboBoxModel<String> dayTModel = new DefaultComboBoxModel<>(new String[]{"D"});
                DefaultComboBoxModel<String> monthFModel = new DefaultComboBoxModel<>(new String[]{"Mon"});
                DefaultComboBoxModel<String> monthTModel = new DefaultComboBoxModel<>(new String[]{"Mon"});
                dayFromBox.setModel(dayFModel);
                dayToBox.setModel(dayTModel);
                monthFromBox.setModel(monthFModel);
                monthToBox.setModel(monthTModel);
                placeArea.setText("");
                activitiesArea.setText("");
                reasonArea.setText("");
           }
        }
    }//GEN-LAST:event_resetCreateButActionPerformed

    //Method which handles actions if Date From Year ComboBox is modified by the user
    private void yearFromBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFromBoxActionPerformed
        //Retrieve the value of the Date From Year Box and convert it into integer
        String yearBoxS = (String) yearFromBox.getSelectedItem();
        int yearBox = Integer.parseInt(yearBoxS);
        
        //Leap Year System, which the second month's days will only having 28 days if yearBox mod 4 is not 0
        if (yearBox % 4 != 0){
            dayFList[1] = "28";
        }
        else {
            dayFList[1] = "29";
        }
        
        //Day and Month From ComboBox Setup
        String[] monthList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        DefaultComboBoxModel<String> dayModel = new DefaultComboBoxModel<>(new String[]{"D"});
        DefaultComboBoxModel<String> monthModel = new DefaultComboBoxModel<>(monthList);
        dayFromBox.setModel(dayModel);
        monthFromBox.setModel(monthModel);
    }//GEN-LAST:event_yearFromBoxActionPerformed

    //Method which handles actions if Date From Month ComboBox is modified by the user
    private void monthFromBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFromBoxActionPerformed
        //Get the value of the month selected by the user
        int monthIndex = monthFromBox.getSelectedIndex();
        
        //Set the day date the user can select by iteration
        String d30 [] = new String [Integer.parseInt(dayFList[monthIndex])];
        for (int i = 0; i < d30.length; i++){
            d30[i] = Integer.toString(i+1);
        }
            
        //Insert the value of the iteration result to the Date To Day ComboBox
        DefaultComboBoxModel<String> dayModel = new DefaultComboBoxModel<>(d30);
        dayFromBox.setModel(dayModel);
    }//GEN-LAST:event_monthFromBoxActionPerformed

    //Method which handles actions if Date To Year ComboBox is modified by the user
    private void yearToBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearToBoxActionPerformed
        //Retrieve the value of the Date From Year Box and convert it into integer
        String yearBoxS = (String) yearToBox.getSelectedItem();
        int yearBox = Integer.parseInt(yearBoxS);
        
        //Leap Year System, which the second month's days will only having 28 days if yearBox mod 4 is not 0
        if (yearBox % 4 != 0){
            dayTList[1] = "28";
        }
        else {
            dayTList[1] = "29";
        }
        
        //Day and Month To ComboBox Setup
        String[] monthList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        DefaultComboBoxModel<String> dayTModel = new DefaultComboBoxModel<>(new String[]{"D"});
        DefaultComboBoxModel<String> monthTModel = new DefaultComboBoxModel<>(monthList);
        dayToBox.setModel(dayTModel);
        monthToBox.setModel(monthTModel);
    }//GEN-LAST:event_yearToBoxActionPerformed

    //Method which handles actions if the Reset to Default Button in Account Page is being clicked
    private void defaultButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultButActionPerformed
        if (!accNameField.getText().equalsIgnoreCase(userGet.getName()) || !accUsernameField.getText().equalsIgnoreCase(userGet.getUser()) || !accPassField.getText().equalsIgnoreCase(userGet.getPass())) {
            int confirm = JOptionPane.showConfirmDialog(null,"By clicking the button, all written data will restored to default. Proceed?", "Reset Confirmation", JOptionPane.YES_NO_OPTION);
            
            //If the user confirmed to reset, the assigned value will restored to default
            if (confirm == 0){
                resetInfo();
            }
        }
    }//GEN-LAST:event_defaultButActionPerformed

    //Method which handles actions if the Inactivate Account Button in Account Page is being clicked
    private void inactiveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactiveButActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"By inactivating your account, you will have to reverify it through your superior. Do you wish to continue the process?", "Delete Account Confirmation", JOptionPane.YES_NO_OPTION);
        
        //If the user confirmed to inactivate, the account used will be inactivated
        if (confirm == 0){
            
            //Retrieve the username of the user
            String acc = userGet.getUser();
            
            //Inactivate Method
            UserDao.inactivate(acc);
            
            //Direct the user into the Login Page
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_inactiveButActionPerformed

    //Method which handles actions if the Save Changes Button in Account Page is being clicked
    private void changeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButActionPerformed
        if (!accNameField.getText().equalsIgnoreCase(userGet.getName()) || !accUsernameField.getText().equalsIgnoreCase(userGet.getUser()) || !accPassField.getText().equalsIgnoreCase(userGet.getPass())) {
            int confirm = JOptionPane.showConfirmDialog(null,"By changing the account details, you have to reverify your account to the superior. Proceed?", "Changing Account Details Confirmation", JOptionPane.YES_NO_OPTION);
            
            //If the user confirmed to save changes, the account details will be changed
            if (confirm == 0){
                
                //Throwing new account details to the TransferDat class
                tf.setName(accNameField.getText());
                tf.setUser(accUsernameField.getText());
                tf.setPass(accPassField.getText());
                tf.setUC(userGet.getUC());
                
                //Updating Account Details Method
                UserDao.update(tf);
                
                //Direct the user into the Login Page
                setVisible(false);
                new LoginPage().setVisible(true);
            }
        }
    }//GEN-LAST:event_changeButActionPerformed

  
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
                new TeacherPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accBG;
    private javax.swing.JTextField accNameField;
    private javax.swing.JPasswordField accPassField;
    private javax.swing.JTextField accStatField;
    private javax.swing.JLabel accTrans;
    private javax.swing.JTextField accUsernameField;
    private javax.swing.JPanel accountBarPanel;
    private javax.swing.JButton accountBut;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JTextArea activitiesArea;
    private javax.swing.JButton changeBut;
    private javax.swing.JLabel createBG;
    private javax.swing.JPanel createBarPanel;
    private javax.swing.JButton createBut;
    private javax.swing.JPanel createPanel;
    private javax.swing.JLabel createTrans;
    private javax.swing.JComboBox<String> dayFromBox;
    private javax.swing.JComboBox<String> dayToBox;
    private javax.swing.JButton defaultBut;
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
    private javax.swing.JButton inactiveBut;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoutBarPanel;
    private javax.swing.JButton logoutBut;
    private javax.swing.JComboBox<String> monthFromBox;
    private javax.swing.JComboBox<String> monthToBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel panelSettings;
    private javax.swing.JTextArea placeArea;
    private javax.swing.JTextArea reasonArea;
    private javax.swing.JButton resetCreateBut;
    private javax.swing.JLabel sidebarLabel;
    private javax.swing.JLabel statLabel;
    private javax.swing.JButton submitCreateBut;
    private javax.swing.JLabel userInfo;
    private javax.swing.JComboBox<String> yearFromBox;
    private javax.swing.JComboBox<String> yearToBox;
    // End of variables declaration//GEN-END:variables
}
