//Program to check whether the given character is uppercase vowel, lowercase vowel, uppercase consonant or lowercase consonant
import java.util.Scanner;
public class UL_vowel_consonant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
        if(ch==('a')||ch==('e')||ch==('i')||ch==('o')||ch==('u')){
                System.out.println("The given Character is lowercase Vowel");
        }else{
                System.out.println("The given Character is lowercase Consonant");
        }
    }
        else if(ch>='A'&& ch<='Z'){
             
         if(ch==('A')||ch==('E')||ch==('I')||ch==('O')||ch==('U')){
                System.out.println("The given Character is Uppercase Vowel");
        }else{
                System.out.println("The given Character is Uppercase Consonant");
        }
    }
}
}