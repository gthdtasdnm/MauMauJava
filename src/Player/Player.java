package Player;

import java.util.ArrayList;
import Deck.Card;

public class Player {
    String name; 
    ArrayList<Card> hand = new ArrayList<>(); 


    public Player(String name, ArrayList<Card> hand){
        this.name = name;
        this.hand = hand;
    }


    public String getName(){
        return name; 
    }

    public ArrayList<Card> getHand(){
        return hand; 
    }

    // Karte Ziehn 
    public void takeCard(Card card){
        hand.add(card); 
    }

    // ToString name und Hand 
    @Override
    public String toString() {
        return "Player " + name + " has: " + hand;
    }

    // Karten Legen 
    public Card discard(Card discardCard){
        int index = hand.indexOf(discardCard);
        if (index != -1) {
            return hand.remove(index);
        }
        return null; // if ther is no card 
     
    }


}
