package oop.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import oop.user.Client;

public class ReceiptUI extends CarUI{
    private int carType;
    private String carBrand;
    private Client userClient;
    private JFrame frame;
    private JPanel switchPanel;
    private JPanel transaction1;
    private JPanel transaction2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel title1;
    private JLabel title2;
    private JLabel name;
    private JLabel emailAdd;
    private JLabel address;
    private JLabel number;
    private JLabel vin;
    private JLabel make;
    private JLabel year;
    private JLabel color;
    private JLabel model;
    private JLabel license;
    private JLabel mileage;
    private JLabel addons;
    private JLabel date;
    private JLabel price;
    private JLabel signature1;
    private JLabel signature2;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox method;
    private JTextField reference;
    private JButton confirmButton1;
    private JButton confirmButton2;
    private JButton cancel1;
    private JButton cancel2;
    private CardLayout switchLayout = new CardLayout();

    public ReceiptUI(Client user, int type, String brand){ //pass as parameters the details (?)
        userClient=user;
        carType=type;
        carBrand=brand;
        frame = setFrame();

        switchPanel = new JPanel(switchLayout);

        transaction1 = new JPanel();
        transaction1.setLayout(null);
        transaction1.setBounds(0,0,900,450);
        transaction1.setBackground(Color.decode("#c2e5f9"));

        transaction2 = new JPanel();
        transaction2.setLayout(null);
        transaction2.setBounds(0,0,900,450);
        transaction2.setBackground(Color.decode("#c2e5f9"));

        switchPanel.add(transaction1, "1");
        switchPanel.add(transaction2, "2");

        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(43, 70, 800, 110);
        panel1.setBackground(Color.WHITE);

        JLabel buyer1 = new JLabel("Buyer Details");
        buyer1.setFont(new Font("Arial", Font.BOLD, 20));
        buyer1.setBounds(15,10,150,30);

        JLabel buyer2 = new JLabel("Name:");
        buyer2.setFont(new Font("Arial", Font.PLAIN, 17));
        buyer2.setBounds(15,40,150,30);

        JLabel buyer3 = new JLabel("E-mail Address:");
        buyer3.setFont(new Font("Arial", Font.PLAIN, 17));
        buyer3.setBounds(15,70,150,30);

        JLabel buyer4 = new JLabel("Address:");
        buyer4.setFont(new Font("Arial", Font.PLAIN, 17));
        buyer4.setBounds(420,40,150,30);

        JLabel buyer5 = new JLabel("Phone Number:");
        buyer5.setFont(new Font("Arial", Font.PLAIN, 17));
        buyer5.setBounds(420,70,150,30);

        name = new JLabel(userClient.getName());
        name.setFont(new Font("Arial", Font.PLAIN, 17));
        name.setBounds(170,40,150,30);

        emailAdd = new JLabel("holder");
        emailAdd.setFont(new Font("Arial", Font.PLAIN, 17));
        emailAdd.setBounds(170,70,150,30);

        address = new JLabel("holder");
        address.setFont(new Font("Arial", Font.PLAIN, 17));
        address.setBounds(570,40,150,30);

        number = new JLabel("holder");
        number.setFont(new Font("Arial", Font.PLAIN, 17));
        number.setBounds(570,70,150,30);

        panel1.add(buyer1);
        panel1.add(buyer2);
        panel1.add(buyer3);
        panel1.add(buyer4);
        panel1.add(buyer5);
        panel1.add(name);
        panel1.add(emailAdd);
        panel1.add(address);
        panel1.add(number);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(43, 190, 800, 200);
        panel2.setBackground(Color.WHITE);

        JLabel vehicle1 = new JLabel("Vehicle Details");
        vehicle1.setFont(new Font("Arial", Font.BOLD, 20));
        vehicle1.setBounds(15,10,150,30);

        JLabel vehicle2 = new JLabel("VIN:");
        vehicle2.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle2.setBounds(15,40,150,30);

        JLabel vehicle3 = new JLabel("Make:");
        vehicle3.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle3.setBounds(15,70,150,30);

        JLabel vehicle4 = new JLabel("Year:");
        vehicle4.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle4.setBounds(15,100,150,30);

        JLabel vehicle5 = new JLabel("Color:");
        vehicle5.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle5.setBounds(15,130,150,30);

        JLabel vehicle6 = new JLabel("Model:");
        vehicle6.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle6.setBounds(420,40,150,30);

        JLabel vehicle7 = new JLabel("Mileage:");
        vehicle7.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle7.setBounds(420,70,150,30);

        JLabel vehicle8 = new JLabel("License Plate:");
        vehicle8.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle8.setBounds(420,100,150,30);

        JLabel vehicle9 = new JLabel("Add-Ons:");
        vehicle9.setFont(new Font("Arial", Font.PLAIN, 17));
        vehicle9.setBounds(420,130,150,30);

        vin = new JLabel("holder");
        vin.setFont(new Font("Arial", Font.PLAIN, 17));
        vin.setBounds(170,40,150,30);

        make = new JLabel("holder");
        make.setFont(new Font("Arial", Font.PLAIN, 17));
        make.setBounds(170,70,150,30);

        year = new JLabel("holder");
        year.setFont(new Font("Arial", Font.PLAIN, 17));
        year.setBounds(170,100,150,30);

        color = new JLabel("holder");
        color.setFont(new Font("Arial", Font.PLAIN, 17));
        color.setBounds(170,130,150,30);

        model = new JLabel("holder");
        model.setFont(new Font("Arial", Font.PLAIN, 17));
        model.setBounds(570,40,150,30);

        license = new JLabel("holder");
        license.setFont(new Font("Arial", Font.PLAIN, 17));
        license.setBounds(570,70,150,30);

        mileage = new JLabel("holder");
        mileage.setFont(new Font("Arial", Font.PLAIN, 17));
        mileage.setBounds(570,100,150,30);

        addons = new JLabel("holder");
        addons.setFont(new Font("Arial", Font.PLAIN, 17));
        addons.setBounds(570,130,150,30);

        confirmButton1 = new JButton("Confirm");
        confirmButton1.setFont(new Font("Arial", Font.BOLD, 17));
        confirmButton1.setBounds(535,164,120,30);
        confirmButton1.setBackground(Color.decode("#5d99bc"));
        confirmButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchLayout.show(switchPanel, "2");
            }
        });

        cancel1 = new JButton("Cancel");
        cancel1.setFont(new Font("Arial", Font.BOLD, 17));
        cancel1.setBounds(665,164,120,30);
        cancel1.setBackground(Color.GRAY);
        cancel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new DashboardUI(carType, carBrand);
            }
        });

        panel2.add(vehicle1);
        panel2.add(vehicle2);
        panel2.add(vehicle3);
        panel2.add(vehicle4);
        panel2.add(vehicle5);
        panel2.add(vehicle6);
        panel2.add(vehicle7);
        panel2.add(vehicle8);
        panel2.add(vehicle9);
        panel2.add(vin);
        panel2.add(make);
        panel2.add(year);
        panel2.add(color);
        panel2.add(model);
        panel2.add(license);
        panel2.add(mileage);
        panel2.add(addons);
        panel2.add(confirmButton1);
        panel2.add(cancel1);

        title1 = new JLabel("Transaction Details");
        title1.setFont(new Font("Arial", Font.BOLD, 45));
        title1.setBounds(240, 16,700,50);

        title2 = new JLabel("Transaction Details");
        title2.setFont(new Font("Arial", Font.BOLD, 45));
        title2.setBounds(240, 16,700,50);

        transaction2.add(title2);
        transaction1.add(title1);

        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(43, 70, 800, 100);
        panel3.setBackground(Color.WHITE);

        JLabel sale1 = new JLabel("Sale Details");
        sale1.setFont(new Font("Arial", Font.BOLD, 20));
        sale1.setBounds(15,7,150,30);

        JLabel sale2 = new JLabel("Sale Date:");
        sale2.setFont(new Font("Arial", Font.PLAIN, 17));
        sale2.setBounds(15,32,150,30);

        JLabel sale3 = new JLabel("Sale Price:");
        sale3.setFont(new Font("Arial", Font.PLAIN, 17));
        sale3.setBounds(15,62,150,30);

        JLabel sale4 = new JLabel("Payment Method:");
        sale4.setFont(new Font("Arial", Font.PLAIN, 17));
        sale4.setBounds(330,32,150,30);

        JLabel sale5 = new JLabel("Check/Bank Transfer Number:");
        sale5.setFont(new Font("Arial", Font.PLAIN, 17));
        sale5.setBounds(330,62,250,30);

        date = new JLabel("holder");
        date.setFont(new Font("Arial", Font.PLAIN, 17));
        date.setBounds(170,32,150,30);

        price = new JLabel("holder");
        price.setFont(new Font("Arial", Font.PLAIN, 17));
        price.setBounds(170,62,150,30);

        String[] payment = {"Cash", "Check","Bank Transfer"};

        method = new JComboBox(payment);
        method.setFont(new Font("Arial", Font.PLAIN, 17));
        method.setBounds(570,32,150,30);
        method.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(method.getSelectedIndex() == 0)
                    reference.setEnabled(false);
                else
                    reference.setEnabled(true);
            }
        });

        reference = new JTextField("holder");
        reference.setFont(new Font("Arial", Font.PLAIN, 17));
        reference.setBounds(570,62,150,30);
        reference.setEnabled(false);

        panel3.add(sale1);
        panel3.add(sale2);
        panel3.add(sale3);
        panel3.add(sale4);
        panel3.add(sale5);
        panel3.add(date);
        panel3.add(price);
        panel3.add(method);
        panel3.add(reference);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(43, 180, 800, 220);
        panel4.setBackground(Color.WHITE);

        JLabel cond1 = new JLabel("Conditions of Sale and Purchase");
        cond1.setFont(new Font("Arial", Font.BOLD, 20));
        cond1.setBounds(15,7,800,30);

        JLabel cond2 = new JLabel("The seller certifies that they are the legal owner of the above-mentioned " +
                "vehicle and have the right to sell it.");
        cond2.setFont(new Font("Arial", Font.PLAIN, 15));
        cond2.setBounds(15,30,800,30);

        JLabel cond3 = new JLabel("The buyer acknowledges that they have inspected the vehicle and accept " +
                "it in its current condition. The ");
        cond3.setFont(new Font("Arial", Font.PLAIN, 15));
        cond3.setBounds(15,50,800,30);

        JLabel cond4 = new JLabel("vehicle is sold “as-is” without any warranties or guarantees, express or implied.");
        cond4.setFont(new Font("Arial", Font.PLAIN, 15));
        cond4.setBounds(15,70,800,30);

        JLabel sign1 = new JLabel("Confirmation of Purchase");
        sign1.setFont(new Font("Arial", Font.BOLD, 20));
        sign1.setBounds(15,95,800,30);

        JLabel sign2 = new JLabel("To confirm your purchase, enter your email and password");
        sign2.setFont(new Font("Arial", Font.PLAIN, 15));
        sign2.setBounds(15,117,800,30);

        confirmButton2 = new JButton("Confirm");
        confirmButton2.setFont(new Font("Arial", Font.BOLD, 17));
        confirmButton2.setBounds(535,184,120,30);
        confirmButton2.setBackground(Color.decode("#5d99bc"));
        confirmButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(emailField.getText().isEmpty() || passwordField.getPassword().length == 0){
                    JOptionPane.showMessageDialog(null, "Input on both fields to confirm purchase", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    frame.dispose();
                    new CarOptionUI();
                }
                
            }
        });

        cancel2 = new JButton("Cancel");
        cancel2.setFont(new Font("Arial", Font.BOLD, 17));
        cancel2.setBounds(665,184,120,30);
        cancel2.setBackground(Color.GRAY);
        cancel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, 
                "Cancel Purchase?", "Purchase Confirmation", JOptionPane.YES_NO_OPTION);

                if(response == JOptionPane.YES_OPTION){
                    frame.dispose();
                    new DashboardUI(carType, carBrand);
                }
                
            }
        });

        JLabel purchase1 = new JLabel("Email Address");
        purchase1.setFont(new Font("Arial", Font.PLAIN, 12));
        purchase1.setBounds(72,143,150,30);

        JLabel purchase2 = new JLabel("Password");
        purchase2.setFont(new Font("Arial", Font.PLAIN, 12));
        purchase2.setBounds(272,143,150,30);

        emailField = new JTextField("Enter Email");
        emailField.setFont(new Font("Arial", Font.PLAIN, 17));
        emailField.setBounds(70,165,150,30);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 17));
        passwordField.setBounds(270,165,150,30);


        panel4.add(cond1);
        panel4.add(cond2);
        panel4.add(cond3);
        panel4.add(cond4);
        panel4.add(sign1);
        panel4.add(sign2);
        panel4.add(confirmButton2);
        panel4.add(cancel2);
        panel4.add(purchase1);
        panel4.add(purchase2);
        panel4.add(emailField);
        panel4.add(passwordField);

        transaction2.add(panel4);
        transaction2.add(panel3);

        transaction1.add(panel1);
        transaction1.add(panel2);

        frame.add(switchPanel, BorderLayout.CENTER);

    }

}
