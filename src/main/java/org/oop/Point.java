package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double calculateDistance(Point to) {
        double xDistance = to.x - this.x;
        double yDistance = to.y - this.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }
    public double calculateDirection(Point to){
        double xDistance = to.x - this.x;
        double yDistance = to.y - this.y;
        return Math.atan2(yDistance, xDistance);
    }

}
