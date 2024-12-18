package oop.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class InventoryUI {

    private JFrame frame;
    private JPanel titlePanel;
    private JPanel dashboardPanel;
    private JPanel infoPanel;
    private JPanel buttonPanel;
    private JPanel transactionPanel;
    private JPanel loaderPanel;
    private JPanel headerPanel;
    private JPanel tablePanel;
    private JLabel[] infoLabel;
    private JLabel[][] loaderLabel;
    private JLabel titleLabel;
    private JButton addButton;
    private JButton removeButton;
    private JButton exitButton;
    private JTextField productIDField;
    private JTextField priceField;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JTextField middleNameField;
    private JTextField ageField;
    private JTextField identificationNumberField;
    private JTextField addField;

    public InventoryUI(){
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

        infoPanel = new JPanel(new GridLayout(3,2));
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

        String[] carInfoString = {"Brand: ", "Product ID: " ,"Model: ", "Type: ","Stock: "};

        for(int i = 0; i < 5; i++){
            infoLabel[i] = new JLabel(carInfoString[i]);
            infoLabel[i].setFont(new Font("Arial", Font.PLAIN, 27));
            infoPanel.add(infoLabel[i]);
        }

        buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.setBackground(Color.WHITE);

        JPanel flowPanel1 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        flowPanel1.setBackground(Color.WHITE);
        JPanel flowPanel2 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        flowPanel2.setBackground(Color.WHITE);

        JLabel subtitle1 = new JLabel("INFORMATION");
        subtitle1.setFont(new Font("Arial", Font.BOLD, 27));
        JLabel subtitle2 = new JLabel("TRANSACTION");
        subtitle2.setFont(new Font("Arial", Font.BOLD, 27));
        subtitle2.setOpaque(true);
        subtitle2.setBackground(transactionColor);

        addField = new JTextField();
        addField.setColumns(10);
        addField.setFont(new Font("Arial", Font.PLAIN, 20));

        addButton = new JButton("Add");
        addButton.setFont(new Font("Arial", Font.PLAIN, 27));
        addButton.setFocusable(false);
        addButton.setBackground(Color.decode("#5d99bc"));
        addButton.setForeground(Color.WHITE);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null,
                        "Add to Inventory?","Inventory Update",JOptionPane.YES_NO_OPTION);
                if(response == JOptionPane.YES_OPTION){
                    frame.dispose();
                    new CarOptionUI(true);
                }

            }
        });

        exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 27));
        exitButton.setFocusable(false);
        exitButton.setBackground(Color.GRAY);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new CarOptionUI(true);
            }
        });

        removeButton = new JButton("Remove");
        removeButton.setFont(new Font("Arial", Font.PLAIN, 27));
        removeButton.setFocusable(false);
        removeButton.setBackground(Color.WHITE);
        removeButton.setForeground(Color.decode("#545454"));
        removeButton.setEnabled(false);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null,
                        "Remove to Inventory?","Inventory Update",JOptionPane.YES_NO_OPTION);
                if(response == JOptionPane.YES_OPTION){
                    //frame.dispose();
                    //new CarOptionUI();
                }
            }
        });

        flowPanel1.add(addField);
        flowPanel1.add(addButton);
        flowPanel1.add(removeButton);

        flowPanel2.add(exitButton);

        buttonPanel.add(flowPanel1, BorderLayout.SOUTH);
        buttonPanel.add(flowPanel2, BorderLayout.NORTH);

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
                        for(int k = 0; k < 5; k++)
                            infoLabel[k].setText(carInfoString[k] + k);

                        removeButton.setEnabled(true);
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

        dashboardPanel.add(infoPanel, BorderLayout.CENTER);
        dashboardPanel.add(buttonPanel, BorderLayout.EAST);

        titlePanel.add(titleLabel);
        frame.add(dashboardPanel, BorderLayout.CENTER);
        frame.add(loaderPanel, BorderLayout.SOUTH);
        frame.add(titlePanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}

