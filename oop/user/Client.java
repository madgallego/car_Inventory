package oop.user;

import java.util.ArrayList;
import java.util.Date; // Import for Date class
import oop.car.Car; // Import for formatting arrays

public class Client extends Person {
    // Attributes
    private static int count = 0;    
    private int clientCount;
    public ArrayList<String> attribs;
    private Car bought;
    private String payMethod = "Default";
    private String bankCheck = "None";
    private Date date; // Date of transaction
    private Admin admin; // Admin responsible for the transaction

    // Constructor
    public Client() {
        count++; // Increment counter when an object is instantiated
        clientCount = count;
    }

    public Client(ArrayList<String> attribs, Car car, Date date, Admin admin) {
        if (attribs == null || attribs.size() < 7) {
            throw new IllegalArgumentException("Attributes list is invalid or incomplete.");
        }
        this.attribs = attribs;
        count++;
        setClientCount(Integer.parseInt(attribs.get(0)));
        setName(attribs.get(1));
        setEmail(attribs.get(2));
        setAddress(attribs.get(3));
        setPhone(attribs.get(4).toCharArray());
        setCarBought(car); //attribs(5)
        payMethod = attribs.get(6);
        bankCheck = attribs.get(7);
        setDate(date);
        setAdmin(admin);

    }

    // Mutator methods
    public void setCarBought(Car bought) {
        this.bought = bought;
    }

    public void setPaymentMethod(int num) {
        switch(num) {
            case 1: payMethod = "Cash"; break;
            case 2: payMethod = "Credit/Debit Card"; break;
            case 3: payMethod = "Bank Transfer"; break;
            case 4: payMethod = "Cheque"; break;
            case 5: payMethod = "Digital Wallet"; break;
            default: break;
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

    public void setDate() {
        date = new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private void setClientCount(int clientCount) {
        this.clientCount = clientCount;
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

    public int getClientCount() {
        return clientCount;
    }

    // toString Method
    @Override
    public String toString() {
        return "Client " + clientCount +
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
