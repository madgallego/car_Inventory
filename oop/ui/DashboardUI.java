package oop.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DashboardUI {

    private JFrame frame;
    private JPanel titlePanel;
    private JPanel dashboardPanel;
    private JPanel switchPanel1;
    private JPanel switchPanel2;
    private JPanel switchPanel3;
    private JPanel infoPanel;
    private JPanel buttonPanel;
    private JPanel transactionPanel;
    private JPanel loaderPanel;
    private JPanel headerPanel;
    private JPanel tablePanel;
    private JLabel[] infoLabel;
    private JLabel[][] loaderLabel;
    private JLabel titleLabel;
    private JButton chooseButton;
    private JButton exitButton;
    private JButton confirmButton;
    private JButton cancelButton;
    private JTextField productIDField;
    private JTextField priceField;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField middleNameField;
    private JTextField ageField;
    private JTextField identificationNumberField;
    private CardLayout switchLayout1 = new CardLayout();
    private CardLayout switchLayout2 = new CardLayout();
    private CardLayout switchLayout3 = new CardLayout();

    public DashboardUI(){
        frame = new JFrame();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setLayout(new BorderLayout());

        Color titleColor = Color.decode("#5d99bc");
        Color transactionColor = Color.decode("#c2e5f9");
        Color tableColor = Color.decode("#def4ff");
        Color chooseColor = Color.decode("#d1f5ff");

        titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        titlePanel.setBackground(titleColor);

        titleLabel = new JLabel("DASHBOARD");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 37));
        titleLabel.setForeground(Color.WHITE);

        dashboardPanel = new JPanel(new BorderLayout());

        switchPanel1 = new JPanel(switchLayout1);
        switchPanel2 = new JPanel(switchLayout2);
        switchPanel3 = new JPanel(switchLayout3);
        switchPanel3.setBackground(Color.WHITE);

        infoPanel = new JPanel(new GridLayout(6,2));
        infoPanel.setBackground(Color.WHITE);

        transactionPanel = new JPanel(new GridLayout(3,2));
        transactionPanel.setBackground(transactionColor);

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel1.setBackground(transactionColor);
        productIDField = new JTextField();
        productIDField.setMargin(new Insets(5,5,5,5));
        productIDField.setColumns(10);
        productIDField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label1 = new JLabel("Product ID");
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel1.add(label1);
        panel1.add(productIDField);
        transactionPanel.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel2.setBackground(transactionColor);
        priceField = new JTextField();
        priceField.setColumns(10);
        priceField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label2 = new JLabel("Price");
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(label2);
        panel2.add(priceField);
        transactionPanel.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel3.setBackground(transactionColor);
        lastNameField = new JTextField();
        lastNameField.setColumns(7);
        lastNameField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label3 = new JLabel("Last Name");
        label3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(label3);
        panel3.add(lastNameField);

        firstNameField = new JTextField();
        firstNameField.setColumns(7);
        firstNameField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label4 = new JLabel("First Name");
        label4.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(label4);
        panel3.add(firstNameField);
        transactionPanel.add(panel3);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel4.setBackground(transactionColor);
        middleNameField = new JTextField();
        middleNameField.setColumns(7);
        middleNameField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label5 = new JLabel("Middle Name");
        label5.setFont(new Font("Arial", Font.PLAIN, 20));
        panel4.add(label5);
        panel4.add(middleNameField);

        ageField = new JTextField();
        ageField.setColumns(7);
        ageField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label6 = new JLabel("Age");
        label6.setFont(new Font("Arial", Font.PLAIN, 20));
        panel4.add(label6);
        panel4.add(ageField);
        transactionPanel.add(panel4);

        JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel5.setBackground(transactionColor);
        identificationNumberField = new JTextField();
        identificationNumberField.setColumns(10);
        identificationNumberField.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel label7 = new JLabel("Identification Number");
        label7.setFont(new Font("Arial", Font.PLAIN, 20));
        panel5.add(label7);
        panel5.add(identificationNumberField);
        transactionPanel.add(panel5);

        infoLabel = new JLabel[12];

        String[] carInfoString = {"Product: ","Dimension: ","Size: ","Product ID: ","Weight: ","Style: ",
                "Brand: ","Capacity: ","Model: ","Engine: ","Type: ","Horsepower: "};

        for(int i = 0; i < 12; i++){
            infoLabel[i] = new JLabel(carInfoString[i]);
            infoLabel[i].setFont(new Font("Arial", Font.PLAIN, 27));
            infoPanel.add(infoLabel[i]);
        }

        buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.setBackground(Color.WHITE);

        JPanel flowPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowPanel1.setBackground(Color.WHITE);
        JPanel flowPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowPanel2.setBackground(Color.WHITE);
        JPanel flowPanel3 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JPanel flowPanel4 = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        JLabel subtitle1 = new JLabel("INFORMATION");
        subtitle1.setFont(new Font("Arial", Font.BOLD, 27));
        JLabel subtitle2 = new JLabel("TRANSACTION");
        subtitle2.setFont(new Font("Arial", Font.BOLD, 27));
        subtitle2.setOpaque(true);
        subtitle2.setBackground(transactionColor);

        flowPanel3.add(subtitle1);
        flowPanel4.add(subtitle2);


        switchPanel1.add(infoPanel, "1");
        switchPanel1.add(transactionPanel, "2");

        switchPanel2.add(flowPanel1, "1");
        switchPanel2.add(flowPanel2, "2");

        switchPanel3.add(subtitle1, "1");
        switchPanel3.add(subtitle2, "2");

        chooseButton = new JButton("Choose");
        chooseButton.setFont(new Font("Arial", Font.PLAIN, 27));
        chooseButton.setFocusable(false);
        chooseButton.setBackground(Color.decode("#5d99bc"));
        chooseButton.setEnabled(false);
        chooseButton.setForeground(Color.WHITE);

        chooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchLayout1.show(switchPanel1, "2");
                switchLayout2.show(switchPanel2, "2");
                switchLayout3.show(switchPanel3, "2");
                buttonPanel.setBackground(transactionColor);
                flowPanel2.setBackground(transactionColor);
            }
        });

        exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 27));
        exitButton.setFocusable(false);
        exitButton.setBackground(Color.WHITE);
        exitButton.setForeground(Color.decode("#545454"));

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        confirmButton = new JButton("Confirm");
        confirmButton.setFont(new Font("Arial", Font.PLAIN, 27));
        confirmButton.setFocusable(false);
        confirmButton.setBackground(Color.decode("#5d99bc"));
        confirmButton.setForeground(Color.WHITE);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                //productIDField
                //priceField
                //lastNameField
                //firstNameField
                //middleNameField
                //ageField
                //identificationNumberField
            }
        });

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 27));
        cancelButton.setFocusable(false);
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setForeground(Color.decode("#545454"));

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchLayout1.show(switchPanel1, "1");
                switchLayout2.show(switchPanel2, "1");
                switchLayout3.show(switchPanel3, "1");
                buttonPanel.setBackground(Color.WHITE);
                flowPanel2.setBackground(Color.WHITE);
            }
        });

        flowPanel1.add(chooseButton);
        flowPanel1.add(exitButton);
        flowPanel2.add(confirmButton);
        flowPanel2.add(cancelButton);

        buttonPanel.add(switchPanel2, BorderLayout.SOUTH);

        loaderPanel = new JPanel(new BorderLayout());
        loaderPanel.setBackground(Color.BLACK);

        headerPanel = new JPanel(new GridLayout(1,4));

        tablePanel = new JPanel(new GridLayout(10,4,1,1));
        tablePanel.setBackground(Color.BLACK);

        loaderPanel.add(headerPanel, BorderLayout.NORTH);
        loaderPanel.add(tablePanel, BorderLayout.CENTER);

        String[] header = {"Manufacturer","Model","Stock","Price"};

        for(int i = 0; i < 4; i++){
            JLabel label = new JLabel(header[i], SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 27));
            label.setOpaque(true);
            label.setBackground(tableColor);
            headerPanel.add(label);
        }

        loaderLabel = new JLabel[10][4];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 4; j++){
                loaderLabel[i][j] = new JLabel("Info " + i + j);
                loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                loaderLabel[i][j].setOpaque(true);
                loaderLabel[i][j].setBackground(Color.WHITE);

                final int row = i;
                loaderLabel[i][j].addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        for(int k = 0; k < 12; k++)
                            infoLabel[k].setText(carInfoString[k] + k);

                        chooseButton.setEnabled(true);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        for(int k = 0; k < 4; k++)
                            loaderLabel[row][k].setBackground(chooseColor);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        for(int k = 0; k < 4; k++)
                            loaderLabel[row][k].setBackground(Color.WHITE);
                    }
                });

                tablePanel.add(loaderLabel[i][j]);
            }
        }

        dashboardPanel.add(switchPanel3, BorderLayout.NORTH);
        dashboardPanel.add(switchPanel1, BorderLayout.CENTER);
        dashboardPanel.add(buttonPanel, BorderLayout.EAST);

        titlePanel.add(titleLabel);
        frame.add(dashboardPanel, BorderLayout.CENTER);
        frame.add(loaderPanel, BorderLayout.SOUTH);
        frame.add(titlePanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }

}
