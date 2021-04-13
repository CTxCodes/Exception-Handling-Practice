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
public class ExceptionB extends ExceptionA {
    ExceptionA example = new ExceptionA();
    Exception example2 = new Exception();
    public void ecxeptionHandling(){
                example.IOExceptionError();
                example2.nullErrorCatching();
    }
    
}
