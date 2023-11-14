/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

class run{
    public static void main (String[] args){
         resit rs = new resit();
         
         rs.Food();
         rs.Drinks();
         rs.cetak();         
    }        
}

class Restoran { //Superclass
    Scanner in = new Scanner (System.in);
    String Pfood, Pdrink;
    int Fquantity, Dquantity;
    
    public void Food(){
        System.out.println("Selamat Datang\n\n1.Ayam goreng\n2.Nasi Ayam\n3. Mee celup\n\ntulis nama makanan:");
        Pfood = in.nextLine();
        System.out.println("Quantity:");
        Fquantity = in.nextInt();
            
    }
    
    public void Drinks(){
        System.out.println("1.air kosong\n2.air oren\n3.air epal\n\ntulis nama minuman:");
        Pdrink = in.nextLine();
        Pdrink = in.nextLine();
        System.out.println("Quantity:");
        Dquantity = in.nextInt();
    }
}

class resit extends Restoran{ //subclass
    public void cetak(){
        
        System.out.println("Order Summary");
        System.out.println("1. "+ Pfood +" x " + Fquantity);
        System.out.println("2. "+ Pdrink +" x " + Dquantity);
    }
}


