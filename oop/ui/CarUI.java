package oop.ui;

import javax.swing.*;
import java.awt.*;

public class CarUI {
    private JFrame frame;
    private JButton button;

    public JFrame setFrame(){
        frame = new JFrame();
        frame.setTitle("SASACIAN");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(900, 450);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        return frame;
    }

    public JButton createButton(String name){
        button = new JButton(name);
        button.setFocusable(false);
        button.setFont(new Font("Arial",Font.BOLD,16));

        return button;
    }
}
