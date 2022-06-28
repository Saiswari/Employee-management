
package employee;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Remove_Employee implements ActionListener , WindowListener {
    JFrame f;
    JTextField t;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b,b1,b2,b3;

    Remove_Employee(){
        f=new JFrame("Remove Employee");
        f.setBackground(Color.green);   
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,500);
        l5.setLayout(null);
        f.add(l5);

        
        l1=new JLabel("Employee Id");//Employee Id label
        l1.setBounds(50,50,250,30);
        l1.setForeground(Color.BLACK);
        Font f2 = new Font("serif",Font.BOLD,25); 
        l1.setFont(f2);
        l5.add(l1);

        t=new JTextField();//textfield
        t.setBounds(250,50,150,30);
        l5.add(t);


        b=new JButton("Search");//Search button
        b.setBounds(200,100,100,30);
        b.addActionListener(this);
        l5.add(b);

        b3=new JButton("back");//back button
        b3.setBounds(360,100,100,30);   
        b3.addActionListener(this);
        l5.add(b3);


        l2=new JLabel("Name:"); //Name label
        l2.setBounds(50,150,250,30);
        l2.setForeground(Color.BLACK);
        Font f3 = new Font("serif",Font.BOLD,20); 
        l2.setFont(f3);
        l5.add(l2);

        l6=new JLabel();    //for data name
        l6.setBounds(200,150,350,30);
        l6.setForeground(Color.BLACK);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        l5.add(l6);

        l3=new JLabel("Mobile No:");// Mobile no label
        l3.setBounds(50,200,250,30);
        l3.setForeground(Color.BLACK);
        Font f4 = new Font("serif",Font.BOLD,20); 
        l3.setFont(f4);
        l5.add(l3);


        l7=new JLabel();// for data mobile no
        l7.setBounds(200,200,350,30);
        l7.setForeground(Color.BLACK);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        l5.add(l7);



        l4=new JLabel("Email Id:");//Email id label
        l4.setBounds(50,250,250,30);
        l4.setForeground(Color.BLACK);
        Font F5=new Font("serif",Font.BOLD,20); 
        l4.setFont(F5);
        l5.add(l4);

        l8=new JLabel();//for data email 
        l8.setBounds(200,250,350,30);
        l8.setForeground(Color.BLACK);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        l5.add(l8);

        b1=new JButton("Remove");// Remove button
        b1.setBounds(120,300,100,30);
        b1.addActionListener(this);
        l5.add(b1);


        b2=new JButton("Cancel");//Cancel button
        b2.setBounds(300,300,100,30);
        b2.addActionListener(this);
        l5.add(b2);
        
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);

        f.setSize(500,500);
        f.setLocation(500,250);  
        f.setVisible(true);
        f.addWindowListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        //getting data
        if(ae.getSource()==b){
            try{
                Conn con = new Conn();
                String str = "select name,phone,email from employee where emp_id ='"+t.getText()+"' ";
                ResultSet rs = con.s.executeQuery(str);

                int i=0;
                if(rs.next()){
                    String name = rs.getString(1);
                    String mob = rs.getString(2);
                    String email=rs.getString(3);

                    l2.setVisible(true);//lable : Name
                    l3.setVisible(true);//lable : moblieno
                    l4.setVisible(true);//lable : email
                    b1.setVisible(true);//Remove button
                    b2.setVisible(true);   //Cancel Button 
                    i=1;
                    l6.setText(name);
                    l7.setText(mob);
                    l8.setText(email);
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception ex){}
        }
        //removing data
        if(ae.getSource()==b1){
            try{
                Conn con = new Conn();
                String str = "delete from employee where emp_id = '"+t.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while delting record "+ex);
            }
        }
        //cancel
        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        //back
        if(ae.getSource()==b3){
            f.setVisible(false);
            Details d=new Details();
        }
    }

    public static void main(String[]ar){
        new Remove_Employee();
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
