/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapter1exceptionsandexceptionshandlingexample;

/**
 *
 * @author Gigabyte
 */
public class Chapter1ExceptionsAndExceptionsHandlingEXAMPLE {

    public static void main(String[] args) {
        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers [10]);
            
        }
        catch (Exception ex){
            System.out.println("Error Occurs!Array out of Bounds!");
        }
        }
    }

