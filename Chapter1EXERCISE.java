/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


 //Simple program using contructor,class,object and try-catch program
        
package com.mycompany.chapter1exercise;

public class Chapter1EXERCISE { //Created class
    
    int last[] = new int[3];
    
    public Chapter1EXERCISE(){
        
        last[0] = 100;
        last[1] = 50;
        last[2] = 150;
    }

    
    public static void main(String[] args) {
       
        Chapter1EXERCISE kira = new Chapter1EXERCISE();
        
        try{
        System.out.println("First Number = "+ kira.last[0]);
        System.out.println("Second Number = "+kira.last[1]);
        System.out.println("1st number + 2nd number = "+ (kira.last[0]+kira.last[1]));
        
        System.out.println("3rd number =" + kira.last[2]);
        System.out.println("4th number =" + kira.last[3]);
        System.out.println("3rd number + 4th number =" + (kira.last[2]+kira.last[3]));
            
        }
        catch (Exception ex){
            System.out.println("Error Occurs!Array out of Bounds!");
        }
        
        
            }
}
