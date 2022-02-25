package projekt.base;

/**
 * This is an Interface that has one method which calculates the distance.
 */
public interface DistanceCalculator {
    /**
     * This is a method calculates the distance between two locations.
     * @param l1 First Location
     * @param l2 Second Location
     * @return distance between two Location
     */
    double calculateDistance(Location l1, Location l2);
}
