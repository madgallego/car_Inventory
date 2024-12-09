package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartUI extends CarUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel title;
    private JLabel subtitle;
    private JButton button;

    public StartUI(){
        initialize();
    }

    private void initialize(){

        frame = new JFrame();

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(0,0,800,500);

        title = new JLabel("SASACIAN");
        title.setBounds(258,140,400,40);
        title.setFont(new Font("Times New Roman",Font.BOLD,52));

        subtitle = new JLabel("System Algorithm for Sales, Car Inventory, and Analysis");
        subtitle.setBounds(128,200,600,30);
        subtitle.setFont(new Font("Times New Roman",Font.ITALIC,22));

        button = createButton("START");
        button.addActionListener(this);
        button.setBounds(328,270,100,40);

        frame = super.setFrame();

        frame.add(panel);

        panel.add(title);
        panel.add(subtitle);
        panel.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        UserConfigUI config = new UserConfigUI();
    }
}