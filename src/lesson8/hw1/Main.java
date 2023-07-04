package lesson8.hw1;

public class Main {

    public static void main(String[] args) {

        double sumSquareFigures = 0;

        Quad quad1 = new Quad(2);
        Quad quad2 = new Quad(3);

        Round round1 = new Round(4);
        Round round2 = new Round(5);

        GeometricFigure[] figures = {quad1, quad2, round1, round2};

        for (GeometricFigure fig: figures) {
            sumSquareFigures += fig.calculateSquare();
        }

        System.out.println(sumSquareFigures);
    }
}
