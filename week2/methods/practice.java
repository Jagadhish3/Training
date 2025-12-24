import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = reverseNumber(n);
        System.out.println(rev);
        System.out.println(isPalindrome(n,rev));
        System.out.println(isStrongNumber(n));
        System.out.println(countPrimeDigits(n));

    }


    public static int reverseNumber(int n){
        int rev=0;
        while(n!=0){
            int d = n%10;
            rev = rev*10 + d;
            n/=10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n, int reverse){
        return n==reverse;
    }
    public static int fact(int n){
        int prod =1;
        for(int i=1;i<=n;i++){
            prod*=i;
        }
        return prod;
    }

    public static boolean isStrongNumber(int num){
        int orig = num;
        int sum=0;

        while(num!=0){
            int dig = num%10;
            sum+=(fact(dig));
            num/=10;

        }
        return sum==orig;
    }
    public static boolean isPrime(int a){
        if(a<2){
            return false;
        }
        if(a==2){
            return true;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){         
                return false;
            }
        }
        return true;

    }

    public static int countPrimeDigits(int num){
            int count = 0;
            while(num>0){
                int dig=num%10;
                if(isPrime(dig)){
                    count++;
                }
                num/=10;
            }
            return count;
    }
}