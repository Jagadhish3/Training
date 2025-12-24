import java.util.Scanner;
public class mathsOperation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        max(a,b,c);
        isPrime(a);
        min(a,b,c);
        fibonacci(b);
    }

    public static void max(int a,int b,int c){
        int largest;
        if(a>b && a>c){
            largest = a;
        }else if(b> a && b>c){
            largest = b;
        }else{
            largest = c;
        }
        System.out.println("Largest of three numbers is "+largest);
    }

    public static void isPrime(int a){
        if(a<2){
            System.out.println("Not Prime");
            return;
        }
        if(a==2){
            System.out.println("Prime");
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");

    }
    public static void min(int a,int b,int c){
        int small;
        if(a<b && a<c){
            small = a;
        }else if(b<a && b<c){
            small = b;
        }else{
            small = c;
        }
        System.out.println("Smallest of three numbers is "+small);
    }

    public static void fibonacci(int n){
        int a=0,b=1,c;
        System.out.println("Fibonacci series: ");

        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.println(a+" ");
            a=b;
            b=c;
        }
    }

    
}