package projekt.base;

public class Location {

    private final int x;
    private final int y;

    /**
     * Constructor for class Location, Defines the coordinates of the delivery destination.
     * @param x type int, is the coordinate x
     * @param y type int, is the coordinate y
     */
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }


    /**
     * getter method for attribute x
     * @return type int, the actual value of the attribute x
     */
    public int getX() {
        return x;
    }


    /**
     * getter method for attribute y
     * @return type int, the actual value of the attribute y
     */
    public int getY() {
        return y;
    }

    /**
     * method add sums the provided coordinates and creates a new object von class Location.
     * @param aLocation type Location, the provided coordinates to be summed
     * @return type Location, a new location object
     */
    Location add(Location aLocation){
        int newX = this.getX() + aLocation.getX();
        int newY = this.getY() + aLocation.getY();

        Location newLocation = new Location(newX, newY);
        return  newLocation;
    }

    /**
     * method add subtracts the provided coordinates and creates a new object von class Location.
     * @param aLocation type Location, the provided coordinates to be subtracted
     * @return type Location, a new location object
     */
    Location subtract(Location aLocation){
        int newX = this.getX() - aLocation.getX();
        int newY = this.getY() - aLocation.getY();

        Location newLocation = new Location(newX, newY);
        return  newLocation;
    }
}
