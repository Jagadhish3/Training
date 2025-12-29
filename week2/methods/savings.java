/*
Savings Prediction Calculation

Question Description
A finance app predicts savings based on monthly income and expense habits.

Implement overloaded methods named predict to calculate the expected savings.

Methods
	double predict(double income, double expenses)
	double predict(double income, double expenses, boolean festiveMonth)
	
Rules
	Base Savings = income − expenses
	Festive Month → expenses increase by 20%
	
Hardcoded Data Set to Use
	Income = 45000
	Expenses = 30000
	Festive Month = true

Expected Output
	Festive expenses = 36000
	Savings = 9000
    */
import java.util.Scanner;
public class savings{
    public static void main(String args[]){
        double income = 45000;
        double expenses = 30000;
        boolean festiveMonth = true;

        System.out.println("Savings without festive month: " + predict(income, expenses));
        System.out.println("Savings with festive month: " + predict(income, expenses, festiveMonth));

    }

    public static double predict(double income, double expenses){
        double savings = income - expenses;
        return savings;        
    }

    public static double predict(double income, double expenses, boolean festiveMonth){
        if(festiveMonth){
            expenses = expenses + (0.2*expenses);
        }
        double savings = income - expenses;
        return savings;
    }
}