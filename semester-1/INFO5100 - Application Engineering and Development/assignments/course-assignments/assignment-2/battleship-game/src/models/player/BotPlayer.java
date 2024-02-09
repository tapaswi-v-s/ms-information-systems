package models.player;

import models.Coordinate;
import models.GameBoard;
import models.ship.Ship;
import models.Torpedo;

import java.util.List;
import java.util.Random;

public class BotPlayer extends Player {
    int difficultyLevel;

    public BotPlayer() {
        this.board = board;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    @Override
    public String toString() {
        return "BotPlayer{" +
                "difficultyLevel=" + difficultyLevel +
                ", board=" + board +
                ", name='" + name + '\'' +
                ", ships=" + ships +
                ", torpedoes=" + torpedoes +
                '}';
    }

    @Override
    public String getAllObjects() {
        return this.toString();
    }
}
