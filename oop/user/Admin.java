package oop.user;

import java.io.*;
import oop.user.*;
import java.util.*;

public class Admin extends Person {
	// Attributes
    public static final int attrbsCount = 7;
    private static int count = 0;
    public ArrayList<String> attribs;
    private String adminID;
    private String password;
    private int adminCount;

    // Constructor
    public Admin() {
        count++;        
        adminCount = count;
    }

    public Admin(ArrayList<String> attribs) {
        this.attribs = attribs;
        count++;
        setAdminCount(Integer.parseInt(attribs.get(0)));
        setName(attribs.get(1));
        setEmail(attribs.get(2));
        setAddress(attribs.get(3));
        setPhone(attribs.get(4).toCharArray());
        setAdminID(attribs.get(5));
        setPassword(attribs.get(6));
    }

    // Mutator methods
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void setAdminCount(int adminCount) {
        this.adminCount = adminCount;
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

    public int getAdminCount() {
        return adminCount;
    }

    // toString Method
    @Override
    public String toString() {
        return "Admin " + adminCount +
               "\nname = " + getName() +
               "\nemail = " + getEmail() +
               "\naddress = " + getAddress() +
               "\nphone = " + getPhone() +
               "\nadminID = " + adminID +
               "\npassword = " + password
    }
}
