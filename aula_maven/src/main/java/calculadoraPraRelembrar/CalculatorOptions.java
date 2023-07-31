package calculadoraPraRelembrar;

public class CalculatorOptions {
    
    public double operation;

    public double Addition (double number1, double number2){
        operation = number1 + number2;
        return operation;
    }

    public double Subtraction (double number1, double number2){
        operation = number1 - number2;
        return operation;
    }

    public double Multiplication (double number1, double number2){
        operation = number1 * number2;
        return operation;
    }

    public double Division (double number1, double number2){
        operation = number1 / number2;
        return operation;
    }
}
