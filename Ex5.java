import java.util.Scanner;

interface Calculator
{
    int add(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    int divide(int a, int b);
}

class SimpleCalculator implements Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int divide(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return a / b;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calculator calculator = new SimpleCalculator();

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Result = " + calculator.add(num1, num2));
                break;

            case 2:
                System.out.println("Result = " + calculator.subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result = " + calculator.multiply(num1, num2));
                break;

            case 4:
                System.out.println("Result = " + calculator.divide(num1, num2));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        input.close();
    }
}-