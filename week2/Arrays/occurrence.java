import java.util.Scanner;
public class occurrence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        int k = sc.nextInt();
        int large = 0;
        int ele=arr[0];
        for(int i=0;i<n;i++){
            int c=countk(arr[i],k);
            if(c>large){
                ele = arr[i];
            }
        }

        System.out.println(ele);


    }

    public static int countk(int num,int k){
        int c = 0;

        while(num!=0){
            int d = num%10;
            if(d==k){
                c++;
            }
            num/=10;
        }

        return c;
    }
}