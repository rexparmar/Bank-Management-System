package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener{
        JTextField textName,textFName,email,address,city,pin,state;
        JDateChooser dob;
        JRadioButton r1,r2,married,single;
        JButton next;
        Random ran = new Random();
        long num = (ran.nextLong()%9000L)+1000L;
        String first = " " + Math.abs(num);

    SignUp(){
        super("Sign Up");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form Number: "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel label4 = new JLabel("Name :");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(100,190,100,30);
        add(label4);

        JLabel label5 = new JLabel("Father's Name: ");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(100,240,180,30);
        add(label5);

        JLabel label6 = new JLabel("DOB: ");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(100,290,180,30);
        add(label6);

        JLabel label7 = new JLabel("Gender: ");
        label7.setFont(new Font("Raleway",Font.BOLD,20));
        label7.setBounds(100,340,180,30);
        add(label7);

        JLabel label8 = new JLabel("Email: ");
        label8.setFont(new Font("Raleway",Font.BOLD,20));
        label8.setBounds(100,390,180,30);
        add(label8);

        JLabel label9 = new JLabel("Marital Status: ");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(100,440,180,30);
        add(label9);

        JLabel label10 = new JLabel("Address: ");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(100,490,180,30);
        add(label10);

        JLabel label11 = new JLabel("City: ");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(100,540,180,30);
        add(label11);

        JLabel label12 = new JLabel("Pin: ");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(100,590,180,30);
        add(label12);

        JLabel label13 = new JLabel("State: ");
        label13.setFont(new Font("Raleway",Font.BOLD,20));
        label13.setBounds(100,640,180,30);
        add(label13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBounds(600,680,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

         dob = new JDateChooser();
         dob.setForeground(new Color(105,105,105));
         dob.setBounds(300,290,400,30);
         add(dob);

         r1 = new JRadioButton("Male");
         r1.setFont(new Font("Raleway",Font.BOLD,14));
         r1.setBounds(300,340,100,30);
         add(r1);

         r2 = new JRadioButton("Female");
         r2.setFont(new Font("Raleway",Font.BOLD,14));
         r2.setBounds(430,340,100,30);
         add(r2);

         ButtonGroup buttonGroup = new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);

         email = new JTextField();
         email.setFont(new Font("Raleway",Font.BOLD,14));
         email.setBounds(300,390,400,30);
         add(email);

         married = new JRadioButton("Married");
         married.setFont(new Font("Raleway",Font.BOLD,14));
         married.setBounds(300,440,100,30);
         add(married);

         single = new JRadioButton("Single");
         single.setFont(new Font("Raleway",Font.BOLD,14));
         single.setBounds(430,440,100,30);
         add(single);

         buttonGroup  = new ButtonGroup();
         buttonGroup.add(married);
         buttonGroup.add(single);

         address = new JTextField();
         address.setFont(new Font("Raleway",Font.BOLD,14));
         address.setBounds(300,490,400,30);
         add(address);

         city = new JTextField();
         city.setFont(new Font("Raleway",Font.BOLD,14));
         city.setBounds(300,540,400,30);
         add(city);

         pin = new JTextField();
         pin.setFont(new Font("Raleway",Font.BOLD,14));
         pin.setBounds(300,590,400,30);
         add(pin);

         state = new JTextField();
         state.setFont(new Font("Raleway",Font.BOLD,14));
         state.setBounds(300,640,400,30);
         add(state);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob1 = ((JTextField) dob.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected()){
            gender = "Female";
        }

        String email1 = email.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(single.isSelected()){
            marital = "Single";
        }
        String address1 = address.getText();
        String city1 = city.getText();
        String pin1 = pin.getText();
        String state1 = state.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Name");
            }else{
                Connn connn1 = new Connn();
                String q= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob1+"','"+gender+"','"+email1+"','"+marital+"','"+address1+"','"+city1+"','"+pin1+"','"+state1+"')";
                connn1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp();
    }

}
