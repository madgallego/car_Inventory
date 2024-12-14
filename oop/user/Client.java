package oop.user;

import oop.car.Car;
import java.util.Date; // Import for Date class
import java.util.Arrays; // Import for formatting arrays

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

    public void setPaymentMethod(String payMethod) {
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

    public void setDate(Date date) {
        this.date = date; // External date setting; real date and time
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    // Accessor Methods
    public Car getCarBought() {
        return bought;
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
        return "Client {" +
               "name = '" + getName() + '\'' +
               ", email = '" + getEmail() + '\'' +
               ", address = '" + getAddress() + '\'' +
               ", phone = " + getPhone() +
               //", car bought = " + (bought != null ? bought.toString() : "None") +
               ", payment method = '" + payMethod + '\'' +
               ", bank/check num = " + bankCheck +
               ", date = " + (date != null ? date.toString() : "None") +
               //", admin = " + (admin != null ? admin.toString() : "None") +
               ", total clients = " + count +
               '}';
    }
}
