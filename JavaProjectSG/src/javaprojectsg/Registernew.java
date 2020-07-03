/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectsg;

/**
 *
 * @author LINTA
 */

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Registernew{
    
    Registernew(){
    
     JFrame frame= new JFrame();	
		frame.setTitle("Welcome to online shopping guide");
                
      
     
		frame.setSize(600, 400);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
                frame.setLayout(null);
                frame.getContentPane().setBackground(new Color(37,24,98));
                  JPanel p1=new JPanel();
                  p1.setSize(500,300);
                  p1.setLocation(30, 40);
                  p1.setLayout(null);
                  p1.setBackground(Color.white);
                JLabel intro=new JLabel();
                intro.setText("Shopease");
                intro.setForeground(Color.black);
                intro.setFont(new Font("Verdana", Font.PLAIN, 50));
                intro.setBounds(120, 30, 300, 80);
                
                JLabel tag=new JLabel();
                tag.setText("Shop easily with Shopease.....");
                tag.setForeground(Color.black);
                tag.setFont(new Font("Verdana", Font.PLAIN, 18));
                tag.setBounds(140, 90, 300, 80);
               
                JButton reg=new JButton("Register");
                reg.setBounds(120, 200, 100, 40);
                reg.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            frame.dispose();
            registerWindow rw=new registerWindow();
            rw.setVisible(true);
        } 
     

    }); 
                reg.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
                
                JButton login=new JButton("Login");
                 login.setBounds(260, 200,100, 40);
                 login.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
                login.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            frame.dispose();
            loginWindow lw=new loginWindow();
            lw.setVisible(true);
        }  
            
            
    });       p1.add(intro);p1.add(tag);p1.add(reg);p1.add(login);frame.add(p1);
                
               
                
                
    }
    public static void main(String args[]){
        new Registernew();
    }

    void setVisible(boolean b) {
         //To change body of generated methods, choose Tools | Templates.
    }
}
