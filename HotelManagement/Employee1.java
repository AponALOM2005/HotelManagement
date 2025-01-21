import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Employee1 extends JFrame implements ActionListener {
    private ImageIcon icon, icon2, image;
    private Container c;
    private JTable table;
    private String path;
    private JScrollBar scroll;
    private Font f1, font, font2;
    private DefaultTableModel model;
    private Cursor cur;

    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gndLabel, nidLabel, membShowLabel, checkInTimeLabel, checkInTimeShowLabel, daysLabel, roomsLabel, rtLabel, rnLabel, adLabel, arLabel, rbLabel, rbShowLabel, paidLabel, paidShowLabel, dueLabel, dueShowLabel, passLabel, bgpic, billShowLabel, fishShowLabel, beefShowLabel, muttonShowLabel, duckShowLabel,riceShowLabel, apShowLabel, mkShowLabel, ltShowLabel, ckShowLabel, ccShowLabel, tShowLabel, cShowLabel, ojShowLabel, mjShowLabel, csShowLabel, fishBillShowLabel, beefBillShowLabel, muttonBillShowLabel, duckBillShowLabel, riceBillShowLabel, apBillShowLabel, mkBillShowLabel, ltBillShowLabel, ckBillShowLabel, ccBillShowLabel, tBillShowLabel, cBillShowLabel, ojBillShowLabel,mjBillShowLabel, csBillShowLabel, foodBillShowLabel, foodBill,
            daysPerWeekLabel, positionLabel, incomeLabel, itLabel;

    private JButton backButton, fishBillButton, beefBillButton, muttonBillButton, duckBillButton, riceBillButton, apBillButton, mkBillButton, ltBillButton, ckBillButton, ccBillButton,  tBillButton, cBillButton, ojBillButton, mjBillButton, csBillButton, fishCancelButton, beefCancelButton, muttonCancelButton, duckCancelButton,riceCancelButton,  apCancelButton, mkCancelButton, ltCancelButton, ckCancelButton, ccCancelButton, tCancelButton, cCancelButton, ojCancelButton, mjCancelButton, csCancelButton, paymentButton, billButton;

    private JTextField titleTf, fnTf, lnTf, phoneTf, gndTf, nidTf,
            daysPerWeekTf, positionTf, incomeTf, ocpTf, membTf, checkInTimeTf, daysTf, roomsTf, rtTf, rnTf, adTf, arTf, rbTf, paidTf, dueTf, passTf, itTf;



    private JSpinner fishSpinner, beefSpinner, muttonSpinner, duckSpinner, riceSpinner,apSpinner, mkSpinner, ltSpinner, ckSpinner, ccSpinner, tSpinner, cSpinner, ojSpinner, mjSpinner, csSpinner;
    
    private JCheckBox fishCheckBox, beefCheckBox, muttonCheckBox, duckCheckBox, riceCheckBox, applePieCheckBox, malaiKulfiCheckBox, lemonTartCheckBox, coconutKheerCheckBox, cupCakeCheckBox, tCheckBox, cCheckBox, ojCheckBox, mjCheckBox, csCheckBox;
        
    private SpinnerNumberModel valueOfFish, valueOfBeef, valueOfMutton, valueOfduck, valueOfRice, valueOfAp, valueOfMk, valueOfLt, valueOfCk, valueOfCc, valueOfT, valueOfC, valueOfOj, valueOfMj, valueOfCs;
        

    Employee1(String path) {
        this.path = path;
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 680);
        this.setLocationRelativeTo(null);
        this.setTitle("Employee Panel");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        // this part changes the icon
        icon = new ImageIcon(getClass().getResource("IMG/icon.jpg"));
        this.setIconImage(icon.getImage());

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Employee Profile Panel:");
        titleLabel.setFont(font);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(10, 10, 250, 50);
        c.add(titleLabel);

        // JLabels Start
        fnLabel = new JLabel("First Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        fnLabel.setForeground(Color.WHITE);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(150, 80, 200, 30);
        fnTf.setText("Shahriar");
        fnTf.setEditable(false);
        fnTf.setFont(font);
        c.add(fnTf);

        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 140, 30);
        lnLabel.setFont(font);
        lnLabel.setForeground(Color.WHITE);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(150, 130, 200, 30);
        lnTf.setText("Shanto");
        lnTf.setEditable(false);
        lnTf.setFont(font);
        c.add(lnTf);

        // Phone
        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10, 180, 140, 30);
        phoneLabel.setFont(font);
        phoneLabel.setForeground(Color.WHITE);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(150, 180, 200, 30);
        phoneTf.setText("01912405486");
        phoneTf.setEditable(false);
        phoneTf.setFont(font);
        c.add(phoneTf);

        // Gender
        gndLabel = new JLabel("Gender");
        gndLabel.setBounds(10, 230, 140, 30);
        gndLabel.setFont(font);
        gndLabel.setForeground(Color.WHITE);
        c.add(gndLabel);

        gndTf = new JTextField();
        gndTf.setBounds(150, 230, 200, 30);
        gndTf.setText("Male");
        gndTf.setEditable(false);
        gndTf.setFont(font);
        c.add(gndTf);

        // Nid Number
        nidLabel = new JLabel("Nid Number");
        nidLabel.setBounds(10, 280, 140, 30);
        nidLabel.setFont(font);
        nidLabel.setForeground(Color.WHITE);
        c.add(nidLabel);

        nidTf = new JTextField();
        nidTf.setBounds(150, 280, 200, 30);
        nidTf.setText("0123456789");
        nidTf.setEditable(false);
        nidTf.setFont(font);
        c.add(nidTf);

        daysPerWeekLabel = new JLabel("Working Days");
        daysPerWeekLabel.setBounds(10, 330, 140, 30);
        daysPerWeekLabel.setFont(font);
        daysPerWeekLabel.setForeground(Color.WHITE);
        c.add(daysPerWeekLabel);

        daysPerWeekTf = new JTextField("Sun,Tue,Thu");
        daysPerWeekTf.setBounds(150, 330, 200, 30);
        daysPerWeekTf.setEditable(false);
        daysPerWeekTf.setFont(font);

        c.add(daysPerWeekTf);

        positionLabel = new JLabel("Position");
        positionLabel.setBounds(10, 380, 140, 30);
        positionLabel.setFont(font);
        positionLabel.setForeground(Color.WHITE);
        c.add(positionLabel);

        positionTf = new JTextField("Manager");
        positionTf.setBounds(150, 380, 200, 30);
        positionTf.setFont(font);
        positionTf.setEditable(false);

        c.add(positionTf);

        incomeLabel = new JLabel("Salary");
        incomeLabel.setBounds(10, 430, 140, 30);
        incomeLabel.setFont(font);
        incomeLabel.setForeground(Color.WHITE);
        c.add(incomeLabel);

        incomeTf = new JTextField("15000tk");
        incomeTf.setBounds(150, 430, 200, 30);
        incomeTf.setFont(font);
        incomeTf.setEditable(false);

        c.add(incomeTf);

       
        //ITEM
        JLabel meals = new JLabel("Meals");
        meals.setBounds(410, 60, 200, 20);
        meals.setFont(font);
        meals.setForeground(Color.WHITE);
        c.add(meals);

        fishCheckBox = new JCheckBox("Fish(500tk)");
        fishCheckBox.setBounds(410, 80, 200, 20);
        fishCheckBox.setFont(font);
        fishCheckBox.setBackground(Color.WHITE);
        c.add(fishCheckBox);
        beefCheckBox = new JCheckBox("Beef(700tk)");
        beefCheckBox.setBounds(410, 100, 200, 20);
        beefCheckBox.setFont(font);
        beefCheckBox.setBackground(Color.WHITE);
        c.add(beefCheckBox);
        muttonCheckBox = new JCheckBox("Mutton(900tk)");
        muttonCheckBox.setBounds(410, 120, 200, 20);
        muttonCheckBox.setFont(font);
        muttonCheckBox.setBackground(Color.WHITE);
        c.add(muttonCheckBox);
        duckCheckBox = new JCheckBox("duck(1000tk)");
        duckCheckBox.setBounds(410, 140, 200, 20);
        duckCheckBox.setFont(font);
        duckCheckBox.setBackground(Color.WHITE);
        c.add(duckCheckBox);
        riceCheckBox = new JCheckBox("Rice(100tk)");
        riceCheckBox.setBounds(410, 160, 200, 20);
        riceCheckBox.setFont(font);
        riceCheckBox.setBackground(Color.WHITE);
        c.add(riceCheckBox);

        //Desert
        JLabel desserts = new JLabel("Desserts");
        desserts.setBounds(410, 180, 200, 20);
        desserts.setFont(font);
        desserts.setForeground(Color.WHITE);
        c.add(desserts);
        applePieCheckBox = new JCheckBox("Apple Pie(200tk)");
        applePieCheckBox.setBounds(410, 200, 200, 20);
        applePieCheckBox.setFont(font);
        applePieCheckBox.setBackground(Color.WHITE);
        c.add(applePieCheckBox);
        malaiKulfiCheckBox = new JCheckBox("Malai Kulfie(200tk)");
        malaiKulfiCheckBox.setBounds(410, 220, 200, 20);
        malaiKulfiCheckBox.setFont(font);
        malaiKulfiCheckBox.setBackground(Color.WHITE);
        c.add(malaiKulfiCheckBox);
        lemonTartCheckBox = new JCheckBox("Lemon Tart(200tk)");
        lemonTartCheckBox.setBounds(410, 240, 200, 20);
        lemonTartCheckBox.setFont(font);
        lemonTartCheckBox.setBackground(Color.WHITE);     
        c.add(lemonTartCheckBox);
        coconutKheerCheckBox = new JCheckBox("Coconut Kheer(250tk)");
        coconutKheerCheckBox.setBounds(410, 260, 200, 20);
        coconutKheerCheckBox.setFont(font);
        coconutKheerCheckBox.setBackground(Color.WHITE);
        c.add(coconutKheerCheckBox);
        cupCakeCheckBox = new JCheckBox("Cup Cake(250tk)");
        cupCakeCheckBox.setBounds(410, 280, 200, 20);
        cupCakeCheckBox.setFont(font);
        cupCakeCheckBox.setBackground(Color.WHITE);
        c.add(cupCakeCheckBox);
        
        // Drinks
        JLabel drinks = new JLabel("Drinks");
        drinks.setBounds(410, 300, 200, 20);
        drinks.setFont(font);
        drinks.setForeground(Color.WHITE);
        c.add(drinks);
        tCheckBox = new JCheckBox("Tea(100tk)");
        tCheckBox.setBounds(410, 320, 200, 20);
        tCheckBox.setFont(font);
        tCheckBox.setBackground(Color.WHITE);
        c.add(tCheckBox);
        cCheckBox = new JCheckBox("Coffee(150tk)");
        cCheckBox.setBounds(410, 340, 200, 20);
        cCheckBox.setFont(font);
        cCheckBox.setBackground(Color.WHITE);
        c.add(cCheckBox);
        ojCheckBox = new JCheckBox("Orange Juice(300tk)");
        ojCheckBox.setBounds(410, 360, 200, 20);
        ojCheckBox.setFont(font);
        ojCheckBox.setBackground(Color.WHITE);
        c.add(ojCheckBox);
        mjCheckBox = new JCheckBox("Mango Juice(300tk)");
        mjCheckBox.setBounds(410, 380, 200, 20);
        mjCheckBox.setFont(font);
        mjCheckBox.setBackground(Color.WHITE);
        c.add(mjCheckBox);
        csCheckBox = new JCheckBox("Chocolateshake(350tk)");
        csCheckBox.setBounds(410, 400, 200, 20);
        csCheckBox.setFont(font);
        csCheckBox.setBackground(Color.WHITE);
        c.add(csCheckBox);

        
        itLabel = new JLabel("Item:");
        itLabel.setBounds(410, 430, 140, 30);
        itLabel.setFont(font);
        itLabel.setForeground(Color.WHITE);
        c.add(itLabel);

        itTf = new JTextField();
        itTf.setBounds(410, 460, 300, 150);
        itTf.setFont(font);
        itTf.setEditable(false);
        c.add(itTf);

        //Button
        billButton = new JButton("Cooking");
        billButton.setBounds(850, 130, 120, 30);
        billButton.setCursor(cur);
        billButton.setFont(font);
        c.add(billButton);

        paymentButton = new JButton("Delivery");
        paymentButton.setBounds(850, 180, 120, 30);
        paymentButton.setCursor(cur);
        paymentButton.setFont(font);
        c.add(paymentButton);

        backButton = new JButton("Back");
        backButton.setBounds(850, 230, 120, 30);
        backButton.setCursor(cur);
        backButton.setFont(font);
        c.add(backButton);
        
        // Action Listener
        billButton.addActionListener(this);
        paymentButton.addActionListener(this);
        backButton.addActionListener(this);

        icon2 = new ImageIcon("IMG/a2.jpg");
        bgpic = new JLabel("", icon2, JLabel.CENTER);
        bgpic.setBounds(0, 0, 1000, 680);

        c.add(bgpic);
    }

    public void actionPerformed(ActionEvent e) {
        if (fishCheckBox.isSelected()) {
            String number = fishCheckBox.getText().toString();
            itTf.setText(number);

            }
        if (beefCheckBox.isSelected()) {
            String number = beefCheckBox.getText().toString();
            itTf.setText(number);  
            }
        if (muttonCheckBox.isSelected()) {
                
            String number = muttonCheckBox.getText().toString();
            itTf.setText(number);
            }
        if (duckCheckBox.isSelected()) {

            String number = duckCheckBox.getText().toString();
            itTf.setText(number);

            }
        if (riceCheckBox.isSelected()) {
                
            String number = riceCheckBox.getText().toString();
            itTf.setText(number);
            }
        if (applePieCheckBox.isSelected()) {
                
            String number = applePieCheckBox.getText().toString();
            itTf.setText(number);
            }

        if (malaiKulfiCheckBox.isSelected()) {
                
            String number = malaiKulfiCheckBox.getText().toString();
            itTf.setText(number);
            }
        if (lemonTartCheckBox.isSelected()) {
                
            String number = lemonTartCheckBox.getText().toString();
            itTf.setText(number);
            }

        if (coconutKheerCheckBox.isSelected()) {
                
            String number = coconutKheerCheckBox.getText().toString();
            itTf.setText(number);
            }
        if (cupCakeCheckBox.isSelected()) {
                
            String number = cupCakeCheckBox.getText().toString();
            itTf.setText(number);
             }
        if (tCheckBox.isSelected()) {
                
            String number = tCheckBox.getText().toString();
            itTf.setText(number);
            }

            if (cCheckBox.isSelected()) {
                                    
            String number = cCheckBox.getText().toString();
            itTf.setText(number);
            }

            if (ojCheckBox.isSelected()) {
                
            String number = ojCheckBox.getText().toString();
            itTf.setText(number);
            }
            if (mjCheckBox.isSelected()) {
                
            String number = mjCheckBox.getText().toString();
                    
            }
            
            if (csCheckBox.isSelected()) {
                
            String number = csCheckBox.getText().toString();
                    
            }
    
        if (e.getSource().equals(backButton)) {
            this.dispose();
            new EmployeeLogin().setVisible(true);
        }
        if (e.getSource() == paymentButton) {
            JOptionPane.showMessageDialog(null, "Food Delivered");
            itTf.setText("");
            }

        if (e.getSource().equals(billButton)) {
        
        String itTf = fishCheckBox.getText();
        String bftf = beefCheckBox.getText();
        String mtTf = muttonCheckBox.getText();
        String dcTf = duckCheckBox.getText();            
        String rcTf = riceCheckBox.getText();
        String apTf = applePieCheckBox.getText();
        String mkTf = malaiKulfiCheckBox.getText();
        String ltTf = lemonTartCheckBox.getText();
        String ckTf = coconutKheerCheckBox.getText();
        String ccTf = cupCakeCheckBox.getText();
        String tcTf = tCheckBox.getText();
        String ojTf = ojCheckBox.getText();
        String cchTf = cCheckBox.getText();
        String mjTf = mjCheckBox.getText();
        String csTf = csCheckBox.getText();
        }
    }
}

