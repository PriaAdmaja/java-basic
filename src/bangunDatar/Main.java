package bangunDatar;

import java.util.Scanner;

import bangunDatar.shape.Rectangle;
import bangunDatar.shape.RightTriangle;
import bangunDatar.shape.Square;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("""
                    Shapes :
                    1. Square
                    2. Rectangle
                    3. Triangle
                    """);
            System.out.print("Select number : ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("==== Square ====");
                    System.out.print("Length of square side : ");
                    Float side = Float.valueOf(scanner.nextLine());
                    Square square = new Square(side);
                    System.out.println("==== Results ====");
                    square.showShape();
                    System.out.println("Square perimeter : " + square.perimeter());
                    System.out.println("Square area : " + square.area());
                    break;
                case "2":
                    System.out.println("==== Rectangle ====");
                    System.out.print("Length of rectangle width : ");
                    Float width = Float.valueOf(scanner.nextLine());
                    System.out.print("Length of rectangle height : ");
                    Float height = Float.valueOf(scanner.nextLine());
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("==== Results ====");
                    rectangle.showShape();
                    System.out.println("Rectangle perimeter : " + rectangle.perimeter());
                    System.out.println("Rectangle area : " + rectangle.area());
                    break;
                case "3":
                    System.out.println("==== Right Triangle ====");
                    System.out.print("Length of right triangle base : ");
                    Float base = Float.valueOf(scanner.nextLine());
                    System.out.print("Length of right triangle height : ");
                    Float triangleHeight = Float.valueOf(scanner.nextLine());
                    RightTriangle rightTriangle = new RightTriangle(base, triangleHeight);
                    System.out.println("==== Results ====");
                    rightTriangle.showShape();
                    System.out.println("Right triangle perimeter : " + rightTriangle.perimeter());
                    System.out.println("Right triangle area : " + rightTriangle.area());
                    break;

                default:
                    System.out.println("Wrong number!");
                    break;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
