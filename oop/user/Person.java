package oop.user;

import java.util.Arrays;

public class Person {

    // Attributes
    private String name;
    private String email;
    private String address;
    private String phone;

    // Default Constructor
    public Person() {}

    // Parameterized Constructor
    public Person(String name, String email, String address, char[] phone) {
        setName(name);
        setEmail(email);
        setAddress(address);
        setPhone(phone); // Use setter for validation
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (email != null && (email.contains("@gmail.com") || email.contains("@yahoo.com") || 
                              email.contains("@outlook.com") || email.contains("@bicol-u.edu.ph"))) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(char[] phone) { 
        if (phone != null && phone.length == 11) {
            for (int i = 0; i < phone.length; i++) { // Iterate over each character in the array
                if (!Character.isDigit(phone[i])) { // Ensure each character is a digit
                    throw new IllegalArgumentException("Phone number must contain only digits (0-9).");
                }
            }
            this.phone = new String(phone); // Convert char[] to String and store
        } else {
            throw new IllegalArgumentException("Phone number must have exactly 11 digits.");
        }
    }


    // Accessors
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // toString Method
    @Override
    public String toString() {
        return "Person { " +
               "name = '" + name + '\'' +
               ", email = '" + email + '\'' +
               ", address = '" + address + '\'' +
               ", phone = " + phone +
               " }";
    }
}