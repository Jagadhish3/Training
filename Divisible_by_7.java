//Program to check whether a number is divisible by 7 or not
import java.util.Scanner;
public class Divisible_by_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%7==0){
            System.out.println("The given number is divisible by 7");
        }else{
            System.out.println("The given number is not divisible by 7");
        }
    }
}