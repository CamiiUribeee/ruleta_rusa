
package com.mycompany.ruletarusa;

import java.util.Random;

public class Ruletarusa {

    public static void main(String[] args) {
        
        Random num =new Random ();    
        
        for (int i=0; i<1; i++){
            
            int N = 1+ number.nextInt(6);    //quiero traerme el number que hay en la clase Message, pero me marca error 
            System.out.println(N);   
        }
        
        Message message = new Message(); 
        
        try{
            int result= message.numbers(0);
            System.out.println("Exception: " + result);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        
    }
}
