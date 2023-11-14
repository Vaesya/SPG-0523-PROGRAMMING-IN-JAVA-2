/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MVC_VIEW extends JFrame{
   Container con;
   JButton addButton;
   JTextField textField1, textField2, textFieldresult;
   JLabel first, second, result;
   
   public MVC_VIEW(MVC_Model model){
       con = getContentPane();
       setTitle("MVC ADD");
       setLayout(new FlowLayout());
       setSize(220,200);
       
       first=new JLabel("First variable");
       textField1 = new JTextField("",8);
       second = new JLabel ("Second variable");
       textField2=new JTextField("",8);
       result= new JLabel("result");
       textFieldresult=new JTextField("",13);
       addButton = new JButton("add");
       
       con.add(first);
       con.add(textField1);
       con.add(second);
       con.add(textField2);
       con.add(result);
       con.add(textFieldresult);
       con.add(addButton);
       setVisible(true);
       
   }
    
}

