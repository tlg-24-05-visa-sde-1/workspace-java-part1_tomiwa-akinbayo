package edu.geometry;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Shape {

    public static final double PIE = 3.14;


    private final Collection<Shape> items = new ArrayList<>();
    private String name;
    private int numOfSides;
    private double totalArea;

    public Shape() {
    }

    public Shape(String name, int numOfSides) {
        setName(name);
        setNumOfSides(numOfSides);
    }

    public abstract double area(double radius);

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    private void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public String toString() {
        return "hi";
    }
}
