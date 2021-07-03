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
public enum Item {
    COKE("Coke",25),PEPSI("Pepsi",35),SODA("Soda",45);
    
    private String name;
    private int price;
    
    private Item(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public long getPrice(){
        return price;
    }
}
