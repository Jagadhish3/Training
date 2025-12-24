import java.util.Scanner;
public class nivenNumber{
    public static void main(String arfgs[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
        int original = i;
        int sum=0;
        while(original!=0){
            int dig = original%10;
            sum+=dig;
            original/=10;
        }

        if(i%sum==0){
            System.out.print(i+" ");
        }
        }
        // if(original%sum==0){
        //     System.out.println(original+" is Niven number");
        // }else{
        //     System.out.println(original+" is not Niven number");
        // }
    }
}