public class Calculator{

    double num1;
    double num2;

    public Calculator() {

    }

    public void add(double num1, double num2) {
        double newNum1 = num1;
        double newNum2 = num2;
        double sum = newNum1 + newNum2;

        System.out.println(newNum1 + " plus " + newNum2 + " equals " + sum);

    }

    public void subtract(double num1, double num2) {
        double newNum1 = num1;
        double newNum2 = num2;
        double diff = newNum1 - newNum2;

        System.out.println(newNum1 + " minus " + newNum2 + " equals " + diff);

    }

    public void multiply(double num1, double num2) {
        double newNum1 = num1;
        double newNum2 = num2;
        double prod = newNum1 * newNum2;

        System.out.println(newNum1 + " times " + newNum2 + " equals " + prod);

    }

    public void divide(double num1, double num2) {
        double newNum1 = num1;
        double newNum2 = num2;
        double quot = newNum1 / newNum2;

        System.out.println(newNum1 + " divided by " + newNum2 + " equals " + quot);

    }
}
