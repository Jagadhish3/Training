import java.util.Scanner;
public class perfectNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int sum;
        System.out.println("Perfect numbers up to "+num+" are:");
        for(int i=1;i<=num;i++){
            sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}