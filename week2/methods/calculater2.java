/*77. Write a java program to create calculator class consist of methods such as:
 	- To subtract 3 variable
 	- To subtract 4 variable
 	- To subtract 5 variable
 	- To subtract 2 variable
 	- To Multiply 3 variable
 	- To Multiply 4 variable
 	- To Multiply 5 variable
 	- To Multiply 2 variable
 	- To divide 2 variable.*/
import java.util.Scanner;
public class calculater2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers for subtraction:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("Subtraction of 2 variables: " + subtract(a, b));
        System.out.println("Subtraction of 3 variables: " + subtract(a, b, c));
        System.out.println("Subtraction of 4 variables: " + subtract(a, b, c, d));
        System.out.println("Subtraction of 5 variables: " + subtract(a, b, c, d, e));

        System.out.println("Enter 5 numbers for multiplication:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        System.out.println("Multiplication of 2 variables: " + multiply(p, q));
        System.out.println("Multiplication of 3 variables: " + multiply(p, q, r));
        System.out.println("Multiplication of 4 variables: " + multiply(p, q, r, s));
        System.out.println("Multiplication of 5 variables: " + multiply(p, q, r, s, t));

        System.out.println("Enter 2 numbers for division:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Division of 2 variables: " + divide(x, y));
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int subtract(int a, int b, int c) {
        return a-b -c;
    }

    public static int subtract(int a, int b, int c, int d) {
        return a-b-c- d;
    }

    public static int subtract(int a, int b, int c, int d, int e) {
        return a-b-c-d-e;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int multiply(int a, int b, int c) {
        return a*b*c;
    }

    public static int multiply(int a, int b, int c, int d) {
        return a*b*c*d;
    }

    public static int multiply(int a, int b, int c, int d, int e) {
        return a*b*c*d*e;
    }

    public static double divide(double a, double b) {
        if (b ==0) {
            System.out.println("Division by zero is not allowed undefined");
            return 0;
        }
        return a / b;
    }
}