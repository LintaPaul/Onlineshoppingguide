package javaprojectsg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaprojectsg.Registernew;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarath
 */
public class userRestore {

    userRestore(){
                     try{ 
                Connection con=getConnection();
                 Statement myStatement=con.createStatement(); 
                Connection con1=getConnection();
                Statement myStatement1=con1.createStatement();
               System.out.println("Connection e");
               
               
                 
                System.out.println("created state");
               String query = "select userid from users where loginStatus=1";
               ResultSet myResultSet=myStatement.executeQuery(query);
               System.out.println("Query ex");
               System.out.println("get value a==");
              if(myResultSet.next()==true){
                   int a = myResultSet.getInt("userid");
                   System.out.println(a);
                   String query1= "UPDATE users  SET      loginStatus = 0 WHERE     userid ="+a+"";
                   myStatement1.executeUpdate(query1);
                  // System.out.println(c);
                  //if(c==1){
                       System.out.println("updated");
                       
                   //}else {
                     //  System.out.println("Not updated");
                   //}
               
                 JOptionPane.showMessageDialog(null, "Logout successful");
                
                 Registernew nw;
                    nw = new Registernew();
                 nw.setVisible(true);
              }
              else{
                   JOptionPane.showMessageDialog(null, "Logout Unsuccessful");
              }
                }
                            catch(SQLException ex){
                        JOptionPane.showMessageDialog(null,ex);
                            }
    }
        public Connection getConnection(){
        Connection con;
        
        try {
            String dburl= "jdbc:mysql://localhost:3306/shoppingguide?useSSL=false";
	    String user="root";
	    String pass="root";
	    con=DriverManager.getConnection(dburl,user,pass);
            
            return con;
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"not connected");
            return null;
        }
    }
}
