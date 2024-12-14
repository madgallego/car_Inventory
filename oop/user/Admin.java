package oop.user;

import java.io.*;
import oop.user.*;

public class Admin extends Person {
    // Attributes
    private static int count = 0;
    private String adminID;
    private String password;

    // Constructor
    public Admin() {
        count++;
    }

    // Mutator methods
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Accessor methods
    public String getAdminID() {
        return adminID;
    }

    public String getPassword() {
        return password;
    }

    public static int getCount() {
        return count;
    }

    // toString Method
    @Override
    public String toString() {
        return "Admin {" +
               "name = '" + getName() + '\'' +
               ", email = '" + getEmail() + '\'' +
               ", address = '" + getAddress() + '\'' +
               ", phone = " + getPhone() +
               ", adminID = '" + adminID + '\'' +
               ", password = '" + password + '\'' +
               ", total admins = " + count +
               '}';
    }
}
