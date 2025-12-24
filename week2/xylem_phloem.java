import java.util.Scanner;
public class xylem_phloem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int original = num;
        // int count =0;
        // while(num!=0){
        //     count++;
        //     num/=10;
        // }
        // int sum_l_f = original%10;
        // int c=0;
        // int mean = 0;
        // original/=10;

        // while(original!=0){
        //     c++;
        //     int dig = original%10;
        //     if(count==c+1){
        //         sum_l_f+=dig;
        //     }else{
        //         mean+=dig;
        //     }
        //     original/=10;

        // }
        // if(sum_l_f==mean){
        //     System.out.println("Xylem");
        // }else{
        //     System.out.println("Phloem");
        // }

        int outer=0;
        int mean=0;
        outer+=(num%10);
        num/=10;

        while(num>10){
            int dig=num%10;
            mean+=dig;
            num/=10;
        }

        outer+=num;
        if(outer==mean){
            System.out.println("Xylem");
        }else{
            System.out.println("Phloem");
        }

    }
}