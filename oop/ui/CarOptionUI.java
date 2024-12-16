package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarOptionUI extends CarUI {

    private JFrame frame;
    private JPanel mainPanel;
    private JPanel titlePanel;
    private JLabel title;
    private JLabel subTitle;

    public CarOptionUI(){
        frame = new JFrame();
        frame = setFrame();
        frame.setLayout(new BorderLayout());

        mainPanel = new JPanel(new GridLayout(2,7,5,10));
        mainPanel.setBackground(Color.decode("#c2e5f9"));

        String[] cars = {"Convertible","Coupe","Crossover","Electric Vehicle",
       "Hatchbacks","Hybrids","Luxury Cars","Microcars",
        "Minivans","Pickup Trucks","Sedan","Sports Car",
        "Station Wagons","SUV"};

        for(int i = 0; i < 14; i++){
            JButton button = new JButton(cars[i]);
            button.setFocusable(false);
            button.setBackground(Color.decode("#5d99bc"));
            //button.setForeground(Color.decode("#545454"));
            button.setFont(new Font("Arial", Font.BOLD, 10));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    new DashboardUI();
                }
            });
            mainPanel.add(button);
        }

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

        titlePanel.add(title,BorderLayout.NORTH);
        titlePanel.add(subTitle,BorderLayout.SOUTH);

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

    }
}
