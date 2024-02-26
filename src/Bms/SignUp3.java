package Bms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class SignUp3 extends JFrame implements ActionListener {
    JLabel label, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
    JRadioButton jRadioButton, jRadioButton1, jRadioButton2, jRadioButton3;
    JButton jButton, jButton1;
    JCheckBox jCheckBox, jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jCheckBox5, jCheckBox6;
    String string;

    SignUp3(String string){
        setLayout(null);
        setTitle("NEW ACCOUNT FORM PAGE 3");
        this.string = this.string;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        this.string=string;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);

        label = new JLabel("Page 3: Account Details");
        label.setFont(new Font("Raleway", Font.BOLD, 22));

        label1 = new JLabel("Account Type:");
        label1.setFont(new Font("Raleway", Font.BOLD, 18));

        label2 = new JLabel("Card Number:");
        label2.setFont(new Font("Raleway", Font.BOLD, 18));

        label3 = new JLabel("XXXX-XXXX-XXXX-4184");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));

        label4 = new JLabel("(Your 16-digit Card number)");
        label4.setFont(new Font("Raleway", Font.BOLD, 12));

        label5 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        label5.setFont(new Font("Raleway", Font.BOLD, 12));

        label6 = new JLabel("PIN:");
        label6.setFont(new Font("Raleway", Font.BOLD, 18));

        label7 = new JLabel("XXXX");
        label7.setFont(new Font("Raleway", Font.BOLD, 18));

        label8 = new JLabel("(4-digit password)");
        label8.setFont(new Font("Raleway", Font.BOLD, 12));

        label9 = new JLabel("Services Required:");
        label9.setFont(new Font("Raleway", Font.BOLD, 18));

        label10 = new JLabel("Form No:");
        label10.setFont(new Font("Raleway", Font.BOLD, 14));

        label11 = new JLabel(this.string);
        label11.setFont(new Font("Raleway", Font.BOLD, 14));

        jButton = new JButton("Submit");
        jButton.setFont(new Font("Raleway", Font.BOLD, 14));
        jButton.setBackground(Color.BLACK);
        jButton.setForeground(Color.WHITE);

        jButton1 = new JButton("Cancel");
        jButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);


        jCheckBox = new JCheckBox("ATM CARD");
        jCheckBox.setBackground(Color.WHITE);
        jCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox1 = new JCheckBox("Internet Banking");
        jCheckBox1.setBackground(Color.WHITE);
        jCheckBox1.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox2 = new JCheckBox("Mobile Banking");
        jCheckBox2.setBackground(Color.WHITE);
        jCheckBox2.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox3 = new JCheckBox("EMAIL Alerts");
        jCheckBox3.setBackground(Color.WHITE);
        jCheckBox3.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox4 = new JCheckBox("Cheque Book");
        jCheckBox4.setBackground(Color.WHITE);
        jCheckBox4.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox5 = new JCheckBox("E-Statement");
        jCheckBox5.setBackground(Color.WHITE);
        jCheckBox5.setFont(new Font("Raleway", Font.BOLD, 16));

        jCheckBox6 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        jCheckBox6.setBackground(Color.WHITE);
        jCheckBox6.setFont(new Font("Raleway", Font.BOLD, 12));

        jRadioButton = new JRadioButton("Saving Account");
        jRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        jRadioButton.setBackground(Color.WHITE);

        jRadioButton1 = new JRadioButton("Fixed Deposit Account");
        jRadioButton1.setFont(new Font("Raleway", Font.BOLD, 16));
        jRadioButton1.setBackground(Color.WHITE);

        jRadioButton2 = new JRadioButton("Current Account");
        jRadioButton2.setFont(new Font("Raleway", Font.BOLD, 16));
        jRadioButton2.setBackground(Color.WHITE);

        jRadioButton3 = new JRadioButton("Recurring Deposit Account");
        jRadioButton3.setFont(new Font("Raleway", Font.BOLD, 16));
        jRadioButton3.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(jRadioButton);
        groupgender.add(jRadioButton1);
        groupgender.add(jRadioButton2);
        groupgender.add(jRadioButton3);

        label10.setBounds(700,10,70,30);
        add(label10);

        label11.setBounds(770,10,40,30);
        add(label11);

        label.setBounds(280,40,400,40);
        add(label);

        label1.setBounds(100,140,200,30);
        add(label1);

        jRadioButton.setBounds(100,180,150,30);
        add(jRadioButton);

        jRadioButton1.setBounds(350,180,300,30);
        add(jRadioButton1);

        jRadioButton2.setBounds(100,220,250,30);
        add(jRadioButton2);

        jRadioButton3.setBounds(350,220,250,30);
        add(jRadioButton3);

        label2.setBounds(100,300,200,30);
        add(label2);

        label3.setBounds(330,300,250,30);
        add(label3);

        label4.setBounds(100,330,200,20);
        add(label4);

        label5.setBounds(330,330,500,20);
        add(label5);

        label6.setBounds(100,370,200,30);
        add(label6);

        label7.setBounds(330,370,200,30);
        add(label7);

        label8.setBounds(100,400,200,20);
        add(label8);

        label9.setBounds(100,450,200,30);
        add(label9);

        jCheckBox.setBounds(100,500,200,30);
        add(jCheckBox);

        jCheckBox1.setBounds(350,500,200,30);
        add(jCheckBox1);

        jCheckBox2.setBounds(100,550,200,30);
        add(jCheckBox2);

        jCheckBox3.setBounds(350,550,200,30);
        add(jCheckBox3);

        jCheckBox4.setBounds(100,600,200,30);
        add(jCheckBox4);

        jCheckBox5.setBounds(350,600,200,30);
        add(jCheckBox5);

        jCheckBox6.setBounds(100,680,600,20);
        add(jCheckBox6);

        jButton.setBounds(250,720,100,30);
        add(jButton);
        jButton.addActionListener(this);
        jButton1.setBounds(420,720,100,30);
        add(jButton1);
        jButton1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,800);
        setLocation(500,10);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String atype = null;
        if(jRadioButton.isSelected()){
            atype = "Saving Account";
        }
        else if(jRadioButton1.isSelected()){
            atype = "Fixed Deposit Account";
        }
        else if(jRadioButton2.isSelected()){
            atype = "Current Account";
        }else if(jRadioButton3.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = getFacility();

        try{
            if(ae.getSource()== jButton){

                assert atype != null;
                if(atype.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into Customer3 values('"+ string +"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String q2 = "insert into login values('"+ string +"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);

                    new Deposite(pin).setVisible(true);
                    setVisible(false);
                }

            }else if(ae.getSource()== jButton1){
                System.exit(0);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    private String getFacility() {
        String facility ="";
        if(jCheckBox.isSelected()){
            facility = facility + " ATM Card";
        }
        if(jCheckBox1.isSelected()){
            facility = facility + " Internet Banking";
        }
        if(jCheckBox2.isSelected()){
            facility = facility + " Mobile Banking";
        }
        if(jCheckBox3.isSelected()){
            facility = facility + " EMAIL Alerts";
        }
        if(jCheckBox4.isSelected()){
            facility += " Cheque Book";
        }
        if(jCheckBox5.isSelected()){
            facility += " E-Statement";
        }
        return facility;
    }

    public static void main(String[] args) {
        new SignUp3("").setVisible(true);
    }
}
