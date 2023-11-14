/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restoran;

import java.util.Scanner;

class run{
    public static void main (String[] args){
        RT restoran = new RT();
        order od = new order();
        
        restoran.welcome();
        restoran.makanan();
        restoran.minuman();
        rest.meja();                
    }        
}


class RT{

int i,tablenum; 
Scanner sc = new Scanner(System.in);

    public void welcome(){
        System.out.println("Selamat Datang ke kedai kami\n\n Sila ambil tempat duduk anda");
    }
    public void makanan(){
        
        String Ofood[] = new String[5];        
        System.out.println("Enter 5 food name you like to order:\n"); 
        for(i=0;i<5;i++){
         System.out.print(i+1);
         Ofood[i] = sc.nextLine();
        }
    }
    public void minuman(){
        String Odrink[] = new String[5];
        System.out.println("Enter 5 drink name you like to order:\n"); 
        for(i=0;i<5;i++){
            System.out.print(i+1);
            Odrink[i] = sc.nextLine();
        }
    }
    public void meja(){
        System.out.print("Enter your table number: ");
        tablenum = sc.nextInt();
    }
}


class resit extends RT{ //subclass
    public void cetak(){
        
        System.out.println("Order Summary");
        System.out.println(tablenum);
        for (i=0;i<5;i++){
            System.out.println((i+1) +"."+ Ofood[i]);
        }
    }
}


