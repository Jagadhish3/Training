import java.util.Scanner;
public class strongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("String numbers from 1 to "+num);

        for(int i=1;i<=num;i++){
        int original = i;
        int sum = 0;

        while(original!=0){
            int dig = original%10;
            int fact=1;
            for(int j=1;j<=dig;j++){
                fact*=j;
            }
            sum+=fact;
            original/=10;
        }

        if(sum==i){
            System.out.println(i);
            // System.out.println(original+" is Strong number");
        }
        // else{
        //     System.out.println(original+" is not stromg nmuber");
        // }
        }
    }
}