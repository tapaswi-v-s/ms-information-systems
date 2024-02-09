package models.ship;

public enum ShipType {
    BOAT(1),
    DESTROYER(10),
    SUBMARINE(20),
    CRUISER(40),
    BATTLESHIP(70),
    CARRIER(100);
    private final int size;
    ShipType(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
