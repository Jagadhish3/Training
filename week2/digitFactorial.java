import java.util.Scanner;
public class digitFactorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
            int dig = num%10;
                int prod=1;
            for(int i=1;i<=dig;i++){
                prod*=i;
            }
            System.out.println("Factorial of digit "+dig+" is "+prod);
            num/=10;
        }
    }
}