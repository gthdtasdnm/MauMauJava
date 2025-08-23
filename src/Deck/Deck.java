package Deck;
import java.util.ArrayList;
import java.util.Iterator;

public class Deck {
    

    public final ArrayList<Card> deck = new ArrayList<>(); 


    public Deck(){
        for (Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                deck.add(new Card(rank, suit)); 
            }
        }
    }

    

    





}
