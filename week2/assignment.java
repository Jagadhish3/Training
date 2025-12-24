import java.util.Scanner;
public class assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println(ch + " is a lowercase letter.");
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println(ch + " is a lowercase vowel.");

                //Printing numbers from -10 to -20 using while loop
                System.out.println("Numbers from -10 to -20:");
                int num = -10;
                while(num >= -20){
                    System.out.println(num);
                    num--;
                }

            } else {
                System.out.println(ch + " is a lowercase consonant.");
                
                //printnting numbers from -25 to -15 using for loop
                System.out.println("Numbers from -25 to -15:");
                for(int num = -25; num <= -15; num++){
                    System.out.println(num);
                }
            }
        }else if(ch>='A' && ch<='Z'){
            System.out.println(ch + " is an uppercase letter.");
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch + " is an uppercase vowel.");

                //Printing numbers from 10 to 20 using do while loop
                System.out.println("Numbers from 10 to 20:");
                int num =10;
                do{
                    System.out.println(num);
                    num++;
                }while(num <= 20);

            } else {
                System.out.println(ch + " is an uppercase consonant.");
                //Printing numbers from 25 to 15 using for loop
                System.out.println("Numbers from 25 to 15:");
                for(int num = 25; num >= 15; num--){
                    System.out.println(num);
                }
            }
        }else{
            System.out.println(ch + " is not an alphabet.");
        }
    }
}