import models.game.Game;
import models.game.GameType;
import models.player.Player;

public class main_class {
    public static void main(String[] args) {
        // Only these two lines are required to play the entire game;
        Game game = new Game(GameType.ONE_PLAYER);
        game.startGame();
    }
}
