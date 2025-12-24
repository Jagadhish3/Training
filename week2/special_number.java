import java.util.Scanner;
public class special_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<num;i++){
        int original = i;
        int sum = 0;
        int prod=1;
        while(original!=0){
            int dig = original%10;
            sum+=dig;
            prod*=dig;
            original/=10;
        }
        if(i==(sum+prod)){
            System.out.println(i);
        }
    }
        // if(original==(sum+prod)){      
        // System.out.println("Special number");
        // }else{
        //     System.out.println("Not a special number");
        // }



    }
}