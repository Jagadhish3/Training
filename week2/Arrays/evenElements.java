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

        System.out.println("Even index elements: ");
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nPrime index elements: ");
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println("\nPerfect numbers from array: ");
        for(int i=0;i<n;i++){
            if(isPerfect(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println("\nsum of elements in array: ");
        int sum = 0;
        int product = 1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println(sum);

        System.out.println("\nProduct of elements in array: "+product);

        int small = Integer.MAX_VALUE;
        int secondSmall1 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                secondSmall1=small;
                small=arr[i];
            }else if(secondSmall1>arr[i] && arr[i]!=small){
                secondSmall1=arr[i];
            }
        }
        System.out.println("\nSmallest element in array: "+small);
        System.out.println("\nSecond Smallest element in array: "+secondSmall1);

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
            }else if(second<arr[i] && arr[i]<first){
                third = second;
                second=first;
            }else if(third<arr[i]&& arr[i]<second){
                third=arr[i];
            }
        }
            System.out.println("\nThird largest element in array: "+third);


            //third smallest
            int firstSmall = Integer.MAX_VALUE;
            int secondSmall = Integer.MAX_VALUE;
            int thirdSmall = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<firstSmall){
                    thirdSmall = secondSmall;
                    secondSmall = firstSmall;
                    firstSmall=arr[i];
                }else if(secondSmall>arr[i] && arr[i]>firstSmall){
                    thirdSmall = secondSmall;
                    secondSmall=arr[i];
                }else if(thirdSmall>arr[i]&& arr[i]>secondSmall){
                    thirdSmall=arr[i];
                }
            }
                System.out.println("\nThird smallest element in array: "+thirdSmall);

                //95. WAJP to merge to two array without Collection.
                int[] arr1 = {1,2,3,4};
                int[] arr2 = {5,6,7,8};
                int m1 = arr1.length;
                int n1 = arr2.length;

                int merge[] = new int[m1+n1];
                for(int i=0;i<m1;i++){
                    merge[i]=arr1[i];
                }
                for(int i=0;i<n1;i++){
                    merge[m1+i]=arr2[i];
                }
                System.out.println("Merged array: ");
                for(int i=0;i<merge.length;i++){
                    System.out.print(merge[i]+" ");
                }

            //union of two arrays
            int[] a1 = {1,2,3,4,5};
            int[] a2 = {4,5,6,7,8};
            int len1 = a1.length;
            int len2 = a2.length;
            int union[] = new int[len1+len2];
            int k=0;
            for(int i=0;i<len1;i++){
                union[k]=a1[i];
                k++;
            }
            for(int i=0;i<len2;i++){
                boolean found =false;
                for(int j=0;j<len1;j++){
                    if(a2[i]==a1[j]){
                        found=true;
                        break;
                    }
                }
                if(found==false){
                    union[k++]=a2[i];
                }
            }
            System.out.println("Union of arrays: ");
            for(int i=0;i<k;i++){
                System.out.print(union[i]+" ");
            }
            //WAJP to find intersection from two array without Collection.
            System.out.println("\nIntersection of arrays: ");
            int intersection[] = new int[len1+len2];
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(a1[i]==a2[j]){
                        intersection[i]=a1[i];
                        System.out.print(intersection[i]+" ");
                    }
                }
            }



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