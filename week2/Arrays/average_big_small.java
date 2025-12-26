import java.util.Scanner;
public class average_big_small{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        int small = arr[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        int small_count=0;
        int large_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==small){
                small_count++;
            }
            if(arr[i]==large){
                large_count++;
            }
        }
        sum = large*large_count+small*small_count;
        double average = (double)(sum/(large_count+small_count));
        System.out.println("Average of largest and smallest element is: "+average);
    }
}