/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DrawOnFrame {
    public static void main(String[] args){
    // create JFrame
    JFrame application = new JFrame("A simple paint program");

    //PaintPanel paintPanel = new PaintPanel();
    //application.add(paintPanel, BorderLayout.CENTER);  

    // create a label and place it in SOUTH of BorderLayout
    application.add(new JLabel("Drag the mouse to draw"),BorderLayout.SOUTH);
    
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    application.setSize(400, 200);
    application.setVisible(true);
    }
}
