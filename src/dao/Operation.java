//File Location (inside package dao)
package dao;

//Import packages and classes
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import pradella.TeacherPage;
import pradella.SuperiorPage;
import javax.swing.table.DefaultTableModel;

public class Operation {
    
    //Method to manipulate data based on the query passed from other classes
    public static void setDataorDelete(String query, String msg) {
        try {
            Connection con = ConProv.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(query);
            if (!msg.equals("")) {
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Method to get specific data based on the query passed and return to the specific class
    public static ResultSet getData(String query){
        try{
            Connection con = ConProv.getCon();
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
        
    //Method to set specific table based on the target variable passed and get specific data for the table based on the query passed
    public static void setTable(String query, String target){
        try {
            Connection con = ConProv.getCon();
            PreparedStatement insert = con.prepareStatement(query);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df;
            
            switch (target){
                
                //Superior-CheckPage Table
                case "checkTable":
                    df = (DefaultTableModel) SuperiorPage.checkTable.getModel();
                    df.setRowCount(0);
            
                    while(rs.next()){
                        Vector vec = new Vector();
                        for (int i=1;i<=c;i++){
                            vec.add(rs.getString("PID"));
                            vec.add(rs.getString("Name"));
                            vec.add(rs.getString("dFrom"));
                            vec.add(rs.getString("dTo"));
                            vec.add(rs.getString("Place"));
                            vec.add(rs.getString("Activity"));
                            vec.add(rs.getString("Reason"));
                            vec.add(rs.getString("Status"));
                        }
                        df.addRow(vec);
                    }
                    break;
                    
                //Superior-AccountPage Table
                case "accTable":
                    df = (DefaultTableModel) SuperiorPage.accTable.getModel();
                    df.setRowCount(0);
            
                    while(rs.next()){
                        Vector vec = new Vector();
                        for (int i=1;i<=c;i++){
                            vec.add(rs.getString("Name"));
                            vec.add(rs.getString("Username"));
                            vec.add(rs.getString("Password"));
                            vec.add(rs.getString("Status"));
                            vec.add(rs.getString("Activation"));
                            vec.add(rs.getString("UniqueCode"));
                        }
                        df.addRow(vec);
                    }
                    break;
                
                case "activateTable":
                    df = (DefaultTableModel) SuperiorPage.activateTable.getModel();
                    df.setRowCount(0);
            
                    while(rs.next()){
                        Vector vec = new Vector();
                        for (int i=1;i<=c;i++){
                            vec.add(rs.getString("Name"));
                            vec.add(rs.getString("Username"));
                            vec.add(rs.getString("Password"));
                            vec.add(rs.getString("Status"));
                        }
                        df.addRow(vec);
                    }
                    break;
            }
    }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Method to set Teacher-HistoryPage and Superior-HistoryPage Table based on the target passed
    public static void setTableHIS(String query, String target){
        try {
            Connection con = ConProv.getCon();
            PreparedStatement insert = con.prepareStatement(query);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            
            if (target.equals("hisTeacher")){
                DefaultTableModel df = (DefaultTableModel) TeacherPage.hisTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("dFrom"));
                        vec.add(rs.getString("dTo"));
                        vec.add(rs.getString("Place"));
                        vec.add(rs.getString("Activity"));
                        vec.add(rs.getString("Reason"));
                        vec.add(rs.getString("Status"));
                    }
                    df.addRow(vec);
                }
            }
            else if (target.equals("hisSuperior")){
                DefaultTableModel df = (DefaultTableModel) SuperiorPage.hisTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("PID"));
                        vec.add(rs.getString("Name"));
                        vec.add(rs.getString("dFrom"));
                        vec.add(rs.getString("dTo"));
                        vec.add(rs.getString("Place"));
                        vec.add(rs.getString("Activity"));
                        vec.add(rs.getString("Reason"));
                        vec.add(rs.getString("Status"));
                    }
                    df.addRow(vec);
                }
            }
    }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Method to get the name of the account user
    public static ResultSet getName(String query){
        try{
            Connection con = ConProv.getCon();
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            return rs;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    //Method to update specific table based on the target variable passed and get specific data for the table based on the query passed
    public void tableUpdate(String target){
        try {
            Connection con = ConProv.getCon();
            PreparedStatement insert;
            ResultSet rs;
            ResultSetMetaData rsm;
            DefaultTableModel df;
            int c;
            switch (target){
                case "activateTable":
                insert = con.prepareStatement("select * from user where Activation = 'Inactive'");
                rs = insert.executeQuery();
                rsm = rs.getMetaData();
                c = rsm.getColumnCount();
            
                df = (DefaultTableModel)SuperiorPage.activateTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("Name"));
                        vec.add(rs.getString("Username"));
                        vec.add(rs.getString("Password"));
                        vec.add(rs.getString("Status"));
                    }
                    df.addRow(vec);
                }
                break;
                
                case "accTable":
                insert = con.prepareStatement("select * from user");
                rs = insert.executeQuery();
                rsm = rs.getMetaData();
                c = rsm.getColumnCount();
            
                df = (DefaultTableModel)SuperiorPage.accTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("Name"));
                        vec.add(rs.getString("Username"));
                        vec.add(rs.getString("Password"));
                        vec.add(rs.getString("Status"));
                        vec.add(rs.getString("Activation"));
                        vec.add(rs.getString("UniqueCode"));
                    }
                    df.addRow(vec);
                }
                break;
                
                case "checkTable":
                insert = con.prepareStatement("select * from proposal where Status = 'Waiting';");
                rs = insert.executeQuery();
                rsm = rs.getMetaData();
                c = rsm.getColumnCount();
            
                df = (DefaultTableModel)SuperiorPage.checkTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("PID"));
                        vec.add(rs.getString("Name"));
                        vec.add(rs.getString("dFrom"));
                        vec.add(rs.getString("dTo"));
                        vec.add(rs.getString("Place"));
                        vec.add(rs.getString("Activity"));
                        vec.add(rs.getString("Reason"));
                    }
                    df.addRow(vec);
                }
                break;
                
                case "hisTable":
                insert = con.prepareStatement("select * from proposal;");
                rs = insert.executeQuery();
                rsm = rs.getMetaData();
                c = rsm.getColumnCount();
            
                df = (DefaultTableModel)SuperiorPage.hisTable.getModel();
                df.setRowCount(0);
            
                while(rs.next()){
                    Vector vec = new Vector();
                    for (int i=1;i<=c;i++){
                        vec.add(rs.getString("PID"));
                        vec.add(rs.getString("Name"));
                        vec.add(rs.getString("dFrom"));
                        vec.add(rs.getString("dTo"));
                        vec.add(rs.getString("Place"));
                        vec.add(rs.getString("Activity"));
                        vec.add(rs.getString("Reason"));
                        vec.add(rs.getString("Status"));
                    }
                    df.addRow(vec);
                }
                break;
                
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
            }
    }
}