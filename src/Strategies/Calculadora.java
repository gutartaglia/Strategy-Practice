package Strategies;

public class Calculadora {

    private Operation operation;

    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public double executarCalculo(double num1, double num2){
        if (operation == null){
            throw new IllegalStateException("Nenhuma operação foi definida");
        }

        return operation.calcular(num1, num2);
    }
}
