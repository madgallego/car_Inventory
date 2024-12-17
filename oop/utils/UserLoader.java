package oop.utils;

import java.io.*;
import java.util.*;
import oop.user.*;

public class UserLoader {

    // Method to load Admin obj data from the file
    public static ArrayList<Admin> loadAdmin(String filePath) {
        File f = new File(filePath);
        ArrayList<Admin> adminList = new ArrayList<>();
        ArrayList<String> attribs;

        try (Scanner scan = new Scanner(f)) {           
            // first line is the count of Admin objects
            if (scan.hasNextLine()) {
                Admin.setCount(Integer.parseInt(scan.nextLine().trim()));
            }

            // read Admin attributes
            for(int j = 0; j < Admin.getCount(); j++) {
                attribs = new ArrayList<>();
                for (int i = 0; i < Admin.attribsCount && scan.hasNextLine(); i++) {
                    attribs.add(scan.nextLine().trim());
                }
                // create new Admin object and add to list
                adminList.add(new Admin(attribs));
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

            // Write each Admin object's attributes
            for (Admin admin : adminList) {
                fw.write(admin.getName() + "\n");
                fw.write(admin.getEmail() + "\n");
                fw.write(admin.getAddress() + "\n");
                fw.write(admin.getPhone() + "\n");
                fw.write(admin.getAdminID() + "\n");
                fw.write(admin.getPassword() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error saving to file.");
        }
    }

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

    public static void addAdmin(ArrayList<Admin> adminList, Admin admin) {
        adminList.add(admin);
        Admin.setCount(adminList.size());
        UserLoader.saveAdmin("./oop/database/User/Admin.txt", adminList);
    }


 
}
