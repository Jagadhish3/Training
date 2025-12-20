//Program to provide information about fruits based on user input
import java.util.Scanner;
public class Fruits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        String fruit = sc.next();

        switch(fruit.toLowerCase()) {
            case "apple":
                System.out.println("Apples are rich in fiber nd vitamin c");
                break;
            case "banana":
                System.out.println("Bananas are great source of potassium");
                break;
            case "mango":
                System.out.println("Mangoes are  king of fruits!");
                break;
            case "orange":
                System.out.println("Oranges are packed with vitamin c");
                break;
            default:
                System.out.println("Sorry, I don't have information about that fruit");
        }

    }
}