package employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class LogIn implements ActionListener,WindowListener {

    JFrame f; 
    JLabel l1,l2; 
    JTextField t1; 
    JPasswordField p1;
    JButton b1,b2;
    public LogIn()
    {
        f=new JFrame("LogIn");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1=new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        f.add(l1);
        l2=new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        f.add(l2);
        t1=new JTextField();
        t1.setBounds(150, 20, 150, 30);
        f.add(t1);
        p1=new JPasswordField();
        p1.setBounds(150, 70, 150, 30);
        f.add(p1);
        
        
        
        b1=new JButton("LogIn");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        f.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(170, 140, 120, 30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        f.add(b2);
        b2.addActionListener(this);
        f.addWindowListener(this);
        f.getContentPane().setBackground(Color.WHITE);
        f.setVisible(true);
        f.setSize(600,300);
        f.setLocation(400,300);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
            Conn c1=new Conn();
            String u=t1.getText();
            String v=p1.getText();
            String q="select * from login where username='"+u+"'and password='"+v+"'";
            ResultSet rs=c1.s.executeQuery(q);
            if(rs.next()){
                new Details().f.setVisible(true);
                f.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "INVALID LOGIN");
                f.setVisible(false);
            }
            }
            else if(e.getSource()==b2){
                f.setVisible(false);
                Front_Page p=new Front_Page();
            }           
        }
        catch(Exception r){
              r.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        LogIn l=new LogIn();
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
