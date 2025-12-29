import java.util.Scanner;
public class decrementMakeDivisible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int operations = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                operations+=arr[i];

            }else if(arr[i]%k==0){
                continue;
        }else{
            int rem = arr[i]%k;
            operations+=rem;
        }
        }
        System.out.println(operations);

    }
}

