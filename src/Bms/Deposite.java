package Bms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {
    JButton btn_depo, btn_back,b3;
    JTextField amt;
    String pin;
    Deposite(String pin){
        this.pin = pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0, 0, 960, 900);
        add(img);
        JLabel depo_amt=new JLabel("Enter Amount you wwant to be Deposite");
        depo_amt.setForeground(Color.WHITE);
        depo_amt.setFont(new Font("System",Font.BOLD,15));
        depo_amt.setBounds(230,350,400,20);
        img.add(depo_amt);
         amt=new JTextField();
        amt.setFont(new Font("Arial",Font.BOLD,20));
        amt.setBounds(230,400,300,30);
        img.add(amt);

        btn_depo = new JButton("DEPOSIT");
        btn_back = new JButton("BACK");

        btn_depo.setBounds(390,450,150,35);
        img.add(btn_depo);

        btn_back.setBounds(390,500,150,35);
        img.add(btn_back);

        btn_back.addActionListener(this);
        btn_depo.addActionListener(this);

        setSize(960,1000);
        setLocation(400,0);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {

        new Deposite("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            String amount =amt.getText();
            Date date = new Date();
            if(ae.getSource()==btn_depo){
                if(amt.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");

                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }
            }else if(ae.getSource()==btn_back){
                setVisible(false);
                new Transaction(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
