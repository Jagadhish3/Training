import java.util.Scanner;
public class numbersPrint{
    public static void main(String args[]){
        // ranges(1);
        range1(500);

    }

//range from 1 to 1000 without using loop
    public static void ranges(int n){
        if(n==1000){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        ranges(n+1);

    }

    //WAJP to print print odd numbers from range 500 to 50
    public static void range1(int st){
        if(st>=50){
            System.out.print(st+" ");
            range1(--st);
        }
    }
}
