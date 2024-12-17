package oop.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date; // Import for Date class
import oop.car.Car; // Import for formatting arrays

public class Client extends Person {
    // Attributes
    public static final int attribsCount = 10;
    private static int count = 0;    
    private int clientCount;
    private ArrayList<String> product;
    private int payMethod;
    private String refNum;
    private String date; // Date of transaction
    private String admin; // Admin responsible for the transaction

    // Constructor
    public Client() {
        count++;
        clientCount = count;
    }

    public Client(ArrayList<String> attribs) { 
        date = attribs.get(0);       
        setClientCount(Integer.parseInt(attribs.get(1)));
        setName(attribs.get(2));
        setEmail(attribs.get(3));
        setAddress(attribs.get(4));
        setPhone(attribs.get(5).toCharArray());
        String productData = attribs.get(6);
        product = new ArrayList<>(Arrays.asList(productData.replace("[", "").replace("]", "").split(", ")));
        setPaymentMethod(Integer.parseInt(attribs.get(7)));
        setRefNum(attribs.get(8).toCharArray());
        admin = attribs.get(9);
    }

    // Mutator methods
    public void setProduct(Car car) {
        product = car.attribs;
    }

    public void setPaymentMethod(int payMethod) {
        if (payMethod < 1 || payMethod > 6) {
            throw new IllegalArgumentException("Payment method must be between 1 and 6.");
        }
        this.payMethod = payMethod;
    }

    public void setRefNum(char[] refNum) {
        if (refNum != null) {
            for (int i = 0; i < refNum.length; i++) { // Iterate over each character in the array
                if (!Character.isDigit(refNum[i])) { // Ensure each character is a digit
                    throw new IllegalArgumentException("Check track number must contain only digits (0-9).");
                }
            }
            this.refNum = new String(refNum); // Convert char[] to String and store
        }
    }

    public void setDate() {
        Date now = new Date();
        date = now.toString();
    }

    public void setAdmin(Admin admin) {
        this.admin = admin.toString();
    }

    private void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    public static void setCount(int num) {
        count = num;
    }
  
    // Accessor Methods
    public ArrayList<String> getProduct() {
        return product;
    }

    public String getPaymentMethod() {
        switch(payMethod) {
            case 1: return "Cash"; 
            case 2: return "Cash/Installment"; 
            case 3: return "Card/Debit"; 
            case 4: return "Card/Credit"; 
            case 5: return "Cheque";
            case 6: return "Digital Wallet";
            default: return "Defualt";
        }
    }


    public int getPayMethod() {
        return payMethod;
    }

    public String getRefNum() {
        return refNum;
    }

    public String getDate() {
        return date;
    }

    public String getAdmin() {
        return admin;
    }

    public int getClientCount() {
        return clientCount;
    }

    public static int getCount() {
        return count;
    }

    // toString Method
    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
               "email: " + getEmail() + "\n" +
               "address: " + getAddress() + "\n" +
               "phone: " + getPhone() + "\n" +
               "car product: " + (product != null ? product : "None") + "\n" +
               "payment method: " + getPaymentMethod() + "\n" +
               "bank/check num: " + refNum + "\n" +
               "date: " + (date != null ? date.toString() : "None") + "\n" +
               "admin: " + admin + "\n";
    }
}
