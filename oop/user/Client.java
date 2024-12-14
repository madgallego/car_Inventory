package oop.user;

import oop.car.Car;
import java.util.Date; // Import for Date class
import java.util.Arrays; // Import for formatting arrays
import java.util.ArrayList;

public class Client extends Person {
    // Attributes
    private static int count = 0;
    private Car bought;
    private String payMethod = "Default";
    private String bankCheck = "None";
    private Date date; // Date of transaction
    private Admin admin; // Admin responsible for the transaction

    // Constructor
    public Client() {
        count++; // Increment counter when an object is instantiated
    }

    // Mutator methods
    public void setCarBought(Car bought) {
        this.bought = bought;
    }

    public void setPaymentMethod(int num) {
        switch(num) {
            case 1: payMethod = "Cash";
            case 2: payMethod = "Credit/Debit Card";
            case 3: payMethod = "Bank Transfer";
            case 4: payMethod = "Cheque";
            case 5: payMethod = "Digital Wallet";
            default: return;
        }        
    }

    public void setBankCheck(char[] bankCheck) {
        if (bankCheck != null) {
            for (int i = 0; i < bankCheck.length; i++) { // Iterate over each character in the array
                if (!Character.isDigit(bankCheck[i])) { // Ensure each character is a digit
                    throw new IllegalArgumentException("Check track number must contain only digits (0-9).");
                }
            }
            this.bankCheck = new String(bankCheck); // Convert char[] to String and store
        }
    }



    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void setDate() {
        date = new Date();
    }

    // Accessor Methods
    public ArrayList<String> getCarBought() {
        return bought.attribs;
    }

    public String getPaymentMethod() {
        return payMethod;
    }

    public String getBankCheck() {
        return bankCheck;
    }

    public Date getDate() {
        return date;
    }

    public Admin getAdmin() {
        return admin;
    }

    public static int getCount() {
        return count;
    }

    // toString Method
    @Override
    public String toString() {
        return "Client :" +
               "name = " + getName() + "\n" +
               "email = " + getEmail() + "\n" +
               "address = " + getAddress() + "\n" +
               "phone = " + getPhone() + "\n" +
               "car bought = " + (bought != null ? bought.attribs : "None") + "\n" +
               "payment method = " + payMethod + "\n" +
               "bank/check num = " + bankCheck + "\n" +
               "date = " + (date != null ? date.toString() : "None") + "\n" +
               "admin = " + (admin != null ? admin.toString() : "None") + "\n" +
               "total clients = " + count;
    }
}
