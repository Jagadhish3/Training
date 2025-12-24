import java.util.Scanner;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean res = isPresent(7);
        System.out.println(res);


    }

    public static boolean isPresent(int num){
        int a=0,b=1,c;
        if(num==a||num==b){
            return true;
        }
        for(int i=1;a<=num;i++){
            c=a+b;
            if(c==num){
                return true;
            }
            a=b;
            b=c;
        }
        return false;
    }
}