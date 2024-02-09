package models.game;

import models.Coordinate;
import models.Score;
import models.player.BotPlayer;
import models.player.HumanPlayer;
import models.player.Player;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class Game {
    LocalTime startTime;
    LocalTime endTime;
    GameType gameType;

    Player player1;
    Player player2;

    Score score;

    public Game(GameType gameType) {
        this.gameType = gameType;
        startGameTimer();
        setUpPlayers();
        score = new Score(player1, player2);
    }

    public void startGame(){
        while((player1.getTorpedoes().size() > 0 && player2.getTorpedoes().size() > 0) &&
                (player1.getShips().size() > 0 && player2.getShips().size() > 0)){
            player1Turn();
            player2Turn();
        }
        endGame();
    }

    private void startGameTimer(){
        startTime = LocalTime.now();
    }

    private void setUpPlayers(){
        if(gameType == GameType.ONE_PLAYER){
            player1 = new HumanPlayer();
            player2 = new BotPlayer();
        }else{
            player1 = new HumanPlayer();
            player2 = new HumanPlayer();
        }
        player1.initShips();
        player2.initShips();
    }
    private void player1Turn(){
        Coordinate coords = new Coordinate(
                new Random().nextInt(10),
                new Random().nextInt(10));
        player1.launchTorpedo(coords);

        if(player2.isShipHit(coords))
            player1Turn();
    }
    private void player2Turn(){
        Coordinate coords = new Coordinate(
                new Random().nextInt(10),
                new Random().nextInt(10));
        player2.launchTorpedo(coords);

        if(player1.isShipHit(coords))
            player2Turn();

    }

    private void endGameTimer(){
        endTime = LocalTime.now();
    }
    private void endGame(){
        endGameTimer();
        score.calculateScores();
        System.out.println("Winner is...: "+score.declareGameResult()+"!");
    }

    @Override
    public String toString() {
        return "Game{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", gameType=" + gameType +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", score=" + score +
                '}';
    }

    public String getAllObjects(){
        return this.toString();
    }
}
