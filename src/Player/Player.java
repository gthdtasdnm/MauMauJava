package Player;

import java.util.ArrayList;
import java.util.Scanner;

import Deck.Card;
import Deck.Deck;

public class Player {
    String name; 
    ArrayList<Card> hand = new ArrayList<>(); 


    public Player(){
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

    public void init(Deck deck){
        Scanner scanner = new Scanner(System.in);

        // Spielername abfragen
        System.out.print("Bitte gib deinen Namen ein: ");
        name = scanner.nextLine();

        // z. B. 5 Karten ziehen
        for (int i = 0; i < 5; i++) {
            takeCard(deck.takeOne());
        }

        System.out.println("Spieler \"" + name + "\" wurde erstellt.");
        System.out.println("Handkarten: " + hand);
    }

}
