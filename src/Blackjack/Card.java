/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

/**
 * @version  1.0.0.0
 * @author Michael
 */

public class Card {
    public final static int SPADES = 0; // numeric value for suits
    public final static int HEARTS = 1;
    public final static int CLUBS = 2;
    public final static int DIAMONDS = 3;
    
    public final static int ACE = 1; // numeric value for ace card
    
    public final static int JACK = 11; // numeric value for face cards
    public final static int QUEEN = 12;
    public final static int KING = 13;
    
    public final int SUIT; 
    public final int RANK;
    public boolean isHoleCard;
    public int softPtValue;
    public int hardPtValue;

    public static void main(String[] args) {
        
        /**
         *   Card c = new Card(2,2);
         *   System.out.println(c.getCardToString());
         *   System.out.println(c.getHardPtValue());
         *   System.out.println(c.getSoftPtValue());
        */ 
    }
    
    public Card(){
        SUIT = 3;
        RANK = 1;
    }
    
    public Card (int Rank, int Suit){
        this.RANK = Rank;
        this.SUIT = Suit;
    }
    
    public Card (int Rank){
        this.RANK = Rank;
        this.SUIT = 2;        
    }
    
    public int getSuit(){
        if (SUIT >= 0 && SUIT <= 3)
            return SUIT;
        else
        {System.out.println("Error path SUIT");
        return 0;
        }
    }
    
    public String getSuitToString(){
        switch (SUIT){
            case 0 : return "Spades";
            case 1 : return "Hearts";
            case 2 : return "Clubs";
            default : return "Diamonds";
        }
    }
    
    public int getRank(){
        if (RANK > 0 && RANK <= 13)
            return RANK;
        else{
            System.out.println("Error path RANK");
            return 0;
        }
    }
    
    public String getRankToString(){
        switch (RANK){
            case 1 : return "Ace";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            case 10 : return "Ten";
            case 11 : return "Jack";
            case 12 : return "Queen";
            default : return "King";
        }
    }
    
    public  String getCardToString(){
        return "The " + getRankToString() + " of " + getSuitToString();
    }
    
    public int getHardPtValue(){
        switch (RANK){
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 4;
            case 5: return 5;
            case 6: return 6;
            case 7: return 7;
            case 8: return 8;
            case 9: return 9;
            case 10: return 10;
            case 11: return 10;
            case 12: return 10;
            default : return 10;
        }
    }
    
    public int getSoftPtValue(){
        if (RANK == 1)
                softPtValue = 11;
        else 
            softPtValue = getHardPtValue();
        return softPtValue;
    }
    
}

  