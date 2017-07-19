/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

/**
 * @version 1.0.0.0
 * @author Michael
 */
public class Player {
    
    int index = 2;
    Card [] hand = new Card [15];
  
    
    // Player has a hand
    // Player can hit
    // Player can stay
    // Player can bust

    public int getHandValue(){
        int handValue = 0;
        for (int x = 0; x < index; x++)
            handValue += hand[x].getHardPtValue();
        return handValue;
    }
    
}


