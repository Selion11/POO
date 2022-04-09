package Guia_3;

public class Triangle extends Figure {

    protected Point firstPoint, secondPoint, thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double area() {
        double semiPerimiter = perimeter() / 2;
        return Math.sqrt(semiPerimiter * (semiPerimiter - firstSide())
                * (semiPerimiter - secondSide()) * (semiPerimiter - thirdSide()));
    }

    @Override
    public double perimeter() {
        return firstSide() + secondSide() + thirdSide();
    }

    private double firstSide() {
        return firstPoint.distanceTo(secondPoint);
    }

    private double secondSide() {
        return secondPoint.distanceTo(thirdPoint);
    }

    private double thirdSide() {
        return thirdPoint.distanceTo(firstPoint);
    }

    @Override
    public String toString() {
        return String.format("Triángulo [ %s , %s , %s ]", firstPoint, secondPoint, thirdPoint);
    }

}
