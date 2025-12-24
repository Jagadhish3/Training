import java.util.Scanner;
public class addition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        
    }

    //No argument method the method which doesnt have formal agruments
    public static void add(){
        int sum = 0;
        System.out.println("Sum is: "+sum);
    }
    //With argument method the method which have formal agruments
    public static void add(int a,int b){
        int sum = a+b;
        System.out.println("Sum is: "+sum);
    }

}