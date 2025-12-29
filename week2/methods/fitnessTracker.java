import java.util.Scanner;
public class fitnessTracker{
    public static void main(String args[]){
        
        showSummary();

    }

    public static int inputSteps(){
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        return steps;
    }

    public static double calculateCalories(int steps){
        double calories = steps*0.04;
        return Math.round(calories*100.0)/100.0;
    }

    public static double calculateCalories(int steps, double weight){
        double calories = steps*0.0005*(weight);
        return Math.round(calories*100.0)/100.0;
    }

    public static void showSummary(){
        int steps = inputSteps();
        System.out.print("Total Steps: "+steps);
        System.out.print("\nCalories Burned (Standard): "+calculateCalories(steps));
        System.out.print("\nCalories Burned : "+calculateCalories(steps, 70.0));
    }
}