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
    
    Card holeCard;
    
    // Dealer extends Player
    // Dealer deals cards to Player and Dealer by calling deck.dealCard
    // Dealer plays according to Blackjack rules
    
    static Deck deck = new Deck();
    
    
    public static void main(String[] args) {
    
        // Create a new game
        Game game = new Game();
        
        // Create a dealer and player
        Player player = new Player();
        Dealer dealer = new Dealer();
        
        // Create a deck for blackjack
        //Deck deck = new Deck();
        
        
        // Shuffle the deck before the game
        deck.shuffleDeck(); // add shuffle sound
        
        // Set the game
        player.hand[0] = deck.dealCard();
        dealer.hand[0] = deck.dealCard();
        dealer.holeCard = dealer.hand[0];
        player.hand[1] = deck.dealCard();
        dealer.hand[1] = deck.dealCard();
        System.out.println(player.hand[0].getCardToString());
        System.out.println(player.hand[1].getCardToString());
        System.out.println(dealer.hand[0].getCardToString());
        System.out.println(dealer.hand[1].getCardToString());
        System.out.println(game.getHandValue(player));
        System.out.println(game.getHandValue(dealer));
        hitPlayer(player);
        hitPlayer(dealer);
        System.out.println(player.hand[2].getCardToString());
        System.out.println(dealer.hand[2].getCardToString());
        System.out.println(game.getHandValue(player));
        System.out.println(game.getHandValue(dealer));
    }

    public static void hitPlayer(Player player){
        player.hand[player.index] = deck.dealCard();
        player.index++;
        
    }
}
