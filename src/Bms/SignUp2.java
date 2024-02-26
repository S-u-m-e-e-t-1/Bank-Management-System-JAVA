package Bms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    JLabel jLabel, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12;
    JButton button;
    JRadioButton radioButton, radioButton1, radioButton2, radioButton3;
    JTextField textField, textField1, textField2;
    JComboBox jComboBox, jComboBox1, jComboBox2, jComboBox3, jComboBox4;

    String string;
    SignUp2(String string){
        setLayout(null);
        setTitle("NEW ACCOUNT FORN PAGE 2");
        ImageIcon i1;
         i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);

        this.string = string;

        jLabel = new JLabel("Page 2: Additonal Details");
        jLabel.setFont(new Font("Raleway", Font.BOLD, 22));

        jLabel1 = new JLabel("Religion:");
        jLabel1.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel2 = new JLabel("Category:");
        jLabel2.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel3 = new JLabel("Income:");
        jLabel3.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel4 = new JLabel("Educational");
        jLabel4.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel10 = new JLabel("Qualification:");
        jLabel10.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel5 = new JLabel("Occupation:");
        jLabel5.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel6 = new JLabel("PAN Number:");
        jLabel6.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel7 = new JLabel("Aadhar Number:");
        jLabel7.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel8 = new JLabel("Senior Citizen:");
        jLabel8.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel9 = new JLabel("Existing Account:");
        jLabel9.setFont(new Font("Raleway", Font.BOLD, 18));

        jLabel11 = new JLabel("Form No:");
        jLabel11.setFont(new Font("Raleway", Font.BOLD, 13));

        jLabel12 = new JLabel(string);
        jLabel12.setFont(new Font("Raleway", Font.BOLD, 13));

        button = new JButton("Next");
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

        textField = new JTextField();
        textField.setFont(new Font("Raleway", Font.BOLD, 14));

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));

        radioButton = new JRadioButton("Yes");
        radioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton.setBackground(Color.WHITE);

        radioButton1 = new JRadioButton("No");
        radioButton1.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton1.setBackground(Color.WHITE);

        radioButton2 = new JRadioButton("Yes");
        radioButton2.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton2.setBackground(Color.WHITE);

        radioButton3 = new JRadioButton("No");
        radioButton3.setFont(new Font("Raleway", Font.BOLD, 14));
        radioButton3.setBackground(Color.WHITE);

        String religion[]={"Hindu","MUslim","Sikh","Christian","Other"};
        jComboBox =new JComboBox(religion);
        jComboBox.setBackground(Color.BLACK);
        jComboBox.setFont(new Font("Raleway",Font.BOLD,14));

        String category[] = {"General","OBC","SC","ST","Other"};
        jComboBox1 = new JComboBox(category);
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        jComboBox2 = new JComboBox(income);
        jComboBox2.setBackground(Color.WHITE);
        jComboBox2.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        jComboBox3 = new JComboBox(education);
        jComboBox3.setBackground(Color.WHITE);
        jComboBox3.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        jComboBox4 = new JComboBox(occupation);
        jComboBox4.setBackground(Color.WHITE);
        jComboBox4.setFont(new Font("Raleway", Font.BOLD, 14));

        jLabel11.setBounds(700,10,60,30);
        add(jLabel11);

        jLabel12.setBounds(760,10,60,30);
        add(jLabel12);

        jLabel.setBounds(280,30,600,40);
        add(jLabel);

        jLabel1.setBounds(100,120,100,30);
        add(jLabel1);

        jComboBox.setBounds(350,120,320,30);
        add(jComboBox);

        jLabel2.setBounds(100,170,100,30);
        add(jLabel2);

        jComboBox1.setBounds(350,170,320,30);
        add(jComboBox1);

        jLabel3.setBounds(100,220,100,30);
        add(jLabel3);

        jComboBox2.setBounds(350,220,320,30);
        add(jComboBox2);

        jLabel4.setBounds(100,270,150,30);
        add(jLabel4);

        jComboBox3.setBounds(350,270,320,30);
        add(jComboBox3);

        jLabel10.setBounds(100,290,150,30);
        add(jLabel10);

        jLabel5.setBounds(100,340,150,30);
        add(jLabel5);

        jLabel6.setBounds(100,390,150,30);
        add(jLabel6);

        textField.setBounds(350,390,320,30);
        add(textField);

        jLabel7.setBounds(100,440,180,30);
        add(jLabel7);

        textField1.setBounds(350,440,320,30);
        add(textField1);

        jLabel8.setBounds(100,490,150,30);
        add(jLabel8);

        radioButton.setBounds(350,490,100,30);
        add(radioButton);

        radioButton1.setBounds(460,490,100,30);
        add(radioButton1);

        jLabel9.setBounds(100,540,180,30);
        add(jLabel9);

        radioButton2.setBounds(350,540,100,30);
        add(radioButton2);

        radioButton3.setBounds(460,540,100,30);
        add(radioButton3);

        button.setBounds(570,640,100,30);
        add(button);

        jComboBox4.setBounds(350,340,320,30);
        add(jComboBox4);

        occupation = new String[]{"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
        jComboBox4 = new JComboBox(occupation);
        jComboBox4.setBackground(Color.WHITE);
        jComboBox4.setFont(new Font("Raleway", Font.BOLD, 14));

        button.addActionListener(this);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) jComboBox.getSelectedItem();
        String category = (String) jComboBox1.getSelectedItem();
        String income = (String) jComboBox2.getSelectedItem();
        String education = (String) jComboBox3.getSelectedItem();
        String occupation = (String) jComboBox4.getSelectedItem();

        String pan = textField.getText();
        String aadhar = textField1.getText();

        String scitizen = "";
        if(radioButton.isSelected()){
            scitizen = "Yes";
        }
        else if(radioButton1.isSelected()){
            scitizen = "No";
        }

        String eaccount = "";
        if(radioButton2.isSelected()){
            eaccount = "Yes";
        }else if(radioButton3.isSelected()){
            eaccount = "No";
        }

        try{
            if(textField1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into Customer2 values('"+ string +"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);

                new SignUp3(string).setVisible(true);
                setVisible(false);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SignUp2("").setVisible(true);
    }
}
