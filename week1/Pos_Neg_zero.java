//Java program to check whether a number is positive, negative or zero
import java.util.Scanner;
public class Pos_Neg_zero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("The given number is Positive");
        }else if(a<0){
            System.out.println("The given number is Negative");
        }else{
            System.out.println("The given number is Zero");
        }
    }
}