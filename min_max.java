//program to find maximum and minimum among three numbers
import java.util.Scanner;
public class min_max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Maximum is: " + a);
        }else if(b>a && b>c){
            System.out.println("Maximum is: " + b);
        }else{
            System.out.println("Maximum is: " + c);
        }

        if(a<b && a<c){
            System.out.println("Minimum is: " + a);
        }else if(b<a && b<c){
            System.out.println("Minimum is: " + b);
        }else{
            System.out.println("Minimum is: " + c);
        }
    }
}