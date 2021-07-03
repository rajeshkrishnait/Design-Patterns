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
public enum Coin {
    PENNY(1), NICKLE(5),DIME(10),QUARTER(25);
    
    private int Denomination;
    
    private Coin(int Denomination){
        this.Denomination=Denomination;
    }
    public int getDenomination(){
        return Denomination;
    }
}
