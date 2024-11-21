package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener
{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5,citizen;
    JTextField sin;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    SignUp2(String first){
        super("Sign Up");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=first;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Info");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Pronounce:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String[] pros = {"He/Him","She/Her","They/Them","Prefer not to say"};
        comboBox = new JComboBox(pros);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Language:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String[] lang = {"English","French","Punjabi","Hindi","Other"};
        comboBox2 = new JComboBox(lang);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String[] income = {"Null","< $100k","$100k> & <$200k","$200k+"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,100,30);
        add(l6);

        String[] edu = {"High School","College","University","Master's","PhD"};
        comboBox5 = new JComboBox(edu);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,270,320,30);
        add(comboBox5);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,130,30);
        add(l7);


        String[] occupation = {"Salaried","Self-Employed","Business","Student","Retired"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,320,320,30);
        add(comboBox4);

        JLabel l8 = new JLabel("SIN Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        sin = new JTextField();
        sin.setFont(new Font("Raleway",Font.BOLD,18));
        sin.setBounds(350,370,150,30);
        add(sin);

        JLabel l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,420,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,420,100,30);
        add(r2);

        ButtonGroup r = new ButtonGroup();
        r.add(r1);
        r.add(r2);

        JLabel l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,18));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,470,100,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,18));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,470,100,30);
        add(e2);

        ButtonGroup e = new ButtonGroup();
        e.add(e1);
        e.add(e2);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(first);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640,100,30);
        add(next);
        next.addActionListener(this);



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String pro = (String) comboBox.getSelectedItem();
        String lang = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String sin1 = sin.getText();
        String senior = "";
        if(r1.isSelected()==true){
            senior = "Yes";
        }else{
            senior = "No";
        }

        String exist = "";
        if(e1.isSelected()==true){
            exist="Yes";
        }else{
            exist="No";
        }

        try{
            if(sin.getText() == ""){
                JOptionPane.showMessageDialog(null,"Please fill all the fields!");
            }
            else{
                Connn connn1 = new Connn();
                String q = "insert into signup2 values('"+formno+"','"+pro+"','"+lang+"','"+inc+"','"+edu+"','"+occ+"','"+sin1+"','"+senior+"','"+exist+"')";
                connn1.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new SignUp2("");
    }

}
