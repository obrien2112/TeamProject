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
    static Player player;
    static Dealer dealer;
    
    public static void main(String[] args) {
        dealer = new Dealer();
        player = new Player();
        System.out.println("Let's play a game of Blackjack! ");
        //System.out.println(Deck.deck[0].getCardToString());
        
        //Player.hand[0].getCardToString();
        
    }
}
