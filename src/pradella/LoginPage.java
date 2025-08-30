//File Location (inside package pradella)
package pradella;

//Import packages and classes
import dao.UserDao;
import javax.swing.JOptionPane;
import model.UserGet;

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    /* Start of NetBeans GUI-Builder Generated Code */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passField = new javax.swing.JPasswordField();
        userField = new javax.swing.JTextField();
        loginBut = new javax.swing.JButton();
        signupBut = new javax.swing.JButton();
        loginImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pradella");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(passField);
        passField.setBounds(150, 230, 180, 30);
        getContentPane().add(userField);
        userField.setBounds(150, 190, 180, 30);

        loginBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LoginButton.png"))); // NOI18N
        loginBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButMouseExited(evt);
            }
        });
        loginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButActionPerformed(evt);
            }
        });
        getContentPane().add(loginBut);
        loginBut.setBounds(80, 300, 200, 50);

        signupBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SignUpButton.png"))); // NOI18N
        signupBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButMouseExited(evt);
            }
        });
        signupBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButActionPerformed(evt);
            }
        });
        getContentPane().add(signupBut);
        signupBut.setBounds(100, 500, 160, 40);

        loginImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginPages.png"))); // NOI18N
        getContentPane().add(loginImg);
        loginImg.setBounds(0, 0, 1010, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* End of NetBeans GUI-Builder Generated Code */
    
    //Method that handles if Sign Up Button being clicked
    private void signupButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButActionPerformed
        new SignupPage().setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_signupButActionPerformed

    //Method that handles if Login Button being clicked
    private void loginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButActionPerformed
        String username = userField.getText();
        String password = passField.getText();
        String activation;
        UserGet user;
        user = UserDao.login(username, password);
        if (user == null){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or Password</b><html>");
            userField.setText("");
            passField.setText("");
            userField.requestFocus();
        }
        else {
            activation = UserDao.getAct(username);
            if (!activation.equals("Inactive")){
                JOptionPane.showMessageDialog(null, "Login Success!");
                String checkStat = UserDao.getStat(username);
                if (checkStat.equals("Teacher")){
                    new TeacherPage(username).setVisible(true);
                    this.setVisible(false);
                }
                else if (checkStat.equals("Superior")){
                    new SuperiorPage(username).setVisible(true);
                    this.setVisible(false);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Your account is not activated. Please contact the superior to verify your account.");
                userField.setText("");
                passField.setText("");
                userField.requestFocus();
            }
        }
    }//GEN-LAST:event_loginButActionPerformed

    //Methods which handle the animation of the button when the cursor is entering or exiting the button
    private void loginButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButMouseEntered
        loginBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LoginButtonTrig.png")));
    }//GEN-LAST:event_loginButMouseEntered

    private void loginButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButMouseExited
        loginBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LoginButton.png")));
    }//GEN-LAST:event_loginButMouseExited

    private void signupButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButMouseEntered
        signupBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SignUpButtonTrig.png")));
    }//GEN-LAST:event_signupButMouseEntered

    private void signupButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButMouseExited
        signupBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SignUpButton.png")));
    }//GEN-LAST:event_signupButMouseExited

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBut;
    private javax.swing.JLabel loginImg;
    private javax.swing.JPasswordField passField;
    private javax.swing.JButton signupBut;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
