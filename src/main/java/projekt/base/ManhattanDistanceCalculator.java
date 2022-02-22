package projekt.base;

class ManhattanDistanceCalculator implements DistanceCalculator {
    /**
     * This method calculates the distance where x-coordinate as the number of the Avenue
     * and the y-coordinate as the number of the Street in Manhattan.This counts only the blocks.
     * @param l1 First Location
     * @param l2 Second Location
     * @return distance as the number of the blocks
     */
    @Override
    public double calculateDistance(Location l1, Location l2) {
        int x1 = l1.getX();
        int x2 = l2.getX();

        int y1 = l1.getY();
        int y2 = l2.getY();

        int diff1 = Math.abs(x1 - x2);
        int diff2 = Math.abs(y1 - y2);

        return diff1 + diff2;

    }
}
