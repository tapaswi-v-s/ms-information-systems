package models.player;

import models.Coordinate;
import models.GameBoard;
import models.ship.Ship;
import models.Torpedo;

import java.util.List;
import java.util.Random;

public class HumanPlayer extends Player {

    String name;
    double age;
    int skillLevel;

    public HumanPlayer() {}

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    @Override
    public String getAllObjects() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "HumanPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skillLevel=" + skillLevel +
                ", board=" + board +
                ", name='" + name + '\'' +
                ", ships=" + ships +
                ", torpedoes=" + torpedoes +
                '}';
    }
}
