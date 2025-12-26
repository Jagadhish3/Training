import java.util.Scanner;
public class reverseDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr[i]=rev(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static int rev(int num){
        int rev= 0;
        while(num!=0){
            int dig = num%10;
            rev = rev*10 + dig;
            num/=10;
        }
        return rev;
    }
}