import java.util.Scanner;
public class leaders{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int c = 1;
        for(int i=0;i<n-1;i++){
            boolean leader = false;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    leader = true;
                }else{
                    leader = false;
                    break;
                }
            }

            if(leader==true){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println(arr[arr.length-1]);
    }
}