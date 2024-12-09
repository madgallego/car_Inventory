package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserConfigUI extends CarUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel title;
    private JButton agentButton;
    private JButton analystButton;

    public UserConfigUI(){
        initialize();
    }

    private void initialize(){

        frame = new JFrame();

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        panel.setBounds(0,0,800,500);

        title = new JLabel("Who's using?");
        title.setBounds(240,140,400,70);
        title.setFont(new Font("Times New Roman",Font.BOLD,52));

        agentButton = super.createButton("Agent");
        agentButton.setBounds(250,270,100,40);
        agentButton.addActionListener(this);

        analystButton = createButton("Analyst");
        analystButton.setBounds(410,270,100,40);
        analystButton.addActionListener(this);

        frame = super.setFrame();

        frame.add(panel);

        panel.add(title);
        panel.add(agentButton);
        panel.add(analystButton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        frame.dispose();
        if(e.getSource() == agentButton){
            SignInUI signIn = new SignInUI("Agent");
        }
        else if(e.getSource() == analystButton){
            SignInUI signIn = new SignInUI("Analyst");
        }
    }
}