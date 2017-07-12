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
public class Dealer extends Player {
    
    static int index = 0;
    static Card [] hand = new Card [15];
    static Card HoleCard;
    
    // Dealer extends Player
    // Dealer deals cards to Player and Dealer by calling deck.dealCard
    // Dealer plays according to Blackjack rules
    
    
    public static void main(String[] args) {
    
        
        // Create a deck for blackjack
        Deck deck = new Deck();
        
        // Shuffle the deck before the game
        deck.shuffleDeck(); // add shuffle sound
        
        // Set the game
        Game.player.hand[0] = deck.dealCard();
        Game.dealer.hand[0] = deck.dealCard();
        Game.player.hand[1] = deck.dealCard();
        Game.dealer.hand[1] = deck.dealCard();
        System.out.println(Game.player.hand[0].getCardToString());
        System.out.println(Game.player.hand[1].getCardToString());
        System.out.println(Game.dealer.hand[0].getCardToString());
        System.out.println(Game.dealer.hand[1].getCardToString());
    }
    

    
    
    
}
