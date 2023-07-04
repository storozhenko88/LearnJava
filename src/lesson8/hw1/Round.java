package lesson8.hw1;

import lesson8.hw1.GeometricFigure;

public class Round extends GeometricFigure {

    public Round(double side) {
        super(side);
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(side, 2);
    }
}
