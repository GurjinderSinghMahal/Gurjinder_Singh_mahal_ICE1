/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagami
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.getRandomValue());
            
            //c.setSuit(Card.Suits(insert call to random number between 0-3 here)
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of suit :");
        String suit = input.nextLine();
        
        System.out.println("Enter numbr btween 1 to 13");
        int number = input.nextInt();
        
        for(int num = 0; num< magicHand.length; num++) {
            if(suit.equals(magicHand[num].getSuit()) && number == magicHand[num].getValue()) {
                System.out.println("FOUND");
            }
            else {
                System.out.println("NOT FOUND");
            }
        }
        // and search magicHand here
        //Then report the result here
    }
    
}
