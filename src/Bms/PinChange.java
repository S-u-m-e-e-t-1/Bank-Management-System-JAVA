package Bms;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener{
    JLabel text, textNewpin, reenterYourNewPin;
    JTextField pintext,pintext_repin;
    JButton change,back;
    String pin;
    PinChange(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0,0,900,900);
        add(img);

        text=new JLabel("Change your pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial",Font.BOLD,20));
        text.setBounds(265,290,180,25);
        img.add(text);
        textNewpin =new JLabel(" New pin");
        textNewpin.setForeground(Color.WHITE);
        textNewpin.setFont(new Font("Arial",Font.BOLD,20));
        textNewpin.setBounds(165,340,180,20);
        img.add(textNewpin);
         pintext=new JTextField();
        pintext.setBounds(165,380,180,20);
        pintext.setFont(new Font("Arial",Font.BOLD,16));
        img.add(pintext);
        reenterYourNewPin =new JLabel("Confirm New pin");
        reenterYourNewPin.setForeground(Color.WHITE);
        reenterYourNewPin.setFont(new Font("Arial",Font.BOLD,20));
        reenterYourNewPin.setBounds(165,410,180,25);
        img.add(reenterYourNewPin);
        pintext_repin=new JTextField();
        pintext_repin.setBounds(165,450,180,20);
        pintext_repin.setFont(new Font("Arial",Font.BOLD,16));
        img.add(pintext_repin);
         change = new JButton("Change");
         change.setBounds(165,520,150,30);
         change.setFont(new Font("Arial",Font.BOLD,20));
         change.addActionListener(this);
         img.add(change);
      back = new JButton("Back");
        back.setBounds(350,520,100,30);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.addActionListener(this);
        img.add(back);

    setSize(900,900);
    setLayout(null);
    setLocation(300,0);
    setVisible(true);
    setTitle("CHANGE PIN");

    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try{
            String npin = pintext.getText();
            String rpin = pintext_repin.getText();

//            if(!(npin == rpin)){
//                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
//                return;
//            }

            if(actionEvent.getSource()==change){
                if (pintext.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (pintext_repin.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }

                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update Customer3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transaction(rpin).setVisible(true);

            }else if(actionEvent.getSource()==back){
                new Transaction(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
