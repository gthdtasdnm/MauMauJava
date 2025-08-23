
import java.util.Iterator;
import Deck.Deck;
import Deck.Card; 

public class Main {
    public static void main(String[] args) {

        Deck decktest = new Deck(); 
        
        for(Card c : decktest.deck){
            System.out.println(c);
        }
       


    }
}