package models.ship;

import models.Coordinate;

public class Ship {
    private ShipType type;
    private Coordinate coordinate;

    public Ship(ShipType type, Coordinate coords) {
        this.type = type;
        this.coordinate = coords;
    }

    public ShipType getType() {
        return type;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "type=" + type +
                ", coordinate=" + coordinate +
                '}';
    }

    public String getAllObjects(){
        return this.toString();
    }
}
