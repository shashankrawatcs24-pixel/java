import java.util.Scanner;

class inputScanner {
    Scanner sc = new Scanner(System.in);
    
    public int getInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public double getDouble(String message) {
        System.out.print(message);
        return sc.nextDouble();
    }
}

abstract class Shape extends inputScanner {
    int dim1, dim2;

    abstract void input();
    abstract void printArea();
}

class Rectangle extends Shape {
    void input() {
        dim1 = getInt("Enter length of rectangle: ");
        dim2 = getInt("Enter breadth of rectangle: ");
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    void input() {
        dim1 = getInt("Enter base of triangle: ");
        dim2 = getInt("Enter height of triangle: ");
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {
    double radius;

    void input() {
        radius = getDouble("Enter radius of circle: ");
    }

    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();
        rect.printArea();
        System.out.println("-------------------------");

        Triangle tri = new Triangle();
        tri.input();
        tri.printArea();
        System.out.println("-------------------------");

        Circle cir = new Circle();
        cir.input();
        cir.printArea();
    }
}
