package Strategies;

public class Control {
    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double num1 = 20;
        double num2 = 5;

        calculadora.setOperation(new Soma());
        System.out.println("Soma: " + calculadora.executarCalculo(num1, num2));

        calculadora.setOperation(new Subtracao());
        System.out.println("Subtração: " + calculadora.executarCalculo(num1, num2));

        calculadora.setOperation(new Multiplicacao());
        System.out.println("Multiplicação: " + calculadora.executarCalculo(num1, num2));

        calculadora.setOperation(new Divisao());
        System.out.println("Divisão: " + calculadora.executarCalculo(num1, num2));

    }
}
