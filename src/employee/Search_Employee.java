
package employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Search_Employee implements ActionListener, WindowListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    Search_Employee(){
        f=new JFrame("search");
        f.setBackground(Color.green);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);
        
        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.BLACK);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        l5.add(t);

        b=new JButton("Search");  //search button
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("Cancel");  //cancel button
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l5.add(b2);
        

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
        f.addWindowListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            new Update_Employee(t.getText());
            
        }

    }
    
    public static void main(String[]ar){
        new Search_Employee();
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