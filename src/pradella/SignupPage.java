//File Location (inside package pradella)
package pradella;

//Import packages and classes
import dao.UserDao;
import model.UserGet;
import javax.swing.JOptionPane;

public class SignupPage extends javax.swing.JFrame {
    
    //Initiation of the variable
    String statData;

    public SignupPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /* Start of NetBeans GUI-Builder Generated Code */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cstatGroup = new javax.swing.ButtonGroup();
        cuserField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        cpassField = new javax.swing.JPasswordField();
        cpassField1 = new javax.swing.JPasswordField();
        cstatBut1 = new javax.swing.JRadioButton();
        cstatBut = new javax.swing.JRadioButton();
        createBut = new javax.swing.JButton();
        backBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pradella");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);
        getContentPane().add(cuserField);
        cuserField.setBounds(50, 280, 180, 30);
        getContentPane().add(nameField);
        nameField.setBounds(50, 220, 400, 30);
        getContentPane().add(cpassField);
        cpassField.setBounds(50, 340, 180, 30);
        getContentPane().add(cpassField1);
        cpassField1.setBounds(270, 340, 180, 30);

        cstatGroup.add(cstatBut1);
        cstatBut1.setForeground(new java.awt.Color(255, 255, 255));
        cstatBut1.setText("Superior");
        cstatBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstatBut1ActionPerformed(evt);
            }
        });
        getContentPane().add(cstatBut1);
        cstatBut1.setBounds(270, 430, 120, 20);

        cstatGroup.add(cstatBut);
        cstatBut.setForeground(new java.awt.Color(255, 255, 255));
        cstatBut.setText("Teacher");
        cstatBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstatButActionPerformed(evt);
            }
        });
        getContentPane().add(cstatBut);
        cstatBut.setBounds(130, 430, 120, 20);

        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CreateButtonCS.png"))); // NOI18N
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
        createBut.setBounds(280, 490, 160, 40);

        backBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackButtonCS.png"))); // NOI18N
        backBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButMouseExited(evt);
            }
        });
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });
        getContentPane().add(backBut);
        backBut.setBounds(70, 490, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Status:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 390, 110, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 90, 230, 80);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 310, 170, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name (with degree) :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 190, 190, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username (max. 18 char) :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 250, 200, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password (max. 18 char) :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 310, 200, 30);

        signupImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Signup Page.png"))); // NOI18N
        getContentPane().add(signupImg);
        signupImg.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* End of NetBeans GUI-Builder Generated Code */
    
    //Method which catches the status selection of the new account and reinterpret it as a string text
    private void cstatBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstatBut1ActionPerformed
        if (cstatBut1.isSelected()){
            statData = cstatBut1.getText();
        }
    }//GEN-LAST:event_cstatBut1ActionPerformed

    //Method which handles actions if the Back Button is being clicked
    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        new LoginPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButActionPerformed

    //Method which handles actions if the Create Button is being clicked
    private void createButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButActionPerformed
        if (!nameField.getText().equals("") && !cuserField.getText().equals("") && !cpassField.getText().equals("") && !cpassField1.getText().equals("") && cstatGroup.getSelection() != null){
            if (cpassField.getText().equals(cpassField1.getText())){
                UserGet user = new UserGet();
                user.setName(nameField.getText());
                user.setUser(cuserField.getText());
                user.setPass(cpassField.getText());
                user.setStat(statData);
                UserDao.save(user);
                new LoginPage().setVisible(true);
                this.setVisible(false);
        }
            else {
                JOptionPane.showMessageDialog(null, "The entered password and the confirm password field do not match.",  "Message", JOptionPane.ERROR_MESSAGE);
                cpassField.setText("");
                cpassField1.setText("");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please fill out all the required criteria.",  "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createButActionPerformed

    //Method which catches the status selection of the new account and reinterpret it as a string text
    private void cstatButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstatButActionPerformed
        if (cstatBut.isSelected()){
            statData = cstatBut.getText();
        }
    }//GEN-LAST:event_cstatButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void backButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButMouseEntered
        backBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackButtonCSTrig.png")));
    }//GEN-LAST:event_backButMouseEntered

    private void backButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButMouseExited
        backBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BackButtonCS.png")));
    }//GEN-LAST:event_backButMouseExited

    private void createButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButMouseEntered
        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CreateButtonCSTrig.png")));
    }//GEN-LAST:event_createButMouseEntered

    private void createButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButMouseExited
        createBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CreateButtonCS.png")));
    }//GEN-LAST:event_createButMouseExited

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
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBut;
    public static javax.swing.JPasswordField cpassField;
    public static javax.swing.JPasswordField cpassField1;
    private javax.swing.JButton createBut;
    private javax.swing.JRadioButton cstatBut;
    private javax.swing.JRadioButton cstatBut1;
    public static javax.swing.ButtonGroup cstatGroup;
    public static javax.swing.JTextField cuserField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JTextField nameField;
    private javax.swing.JLabel signupImg;
    // End of variables declaration//GEN-END:variables
}
