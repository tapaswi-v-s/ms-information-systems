package models;

import models.player.BotPlayer;
import models.player.HumanPlayer;
import models.player.Player;

public class Score {
    private Player player1;
    private Player player2;

    private int player1Score = 0;
    private int player2Score = 0;

    public Score(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public void calculateScores() {
        if (player1.getShips().isEmpty()) {
            player2Score += 2;
        } else {
            if (player2.getShips().isEmpty()) {
                player1Score += 2;
            } else {
                if (player1.getTorpedoes().isEmpty() || player2.getTorpedoes().isEmpty()) {
                    player1Score++;
                    player2Score++;
                }
            }
        }
    }

    public String declareGameResult() {
        if (player1Score > player2Score) {
            return player1.getName() + " Wins!" +
                    ((player1 instanceof HumanPlayer)
                            ? "\nPlayer Details: " +
                            "\nAge: " + ((HumanPlayer) player1).getAge() +
                            " Skill Level: " + ((HumanPlayer) player1).getSkillLevel()
                            : "");
        } else if (player2Score > player1Score) {
            return player2.getName() + " Wins!" +
                    ((player2 instanceof HumanPlayer)
                            ? "\nPlayer Details: " +
                            "\nAge: " + ((HumanPlayer) player2).getAge() +
                            " Skill Level: " + ((HumanPlayer) player2).getSkillLevel()
                            : "Boot Difficulty Level: "+((BotPlayer) player2).getDifficultyLevel());
        } else {
            return "It's a tie...";
        }
    }

    @Override
    public String toString() {
        return "Score{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", player1Score=" + player1Score +
                ", player2Score=" + player2Score +
                '}';
    }

    public String getAllObjects(){
        return this.toString();
    }
}
