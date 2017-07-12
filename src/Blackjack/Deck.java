/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.Random;

/**
 * @version 1.0.0.0
 * @author Michael
 */

public class Deck {
    int topCard = 0;
    static Card [] deck = new Card [52];
    
    public static void main(String[] args) {
        /*
        new Deck();
        shuffleDeck();
        System.out.println(dealCards().getCardToString());
        System.out.println(cardsRemaining());
        */
        
        /*
        // output each card of the deck
        for (int counter = 0; counter < 52; counter++)
            if (deck[counter] != null)
            System.out.println(deck[counter].getCardToString() + "   " + deck[counter].getHardPtValue()
                    + "   " + deck[counter].getSoftPtValue()); 
        */            
    }
    
    public static void shuffleDeck(){
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = rand.nextInt(i+1);
            // simple swap
            Card temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }    
    }
    
    public static int cardsRemaining(){
        int counter = 0;
        for (int x = 0; x < deck.length; x++ ){
            if (deck[x] != null)
                counter++;
        }
        return counter;
    }
    
    
    public Card dealCard(){
        Card dealtCard = deck[topCard];
        deck[topCard] = null;
        topCard++;
        //System.out.println("the top card is " +deck[topCard].getCardToString());
        return dealtCard;
    }

    public void dealCards(int howMany){
        for (int x = 0; x < howMany; x++){
            deck[x] = null;
            topCard++;
        }
        System.out.println("the top card is " +deck[topCard].getCardToString());
    }
    
    public Deck(){
        int cardNumber = 0;
        
        for (int suit = 0; suit <= 3; suit++){
            for (int rank = 1; rank <= 13; rank++){
            deck[cardNumber]= new Card (rank, suit);
            cardNumber++;
            }
        }
    }
}    