/*
first = 1;
second = 2;
k=2;
n=10;

series is 1 2 6 16 44 120 .....
*/
import java.util.Scanner;
public class puzzle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int first = 1;
        int second = 2;
        int next;
        for(int i=0;i<n;i++){
            next = k*(first+second);
            System.out.print(first+" ");
            first = second;
            second = next;
        }
    }
}