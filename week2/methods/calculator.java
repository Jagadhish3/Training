import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        add_3(a,b,c);
        multiply_3(a,b,c);
        subtract_4(a,b,c,d);
        add_2(a,b);

        
    }

    public static void add_3(int a,int b,int c){
        System.out.println("Addition of 3 variables: "+(a+b+c));
    }
    public static void multiply_3(int a,int b,int c){
        System.out.println("Multiplication of 3 variables: "+(a*b*c));
    }
    public static void subtract_4(int a,int b,int c,int d){
        System.out.println("Subtraction of 4 variables: "+(a-b-c-d));
    }
    public static void add_2(int a,int b){
        System.out.println("Addition of 2 variables: "+(a+b));
    }

}