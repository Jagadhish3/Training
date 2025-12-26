import java.util.Scanner;
public class divisible{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {9,-10,5,8,18,10,16};
        System.out.println("Elements divisible by 18 are: ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(18%arr[i]==0){
                count++;
                
            }

        }
        System.out.println("Count of elements divisible by 18 is: "+count);

    }
}