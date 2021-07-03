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
import java.util.List;
public interface VendingMachine {
    public long selectItemAndPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item,List<Coin>> collectItemAndChange();
    public void reset();
}
