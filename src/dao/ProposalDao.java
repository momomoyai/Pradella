//File Location (inside package dao)
package dao;

//Import packages and classes
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UserGet;
import pradella.SuperiorPage;

public class ProposalDao {
    
    //Method to set history table from TeacherPage or SuperiorPage
    public static void proTable(UserGet user, String target){
        String query = "";
        
        //hisTeacher = Teacher-HistoryPage Table
        if (target.equals("hisTeacher")){
            query = "select * from proposal where Name = '"+user.getName()+"';";
        }
        
        //hisSuperior = Superior-HistoryPage Table
        else if (target.equals("hisSuperior")){
            query = "select * from proposal;";
        }
        Operation.setTableHIS(query, target);
    }
    
    //Method to set Superior-CheckPage Table
    public static void checkTable(){
        String query = "select * from proposal where Status = 'Waiting';";
        String target = "checkTable";
        Operation.setTable(query, target);
    }
    
    //Method to change the status of proposal from 'Waiting' to 'Approved' in Superior-CheckPage
    public static void approve(String PID){
        String query = "UPDATE PROPOSAL SET Status = 'Approved' WHERE PID = "+PID+";";
        Operation.setDataorDelete(query, "The proposal is approved successfully!");
    }
    
    //Method to change the status of proposal from 'Waiting' to 'Rejected' in Superior-CheckPage
    public static void reject(String PID){
        String query = "UPDATE PROPOSAL SET Status = 'Rejected' WHERE PID = "+PID+";";
        Operation.setDataorDelete(query, "The proposal is rejected successfully!");
    }
    
    //Method to delete specific proposal history based on the Proposal ID (PID)
    public static void delete(String PID){
        String query = "DELETE FROM PROPOSAL WHERE PID = '"+PID+"';";
        Operation.setDataorDelete(query, "The proposal has been deleted successfully!");
    }
    
    //Method to run the search feature based on the variable and text
    //var = Variable used to search by; field = The field used by the user to search for; category = The page asked for search performance
    public static void search(String var, String field, String category){
        try{
            ResultSet rs;
            if (field.equals("")){
                rs = Operation.getData("SELECT * FROM PROPOSAL;");
            }
            else{
                rs = Operation.getData("SELECT * FROM PROPOSAL WHERE "+var+" LIKE '%"+field+"%';");
            }
            ResultSetMetaData rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = null;
            
            //checkTable = Superior-CheckPage Table
            if (category.equals("checkTable")){
                df = (DefaultTableModel) SuperiorPage.checkTable.getModel();
            }
            
            //hisTable = Superior-HistoryPage Table
            else if (category.equals("hisTable")){
                df = (DefaultTableModel) SuperiorPage.hisTable.getModel();
            }
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
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}