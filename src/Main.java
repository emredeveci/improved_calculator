import java.util.Scanner;

public class Main {

    static void add() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    static void subtract() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        result = firstNumber - secondNumber;
        System.out.println("Result: " + result);
    }

    static void multiply() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        result = firstNumber * secondNumber;
        System.out.println("Result: " + result);
    }

    static void divide() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("You cannot divide by number zero.");
            return;
        }

        result = firstNumber / secondNumber;
        System.out.println("Result: " + result);
    }

    static void exponentiation() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result = 1;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        for (int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int number, result = 1;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void modulo() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, result;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("You cannot divide by zero.");
            return;
        }
        result = firstNumber % secondNumber;
        System.out.println("Result: " + result);
    }

    static void rectangularCalculations() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, perimeter, area;
        System.out.print("Please enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        area = firstNumber * secondNumber;
        perimeter = 2 * (firstNumber + secondNumber);

        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modulus\n"
                + "8- Area and Perimeter of a Rectangle\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("What would you like to do? ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangularCalculations();
                    break;
                case 0:
                    System.out.println("Good bye.");
                    break;
                default:
                    System.out.println("You have made an invalid choice, please try again.");
            }
        } while (selection != 0);
    }

}