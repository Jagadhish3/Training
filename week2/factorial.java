import java.util.Scanner;
public class factorial{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        //Factorial of a given number
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);

        //Factorial of numbers from 1 to 10
        System.out.println("Factorials of numbers from 1 to 10 are:");
        for(int i=1;i<=10;i++){
            fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
        //Factorial of all odd numbers from 10 to 1
        System.out.println("Factorials of odd numbers from 10 to 1 are:");
        for(int i=9;i>=1;i=i-2){
            fact=1;
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }

        //Factorial of all prime numbers from 14 to 5
        System.out.println("Factorials of prime numbers from 14 to 5 are:");
        for(int i=14;i>=5;i--){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                fact=1;
                for(int k=1;k<=i;k++){
                    fact*=k;
                }
                System.out.println("Factorial of "+i+" is "+fact);
            }
        }

        //sum of prime numbers range from the range 32 to 50
        System.out.println("Factorials of prime numbers from 32 to 50");
        int sum_prime=0;
        for(int i=32;i<=50;i++){
            int cnt=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                sum_prime+=i;
            }
        }
        System.out.println("Sum of prime numbers is "+sum_prime);
    }
}

