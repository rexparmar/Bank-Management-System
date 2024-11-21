package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {
    JRadioButton a1,a2,a3,a4;
    JCheckBox s1,s2,s3,s4,s5,s6;
    JButton submit,cancel;
    String formno;
    SignUp3(String formno){
        this.formno=formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,20,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,50,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        a1 = new JRadioButton("Savings Acocunt");
        a1.setBackground(new Color(215,252,252));
        a1.setBounds(100,180,200,30);
        a1.setFont(new Font("Raleway",Font.BOLD,18));
        add(a1);

        a2 = new JRadioButton("Fixed Deposit Acocunt");
        a2.setBackground(new Color(215,252,252));
        a2.setBounds(300,180,250,30);
        a2.setFont(new Font("Raleway",Font.BOLD,18));
        add(a2);

        a3 = new JRadioButton("Current Account");
        a3.setBackground(new Color(215,252,252));
        a3.setBounds(100,220,200,30);
        a3.setFont(new Font("Raleway",Font.BOLD,18));
        add(a3);

        a4 = new JRadioButton("Recurring Deposit Account");
        a4.setBackground(new Color(215,252,252));
        a4.setBounds(300,220,300,30);
        a4.setFont(new Font("Raleway",Font.BOLD,18));
        add(a4);

        ButtonGroup acc = new ButtonGroup();
        acc.add(a1);
        acc.add(a2);
        acc.add(a3);
        acc.add(a4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16 Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,30);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("It would appear on atm card/cheque and Bank Statements.");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,350,30);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4 Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        s1 = new JCheckBox("ATM CARD");
        s1.setBackground(new Color(215,252,252));
        s1.setFont(new Font("Raleway",Font.BOLD,16));
        s1.setBounds(100,500,200,30);
        add(s1);

        s2 = new JCheckBox("Internet Banking");
        s2.setBackground(new Color(215,252,252));
        s2.setFont(new Font("Raleway",Font.BOLD,16));
        s2.setBounds(350,500,200,30);
        add(s2);

        s3 = new JCheckBox("Mobile Banking");
        s3.setBackground(new Color(215,252,252));
        s3.setFont(new Font("Raleway",Font.BOLD,16));
        s3.setBounds(100,540,200,30);
        add(s3);

        s4 = new JCheckBox("Email Alerts");
        s4.setBackground(new Color(215,252,252));
        s4.setFont(new Font("Raleway",Font.BOLD,16));
        s4.setBounds(350,540,200,30);
        add(s4);

        s5 = new JCheckBox("Cheque Book");
        s5.setBackground(new Color(215,252,252));
        s5.setFont(new Font("Raleway",Font.BOLD,16));
        s5.setBounds(100,580,200,30);
        add(s5);

        s6 = new JCheckBox("E-Statement");
        s6.setBackground(new Color(215,252,252));
        s6.setFont(new Font("Raleway",Font.BOLD,16));
        s6.setBounds(350,580,200,30);
        add(s6);


        JCheckBox agree = new JCheckBox("I have read all the terms and conditionds. I Agree to all.",true);
        agree.setBackground(new Color(215,252,252));
        agree.setFont(new Font("Raleway",Font.BOLD,12));
        agree.setBounds(100,650,600,30);
        add(agree);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        submit =  new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel =  new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        add(cancel);

        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(a1.isSelected()){
            atype= "Savings Account";
        }else if(a2.isSelected()){
            atype = "Fixed Deposit Account";
        }else if(a3.isSelected()){
            atype = "Current Account";
        }else if(a4.isSelected()){
            atype="Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno =" " + Math.abs(first7);

        long first3 =(ran.nextLong()%9000L) +1000L;
        String pin =" "+ Math.abs(first3);

        String fac = " ";
        if(s1.isSelected()){
            fac=fac + "ATM CARD ";
        }else if(s2.isSelected()){
            fac=fac+"Internet Banking";
        }else if(s3.isSelected()){
            fac=fac+"Mobile Banking";
        }else if(s4.isSelected()){
            fac=fac+"Email Alerts";
        }else if(s5.isSelected()){
            fac=fac+"Cheque Book";
        }else if(s6.isSelected()){
            fac=fac+"E-Statements";
        }

        try{
            if(e.getSource()==submit){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Fill all the Fields.");
                }else{
                    Connn c1 = new Connn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card No: "+cardno+ "\n Pin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
            else if(e.getSource()==cancel){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp3("");
    }

}
