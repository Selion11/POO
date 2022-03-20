package Guia_3;

import java.util.Objects;

public final class Complex {
    private final double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex(Number real) {
        this(real.doubleValue(), 0);
    }

    double getReal() {
        return real;
    }

    double getImaginary() {
        return imaginary;
    }

    Complex plus(Complex a) {
        return new Complex(real + a.real, imaginary + a.imaginary);
    }

    Complex plus(Number a) {
        return plus(new Complex(a));
    }

    @Override

    public String toString() {
        return String.format("%.2f %c %.2f", real, imaginary > 0 ? '+' : '-', imaginary);
    }


    @Override

    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(!(o instanceof Complex)){
            return false;
        }
        Complex that = (Complex) o;

        return Double.compare(that.real,real) == 0 && Double.compare(that.imaginary,imaginary) == 0;
    }

    @Override

    public int hashCode(){
        return Objects.hash(real,imaginary);
    }

}