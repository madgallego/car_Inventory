package oop.person;

public class Person{

    //Attributes
    private String name;
    private String email;
    private String address;
    private int[] phone = new int[11];

    //Constructor
    public Person() { } //

    //Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int[] phone) {
        this.phone = phone;
    }

    //Accessors
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
        return phone;
    }
}