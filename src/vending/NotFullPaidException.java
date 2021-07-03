/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending;

/**
 *
 * @author ELCOT
 */
public class NotFullPaidException extends RuntimeException{
    private String message;
    private long remaining;
    public NotFullPaidException(String s,long remaining){
        this.message=message;
        this.remaining=remaining;
    }
    
    public long getRemaining(){
        return remaining;
    }
    
    @Override
    public String getMessage(){
        return message+remaining;
    }
}
