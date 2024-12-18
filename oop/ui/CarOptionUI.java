package oop.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CarOptionUI extends CarUI {
    private boolean adminCheck;
    private JFrame frame;
    private JPanel brandPanel;
    private JPanel mainPanel;
    private JPanel titlePanel;
    private JPanel switchPanel1;
    private JPanel switchPanel2;
    private JLabel title;
    private JLabel subTitle;
    private JButton[] typeButton;
    private CardLayout switchLayout1 = new CardLayout();
    private CardLayout switchLayout2 = new CardLayout();

    private int buttonNum;

    public CarOptionUI(boolean admin){
        adminCheck=admin;
        frame = new JFrame();
        frame = setFrame();
        frame.setLayout(new BorderLayout());

        switchPanel1 = new JPanel(switchLayout1);
        switchPanel2 = new JPanel(switchLayout2);

        brandPanel = new JPanel(new GridLayout(1,5,5,0));
        brandPanel.setBackground(Color.decode("#c2e5f9"));

        mainPanel = new JPanel(new GridLayout(2,6,5,0));
        mainPanel.setBackground(Color.decode("#c2e5f9"));

        switchPanel1.add(mainPanel, "1");
        switchPanel1.add(brandPanel, "2");

        titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBackground(Color.decode("#5d99bc"));

        title = new JLabel("Welcome to SASACIAN",SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setForeground(Color.WHITE);

        subTitle = new JLabel("Choose a Type of Car");
        subTitle.setFont(new Font("Arial", Font.PLAIN, 25));
        subTitle.setOpaque(true);
        subTitle.setBackground(Color.decode("#7ebce0"));
        subTitle.setForeground(Color.WHITE);

        String[] cars = {"Convertible","Coupe","Crossover","Electric Vehicle",
       "Hatchbacks","Luxury Cars",
        "Minivans","Pickup Trucks","Sedan","Sports Car",
        "Station Wagons","SUV"};

        typeButton = new JButton[14];

        String[] brand = new String[4];

        for(int i = 0; i < 12; i++){
            typeButton[i] = new JButton(cars[i]);
            typeButton[i].setFocusable(false);
            typeButton[i].setBackground(Color.decode("#5d99bc"));
            typeButton[i].setFont(new Font("Arial", Font.BOLD, 10));
            final int num = i;
            typeButton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    switch(num){
                        case 0: 
                            buttonNum = 1;
                            brand[0] = "BMW";
                            break;
                        case 1: 
                            buttonNum = 3;
                            brand[0] = "BMW";
                            brand[1] = "Ford";
                            brand[2] = "Toyota";
                            break;
                        case 2:
                            buttonNum = 1;
                            brand[0] = "Toyota";
                            break;
                        case 3:
                            buttonNum = 3;
                            brand[0] = "BMW";
                            brand[1] = "Honda";
                            brand[2] = "Tesla";
                            break;
                        case 4:
                            buttonNum = 3;
                            brand[0] = "Honda";
                            brand[1] = "Mazda";
                            brand[2] = "Toyota";
                            break;
                        case 5:
                            buttonNum = 2;
                            brand[0] = "BMW";
                            brand[1] = "Toyota";
                            break;
                        case 6:
                            buttonNum = 1;
                            brand[0] = "Suzuki";
                            break;
                        case 7:
                            buttonNum = 3;
                            brand[0] = "Ford";
                            brand[1] = "Mazda";
                            brand[2] = "Toyota";
                            break;
                        case 8:
                            buttonNum = 3;
                            brand[0] = "Honda";
                            brand[1] = "Mazda";
                            brand[2] = "Toyota";
                            break;
                        case 9:
                            buttonNum = 3;
                            brand[0] = "Ford";
                            brand[1] = "Mazda";
                            brand[2] = "Toyota";
                            break;
                        case 10:
                            buttonNum = 2;
                            brand[0] = "Mazda";
                            brand[1] = "Subaru";
                            break;
                        case 11:
                            buttonNum = 4;
                            brand[0] = "Ford";
                            brand[1] = "Honda";
                            brand[2] = "Mazda";
                            brand[3] = "Toyota";
                            break;
                    }

                    brandPanel.removeAll();

                    for(int i = 0; i < buttonNum; i++){
                        JButton brandButton = new JButton(brand[i]);
                        brandButton.setFocusable(false);
                        brandButton.setBackground(Color.decode("#5d99bc"));
                        brandButton.setFont(new Font("Arial", Font.BOLD, 30));
                        final int push=i;
                        brandButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                frame.dispose();
                                if(adminCheck) new InventoryUI(num, brand[push]);
                                else new DashboardUI(num, brand[push]);
                            }
                        });
                        brandPanel.add(brandButton);
            
                    }

                    switchLayout1.show(switchPanel1,"2");
                    switchLayout2.show(switchPanel2,"2");
                    subTitle.setText("Choose a Brand");
                }
            });
            mainPanel.add(typeButton[i]);
        }

        JPanel buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel1.setBackground(Color.decode("#c2e5f9"));
        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel2.setBackground(Color.decode("#c2e5f9"));

        switchPanel2.add(buttonPanel1, "1");
        switchPanel2.add(buttonPanel2, "2");

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 15));
        exitButton.setBackground(Color.GRAY);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new StartUI();
                
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 15));
        backButton.setBackground(Color.GRAY);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchLayout2.show(switchPanel2,"1");
                switchLayout1.show(switchPanel1,"1");
            }
        });


        buttonPanel1.add(exitButton);
        buttonPanel2.add(backButton);

        titlePanel.add(title,BorderLayout.NORTH);
        titlePanel.add(subTitle,BorderLayout.SOUTH);
        
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(switchPanel1, BorderLayout.CENTER);
        frame.add(switchPanel2, BorderLayout.SOUTH);

    }
}
