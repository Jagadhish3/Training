import java.util.Scanner;
public class isPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int cnt = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }

        if(cnt==2){
            System.out.println(num+" is prime number");
        }else{
            System.out.println(num+" is not prime number");
        }

    }
}