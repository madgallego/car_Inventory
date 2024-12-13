package oop.person;

public class Admin extends Person {
    //Attributes
    private static int adminCount = 0;
    private String adminID;
    private String password;

    //Constructor
    public Admin() {
        adminCount++;
    }

    //Mutator methods
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public void setPassword(String password) {
        this.password = passwor;
    }

    //Accessor method
}