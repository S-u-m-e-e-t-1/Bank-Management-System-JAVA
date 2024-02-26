package Bms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Transaction extends JFrame implements ActionListener {
     String pin;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1,image;
    Transaction(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(960,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,960,1080);
        add(image);

        JLabel text=new JLabel("Select your Transaction");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        b1= new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("FAST CASH");
        b4 = new JButton("MINI STATEMENT");
        b5 = new JButton("PIN CHANGE");
        b6 = new JButton("BALANCE ENQUIRY");
        b7 = new JButton("EXIT");

        b1.setBounds(170,499,150,35);
        image.add(b1);

        b2.setBounds(390,499,150,35);
        image.add(b2);

        b3.setBounds(170,543,150,35);
        image.add(b3);

        b4.setBounds(390,543,150,35);
        image.add(b4);

        b5.setBounds(170,588,150,35);
        image.add(b5);

        b6.setBounds(390,588,150,35);
        image.add(b6);

        b7.setBounds(390,633,150,35);
        image.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
        public void actionPerformed (ActionEvent ae) {
        if (ae.getSource() == b1) {
            setVisible(false);
            new Deposite(pin).setVisible(true);
        } else if (ae.getSource() == b2) {
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        } else if (ae.getSource() == b3) {
            setVisible(false);
            new FastCash(pin).setVisible(true);
        } else if (ae.getSource() == b4) {
            new MiniStatement(pin).setVisible(true);
        } else if (ae.getSource() == b5) {
            setVisible(false);
            new PinChange(pin).setVisible(true);
        } else if (ae.getSource() == b6) {
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if (ae.getSource() == b7) {
                System.exit(0);
            }

    }

    public static void main(String[] args){
        new Transaction("").setVisible(true);
    }

}
