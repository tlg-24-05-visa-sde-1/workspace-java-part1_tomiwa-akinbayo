package edu.geometry;

public class Circle extends Shape {

    private double radius;
    private double diameter;

    public Circle() {
    }

    public Circle(double radius){
        setRadius(radius);
    }

//    public double area() {
//        return 0;
//    }

    @Override
    public double area(double radius){
        double result = PIE * (radius * radius);
        return result;
    }


    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    private void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
