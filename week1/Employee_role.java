//Program to display employee roles based on department input
import java.util.Scanner;
public class Employee_role{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a department: ");
        String department = sc.next();

        switch(department.toUpperCase()){
            case "IT":
                System.out.println("Roles available to select in IT are: \nDeveloper\nTester\nDevops Engineer");
                break;
            case "HR":
                System.out.println("Roles available tonselect in HR are: \nRecruiter\nHR executive\nPayroll Ofiicer");
                break;
            case "FINANCE":
                System.out.println("Roles available to select in Finance are: \nAccountant\nFinancial Analyst\nAuditor");
                break;
            case "OPERATIONS":
                System.out.println("Roles available to select in Operations are: \nOperation Executive\nTeam Lead\nManager");
                break;
            default:
                System.out.println("Enter vaild roles");
                break;
        }
    }
}