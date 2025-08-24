package Factory;

import Player.Player;

public class PlayerFactory extends Factory{

    @Override
    public Player createPlayer() {
        return new Player();
    }
}
