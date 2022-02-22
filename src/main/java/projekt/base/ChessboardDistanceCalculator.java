package projekt.base;

class ChessboardDistanceCalculator implements DistanceCalculator {
    /**
     * This is a method calculates distance where the x-coordinate as a column and the y-coordinate as a row (on a chessboard).
     * @param l1 First Location
     * @param l2 Second Location
     * @return distance as minimum number of moves from one square to the other.
     */
    @Override
    public double calculateDistance(Location l1, Location l2) {
        int x1 = l1.getX();
        int x2 = l2.getX();

        int y1 = l1.getY();
        int y2 = l2.getY();

        int diff1 = Math.abs(x1 - x2);
        int diff2 = Math.abs(y1 - y2);

        return Math.max(diff1,diff2);
    }
}
