package models;

public class Torpedo {
    private Coordinate coordinate = null;
    public Torpedo() {}

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void launch(Coordinate coordinate){
        this.coordinate = coordinate;
        // Logic to launch torpedo
    }

    @Override
    public String toString() {
        return "Torpedo{" +
                "coordinate=" + coordinate +
                '}';
    }

    public String getAllObjects(){
        return this.toString();
    }
}
