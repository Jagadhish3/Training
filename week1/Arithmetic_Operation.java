//Program to perform arithmetic operations based on user input
import java.util.Scanner;
public class Arithmetic_Operation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation: ");
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+':
                System.out.print("Enter no of variables: ");
                int n1 = sc.nextInt();
                switch(n1){
                    case 2:
                        System.out.println("Enter 2 numbers to perform addition");
                        int a2 = sc.nextInt();
                        int b2 = sc.nextInt();
                        int sum2 = a2+b2;
                        System.out.println("Addition of two variables is "+sum2);
                        break;
                    case 3:
                        System.out.println("Enter 3 numbers to perform addition");
                        int a3 = sc.nextInt();
                        int b3 = sc.nextInt();
                        int c3 = sc.nextInt();
                        int sum3 = a3+b3+c3;
                        System.out.println("Addition of three variables is "+sum3);
                        break;
                    case 4:
                        System.out.println("Enter 4 numbers to perform addition");
                        int a4 = sc.nextInt();
                        int b4 = sc.nextInt();
                        int c4 = sc.nextInt();
                        int d4 = sc.nextInt();
                        int sum4 = a4+b4+c4+d4;
                        System.out.println("Addition of four variables is "+sum4);
                        break;
                    default:
                        System.out.println("Enter only 2 or 3 or 4 variables to perform addition other coming soon....");
                        break;
                }
                break;
            case '-':
                System.out.print("Enter no of variables: ");
                int n2 = sc.nextInt();
                switch(n2){
                    case 2:
                        System.out.println("Enter 2 numbers to perform subtraction");
                        int a2 = sc.nextInt();
                        int b2 = sc.nextInt();
                        int sub2 = a2-b2;
                        System.out.println("Subtraction of two variables is "+sub2);
                        break;
                    case 3:
                        System.out.println("Enter 3 numbers to perform subtraction");
                        int a3 = sc.nextInt();
                        int b3 = sc.nextInt();
                        int c3 = sc.nextInt();
                        int sub3 = a3-b3-c3;
                        System.out.println("Subtraction of three variables is "+sub3);
                        break;
                    case 4:
                        System.out.println("Enter 4 numbers to perform subtraction");
                        int a4 = sc.nextInt();
                        int b4 = sc.nextInt();
                        int c4 = sc.nextInt();
                        int d4 = sc.nextInt();
                        int sub4 = a4-b4-c4-d4;
                        System.out.println("Subtraction of four variables is "+sub4);
                        break;
                    default:
                        System.out.println("Enter only 2 or 3 or 4 variables to perform subtraction other coming soon....");
                        break;
                }
                break;
            case '*':
                System.out.print("Enter no of variables: ");
                int n3 = sc.nextInt();
                switch(n3){
                    case 2:
                        System.out.println("Enter 2 numbers to perform multiplication");
                        int a2 = sc.nextInt();
                        int b2 = sc.nextInt();
                        int mul2 = a2*b2;
                        System.out.println("Multiplication of two variables is "+mul2);
                        break;
                    case 3:
                        System.out.println("Enter 3 numbers to perform multiplication");
                        int a3 = sc.nextInt();
                        int b3 = sc.nextInt();
                        int c3 = sc.nextInt();
                        int mul3 = a3*b3*c3;
                        System.out.println("Multiplication of three variables is "+mul3);
                        break;
                    case 4:
                        System.out.println("Enter 4 numbers to perform multiplication");
                        int a4 = sc.nextInt();
                        int b4 = sc.nextInt();
                        int c4 = sc.nextInt();
                        int d4 = sc.nextInt();
                        int mul4 = a4*b4*c4*d4;
                        System.out.println("Multiplication of four variables is "+mul4);
                        break;
                    default:
                        System.out.println("Enter only 2 or 3 or 4 variables to perform multiplication other coming soon....");
                        break;
                }
                break;
            case '/':
                System.out.println("Enter 2 numbers to perform division");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int div2 = a2/b2;
                System.out.println("Division of two variables is "+div2);
                break;
            default:
                System.out.println("Enter operation from +, -, *, / only remaining operations coming soon....");
                break;
        }
    }
}