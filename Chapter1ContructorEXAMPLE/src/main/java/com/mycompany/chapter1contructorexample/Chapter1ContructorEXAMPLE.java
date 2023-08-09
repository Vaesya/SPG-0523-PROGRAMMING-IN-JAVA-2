/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter1contructorexample; //Package which holds classes together which those classes are related to each other

public class Chapter1ContructorEXAMPLE { //Created a class
    
    int x; // Created class attribute/ variable
    
    public Chapter1ContructorEXAMPLE(){ //This is contructor (Must same name with class)
        x=5; // Give value to attribute / variable
    }
    public static void main(String[] args) { 
        Chapter1ContructorEXAMPLE myObj =new Chapter1ContructorEXAMPLE(); //Craete an object of class Chapter1ContructorEXAMPLE(This will call the contructor)
        System.out.println(myObj.x); //Print value of object
    }
}
