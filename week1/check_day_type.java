//Program to check whether a day is a weekday or weekend
import java.util.Scanner;
public class check_day_type{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.toLowerCase().equals("monday")||s.toLowerCase().equals("tuesday")||s.toLowerCase().equals("wednesday")||s.toLowerCase().equals("thursday")||s.toLowerCase().equals("friday")){
            System.out.println("Weekday");
        }else if(s.toLowerCase().equals("saturday")||s.toLowerCase().equals("sunday")){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}