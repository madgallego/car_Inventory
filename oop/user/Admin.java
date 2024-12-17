package oop.user;

import java.util.*;

public class Admin extends Person {
    // Attributes
    public static final int attribsCount = 6;
    private static int count = 0;

    private String adminID;
    private String password;

    // Default Constructor
    public Admin() {}

    // Parameterized Constructor
    public Admin(ArrayList<String> attribs) {
        if (attribs.size() != attribsCount) {
            throw new IllegalArgumentException("Invalid number of attributes for Admin.");
        }
        setName(attribs.get(0));
        setEmail(attribs.get(1));
        setAddress(attribs.get(2));
        setPhone(attribs.get(3).toCharArray());
        setAdminID(attribs.get(4));
        setPassword(attribs.get(5));
        count++;
    }

    // Static Methods for Count Management
    public static void setCount(int temp) {
        count = temp;
    }

    public static int getCount() {
        return count;
    }

    // Mutator Methods
    public void setAdminID(String adminID) {
        if (adminID != null && !adminID.isEmpty()) {
            this.adminID = adminID;
        } else {
            throw new IllegalArgumentException("Admin ID cannot be empty.");
        }
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        }
    }

    // Accessor Methods
    public String getAdminID() {
        return adminID;
    }

    public String getPassword() {
        return password;
    }

    // Method to verify login using name and password
    public static boolean authName(ArrayList<Admin> adminList, String name, String password) {
        if (name == null || password == null) return false;

        Iterator<Admin> iterator = adminList.iterator();
        while (iterator.hasNext()) {
            Admin admin = iterator.next();
            if (admin.getName().equals(name) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method to verify login using email and password
    public static boolean authEmail(ArrayList<Admin> adminList, String email, String password) {
        if (email == null || password == null) return false;

        Iterator<Admin> iterator = adminList.iterator();
        while (iterator.hasNext()) {
            Admin admin = iterator.next();
            if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method to verify login using phone and password
    public static boolean authPhone(ArrayList<Admin> adminList, String phone, String password) {
        if (phone == null || password == null) return false;

        Iterator<Admin> iterator = adminList.iterator();
        while (iterator.hasNext()) {
            Admin admin = iterator.next();
            if (admin.getPhone().equals(phone) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Method to verify login using ID and password
    public static boolean authID(ArrayList<Admin> adminList, String id, String password) {
        if (id == null || password == null) return false;

        Iterator<Admin> iterator = adminList.iterator();
        while (iterator.hasNext()) {
            Admin admin = iterator.next();
            if (admin.getAdminID().equals(id) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


    // toString Method
    @Override
    public String toString() {
        return "Admin " +
               "\nname = " + getName() +
               "\nemail = " + getEmail() +
               "\naddress = " + getAddress() +
               "\nphone = " + getPhone() +
               "\nadminID = " + adminID +
               "\npassword = " + password;
    }
}
