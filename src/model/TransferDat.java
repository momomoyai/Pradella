//File Location (inside package model)
package model;

public class TransferDat {
    private String name;
    private String username;
    private String password;
    private String uniquecode;

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
    public void setUser(String username) {
        this.username = username;
    }
    
    //Getter and Setter of the password of the user
    public String getPass() {
        return password;
    }
    public void setPass(String password) {
        this.password = password;
    }
    
    //Getter and Setter of the unique code of the user
    public String getUC() {
        return uniquecode;
    }
    public void setUC(String uniquecode) {
        this.uniquecode = uniquecode;
    }
}