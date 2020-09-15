import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        math();

        int userInt = getInteger(1,10);
        System.out.println(userInt);
    }

    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static double modulus(double number1, double number2) {
        return number1 % number2;
    }

    public static void math() {
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        System.out.println(add(number1, number2));
        System.out.println(subtract(number1, number2));
        System.out.println(multiply(number1, number2));
        System.out.println(divide(number1, number2));
        System.out.println(modulus(number1, number2));
    }


    public static int getInteger(int min, int max) {
        System.out.printf("Please enter a number %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Please enter a number within the range.");
            return getInteger(min, max);
        }
        System.out.println("You entered a valid number");
        return userInput;
    }


}
