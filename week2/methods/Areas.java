import java.util.Scanner;
public class Areas{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double radius = sc.nextDouble();

        System.out.println("Area of square is: "+AreaCalculation(a));
        System.out.println("Area of circle is: "+AreaCalculation(radius));
        System.out.println("Area of rectangle is: "+AreaCalculation(a,b));

    }

    public static int AreaCalculation(int side){
        return side*side;
    }
    public static double AreaCalculation(double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
    public static int AreaCalculation(int length, int breadth){
        return length*breadth;
    }
}