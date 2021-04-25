package com.company;

public class UseGeometric {
    public static void main(String[] args)
    {
        GeometricFigure[] geometricFigures = new GeometricFigure[4];
        geometricFigures[0] = new Square(3, 3, "Square");
        geometricFigures[1] = new Triangle(10,12, "Triangle");
        geometricFigures[2] = new Square(8, 8, "Square");
        geometricFigures[3] = new Triangle(5,7, "Triangle");


        for (int i = 0; i < geometricFigures.length; i++ ) {
            System.out.println(geometricFigures[i].toString());
        }
    }
}
