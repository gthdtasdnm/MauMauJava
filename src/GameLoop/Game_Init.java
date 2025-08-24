package GameLoop;
import java.util.ArrayList;
import java.util.Scanner;
import Deck.Card;
import Deck.Deck;
import Player.Player;


public class Game_Init extends MauMauState {

    private ArrayList<Player> players = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean finished = false;
    private Deck deck = new Deck();

    public void enter(){
        System.out.println("Willkommen zum MauMau Spiel");
        System.out.println("Gib die Namen der Spieler ein, die mitspielen.");
        System.out.println("Wenn du fertig bist, gibt \"exit\" ein");
        update(); 

    } 

    public void update(){
        if (finished) return; // falls beendet
        

        System.out.print("Spielername: ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("exit")) { 
            if(players.size() >= 1 ) {
                finished = true;}  
                System.out.println("Spieleranzahl: " + players.size());
                System.out.println("Spieler: " + players);
                exit();  
                return;
            }
            else{ 
                finished = false;
            }




        if (!input.isEmpty()) {     // spiler wird erstellt wenn eine Engabe vorliegt 
            ArrayList<Card> hand = new ArrayList<>();
            for(int i = 0; i <= 4; i++){
                hand.add(deck.takeOne());
            }
            players.add(new Player(input,hand));
            System.out.println("Spieler hinzugefügt: " + input);    
        } else {            // bei keiner Eingabe wirde nach einen name gefragt 
            System.out.println("Bitte einen gültigen Namen eingeben!");
        } 
        if(players.size() >= 4){ // Wenn 4 es Spiler sind gehen wir raus 
            return;
        }


        // Nach jeder Eingabe rekursiv wieder update() aufrufen
        update();
    } 

    public void exit(){
        System.out.println("Game_Init verlassen");
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
