import java.util.Scanner;
public class primeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int cnt1=0;
        int cnt2=0;
        for(int i=2;i<=num;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    cnt1++;
                }
            }
            if(cnt1==0){
                System.out.print(i+" ");
                cnt2++;
            }
            cnt1=0;

        }
        System.out.println("\nNumber of prime number upto 10 is "+cnt2);
    }
}