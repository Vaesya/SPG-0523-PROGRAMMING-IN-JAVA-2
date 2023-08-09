/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gigabyte
 */
public class Vehicle { //Superclass
            
        protected String brand = "Ford"; //String
        public void honk(){//Method
            System.out.println("Tuuut... Tuuut");
        }
}    


//This is where"Inheritence" implements

class Car extends Vehicle{//Subclass which derived from superclass by using 'extends'
    
    private String modelName = "Mustang"; //String
    public static void main(String[] args) { //Main Method
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " "+myFastCar.modelName);
        
    }
}
