//Program to evaluate student performance based on grade
import java.util.Scanner;
public class Student_performance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);

        switch(grade){  //we cannot use long, float, double, boolean in switch input
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:  //we can write default statement anywhere in switch case
                System.out.println("Invalid grade");
                break;
        }
    }
}