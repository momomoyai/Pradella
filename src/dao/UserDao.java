//File Location (inside package dao)
package dao;

//Import packages and classes
import javax.swing.JOptionPane;
import model.UserGet;
import pradella.SignupPage;
import java.sql.*;
import model.TransferDat;

public class UserDao {
    
    //Method that handles the mechanism of registration for new accounts
    public static void save(UserGet user){
        String query = "INSERT INTO user(Name,Username,Password,Status) values('"+user.getName()+"','"+user.getUser()+"','"+user.getPass()+"','"+user.getStat()+"')";
        Operation.setDataorDelete(query, "Your account has been registered!");
        SignupPage.nameField.setText("");
        SignupPage.cuserField.setText("");
        SignupPage.cpassField.setText("");
        SignupPage.cpassField1.setText("");
        SignupPage.cstatGroup.clearSelection();
    }
    
    //Method to activate accounts by changing the status of account from 'Inactive' to 'Active'
    public static void activate(String accuser){
        String query = "UPDATE USER SET Activation = 'Active' WHERE Username = '"+accuser+"'";
        Operation.setDataorDelete(query, "The account has been activated successfully!");
    }
    
    //Method to inactivate accounts by changing the status of account from 'Active' to 'Inactive'
    public static void inactivate(String accuser){
        String query = "UPDATE USER SET Activation = 'Inactive' WHERE Username = '"+accuser+"'";
        Operation.setDataorDelete(query, "The account has been inactivated successfully!");
    }
    
    //Method to update accounts with status 'Teacher', which causes accounts to be inactivated after the update
    public static void update(TransferDat tf){
        int uc = Integer.parseInt(tf.getUC());
        String query = "UPDATE USER SET Name = '"+tf.getName()+"', Username = '"+tf.getUser()+"', Password = '"+tf.getPass()+"', Activation = 'Inactive' WHERE UniqueCode = "+uc+";";
        Operation.setDataorDelete(query, "Your account has been updated successfully!");
    }
    
    //Method to update accounts with status 'Superior' without inactivating the account
    public static void updateS(TransferDat tf){
        int uc = Integer.parseInt(tf.getUC());
        String query = "UPDATE USER SET Name = '"+tf.getName()+"', Username = '"+tf.getUser()+"', Password = '"+tf.getPass()+"', Activation = 'Active' WHERE UniqueCode = "+uc+";";
        Operation.setDataorDelete(query, "Your account has been updated successfully!");
    }
    
    //Method to delete accounts from the database
    public static void delete(String acc){
        String query = "DELETE FROM USER WHERE Username = '"+acc+"'";
        Operation.setDataorDelete(query, "Your account has been deleted successfully!");
    }
    
    //Method to handles attempts of login from the user by checking the vailidity of data inserted by the user and return the result
    public static UserGet login(String username, String password){
        UserGet user = null;
        try{
            ResultSet rs = Operation.getData("select * from user where Username = '"+username+"' and Password = '"+password+"';");
            while(rs.next()){
                user = new UserGet();   
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    
    //Method to get the name of the account user
    public static String getName(String username){
        String name = null;
        try{
            ResultSet rs = Operation.getData("select Name from user where Username = '"+username+"';");
            while(rs.next()){
                name = rs.getString("Name");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return name;
    }
    
    //Method to get the activation status of the account
    public static String getAct(String username){
        String act = null;
        try{
            ResultSet rs = Operation.getData("select Activation from user where Username = '"+username+"';");
            while(rs.next()){
                act = rs.getString("Activation");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return act;
    }
    
    //Method to get the status of the account (Teacher or Superior)
    public static String getStat(String username){
        String stat = null;
        try{
            ResultSet rs = Operation.getData("select Status from user where Username = '"+username+"';");
            while(rs.next()){
                stat = rs.getString("Status");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return stat;
    }
    
    //Method to set the details of user's account in UserGet class
    public UserGet setData(UserGet userGet){
        String name, acc, pass, stat, uc;
        try{
            ResultSet rs = Operation.getData("select * from user where Username = '"+userGet.getUser()+"';");
            while(rs.next()){
                name = rs.getString("Name");
                acc = rs.getString("Username");
                pass = rs.getString("Password");
                stat = rs.getString("Status");
                uc = rs.getString("UniqueCode");
                userGet.setName(name);
                userGet.setUser(acc);
                userGet.setPass(pass);
                userGet.setStat(stat);
                userGet.setUC(uc);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return userGet;
    }
    
    //Method to insert new proposal data to the database
    public static String subPro(String name, String dFrom, String dTo, String place, String act, String reason){
        try{
            String query = "INSERT INTO proposal(Name,dFrom,dTo,Place,Activity,Reason,Status) values('"+name+"','"+dFrom+"','"+dTo+"','"+place+"','"+act+"','"+reason+"','Waiting')";
            Operation.setDataorDelete(query, "");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
    //Method to set the Superior-AccountPage Table
    public static void accTable(){
        try{
            String query = "select * from user";
            String target = "accTable";
            Operation.setTable(query, target);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //Method to set the Superior-CheckPage Table
    public static void actTable(){
        try{
            String query = "select * from user where Activation = 'Inactive'";
            String target = "activateTable";
            Operation.setTable(query, target);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
