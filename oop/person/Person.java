package oop.person;

import java.util.Arrays;

public class Person {

    // Attributes
    private String name;
    private String email;
    private String address;
    private int[] phone;

    // Default Constructor
    public Person() {}

    // Parameterized Constructor
    public Person(String name, String email, String address, int[] phone) {
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

    public void setPhone(int[] phone) {
        if (phone != null && phone.length == 11) {
            for (int digit : phone) {
                if (digit < 0 || digit > 9) { // Ensure all elements are valid digits
                    throw new IllegalArgumentException("Phone number must contain only digits (0-9).");
                }
            }
            this.phone = Arrays.copyOf(phone, phone.length); // Copy to ensure encapsulation
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

    public int[] getPhone() {
        return phone != null ? Arrays.copyOf(phone, phone.length) : null; // Return a copy for safety
    }

    // toString Method
    @Override
    public String toString() {
        return "Person { " +
               "name = '" + name + '\'' +
               ", email = '" + email + '\'' +
               ", address = '" + address + '\'' +
               ", phone = " + (phone != null ? Arrays.toString(phone) : "N/A") +
               " }";
    }
}