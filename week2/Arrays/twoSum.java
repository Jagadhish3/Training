import java.util.Scanner;
public class twoSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Indices are: "+j+" "+i);
                }
            }
        }

        
    }
}