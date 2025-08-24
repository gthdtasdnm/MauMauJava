package Factory;

import Deck.Deck;
import Player.Player;

public abstract class Factory{
    public Player orderPlayer(Deck deck){
        Player player = createPlayer();
        player.init(deck);
        return player;
    }

    public abstract Player createPlayer();
}
