public class assignment2{
    public static void main(String args[]){
        int []arr = {1,0,2,0,0,3,0,4};
        int n = arr.length;

        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }

        System.out.println("Array after moving zeros to the end:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}