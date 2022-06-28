
package employee;
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Details implements ActionListener, WindowListener{
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    Details(){
        f=new JFrame("Details");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1=new JLabel("EMPLOYEE DETAILS");
        l1.setBounds(180, 100,500,100);
        l1.setFont(new Font("serif",Font.BOLD,30));
        f.add(l1);
        b1=new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(200, 300, 120, 30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        f.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("View");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350, 300, 120, 30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        f.add(b2);
        b2.addActionListener(this);
        
        b3=new JButton("Remove");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(200, 350, 120, 30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        f.add(b3);
        b3.addActionListener(this);
        
        b4=new JButton("Update");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(350, 350, 120, 30);
        b4.setFont(new Font("serif",Font.BOLD,15));
        f.add(b4);
        b4.addActionListener(this);
          
        ImageIcon icon = new ImageIcon("D:/PRACTICE/Employee/src/employee/img/download10.jpg");
        Image i=icon.getImage().getScaledInstance(1536, 864, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(i);
        JLabel label = new JLabel(i1);
        label.setBounds(0, 0,1536, 864);
        label.setVisible(true);
        f.add(label);
        f.addWindowListener(this);
        f.setSize(Toolkit.getDefaultToolkit().getScreenSize());//width=1536,height=864
        f.setVisible(true);
        f.addWindowListener(this);
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            f.setVisible(false);
            new Add_Employee();
        }
        if(e.getSource()==b2)
        {
            f.setVisible(false);
             new View_Employee();
        }
        if(e.getSource()==b3)
        {
            f.setVisible(false);
            new Remove_Employee();
        }
        if(e.getSource()==b4)
        {
            f.setVisible(false);
            new Search_Employee();
        }
    
    }
    public static void main(String[] args)
    {
        Details d=new Details();
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
