//program to check the given character is digit or not
import java.util.Scanner;
public class Check_digit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='0'&&ch<='9'){  
            System.out.println("The given number is a digit");
        }else{
            System.out.println("The given number is not a digit");
        }
    }
}