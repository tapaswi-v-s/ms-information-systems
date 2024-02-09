package models.player;

import models.Coordinate;
import models.GameBoard;
import models.ship.Ship;
import models.Torpedo;
import models.ship.ShipType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Player {
    protected GameBoard board = new GameBoard();
    protected String name = null;
    protected List<Ship> ships;
    protected final List<Torpedo> torpedoes = new ArrayList<>() {{
        for (int i = 0; i < 45; i++) {
            add(new Torpedo());
        }
    }};

    // Initializing the ships and placing it on the game board.
    public void initShips() {
        ships = new ArrayList<>() {{
            for (int i = 0; i < 6; i++) {
                add(new Ship(ShipType.values()[i],
                        new Coordinate(new Random().nextInt(10),
                                new Random().nextInt(10))));
            }
        }};

        // Placing the ships on the board
        board.placeShips(ships);
    }

    public void launchTorpedo(Coordinate coordinate){
        if (torpedoes.size() != 0){
            Torpedo torpedo = torpedoes.remove(torpedoes.size() - 1);
            torpedo.launch(coordinate);
            board.markTorpedo(torpedo);
        }
    }

    public boolean isShipHit(Coordinate target) {
        for (Ship ship : ships) {
            if (ship.getCoordinate().equals(target)) {
                ships.remove(ship);
                System.out.println(name+"'s ship Hit! " +
                        "\nShip Name: "+ship.getType().name()+
                        " Ship Size: "+ship.getType().getSize());
                return true;
            }
        }
        return false;
    }

    public List<Torpedo> getTorpedoes() {
        return torpedoes;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public String getName() {
        return name;
    }

    public abstract String getAllObjects();
}
