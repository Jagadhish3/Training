import java.util.Scanner;
public class sum{
        
           public static int s=0;
    public static void main(String args[]){
        System.out.println(sumPrint(5));
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(doubleToInt(d));
        int i =130;
        System.out.println(intToByte(i));

    }
    public static int sumPrint(int n){
        if(n==1){
            return 1;
        }
        return n+sumPrint(n-1);
    }

    //typecasting
    public static int doubleToInt(double a){
        return (int)a;
    }
    
    public static byte intToByte(int b){
        byte a=(byte)b;
        return a;
    }
}