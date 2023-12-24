package models;
import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    //Shape(param): Constructor to initialize a shape with an array of points.
    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    //perimeter(): Calculate and return the perimeter of the shape.
    public double calculatePerimeter() {
        double perimeter = 0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(nextIndex);
            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    //longestSide(): Find and return the length of the longest side in the shape.
    public double getLongest() {
        double longest = 0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(nextIndex);
            double sideLength = currentPoint.distanceTo(nextPoint);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }

        return longest;
    }

    //averageSide(): Calculate and return the average length of the sides in the shape.
    public double averageSide() {
        double totalLength = 0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(nextIndex);
            totalLength += currentPoint.distanceTo(nextPoint);
        }

        return totalLength / numPoints;
    }
}