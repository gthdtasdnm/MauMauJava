package GameLoop;
import java.util.Scanner;

public class Game_Inti extends State {

    Scanner scanner = new Scanner(System.in); 

    public void enter(){
        int player; 
        
        System.out.println("Wie viele Spiler gibt es");
        player = scanner.nextInt(); 

        for(int i = 1; i >= player; i++){
            System.out.println("Geben sie den Namen des " + i + " Spieler ein:");
            
        }
    } 

    public void update(){
        
    } 

    public void exit(){
        
    } 
}
