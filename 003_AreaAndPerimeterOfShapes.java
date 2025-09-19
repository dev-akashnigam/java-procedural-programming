import java.util.Scanner;

class AreaAndPerimeterOfShapes {
    static double calcAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double calcPerimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calcAreaOfRectangle(double length, double width) {
        return length * width;
    }

    static double calcPerimeterOfRectangle(double length, double width) {
        return 2*(length * width);
    }

    static double calcAreaOfTriangle(double lengthOfFirstSide, double lengthOfSecondSide, double lengthOfThirdSide) {
        double semiPerimeter = (lengthOfFirstSide + lengthOfSecondSide + lengthOfThirdSide)/2;
        return Math.sqrt(semiPerimeter * Math.abs(semiPerimeter - lengthOfFirstSide) * Math.abs(semiPerimeter - lengthOfSecondSide) * Math.abs(semiPerimeter - lengthOfThirdSide));
    }

    static double calcPerimeterOfTriangle(double lengthOfFirstSide, double lengthOfSecondSide, double lengthOfThirdSide) {
        return lengthOfFirstSide + lengthOfSecondSide + lengthOfThirdSide;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the radius of circle: ");
        double radiusOfCircle = scanner.nextDouble();

        System.out.println("Please enter the length of rectangle: ");
        double lengthOfRect = scanner.nextDouble();

        System.out.println("Please enter the width of rectangle: ");
        double widthOfRect = scanner.nextDouble();

        System.out.println("Please enter the length of first side of triangle: ");
        double side1OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of second side of triangle: ");
        double side2OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of third side of triangle: ");
        double side3OfTriangle = scanner.nextDouble();

        System.out.printf("Area and Perimeter of Circle of radius: %.2f = %.2f, %.2f%n", radiusOfCircle, calcAreaOfCircle(radiusOfCircle), calcPerimeterOfCircle(radiusOfCircle));
        System.out.printf("Area and Perimeter of Rectangle of length: %.2f and width: %.2f = %.2f, %.2f%n", lengthOfRect, widthOfRect, calcAreaOfRectangle(lengthOfRect, widthOfRect), calcPerimeterOfRectangle(lengthOfRect, widthOfRect));
        System.out.printf("Area and Perimeter of Triangle with sides of length: %.2f, %.2f and %.2f = %.2f, %.2f%n", side1OfTriangle, side2OfTriangle, side3OfTriangle, calcAreaOfTriangle(side1OfTriangle, side2OfTriangle, side3OfTriangle), calcPerimeterOfTriangle(side1OfTriangle, side2OfTriangle, side3OfTriangle));

        scanner.close();
    }
}