/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gigabyte
 */
class GlobalMVC {
    public static void main(String args[]){
        MVC_Model m = new MVC_Model();
        MVC_VIEW v = new MVC_VIEW(m);
        new MVC_Controller(v,m);
    }
}
