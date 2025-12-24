import java.util.Scanner;
public class numbers_print_loop{
    public static void main(String args[]){
        int a_start = -123;
        int a_end = -129;
        System.out.println("Numbers from -123 to -129");
        while(a_start>=a_end){
            System.out.println(a_start--);
        }
        int b_start = 79;
        int b_end = 84;
        System.out.println("Numbers from 79 to 84");
        while(b_start<=b_end){
            System.out.println(b_start++);
        }
        int c_start = -110;
        int c_end = -100;
        System.out.println("Numbers from -110 to -100");
        while(c_start<=c_end){
            System.out.println(c_start++);
        }
        int d_start = 0;
        int d_end = -9;
        System.out.println("Numbers from 0 to -9");
        while(d_start>=d_end){
            System.out.println(d_start--);
        }

    }
}