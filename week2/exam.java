import java.util.Scanner;
public class exam{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int original = num;
        int actual=num;

        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        int sum=0;

        while(original!=0){
            int dig=original%10;
            // sum+=(Math.pow(dig,count--));
            int prod=1;
            for(int i=1;i<=count;i++){
                prod*=dig;
            }
            sum+=prod;
            count--;
            original/=10;

        }
        if(actual==sum){
        System.out.println(sum+" is a Disarium number");
        }else{
            System.out.println("Not Disarium number");
        }


    }
}