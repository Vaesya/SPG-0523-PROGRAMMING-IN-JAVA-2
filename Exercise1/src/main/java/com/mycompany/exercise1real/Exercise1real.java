/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise1real;

/**
 *
 * @author Gigabyte
 */
public class Exercise1real {

    public static void main(String[] args) {
        Buku bk = new Buku(); // Creates object name bk for Buku Class
        genre gr =new genre();// Creates object name gr for Genre class
        
        bk.jenis(); //Call method jenis dalam class buku
        gr.jenis();// Call method jenis dalam class genre
        
    }
}

class Buku{ // SUperclass
    public void jenis(){ 
        System.out.println(" Jenis buku di Library\n\n1.Kamus\n2.Enskiplodia\n3. Rujukan");
    }
}

class genre extends Buku{//SUBCLASS
    public void jenis(){
        System.out.println("genre yang ada dalam setiap jenis buku\n\n1.Haiwan\n2.Manusia\n3.Psikologi");
    }

}
    
