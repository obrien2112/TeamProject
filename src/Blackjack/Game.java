/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

/**
 *
 * @author Michael
 */
public class Game {
    
    public static void main(String[] args) {
        //Game game = new Game();
        System.out.println("Let's play a game of Blackjack! ");
        //System.out.println(Dealer.player.hand[0].getValue());
    }
    
    public int getHandValue(Player player){
        int handValue = 0;
        for (int x = 0; x < player.index; x++)
            handValue += player.hand[x].getHardPtValue();
        return handValue;
    }
}
