package lesson8.hw1;

import lesson8.hw1.GeometricFigure;

public class Quad extends GeometricFigure {
    public Quad(double side) {
        super(side);
    }

    @Override
    public double calculateSquare() {
        return side * side;
    }
}
