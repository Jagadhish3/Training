import java.util.Scanner;
public class averageCount{
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==sum/n){
                c++;
            }
        }
        System.out.println("Count of elements equal to average: "+c);

        
    }
}