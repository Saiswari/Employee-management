
package employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Add_Employee implements ActionListener, WindowListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,id;
    JButton b1,b2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    Add_Employee(){
        f=new JFrame("Add Employee");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
        id=new JLabel();
        id.setBounds(200,0,900,700);
        id.setLayout(null);
        
        l1=new JLabel("EMPLOYEE DETAILS");
        l1.setBounds(320,30,500,50);
        l1.setFont(new Font("serif",Font.BOLD,30));
        id.add(l1);
        
        l2=new JLabel("Name");
        l2.setBounds(50,150,100,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        id.add(l2);
        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id.add(t1);
        
        l3=new JLabel("Father's Name");
        l3.setBounds(400,150,200,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        id.add(l3);
        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id.add(t2);
        
        l4=new JLabel("Age");
        l4.setBounds(50,200,100,30);
        l4.setFont(new Font("serif",Font.BOLD,20));
        id.add(l4);
        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id.add(t3);

        l5=new JLabel("Date Of Birth");
        l5.setBounds(400,200,200,30);
        l5.setFont(new Font("serif",Font.BOLD,20));
        id.add(l5);
        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id.add(t4);
        
        l6=new JLabel("Address");
        l6.setBounds(50,250,100,30);
        l6.setFont(new Font("serif",Font.BOLD,20));
        id.add(l6);
        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id.add(t5);

        l7=new JLabel("Phone");
        l7.setBounds(400,250,100,30);
        l7.setFont(new Font("serif",Font.BOLD,20));
        id.add(l7);
        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id.add(t6);
        
        l8=new JLabel("Email Id");
        l8.setBounds(50,300,100,30);
        l8.setFont(new Font("serif",Font.BOLD,20));
       id.add(l8);
        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id.add(t7);
        
        l9=new JLabel("Education");
        l9.setBounds(400,300,100,30);
        l9.setFont(new Font("serif",Font.BOLD,20));
        id.add(l9);
        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id.add(t8);
        
        l10=new JLabel("Job Post");
        l10.setBounds(50,350,100,30);
        l10.setFont(new Font("serif",Font.BOLD,20));
        id.add(l10);
        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id.add(t9);
        
        l11=new JLabel("Aadhar No");
        l11.setBounds(400,350,100,30);
        l11.setFont(new Font("serif",Font.BOLD,20));
       id.add(l11);
        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id.add(t10);
        
        l12=new JLabel("Employee Id");
        l12.setBounds(50,400,150,30);
        l12.setFont(new Font("serif",Font.BOLD,20));
        id.add(l12);
        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        id.add(t11);
        
         b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,550,150,40);
        
        id.add(b2);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id.add(b1);
        
        b2.addActionListener(this);
        b1.addActionListener(this);
        
        f.add(id);
        f.setVisible(true);
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.setLocation(0,0);
        f.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        if(ae.getSource() == b2){
            try{
                Conn cc = new Conn();
                String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                f.setVisible(false);
                new Details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Details();
        }
    
    }
    public static void main(String[] args)
    {
        Add_Employee d=new Add_Employee();
    }
    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {new Details();}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}