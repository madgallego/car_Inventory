package oop.utils;

import oop.user.*;
import oop.car.*;
import java.io.*;
import java.util.*;

/*public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Admin> adminList = UserLoader.loadAdmin(UserLoader.ADMIN_FILE);

        // Test login verification
        System.out.println("\nLOG IN");
        System.out.print("Admin (name): ");
        String user = s.nextLine();        
        System.out.print("Password: ");
        String pw = s.nextLine();

        // Verify using name and password
        if(Admin.authName(adminList, user, pw)) {
            System.out.println("Verified");
        } else { 
            System.out.println("Invalid name or password.");
        }

        System.out.println(Admin.loggedIn(adminList, user, pw)); //loggedIn returns Admin obj, then printed.

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
}*/

public class Test {
    public static void main(String[] args) {
        ArrayList<Client> clientList = UserLoader.loadClient();

        for (Client clnt : clientList) {
            System.out.println(clnt);
        }     

        Scanner s = new Scanner(System.in);
        ArrayList<Admin> adminList = UserLoader.loadAdmin();

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

        Admin admin = Admin.loggedIn(adminList, user, pw);

        ArrayList<SUV> c = CarLoader.loadSUV("Toyota");
        Client client = new Client();

        // Input Client Details
        System.out.println("\nEnter Client Details:");
        System.out.print("Client Name: ");
        client.setName(s.nextLine());
        System.out.print("Client Email: ");
        client.setEmail(s.nextLine());
        System.out.print("Client Address: ");
        client.setAddress(s.nextLine());
        System.out.print("Client Phone Number: ");
        client.setPhone(s.nextLine().toCharArray());
        client.setProduct(c.get(0)); //the first car from the list      
        
        System.out.print("\n1. Cash\n2. Cash/Installment\n3. Card/Credit\n4. Card/Debit\n5. Cheque\n6. Digital Wallet\n\nClient Payment Method: ");
        int ch = s.nextInt();
        s.nextLine();
        client.setPaymentMethod(ch);
        if(ch == 3 || ch == 4 || ch == 5 || ch == 6) {
            System.out.print("Transaction reference number (digits only): ");
            client.setRefNum(s.nextLine().toCharArray());
        }

        client.setAdmin(admin);
        client.setDate(); //after transaction we get the date  

        UserLoader.saveClient(client);  //on file

        System.out.println("\n--- Client Details ---"); //on screen
        System.out.println(client); 
    }
}