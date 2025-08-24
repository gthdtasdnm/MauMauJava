package Deck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    

    public ArrayList<Card> deck = new ArrayList<>(); 


    public Deck(){
        for (Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                deck.add(new Card(rank, suit)); 
            }
        }
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck(){
        return new ArrayList<>(deck); 
    }

    public Card takeOne() {
        return deck.remove(0); 
    }
}
