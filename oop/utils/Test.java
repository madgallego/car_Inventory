package oop.utils;

import oop.user.*;
import java.io.*;
import java.util.*;
import oop.car.*;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Admin admin = new Admin();
        Client client = new Client();
        ArrayList<SUV> c = CarLoader.loadSUV("Toyota");

        ArrayList<Admin> adminList = UserLoader.loadAdmin("./oop/database/User/Admin.txt");

        // Input Admin Details
        System.out.println("\nEnter NEW Admin Details:");
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

        adminList.add(admin);

        UserLoader.saveAdmin("./oop/database/User/Admin.txt", adminList);

/*        // Input Client Details
        System.out.println("\nEnter Client Details:");
        System.out.print("Client Name: ");
        client.setName(s.nextLine());
        System.out.print("Client Email: ");
        client.setEmail(s.nextLine());
        System.out.print("Client Address: ");
        client.setAddress(s.nextLine());
        System.out.print("Client Phone Number: ");
        client.setPhone(s.nextLine().toCharArray());
        client.setCarBought(c.get(0)); //the first car from the list      
        System.out.print("\n1. Cash\n2. Cash/Installment\n3. Card/Credit\n4. Card/Debit\n5. Cheque\n6. Digital Wallet\n\nClient Payment Method: ");
        int ch = s.nextInt(); s.nextLine();
        client.setPaymentMethod(ch);
        switch(ch) {
            case 5: System.out.print("Client Bank/Cheque Number (optional): ");
                    client.setBankCheck(s.nextLine().toCharArray());
                    break;
            default : break;
        }      
        client.setAdmin(admin);
        client.setDate(); //after transaction we get the date    

        // Display Admin and Client Details
        System.out.println("\n--- Admin Details ---");
        System.out.println(admin);

        System.out.println("\n--- Client Details ---");
        System.out.println(client); 
*/

        String name, password;
        System.out.println("\n\nLog in");
        System.out.print("\nAdmin (name): ");
        name = s.nextLine();        
        System.out.print("\nPassword: ");
        password = s.nextLine();

        if(Admin.verify(adminList, name)) {
            System.out.println("Veryfied");
        }else { 
            System.out.println("Admin name not found");
        }

        if(Admin.verify(adminList, password)) {
            System.out.println("Veryfied");
        }else { 
            System.out.println("Admin password not verified");
        }

        s.close();
    }
}
