import java.util.Scanner;
public class evenElements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elemnts into an array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println("Even index elements: ");
        // for(int i=0;i<n;i+=2){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println("\nPrime index elements: ");
        // for(int i=0;i<n;i++){
        //     if(isPrime(i)){
        //         System.out.print(arr[i]+" ");
        //     }
        // }

        // System.out.println("\nPerfect numbers from array: ");
        // for(int i=0;i<n;i++){
        //     if(isPerfect(arr[i])){
        //         System.out.print(arr[i]+" ");
        //     }
        // }

        // System.out.println("\nsum of elements in array: ");
        // int sum = 0;
        // int product = 1;
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        //     product*=arr[i];
        // }
        // System.out.println(sum);

        // System.out.println("\nProduct of elements in array: "+product);

        // int small = Integer.MAX_VALUE;
        // int secondSmall = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     if(arr[i]<small){
        //         secondSmall=small;
        //         small=arr[i];
        //     }else if(secondSmall>arr[i] && arr[i]!=small){
        //         secondSmall=arr[i];
        //     }
        // }
        // System.out.println("\nSmallest element in array: "+small);
        // System.out.println("\nSecond Smallest element in array: "+secondSmall);

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            }else if(secondLarge>arr[i] && arr[i]<large){
                secondLarge = arr[i];
            }
        }
        System.out.println("\nLargest element in array: "+large);
        System.out.println("\nSecond Largest element in array: "+secondLarge);


        //3rd largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first=arr[i];
            }else if(second>arr[i] && arr[i]<first){
                third = second;
                second=first;
            }else if(third>arr[i]&& arr[i]<second){
                third=arr[i];
            }
        }
            System.out.println("\nThird largest element in array: "+third);
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num){
            return true;
        }
        return false;
    }
}