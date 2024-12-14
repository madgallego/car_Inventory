package oop.user;

import java.util.Date;
import oop.car.Car; // Import for Date class
import oop.user.*;

public class Client extends Person {
    // Attributes
    private static int count = 0;
    private Car bought;
    private String payMethod = "default";
    private int bankCheck;
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

    public void setBankCheck(int bankCheck) {
        this.bankCheck = bankCheck;
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

    public int getBankCheck() {
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
               //", phone = " + Arrays.toString(getPhone()) +
               ", car bought = " + (bought != null ? bought.toString() : "None") +
               ", payment method = '" + payMethod + '\'' +
               ", bank/check num = " + bankCheck +
               ", date = " + (date != null ? date.toString() : "None") +
               ", admin = " + (admin != null ? admin.toString() : "None") +
               ", total clients = " + count +
               '}';
    }
}
