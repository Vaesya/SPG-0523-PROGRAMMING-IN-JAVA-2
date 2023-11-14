/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gigabyte
 */
public abstract class Animal {
    
    public static void main(String[]args){ //Main class
        Dog dog = new Dog(); //creates object for class Dog
        dog.makeNoise(); // Call method makeNoise in Dog

        Cow cow = new Cow();
        cow.makeNoise();
}
    
    
    public void sleep(int hours){
        try{
            //1000 miliseconds *60 seconds * 60 minutes * hours
            Thread.sleep(1000*60*60*hours);
        }
        catch (InterruptedException ie){
            //ignore
        }       
    }
    public abstract void makeNoise();    
}

class Dog extends Animal {
    public void makeNoise(){
        System.out.println("BARK!! , BARK!!");
    }
}

class Cow extends Animal{
    public void makeNoise(){
        System.out.println("MOO!!, MOO!!");    
    }

}


