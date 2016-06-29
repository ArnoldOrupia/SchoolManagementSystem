
package School_Management_System;

import java.sql.JDBCType;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame{
    private static JLabel welcome,title,task,pic;
    private static JButton admin,teacher,student,nonstaff,finance,secretary;
    private static ImageIcon background, icon;
    private static JPanel home;
    
    public Interface(){
      super("CONARD HIGH SCHOOL SYSTEM");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c=getContentPane();
    setBackground(Color.WHITE);
    setLayout(null);
    setVisible(true);
    setSize(800, 500);
    setResizable(false);
    setLocation(300,150);
    
    home=new JPanel(null);
    home.setBounds(0,0,800, 500);
    home.setBackground(new Color(0,128,128));
    add(home);
    
    /*
     ImageIcon icon=new ImageIcon(getClass().getResource("LOGO.PNG"));
      JLabel  pic=new JLabel(icon);
        pic.setBounds(120,50,150,150);
        home.add(pic);
*/
    welcome=new JLabel("WELCOME TO CONARD HIGH SCHOOL SYSTEM");
    
    welcome.setFont(new java.awt.Font("Times New Roman",1,26));
   welcome.setBounds(100, 10, 800, 50);
    welcome.setBackground(Color.green);
  //  welcome.setOpaque(true);
    home.add(welcome);
    
      task=new JLabel("Motto: Academic Excellence, our Swag!!");
      task.setFont(new java.awt.Font("Times New Roman",1,26));
      task.setBounds(100, 60, 600, 50);
      
      //task.setBackground(Color.green);
      //task.setOpaque(true);
         home.add(task);
      
        




    }
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Interface();
            }
        }
        
        );
    }
    
}
