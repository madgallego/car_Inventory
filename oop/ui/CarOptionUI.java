package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarOptionUI extends CarUI {

    private JFrame frame;
    private JPanel brandPanel;
    private JPanel mainPanel;
    private JPanel titlePanel;
    private JPanel switchPanel;
    private JLabel title;
    private JLabel subTitle;
    private JButton[] typeButton;
    private CardLayout switchLayout = new CardLayout();

    private int buttonNum;

    public CarOptionUI(){
        frame = new JFrame();
        frame = setFrame();
        frame.setLayout(new BorderLayout());

        switchPanel = new JPanel(switchLayout);

        //typePanel = new JPanel(new BorderLayout());

        brandPanel = new JPanel(new GridLayout(1,5,5,10));
        brandPanel.setBackground(Color.decode("#c2e5f9"));

        mainPanel = new JPanel(new GridLayout(2,6,5,10));
        mainPanel.setBackground(Color.decode("#c2e5f9"));

        switchPanel.add(mainPanel, "1");
        switchPanel.add(brandPanel, "2");

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
                            buttonNum = 4;
                            brand[0] = "Ford";
                            brand[1] = "Honda";
                            brand[2] = "Mazda";
                            brand[3] = "Toyota";
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
                            buttonNum = 3;
                            brand[0] = "Ford";
                            brand[1] = "Mazda";
                            brand[2] = "Toyota";
                            break;
                        case 11:
                            buttonNum = 2;
                            brand[0] = "BMW";
                            brand[1] = "Toyota";
                            break;
                    }

                    for(int i = 0; i < buttonNum; i++){
                        JButton brandButton = new JButton(brand[i]);
                        brandButton.setFocusable(false);
                        brandButton.setBackground(Color.decode("#5d99bc"));
                        brandButton.setFont(new Font("Arial", Font.BOLD, 30));
                        brandButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                frame.dispose();
                                new DashboardUI();
                            }
                        });
                        brandPanel.add(brandButton);
            
                    }

                    switchLayout.show(switchPanel,"2");
                    subTitle.setText("Choose a Brand");
                }
            });
            mainPanel.add(typeButton[i]);
        }

        titlePanel.add(title,BorderLayout.NORTH);
        titlePanel.add(subTitle,BorderLayout.SOUTH);

        //typePanel.add(titlePanel, BorderLayout.NORTH);
        //typePanel.add(mainPanel, BorderLayout.CENTER);
        
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(switchPanel, BorderLayout.CENTER);

    }
}
