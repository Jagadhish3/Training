import java.util.Scanner;
public class digit_seperation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        // System.out.println("The digits are: ");
        // while(num!=0){
        //     int dig = num%10;
        //     System.out.println(dig);
        //     num/=10;// num = num/10;
        // }

        // //even digits of given number
        // System.out.println("Enter a number to print even digits: ");
        // int num2 = originalNum;
        // System.out.println("Even digits are: ");
        // while(num2!=0){
        //     int dig = num2%10;
        //     if(dig%2==0){
        //         System.out.println(dig);
        //     }
        //     num2/=10;
        // }
        // //prime digits of given number
        // int num3 = originalNum;
        // System.out.println("Prime digits are: ");
        // while(num3!=0){
        //     int dig = num3%10;
        //     if(dig==2||dig==3||dig==5||dig==7){
        //         System.out.println(dig);
        //     }
        //     num3/=10;
        // }

        // //sum of digits of given number
        // System.out.println("Sum of digits of the number: ");
        // int num4 = originalNum;
        // int sum = 0;
        // while(num4!=0){
        //     int dig = num4%10;
        //     sum += dig;
        //     num4/=10;
        // }
        // System.out.println("Sum = " + sum);

        // //product of even digits sum and odd didgit sum of given number
        // System.out.print("Product of even digits sum and odd didgit sum of the number: ");
        // int num5 = originalNum;
        // int sum1=0;
        // int sum2=0;
        // int product = 1;
        // while(num5!=0){
        //     int dig = num5%10;
        //     if(dig%2==0){
        //         sum1+= dig;
        //     }else{
        //         sum2+=dig;
        //     }
        //     num5/=10;
        // }
        // System.out.println(sum1*sum2);

        // //smallest digit
        // System.out.println("Smallest digit is: ");
        // int num6 = originalNum;

        // int small = num6%10;
        // int secondSmall = num6%10;
        // while(num6!=0){
        //     int dig = num6%10;
        //     if(dig<small){
        //         secondSmall=small;
        //         small=dig;
        //     }
        //     num6/=10;
        // }
        // System.out.println(small);
        // System.out.println("Second small: "+secondSmall);

        //Lagest and second largest
        int num7 = originalNum;
        int large = 0;
        int second_large = 0;

        while(num7!=0){
            int dig = num7%10;
            if(dig>large){
                second_large=large;
                large=dig;
            }else if(dig>second_large && dig!=large){
                second_large=dig;
            }
            num7/=10;
        }
        System.out.println("Largest: "+large);
        System.out.println("Second largest: "+second_large);

    }
}