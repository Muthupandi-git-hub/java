import java.util.Scanner;

abstract class Shape {
    int dim1, dim2;

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        dim1 = length;
        dim2 = breadth;
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        dim1 = radius;
    }

    void printArea() {
        double area = 3.14 * dim1 * dim1;
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s;

        while (true) {

            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Length: ");
                    int length = sc.nextInt();

                    System.out.print("Breadth: ");
                    int breadth = sc.nextInt();

                    s = new Rectangle(length, breadth);
                    s.printArea();
                    break;

                case 2:
                    System.out.print("Base: ");
                    int base = sc.nextInt();

                    System.out.print("Height: ");
                    int height = sc.nextInt();

                    s = new Triangle(base, height);
                    s.printArea();
                    break;

                case 3:
                    System.out.print("Radius: ");
                    int radius = sc.nextInt();

                    s = new Circle(radius);
                    s.printArea();
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;   
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}