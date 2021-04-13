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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class ExceptionA extends Exception {
  
    public void IOExceptionError() {
      
        try {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } catch (IOException e) {
            System.out.println("IOException has been caught");
        }

    }
            
    
}
