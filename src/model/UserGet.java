//File Location (inside package model)
package model;

public class UserGet {
    private String name;
    private String username;
    private String password;
    private String status;
    private String uniqueCode;

    //Getter and Setter of the name of the user
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //Getter and Setter of the username of the user
    public String getUser() {
        return username;
    }
    public void setUser(String user) {
        this.username = user;
    }
    
    //Getter and Setter of the password of the user
    public String getPass() {
        return password;
    }
    public void setPass(String pass) {
        this.password = pass;
    }
    
    //Getter and Setter of the status of the user
    public String getStat() {
        return status;
    }
    public void setStat(String stat) {
        this.status = stat;
    }
    
    //Getter and Setter of the unique code of the user
    public String getUC() {
        return uniqueCode;
    }
    public void setUC(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

}