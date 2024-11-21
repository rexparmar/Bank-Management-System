package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    JTextField text1;
    JButton b1,b2;
    String pin;
    Withdraw(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Maximum Withdraw is 10000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("Please Enter Your amount:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        l3.add(label2);

        text1= new JTextField();
        text1.setBackground(new Color(65,125,128));
        text1.setForeground(Color.WHITE);
        text1.setBounds(460,260,320,25);
        text1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(text1);

        b1 = new JButton("Withdraw");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount =  text1.getText();
            Date date = new Date();
            if (amount == "") {
                JOptionPane.showMessageDialog(null,"Please enter valid amount you wan to withdraw!");
            }else{
                Connn c = new Connn();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Oops! Insufficient balance!");
                    return;
                }

                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+ " debited successfully!");
                setVisible(false);
                new MainClass(pin);
            }
        }catch(Exception E){

        }
    }

    public static void main(String[] args) {
        new Withdraw("");
    }

}
