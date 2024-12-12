package oop.person;

import oop.car;

public class Client extends Person {
    //Attributes
    private static int clientCount = 0;
    private Car bought;
    private String payMethod = "";
    private String bankCheck = "";
    private int date;//date of transaction
    //should I add an attribute for saving the admin object (whose details) that made the transaction for the client 

    //Constructor
    public Client() {//counter will increment every time an object if instantiated 
        clientCount++;
    }

    //Mutator methods
    public void setCarBought(Car bought) {
        bought = bought;
    }

    public void setPaymentMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public void setBanckCheck(String bankCheck) {
        this.bankCheck = bankCheck;
    }

    public void setDate(int date) {
        this.date = date;
    }

    //Accessor Methods
}