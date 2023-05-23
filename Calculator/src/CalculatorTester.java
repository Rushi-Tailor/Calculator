import java.util.Scanner;

public class CalculatorTester {
    public static void main (String args[]) {

        Scanner keyboard = new Scanner(System.in);
        Calculator math = new Calculator();

        String operation = "";
        double number1 = 0;
        double number2 = 0;

        

        System.out.print("Enter the first number: ");
        number1 = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter the second number: ");
        number2 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter operation");
        System.out.println(" |add|subtract|multiply|divide|all| ");
        System.out.print("Enter one of these operations: ");
        operation = keyboard.nextLine();

        if (operation.equals("add")) {
            
            math.add(number1, number2);
        }
        else if (operation.equals("subtract")) { 

            math.subtract(number1, number2);
        }
        else if (operation.equals("multiply")) {
            
            math.multiply(number1, number2);
        }
        else if (operation.equals("divide")) {

            math.divide(number1, number2);
        } 
        else if (operation.equals("all")) {

            math.add(number1, number2);
            math.subtract(number1, number2);
            math.multiply(number1, number2);
            math.divide(number1, number2);
        }
        else {
            System.out.println("Command not found. Please run the program and try again."); 
        }

        keyboard.close();

    }
}
