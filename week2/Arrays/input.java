import java.util.Scanner;
public class input{
    public static void main(String args[]){
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("\nEnter value at index "+i+" : ");
            arr[i] = sc.nextInt();
        }
    }
}