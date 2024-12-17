package oop.utils;

import java.util.*;
import oop.user.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Admin> adminList = UserLoader.loadAdmin("././oop/database/User/Admin.txt");
        if(Admin.verify(adminList, "Lex")){
            System.out.println("Nice!");
        }
        else System.out.println("no!");

        if(Admin.verify(adminList, "mharcmharc")){
            System.out.println("Nice!");
        }
        else System.out.println("no!");
    }
}
