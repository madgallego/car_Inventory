package oop.utils;

import java.io.*;
import java.util.*;
import oop.user.*;

public class UserLoader {
    
    // Method to load Admin obj data from the file
    public static ArrayList<Admin> loadAdmin(String filePath) {
        File f = new File(filePath);
        ArrayList<Admin> adminList = new ArrayList<Admin>();
        ArrayList<String> attribs;

        try (Scanner scan = new Scanner(f)) {
            while (scan.hasNextLine()) {
                // Load attributes for each Admin
                attribs = new ArrayList<String>();
                for (int i = 0; i < Admin.attrbsCount && scan.hasNextLine(); i++) {
                    attribs.add(scan.nextLine().trim());
                }
                //create new admin object with the attribs then add to list
                adminList.add(new Admin(attribs));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }

        return adminList;
    }   

   //Method for saving changes i.e. deleting or adding admin objects into the file
    public static void saveAdmin(String filePath, ArrayList<Admin> adminList) {
        try{
			FileWriter f = new FileWriter(filePath);
			Iterator<Admin> iterator = adminList.iterator();
			while (iterator.hasNext()) {
				Admin admin = iterator.next();
				for(int i = 0; i < admin.attribs.size(); i++)
					f.write(admin.attribs.get(i) + "\n");	
			}
			f.close();
		}catch(IOException e){
			System.err.println("File Not Found.");
		}
    }    

 /*   //method for loading client attribs to ArrayList<Strings> attribs
    public ArrayList<Client> loadClient() {
        ArrayList<Client> clientList = new ArrayList<Client>();
        ArrayList<String> attribs = new ArrayList<String>();


        return clientList;
    }
    
    //method for saving/appending new client object to clientList
    */
}
