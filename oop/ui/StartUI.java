package oop.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import oop.user.Admin;
import oop.utils.*;

public class StartUI implements ActionListener {
    private boolean adminCheck;
    private JFrame frame;
    private JPanel switchPanel;
    private JPanel startPanel;
    private JPanel userConfigPanel;
    private JPanel signInPanel;
    private JLabel title;
    private JLabel subtitle;
    private JLabel userLabel;
    private JLabel signInLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField username;
    private JPasswordField password;
    private JButton startButton;
    private JButton quitButton;
    private JButton agentButton;
    private JButton adminButton;
    private JButton loginButton;
    private JButton backButton1;
    private JButton backButton2;
    private CardLayout switchLayout = new CardLayout();

    public StartUI(){
        initialize();
    }

    private void initialize(){

        frame = new JFrame();
        frame.setTitle("SASACIAN");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(900, 450);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        switchPanel = new JPanel(switchLayout);

        startPanel = new JPanel();
        startPanel.setLayout(null);
        startPanel.setBackground(Color.decode("#c2e5f9"));
        startPanel.setBounds(0,0,900,450);

        title = new JLabel("SASACIAN");
        title.setBounds(318,110,400,40);
        title.setFont(new Font("Times New Roman",Font.BOLD,52));

        subtitle = new JLabel("System Algorithm for Sales, Car Inventory, and Analysis");
        subtitle.setBounds(188,170,600,30);
        subtitle.setFont(new Font("Times New Roman",Font.ITALIC,22));

        startButton = new JButton("START");
        startButton.addActionListener(this);
        startButton.setBounds(338,240,200,40);
        startButton.setBackground(Color.decode("#5d99bc"));
        startButton.setFont(new Font("Times New Roman",Font.BOLD,15));

        quitButton = new JButton("QUIT");
        quitButton.addActionListener(this);
        quitButton.setBounds(338,290,200,40);
        quitButton.setBackground(Color.decode("#5d99bc"));
        quitButton.setFont(new Font("Times New Roman",Font.BOLD,15));

        switchPanel.add(startPanel, "1");

        userConfigPanel = new JPanel();
        userConfigPanel.setLayout(null);
        userConfigPanel.setBackground(Color.decode("#c2e5f9"));
        userConfigPanel.setBounds(0,0,800,500);

        userLabel = new JLabel("Who's using?");
        userLabel.setBounds(290,110,400,70);
        userLabel.setFont(new Font("Times New Roman",Font.BOLD,52));

        agentButton = new JButton("Agent");
        agentButton.setBounds(270,200,150,40);
        agentButton.addActionListener(this);
        agentButton.setBackground(Color.decode("#5d99bc"));
        agentButton.setFont(new Font("Times New Roman",Font.BOLD,15));

        adminButton = new JButton("Admin");
        adminButton.setBounds(450,200,150,40);
        adminButton.addActionListener(this);
        adminButton.setBackground(Color.decode("#5d99bc"));
        adminButton.setFont(new Font("Times New Roman",Font.BOLD,15));

        backButton1 = new JButton("Back");
        backButton1.setBounds(370,340,130,30);
        backButton1.addActionListener(this);
        backButton1.setBackground(Color.GRAY);
        backButton1.setFont(new Font("Times New Roman",Font.BOLD,15));

        userConfigPanel.add(userLabel);
        userConfigPanel.add(agentButton);
        userConfigPanel.add(adminButton);
        userConfigPanel.add(backButton1);

        switchPanel.add(userConfigPanel, "2");

        frame.add(switchPanel, BorderLayout.CENTER);

        signInPanel = new JPanel();
        signInPanel.setLayout(null);
        signInPanel.setBackground(Color.decode("#c2e5f9"));
        signInPanel.setBounds(0,0,400,500);

        signInLabel = new JLabel();
        signInLabel.setFont(new Font("Times New Roman", Font.BOLD,25));
        signInLabel.setBounds(50,80,400,30);

        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN,17));
        usernameLabel.setBounds(50,130,200,30);

        username = new JTextField(10);
        username.setBounds(50,158,200,40);
        username.setMargin(new Insets(6,6,6,6));
        username.setFont(new Font("Times New Roman", Font.PLAIN,14));
        username.addActionListener(this);
        //username.setMargin(new Insets(5, 10, 5, 10));

        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN,17));
        passwordLabel.setBounds(50,200,200,30);

        password = new JPasswordField(10);
        password.setBounds(50,228,200,40);
        password.setMargin(new Insets(6,6,6,6));
        password.setFont(new Font("Times New Roman", Font.PLAIN,14));
        //password.setMargin(new Insets(5, 10, 5, 10));

        loginButton = new JButton("Login");
        loginButton.setBounds(50,280,100,30);
        loginButton.addActionListener(this);
        loginButton.setBackground(Color.decode("#5d99bc"));
        loginButton.setFont(new Font("Times New Roman",Font.BOLD,15));

        backButton2 = new JButton("Back");
        backButton2.setBounds(180,280,100,30);
        backButton2.addActionListener(this);
        backButton2.setBackground(Color.GRAY);
        backButton2.setFont(new Font("Times New Roman",Font.BOLD,15));

        switchPanel.add(signInPanel, "3");

        signInPanel.add(signInLabel);
        signInPanel.add(usernameLabel);
        signInPanel.add(passwordLabel);
        signInPanel.add(username);
        signInPanel.add(password);
        signInPanel.add(loginButton);
        signInPanel.add(backButton2);

        startPanel.add(title);
        startPanel.add(subtitle);
        startPanel.add(startButton);
        startPanel.add(quitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton){
            switchLayout.show(switchPanel, "2");
        }
        else if(e.getSource() == quitButton){
            frame.dispose();
        }
        else if(e.getSource() == backButton1){
            switchLayout.show(switchPanel, "1");
        }
        else if(e.getSource() == agentButton){
            adminCheck=false;
            signInLabel.setText("Good Day, Agent!");
            switchLayout.show(switchPanel, "3");
        }
        else if(e.getSource() == adminButton){
            adminCheck=true;
            signInLabel.setText("Good Day, Admin!");
            switchLayout.show(switchPanel, "3");
        }
        else if(e.getSource() == loginButton){
            ArrayList<Admin> adminList = UserLoader.loadAdmin();//location of the database for admin
            String passKey = new String (password.getPassword());//string representation of the password

            //checking the validity of user input
            if(username.getText().isEmpty() || password.getPassword().length == 0){
                JOptionPane.showMessageDialog(null, "Input on both fields before logging in", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(Admin.authName(adminList, username.getText(), passKey) ){
                System.out.println(username.getText());
                System.out.println(passKey);
                    frame.dispose();
                    new CarOptionUI(adminCheck);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong username or password. Please try again!", "Security Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource() == backButton2){
            switchLayout.show(switchPanel, "2");
        }
    }
}
