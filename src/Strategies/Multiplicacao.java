package Strategies;

public class Multiplicacao implements Operation {

    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}
