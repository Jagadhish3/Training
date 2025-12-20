//Program to calculate area of different shapes based on user input
import java.util.Scanner;
public class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape circle, rectangle, triangle, square: ");
        String shape = sc.next();

        switch(shape.toLowerCase()){
            case "circle":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                double Area = Math.PI*radius*radius;
                System.out.println("Area of circle is: "+Area);
                break;
            case "rectangle":
                System.out.println("Enter length and breadth: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();

                double Area1 = length*breadth;
                System.out.println("Area of rectangle is: "+Area1);
                break;
            case "triangle":
                System.out.println("Enter base and height: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double Area2 = 0.5*base*height;
                System.out.println("Area of triangle is: "+Area2);
                break;
            case "square":
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double Area3 = side*side;
                System.out.println("Area of square is: "+Area3);
                break;
            default:
                System.out.println("Enter valid shape");
                break;
        }
    }
}