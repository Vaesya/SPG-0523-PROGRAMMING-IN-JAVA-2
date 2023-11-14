/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVC_Controller implements ActionListener{
    MVC_Model model;
    MVC_VIEW view;

    MVC_Controller(MVC_VIEW v, MVC_Model m) {
        model = m;
        view = v;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0){
        try{
            //retrieve the input from VIew
            String a = view.textField1.getText();
            String b = view.textField2.getText();
            
            //call add method
            int result = model.add(a,b);
            
            //display rsult in View(UI)
            view.textFieldresult.setText(""+ result);
            
        }
        catch(Exception ee){
            ee.printStackTrace();
        }    
    }
    public void actionListenerMeth(ActionListener ae){
        view.addButton.addActionListener(ae);
    }
    
    
}
