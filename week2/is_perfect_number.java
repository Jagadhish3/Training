import java.util.Scanner;
public class is_perfect_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //If the sum of the factors of the given number excluding itself is equal to the original number it is perfect number
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("Given number "+num+" is perfect number");
        }else{
            System.out.println("Given number "+num+" is not a perfect number");
        }
    }
}