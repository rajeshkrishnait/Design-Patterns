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
import java.util.Map;
import java.util.HashMap;

public class Inventory<T> {
    private Map<T,Integer> Inventory=new HashMap<>();
    
    public int getQuantity(T item){
        Integer value=Inventory.get(item);
        return value==null?0:value;
    }
    
    public void add(T item){
        Inventory.put(item,Inventory.get(item)+1);
    }
    
    public void deduct(T item){
        if(hasItem(item)){
            Inventory.put(item,Inventory.get(item)-1);
        }
    }
    
    public boolean hasItem(T item){
        return getQuantity(item)>0;
    }
    
    public void clear(){
        Inventory.clear();
    }
    
    public void put(T item,int val){
        Inventory.put(item,val);
    }
}
