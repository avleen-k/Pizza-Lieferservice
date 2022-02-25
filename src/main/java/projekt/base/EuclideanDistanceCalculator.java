package projekt.base;

class EuclideanDistanceCalculator implements DistanceCalculator {
    /**
     * Calculates the Euclidean distance of two points (x1, y1) and (x2, y2)
     * @param l1 First Location
     * @param l2 Second Location
     * @return Euclidean distance
     */
    @Override
    public double calculateDistance(Location l1, Location l2) {
        int x1=l1.getX();
        int x2=l2.getX();

        int y1= l1.getY();
        int y2= l2.getY();

        double sqr1=Math.pow(x1-x2,2);
        double sqr2=Math.pow(y1-y2,2);


        return Math.sqrt(sqr1+sqr2);
    }
}
