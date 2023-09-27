/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author anshika Thakur
 * Student number 991698396
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
       Card luckyCard = new Card();
       luckyCard.setValue(3);
       luckyCard.setSuit("Spades");
       
       boolean found = false;
       for (int i= 0;i<magicHand.length;i++){
           if (magicHand[i].equals(luckyCard)){
               found = true;
               break;
           }
       }
    if(found){
        System.out.println("Congratulation!toubgot lucky card");
    }else{
        System.out.println("Soory! better luck next time");
    }
    }
    }
    
    

