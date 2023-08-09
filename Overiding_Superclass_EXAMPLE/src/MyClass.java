/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gigabyte
 */
public class MyClass {
    
    public static void main (String args[]){
        Company a = new Company();
        Company b = new eBay();
        
        b.address();
    }
}

class Company{
    public void address(){
        System.out.println("This is Address of Crunchify Company");
    }
}

class eBay extends Company{
    
    public void address(){
        super.address();
        System.out.println("This is eBay's Address");
    }
}