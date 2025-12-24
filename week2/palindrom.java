import java.util.Scanner;
public class palindrom{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Palindrome numbers from 100 to "+num);
        for(int i=100;i<=num;i++){
        int originalNum = i;
        int rev =0;
        while(originalNum!=0){
            int dig = originalNum%10;
            rev=rev*10+dig;
            originalNum/=10;

        }
        if(rev==i){
            System.out.println(i);
        }
        }
    }
        
 }
  