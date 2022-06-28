package employee;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Front_Page implements ActionListener, WindowListener{
    JFrame f; JLabel l1,l2,ic;
    JButton b;
    Front_Page(){
        //FRAME
        f=new JFrame("Employee Management System");
        f.setBackground(Color.LIGHT_GRAY);
        f.setLayout(null);
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        //BUTTON
        b=new JButton("Click Here To Continue");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(450, 400, 370, 100);
        b.addActionListener(this);
        f.add(b);
        
        JLabel id=new JLabel();
        id.setBounds(100,150,1260,530);
        id.setLayout(null);
        id.setVisible(true);
        JLabel lid=new JLabel("EMPLOYEE MANAGMENT SYSTEM");
        lid.setBounds(90,10,1200,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        lid.setVisible(true);
        id.add(lid);
        id.add(b);
        
        f.add(id);
        f.addWindowListener(this);
        f.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
            f.setVisible(false);
            LogIn l=new LogIn();
        }   
    }
    public static void main(String[] args)
        {
            Front_Page p=new Front_Page();
        }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);}

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
