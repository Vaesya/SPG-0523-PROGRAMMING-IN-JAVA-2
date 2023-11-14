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
        vehicle call = new car();
        call.drive();
        call=new motorbike();
        call.drive();
    }
    
    static class vehicle {
        public void drive(){
            System.out.println("I am Vehicle and I can Drive!");
        }
    }
    
    static class car extends vehicle{
        public void Drive(){
        super.drive();
        System.out.println("I am a car! I use  Four Wheels!");
        }
    }
    
    static class motorbike extends vehicle{
        public void drive(){
            super.drive();
            System.out.println("I am motorcycle I only have two wheels");
        }
    }
}
