/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card((int)(Math.random() * 13) + 1, Card.SUITS[(int) (Math.random() *4)]);
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
            System.out.println(c);
            
        }
         Card luckyCard = new Card(2, "Clubs");
         Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a card value (1 - 13): ");
        int userValue = scanner.nextInt();
        
        System.out.print("Enter a suit (0 - 3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card(userValue, userSuit);
        
         boolean userCardFound = false;
        boolean luckyCardFound = false;

        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                userCardFound = true;
            }

            if (card.equals(luckyCard)) {
                luckyCardFound = true;
            }
        }
        
        if (userCardFound) {
            System.out.println("User's card is in the magic hand!");
        } else {
            System.out.println("User's card is not in the magic hand.");
        }

        if (luckyCardFound) {
            System.out.println("Lucky card is in the magic hand!");
        } else {
            System.out.println("Lucky card is not in the magic hand.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
