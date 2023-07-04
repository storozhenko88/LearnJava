package lesson8.hw1;

public abstract class GeometricFigure implements Square {
    double side;

    public GeometricFigure (double side){
        this.side = side;
    }

    @Override
    public double calculateSquare() {
        return 0;
    }
}
