package GameLoop;
import java.util.ArrayList;
import java.util.Scanner;
import Deck.Card;
import Deck.Deck;
import Factory.PlayerFactory;
import Player.Player;


public class Game_Init extends MauMauState {

    private ArrayList<Player> players = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private boolean finished = false;
    private Deck deck = new Deck();
    PlayerFactory playerFactory = new PlayerFactory();

    public void enter(){
        System.out.println("Willkommen zum MauMau Spiel");
        System.out.println("Gib die Namen von 4 Spielern ein");
        update();
    } 

    public void update(){
        if(players.size() < 4){
            players.add(playerFactory.orderPlayer(deck));
        }else{
            exit();
            return;
        }

        // Nach jeder Eingabe rekursiv wieder update() aufrufen
        update();
    } 

    public void exit(){
        System.out.println("Game_Init verlassen");
        System.out.println(players);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
