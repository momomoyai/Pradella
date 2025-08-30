//File Location (inside package dao)
package dao;

//Import packages and classes
import java.sql.*;

public class ConProv {
    
    //Method for initializating connection to the database
    public static Connection getCon(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pradelladb?useSSL=false", "root", "");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}