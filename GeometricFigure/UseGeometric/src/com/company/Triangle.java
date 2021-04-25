package com.company;

public class Triangle extends GeometricFigure {
    Triangle(int height, int width, String type){
        super(height, width, type);
    }

    @Override
    public double getArea() {
        return (super.getHeight() * super.getWidth())/2;
    }

    @Override    public String toString() {
        return "\nThe " + super.getType() + " Triangle with height = " + super.getHeight() + " and with width = " + super.getWidth() + "\n Has an area of " + this.getArea();
    }
}
