//Program to check whether the given character is lowercase,uppercase,digit or special character
import java.util.Scanner;
public class char_type {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("The given charater is in lowercase");
        }else if(ch>='A'&& ch<='Z'){
            System.out.println("The given character is in Uppercase");
        }else if(ch>='0'&&ch<='9'){
            System.out.println("The given charater is a digit");
        }else{
            System.out.println("The given character is special Character");
        }
    }
}