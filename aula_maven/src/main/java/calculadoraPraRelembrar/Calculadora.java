package calculadoraPraRelembrar;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double result = 0.0; 
        CalculatorOptions calculator = new CalculatorOptions();

        Scanner entry = new Scanner(System.in);

        System.out.println("Welcome to Daywid's Calculator!");
        System.out.println("Input a number: \n");
        double number1 = entry.nextDouble();
        System.out.println("Input another number: \n");
        double number2 = entry.nextDouble();
        System.out.println("Choose an option: \n 1 - addition \n 2 - subtraction \n 3 - division \n 4 - multiplication");
        int option = entry.nextInt();


        switch (option) {
            case 1:
            
                result = calculator.Addition(number1, number2);
            
                break;
            
            case 2:
            
                result = calculator.Subtraction(number1, number2);
            
                break;
            
            case 3:
            
                result = calculator.Division(number1, number2);
            
                break;
            
            case 4:

                result = calculator.Multiplication(number1, number2);

                break;

            default:
            
            System.out.println("Invalid option!");
            
            }

        System.out.println("Result: " + result);



    }
}
