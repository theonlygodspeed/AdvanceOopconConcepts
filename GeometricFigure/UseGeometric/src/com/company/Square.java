package com.company;

public class Square extends GeometricFigure {
    Square(int height, int width, String type){
        super(height, width, type);
    }

    @Override    public double getArea() {
        return (super.getHeight() * super.getWidth());
    }

    @Override    public String toString() {
        return "\nThe " + super.getType() + " with height = " + super.getHeight() + " and with width = " + super.getWidth() + "\n Has an area of " + this.getArea();
    }
}