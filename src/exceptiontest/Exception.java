/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

/**
 *
 * @author cjt1496
 */

import java.util.Scanner;
public class Exception {
    Scanner input = new Scanner(System.in);
    
    public void nullErrorCatching(){ 
        
            System.out.println("Do not type \"Corey\"");
            String word = input.next();      
            
            
        try{
            if(word.equals("Corey")){
                System.out.println("Wow! I almost got you! \"Corey\"!");
            }
           
        } catch (NullPointerException e){
            System.out.println("NullPointer Exception thrown! You should have types \"Corey\"");
        }
    }

 
    
   
            
    
    
}
