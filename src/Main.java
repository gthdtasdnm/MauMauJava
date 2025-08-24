import Deck.Deck;
import Player.Player;

import java.util.ArrayList;

import Deck.Card; 

public class Main {
    public static void main(String[] args) {

        Deck decktest = new Deck(); 
        ArrayList<Card> hand = new ArrayList<>(); 
        
        for(Card c : decktest.deck){
            System.out.println(c);
        }

        for(int i = 0; i <= 4; i++){
            hand.add(decktest.takeOne()); 
        }



        Player test = new Player("Kevin", hand); 

        System.out.println(test);


    }
}