//Program to find the number is even or odd
import java.util.Scanner;
public class Even_odd_check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //for non static methods we have to create object 
        int a = sc.nextInt(); 
        if(a%2==0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is Odd");
        }
    }
}