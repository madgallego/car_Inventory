package oop.utils;

import oop.user.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Admin> adminList = UserLoader.loadAdmin("./oop/database/User/Admin.txt");

        // Input Admin Details in 2 cases:
        System.out.println("\nEnter New Admin Details:");
        System.out.print("\nAdmin Name: ");
        String name = s.nextLine();
        System.out.print("Admin Email: ");
        String email = s.nextLine();
        System.out.print("Admin Address: ");
        String address = s.nextLine();
        System.out.print("Admin Phone Number: ");
        String phone = s.nextLine();
        System.out.print("Admin ID: ");
        String id = s.nextLine();
        System.out.print("Admin Password: ");
        String password = s.nextLine();

        // Case 1: Add a new Admin using the UserLoader
        UserLoader.addAdmin(adminList, name, email, address, phone, id, password);

        Admin admin = new Admin();
        System.out.println("\nEnter Second Admin Details:");
        System.out.print("Admin Name: ");
        admin.setName(s.nextLine());
        System.out.print("Admin Email: ");
        admin.setEmail(s.nextLine());
        System.out.print("Admin Address: ");
        admin.setAddress(s.nextLine());
        System.out.print("Admin Phone Number: ");
        admin.setPhone(s.nextLine().toCharArray());
        System.out.print("Admin ID: ");
        admin.setAdminID(s.nextLine());
        System.out.print("Admin Password: ");
        admin.setPassword(s.nextLine());

        // Case 2: Add a new Admin object directly
        UserLoader.addAdmin(adminList, admin); 

        // Test login verification
        String user, pw;
        System.out.println("\nLOG IN");
        System.out.print("Admin (name): ");
        user = s.nextLine();        
        System.out.print("Password: ");
        pw = s.nextLine();

        // Verify using name and password
        if(Admin.authName(adminList, user, pw)) {
            System.out.println("Verified");
        } else { 
            System.out.println("Invalid name or password.");
        }

        System.out.println("\nLOG IN");
        System.out.print("Admin (email): ");
        user = s.nextLine();        
        System.out.print("Password: ");
        pw = s.nextLine();

        // Verify using email and password
        if(Admin.authEmail(adminList, user, pw)) {
            System.out.println("Verified");
        } else { 
            System.out.println("Invalid email or password.");
        }

        System.out.println("\nLOG IN");
        System.out.print("Admin (phone): ");
        user = s.nextLine();        
        System.out.print("Password: ");
        pw = s.nextLine();

        // Verify using phone and password
        if(Admin.authPhone(adminList, user, pw)) {
            System.out.println("Verified");
        } else { 
            System.out.println("Invalid phone number or password.");
        }

        System.out.println("\nLOG IN");
        System.out.print("Admin (ID): ");
        user = s.nextLine();        
        System.out.print("Password: ");
        pw = s.nextLine();

        // Verify using ID and password
        if(Admin.authID(adminList, user, pw)) {
            System.out.println("Verified");
        } else { 
            System.out.println("Invalid ID or password.");
        }
    }
}