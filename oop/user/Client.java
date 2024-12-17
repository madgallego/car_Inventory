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
    private int payMethod;
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
        setCarBought(car); //attribs(5) processed sa userLoader.clientList
        setPaymentMethod(attribs.get(6));
        setBankCheck(attribs.get(7).toCharArray());
        setDate(date); //attribs(8)
        setAdmin(admin);//attribs(9)

    }

    // Mutator methods
    public void setCarBought(Car bought) {
        this.bought = bought;
    }

    public void setPaymentMethod(int payMethod) {
        if (payMethod < 1 || payMethod > 6) {
            throw new IllegalArgumentException("Payment method must be between 1 and 6.");
        }
        this.payMethod = payMethod;
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

    public void setDate(Date date) {//edit
        this.date = date;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }
  
    // Accessor Methods
    public ArrayList<String> getCarAttribs() {
        return bought.attribs;
    }

    public String getPaymentMethod() {
        switch(payMethod) {
            case 1: return "Cash"; break;
            case 2: return "Cash/Installment"; break;
            case 3: return "Card/Debit"; break;
            case 4: return "Card/Credit"; break;
            case 5: return "Cheque"; break;
            case 6: return "Digital Wallet"; break;
        }
    }

    public Car getCarBought() {
        return bought;
    }

    public int getPayMethod() {
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
               "admin = " + (admin != null ? admin.toString() : "None") + "\n"
    }
}
