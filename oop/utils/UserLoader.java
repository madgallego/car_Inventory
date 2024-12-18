package oop.utils;

import java.io.*;
import java.util.*;
import oop.user.*;

public class UserLoader {
    public static final String CLIENT_FILE = "./oop/database/User/Client.txt";
    public static final String ADMIN_FILE = "./oop/database/User/Admin.txt";

    // Method to load Admin obj data from the file
    public static ArrayList<Admin> loadAdmin() {
        File f = new File(ADMIN_FILE);
        ArrayList<Admin> adminList = new ArrayList<>();
        ArrayList<String> attribs;

        try (Scanner scan = new Scanner(f)) {
            // first line is the count of Admin objects
            if (scan.hasNextLine()) {
                Admin.setCount(Integer.parseInt(scan.nextLine().trim()));
            }

            // read Admin attributes
            for (int j = 0; j < Admin.getCount(); j++) {
                attribs = new ArrayList<>();
                for (int i = 0; i < Admin.attribsCount && scan.hasNextLine(); i++) {
                    String line = scan.nextLine().trim();
                    attribs.add(line);
                }
                if (attribs.size() == Admin.attribsCount) {
                    adminList.add(new Admin(attribs));                    
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }

        return adminList;
    }

    // Method for saving changes (like deleting or adding admin objects) into the file
    public static void saveAdmin(String filePath, ArrayList<Admin> adminList) {
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(filePath))) {
            // Write the count of Admin objects as the first line
            fw.write(Admin.getCount() + "\n");

            Iterator<Admin> iterator = adminList.iterator();
            while (iterator.hasNext()) {
                Admin admin = iterator.next();
                // Write each Admin object's attributes
                for(int i = 0; i < Admin.attribsCount; i++) {
                    fw.write(admin.attribs.get(i) + "\n");
                }                
            }
        } catch (IOException e) {
            System.err.println("Error saving to file.");
        }
    }

    //Makes and Adds Admin object 
    public static void addAdmin(ArrayList<Admin> adminList, String name,String email, String address, String phone, String id, String password) {
        Admin admin = new Admin();
        
        admin.setName(name);
        admin.setEmail(email);
        admin.setAddress(address);
        admin.setPhone(phone.toCharArray());
        admin.setAdminID(id);
        admin.setPassword(password);

        addAdmin(adminList, admin);
    }

    //Adds Admin object into list
    public static void addAdmin(ArrayList<Admin> adminList, Admin admin) {
        adminList.add(admin);
        Admin.setCount(adminList.size());
        UserLoader.saveAdmin(ADMIN_FILE, adminList);
    }

    //method for loading client attribs to ArrayList<Strings> attribs
    public static ArrayList<Client> loadClient() {
        ArrayList<Client> clientList = new ArrayList<>();

        try (Scanner s = new Scanner(new File(CLIENT_FILE))) {
            String line;
            ArrayList<String> attribs = new ArrayList<>();

            while (s.hasNextLine()) {
                line = s.nextLine();
                if (line.equals("-----")) { // Separator for one client
                    if (attribs != null && attribs.size() == Client.attribsCount) {
                        clientList.add(new Client(attribs));
                    } else {
                        throw new IllegalArgumentException("Attributes list must contain exactly " + Client.attribsCount + " elements.");
                    }
                    attribs.clear();
                } else {
                    attribs.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading clients: " + e.getMessage());
        }
        return clientList;
    }
   
    //method for appending new client object into the file
    public static void saveClient(Client client) {
        
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(CLIENT_FILE, true))) { // appending
            
            fw.write(client.getDate() + "\n");
            fw.write(client.getClientCount() + "\n");
            fw.write(client.getName() + "\n");
            fw.write(client.getEmail() + "\n");
            fw.write(client.getAddress() + "\n");
            fw.write(client.getPhone() + "\n");
            fw.write(client.getProduct().toString() + "\n");
            fw.write(client.getPayMethod() + "\n");
            fw.write(client.getRefNum() + "\n");
            fw.write(client.getAdmin() + "\n");
            fw.write("-----\n"); // Separator for better readability
            
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
        }
    }

 
}
