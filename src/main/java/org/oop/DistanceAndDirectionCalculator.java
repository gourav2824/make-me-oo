package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return from.distanceFromPoint(to);
    }

    public static double direction(Point from, Point to) {
        return from.directionFromPoint(to);
    }
}
