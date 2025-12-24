//53. Write a program to print the first n numbers in the Fibonacci sequence.
	// 0, 1, 1, 2, 3, 5, 8, 13, ...
import java.util.Scanner;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci series up to "+n+" terms:");
        
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
        
        //Fibonacci series upto n numbers
        a=0;
        b=1;
        c=0;
        System.out.println("\nFibonacci series upto "+n);
        for (int i=1;a<=n;i++){
            c = a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
    }
}