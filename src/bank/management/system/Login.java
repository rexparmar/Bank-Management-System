package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField text1;
    JPasswordField pass1;
    JButton button1,button2,button3;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image i12 = i11.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image2 = new JLabel(i13);
        image2.setBounds(630,350,100,100);
        add(image2);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        text1 = new JTextField(15);
        text1.setBounds(325,190,230,30);
        text1.setFont(new Font("Arial",Font.BOLD,14));
        add(text1);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        pass1 = new JPasswordField(15);
        pass1.setBounds(325,250,230,30);
        pass1.setFont(new Font("Arial",Font.BOLD,14));
        add(pass1);

        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,250,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image i122 = i111.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon i133 = new ImageIcon(i122);
        JLabel image3 = new JLabel(i133);
        image3.setBounds(0,0,850,480);
        add(image3);

        setLayout(null);
        setSize(840,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==button1){
                Connn c = new Connn();
                String cardno = text1.getText();
                String pin = pass1.getText();
                String q = "select * from login where card_no='"+cardno+"' and pin='"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new MainClass(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"Please enter correct details!");
                }
            }else if(e.getSource()==button2){
                text1.setText("");
                pass1.setText("");
            }else if(e.getSource()==button3){
                new SignUp();
                setVisible(false);
            }
        }catch(Exception e1){
            e1.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }

}
