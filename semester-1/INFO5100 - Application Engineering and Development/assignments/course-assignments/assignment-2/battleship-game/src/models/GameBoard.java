package models;

import models.ship.Ship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This class is singleton because a game can have only 1 game board
public class GameBoard {

    private char[][] boardMatrix;
    private List<Ship> ships;

    private List<Torpedo> torpedoMarkers = new ArrayList<>();

    public GameBoard() {
        initBoard();
    }

    private void initBoard(){
        boardMatrix = new char[10][10];
        ships = new ArrayList<>();
    }

    // Logic to place the ships on the board
    public void placeShips(List<Ship> ships) {
        this.ships = ships;
        for (Ship ship : ships) {
            boardMatrix[ship.getCoordinate().getY()][ship.getCoordinate().getX()] = 'x';
        }
    }

    public void markTorpedo(Torpedo torpedo){
        boardMatrix[torpedo.getCoordinate().getY()][torpedo.getCoordinate().getX()] = 'o';
        torpedoMarkers.add(torpedo);
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "boardMatrix=" + Arrays.toString(boardMatrix) +
                ", ships=" + ships +
                ", torpedoMarkers=" + torpedoMarkers +
                '}';
    }

    public String getAllObjects(){
        return this.toString();
    }
}
