package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SignInUI extends CarUI {
    private JFrame frame;
    private JPanel panelOne;
    private JPanel panelTwo;
    private JLabel labelOne;
    private JLabel labelTwo;
    private JLabel labelThree;
    private JTextField username;
    private JPasswordField password;

    public SignInUI(){

    }

    public SignInUI(String name){
        initialize(name);
    }

    private void initialize(String name){

        frame = new JFrame();

        panelOne = new JPanel();
        panelOne.setLayout(null);
        panelOne.setBackground(Color.GRAY);
        panelOne.setBounds(0,0,400,500);

        labelOne = new JLabel("Good Day, " + name + "!");
        labelOne.setFont(new Font("Times New Roman", Font.BOLD,25));
        labelOne.setBounds(50,80,400,30);

        labelTwo = new JLabel("Username");
        labelTwo.setFont(new Font("Times New Roman", Font.PLAIN,17));
        labelTwo.setBounds(50,130,200,30);

        username = new JTextField(10);
        username.setBounds(50,158,200,30);
        username.setMargin(new Insets(5, 10, 5, 10));

        labelThree = new JLabel("Password");
        labelThree.setFont(new Font("Times New Roman", Font.PLAIN,17));
        labelThree.setBounds(50,210,200,30);

        password = new JPasswordField(10);
        password.setBounds(50,238,200,30);
        password.setMargin(new Insets(5, 10, 5, 10));

        panelTwo = new JPanel();
        panelTwo.setLayout(null);
        panelTwo.setBackground(Color.GRAY);
        panelTwo.setBounds(400,0,400,500);

        frame = super.setFrame();

        frame.add(panelOne);
        frame.add(panelTwo);

        panelOne.add(labelOne);
        panelOne.add(labelTwo);
        panelOne.add(username);
        panelOne.add(labelThree);
        panelOne.add(password);

    }

}
