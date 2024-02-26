package Bms;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class SignUp1 extends JFrame implements ActionListener {
  JTextField   nm_txf,fnm_txf,email_txf, ads_txf,state_txf,   city_txf,pin_txf;
    JDateChooser dob_chsr;
    JButton next;
    JRadioButton gen_rbtn_fmale,gen_rbtn_male,unmarried,married,other;
    long random2;
    SignUp1(){
        setLayout(null);
        setTitle("NEW ACCOUNT FORM PAGE 1");
        Random random=new Random();
        random2=Math.abs((random.nextLong()%9000L)+1000L);

        JLabel formnum=new JLabel("APPLICATION FORM NO:-"+random2);
        formnum.setFont(new Font("Times New Roman",Font.BOLD,40));
        formnum.setBounds(150,10,600,40);
        add(formnum);

        JLabel personal_details=new JLabel("Page1 :- Personal details ");
        personal_details.setFont(new Font("Times New Roman",Font.BOLD,30));
        personal_details.setBounds(250,50,400,40);
        add(personal_details);

        JLabel name=new JLabel("Name ");
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setBounds(100,100,100,30);
        add(name);

       nm_txf=new JTextField();
        nm_txf.setFont(new Font("Arial",Font.BOLD,20));
        nm_txf.setBounds(300,100,300,30);
        add(nm_txf);

        JLabel fname=new JLabel("Father Name ");
        fname.setFont(new Font("Times New Roman",Font.BOLD,20));
        fname.setBounds(100,150,200,30);
        add(fname);
       fnm_txf=new JTextField();
        fnm_txf.setFont(new Font("Arial",Font.BOLD,20));
        fnm_txf.setBounds(300,150,300,30);
        add(fnm_txf);
        JLabel dob=new JLabel("Date of Birth");
        dob.setFont(new Font("Times New Roman",Font.BOLD,20));
        dob.setBounds(100,200,200,30);
        add(dob);

     dob_chsr=new JDateChooser();
        dob_chsr.setBounds(300,200,300,30);
        add(dob_chsr);

        JLabel gender=new JLabel("Gender ");
        gender.setFont(new Font("Times New Roman",Font.BOLD,20));
        gender.setBounds(100,250,200,30);
        add(gender);

       gen_rbtn_male=new JRadioButton("Male");
        gen_rbtn_male.setBounds(300,250,100,30);
        add(gen_rbtn_male);

         gen_rbtn_fmale=new JRadioButton("Female");
        gen_rbtn_fmale.setBounds(400,250,100,30);
        add(gen_rbtn_fmale);

        ButtonGroup gen_group=new ButtonGroup();
        gen_group.add(gen_rbtn_male);
        gen_group.add(gen_rbtn_fmale);




        JLabel email=new JLabel("Email Address");
        email.setFont(new Font("Times New Roman",Font.BOLD,20));
        email.setBounds(100,300,200,30);
        add(email);

        email_txf=new JTextField();
        email_txf.setFont(new Font("Arial",Font.BOLD,20));
        email_txf.setBounds(300,300,300,30);
        add(email_txf);

        JLabel mrg_sts=new JLabel("Marital Status");
        mrg_sts.setFont(new Font("Times New Roman",Font.BOLD,20));
        mrg_sts.setBounds(100,350,200,30);
        add(mrg_sts);

         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(300,350,100,30);
        add(unmarried);

         married=new JRadioButton("Married");
        married.setBounds(400,350,100,30);
        add(married);

         other=new JRadioButton("Other");
        other.setBounds(500,350,100,30);
        add(other);

        ButtonGroup mrg_group=new ButtonGroup();
        mrg_group.add(unmarried);
        mrg_group.add(married);
        mrg_group.add(other);

        JLabel adrs=new JLabel("Address");
        adrs.setFont(new Font("Times New Roman",Font.BOLD,20));
        adrs.setBounds(100,400,200,30);
        add(adrs);

     ads_txf=new JTextField();
        ads_txf.setFont(new Font("Arial",Font.BOLD,20));
        ads_txf.setBounds(300,400,300,30);
        add(ads_txf);

        JLabel city=new JLabel("City");
        city.setFont(new Font("Times New Roman",Font.BOLD,20));
        city.setBounds(100,450,200,30);
        add(city);

         city_txf=new JTextField();
        city_txf.setFont(new Font("Arial",Font.BOLD,20));
        city_txf.setBounds(300,450,300,30);
        add(city_txf);

        JLabel state=new JLabel("State ");
        state.setFont(new Font("Times New Roman",Font.BOLD,20));
        state.setBounds(100,500,200,30);
        add(state);

        state_txf=new JTextField();
        state_txf.setFont(new Font("Arial",Font.BOLD,20));
        state_txf.setBounds(300,500,300,30);
        add(state_txf);

        JLabel pin=new JLabel("PIN CODE ");
        pin.setFont(new Font("Times New Roman",Font.BOLD,20));
        pin.setBounds(100,550,200,30);
        add(pin);

        pin_txf=new JTextField();
        pin_txf.setFont(new Font("Arial",Font.BOLD,20));
        pin_txf.setBounds(300,550,300,30);
        add(pin_txf);

        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial",Font.BOLD,20));
        next.setBounds(620,660,80,30);
        add(next);

        next.addActionListener(this);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=" "+random2;
        String name=nm_txf.getText();
        String fname=fnm_txf.getText();
        String dob=((JTextField) dob_chsr.getDateEditor().getUiComponent()).getText();
        String gender=null,maritial=null;
        if (gen_rbtn_male.isSelected()){
            gender="Male";
        }else if (gen_rbtn_fmale.isSelected()){
            gender="Female";
        }
        if (married.isSelected()){
            maritial="Married";
        } else if (unmarried.isSelected()) {
            maritial="Unmarried";
        } else if (other.isSelected()) {
            maritial="other";
        }
        String email=email_txf.getText();
        String city=city_txf.getText();
        String address=ads_txf.getText();
        String state=state_txf.getText();
        String pin=pin_txf.getText();
        try {
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            } else if (formno.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (fname.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (maritial.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (city.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (state.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }else if (pin.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Name must be filled");
            }
            Conn c = new Conn();
            String q1 = "insert into Customer values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritial+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
            c.s.executeUpdate(q1);

            new SignUp2(formno).setVisible(true);
            setVisible(false);

        }catch (Exception exception){
            System.out.println(exception);
        }

    }
    public static void main(String[] args) {
        new SignUp1();
    }
}
