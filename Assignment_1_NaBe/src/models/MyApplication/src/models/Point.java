package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point destination) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = destination.getX();
        double y2 = destination.getY();

        // Fixing the distance calculation formula
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return distance;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

