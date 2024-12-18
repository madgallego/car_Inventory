package oop.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import oop.car.Car;
import oop.car.Convertible;
import oop.car.Coupe;
import oop.car.Crossover;
import oop.car.EV;
import oop.car.Hatchback;
import oop.car.Luxury;
import oop.car.Minivan;
import oop.car.SUV;
import oop.car.Sedan;
import oop.car.SportsCar;
import oop.car.Truck;
import oop.car.Wagon;
import oop.utils.CarLoader;
import oop.utils.Transaction;

public class InventoryUI {
    private Car selected;
    private int carType;
    private String carBrand;
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

    public InventoryUI(int type, String brand){
        carType=type;
        carBrand=brand;
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

        infoLabel = new JLabel[5];

        String[] carInfoString = {"Brand: ", "Model: " ,"Type: ", "Product ID: ","Stock: "};

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
                    Transaction.restock(selected, Integer.parseInt(addField.getText()));
                    //int newNum = selected.getNum() + Integer.parseInt(addField.getText());
                    //selected.setNum(newNum);
                    infoLabel[4].setText("Stock: " + selected.getNum());
                    //frame.dispose();
                    //new CarOptionUI(true);
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
                    Transaction.destock(selected, Integer.parseInt(addField.getText()));
                    //int newNum = selected.getNum() - Integer.parseInt(addField.getText());
                    //selected.setNum(newNum);
                    infoLabel[4].setText("Stock: " + selected.getNum());
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

        String[] header = {"Brand","Model","Product ID","Price"};

        for(int i = 0; i < 4; i++){
            JLabel label = new JLabel(header[i], SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 27));
            label.setOpaque(true);
            label.setBackground(tableColor);
            headerPanel.add(label);
        }

        loaderLabel = new JLabel[10][4];

        int i=0;
        switch (carType) {
            case 0:
                ArrayList<Convertible> ListInfo0 = CarLoader.loadConvertible(carBrand);
                System.out.println("File Read!");
                 i = 0;
                while(i<ListInfo0.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo0.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo0.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo0.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo0.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo0.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo0.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo0.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo0.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo0.get(row).getNum());
                                selected=ListInfo0.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;


            
            case 1: //Coupe
                ArrayList<Coupe> ListInfo1 = CarLoader.loadCoupe(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo1.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo1.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo1.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo1.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo1.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo1.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo1.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo1.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo1.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo1.get(row).getNum());
                                selected=ListInfo1.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;


            case 2:
                ArrayList<Crossover> ListInfo2 = CarLoader.loadCrossover(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo2.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo2.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo2.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo2.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo2.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo2.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo2.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo2.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo2.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo2.get(row).getNum());
                                selected=ListInfo2.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;

            case 3:
                ArrayList<EV> ListInfo3 = CarLoader.loadEV(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo3.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo3.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo3.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo3.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo3.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo3.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo3.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo3.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo3.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo3.get(row).getNum());
                                selected=ListInfo3.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }

                break;
            case 4:
                ArrayList<Hatchback> ListInfo4 = CarLoader.loadHatchback(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo4.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo4.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo4.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo4.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo4.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo4.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo4.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo4.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo4.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo4.get(row).getNum());
                                selected=ListInfo4.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }

                break;
            case 5:
                ArrayList<Luxury> ListInfo5 = CarLoader.loadLuxury(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo5.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo5.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo5.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo5.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo5.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo5.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo5.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo5.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo5.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo5.get(row).attribs.get(0));
                                selected=ListInfo5.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;
            case 6:
                ArrayList<Minivan> ListInfo6 = CarLoader.loadMinivan(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo6.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo6.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo6.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo6.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo6.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo6.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo6.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo6.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo6.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo6.get(row).getNum());
                                selected=ListInfo6.get(row);
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;
            case 7:
                ArrayList<Truck> ListInfo7 = CarLoader.loadTruck(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo7.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo7.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo7.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo7.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo7.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo7.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo7.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo7.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo7.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo7.get(row).getNum());
                                selected=ListInfo7.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;

            case 8:
                ArrayList<Sedan> ListInfo8 = CarLoader.loadSedan(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo8.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo8.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo8.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo8.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo8.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo8.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo8.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo8.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo8.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo8.get(row).getNum());
                                selected=ListInfo8.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }

                break;
            case 9:
                ArrayList<SportsCar> ListInfo9 = CarLoader.loadSportsCar(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo9.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo9.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo9.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo9.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo9.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo9.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo9.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo9.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo9.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo9.get(row).getNum());
                                selected=ListInfo9.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;
            case 10:
                ArrayList<Wagon> ListInfo10 = CarLoader.loadWagon(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo10.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo10.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo10.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo10.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo10.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo10.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo10.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo10.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo10.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo10.get(row).getNum());
                                selected=ListInfo10.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;
            case 11:
                ArrayList<SUV> ListInfo11 = CarLoader.loadSUV(carBrand);
                System.out.println("File Read!");
                i = 0;
                while(i<ListInfo11.size()){
                    for(int j = 0; j < 4; j++){
                        switch (j) {
                            case 0:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo11.get(i).getBrand());
                                break;
                            case 1:
                                loaderLabel[i][j] = new JLabel("    " + ListInfo11.get(i).getModel());
                                break;
                            case 2:
                                loaderLabel[i][j] = new JLabel("    " + " " + ListInfo11.get(i).getCarID());
                                break;
                            case 3:
                                loaderLabel[i][j] = new JLabel("    " + "Php " +ListInfo11.get(i).getPrice()+"0");
                                break;
                        }
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 22));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
        
                        final int row = i;
                        loaderLabel[i][j].addMouseListener(new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                infoLabel[0].setText(carInfoString[0] + ListInfo11.get(row).attribs.get(1));
                                infoLabel[1].setText(carInfoString[1] + ListInfo11.get(row).attribs.get(2));
                                infoLabel[2].setText(carInfoString[2] + ListInfo11.get(row).attribs.get(10));
                                infoLabel[3].setText(carInfoString[3] + ListInfo11.get(row).attribs.get(0));
                                infoLabel[4].setText(carInfoString[4] + ListInfo11.get(row).getNum());
                                selected=ListInfo11.get(row);
        
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
                    i++;
                     
                }
                //filler trays
                while(i<10){
                    for(int j = 0; j < 4; j++){
                        loaderLabel[i][j] = new JLabel(" ");
                        loaderLabel[i][j].setFont(new Font("Arial", Font.PLAIN, 27));
                        loaderLabel[i][j].setOpaque(true);
                        loaderLabel[i][j].setBackground(Color.WHITE);
                        tablePanel.add(loaderLabel[i][j]);
                }
                    i++;
                }
                break;
            default:
                throw new AssertionError();
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

