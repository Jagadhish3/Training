import java.util.Scanner;
public class loanPayable{
    public static void main(String[] args){
        System.out.println(loan(200000));
        System.out.println(loan(200000, 5));
        System.out.println(loan(200000, 5, "HOME"));
    }

    public static double loan(double principle){
        double time = 5.0;
        double rate = 8.0;
        double interest = (principle*(rate/100)*time);
        double totalAmount = principle + interest;
        return totalAmount;
    }

    public static double loan(double principle, double years){
        double rate = 8.0;
        double totalAmount = (principle* (Math.pow(1+(rate/100), years)));
        //round upto 2 decimal places
        return Math.round(totalAmount*100.0)/100.0;
    }

    public static double loan(double priciple, double years, String loanType){
        double rate = 0.0;
        if(loanType.equals("HOME")){
            rate = 7.0;
        }
        else if(loanType.equals("AUTO")){
            rate = 9.0;
        }
        else if(loanType.equals("PERSONAL")){
            rate = 12.0;
        }
        double totalAmount = (priciple* (Math.pow(1+(rate/100), years)));
        return Math.round(totalAmount*100)/100.0;
    }
}