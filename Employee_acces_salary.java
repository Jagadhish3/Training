import java.util.Scanner;

public class Employee_acces_salary{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int ID = sc.nextInt();
        System.out.print("Enter Employee name: ");
        String name = sc.next();
        System.out.print("Enter Employee age: ");
        int age = sc.nextInt();

        if(age<21){
            System.out.println("\nEmployee is not eligible to work");
        }
        else{
        System.out.println("\nEnter choice of department as\n1.IT\n2.HR\n3.Finance ");
        int choice = sc.nextInt();
        System.out.print("\nEnter basic salary: ");
        double salary = sc.nextDouble();
        String department ="";
          
        switch(choice){
                case 1:
                    department="IT";
                    System.out.println("Role selection:\nDeveloper\nTester");
                    String role1 = sc.next();
                    switch(role1.toLowerCase()){
                        case "developer":
                            System.out.println("Allowance for developer role is 30%");
                            int developer_allowance = 30;
                            double final_salary_dev = salary + (salary*developer_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role1);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_dev);
                            if(final_salary_dev>=60000){
                                System.out.println("Admin Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        case "tester":
                            System.out.println("Allowance for tester role is 25%");
                            int tester_allowance = 25;
                            double final_salary_test = salary + (salary*tester_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role1);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_test);
                            if(final_salary_test>=60000){
                                System.out.println("Admin Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        default:
                            System.out.println("Enter a valid role");
                            break;
                    }
                    break;
                case 2:
                    department="HR";
                    System.out.println("Role selection:\nRecruiter\nPayroll");
                    String role2 = sc.next();
                    switch(role2.toLowerCase()){
                        case "recruiter":
                            System.out.println("Allowance for recruiter is 20%");
                            int recruiter_allowance = 20;
                            double final_salary_recruit = salary + (salary*recruiter_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role2);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_recruit);
                            if(final_salary_recruit>=60000){
                                System.out.println("Manager Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        case "payroll":
                            System.out.println("Allowance for payroll is 22%");
                            int payroll_allowance = 20;
                            double final_salary_pay = salary + (salary*payroll_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role2);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_pay);
                            if(final_salary_pay>=60000){
                                System.out.println("Manager Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        default:
                            System.out.println("Enter a valid role");
                            break;
                    }
                    break;
                case 3:
                    department="Finance";
                    System.out.println("Role selection:\nAccountant\nAuditor");
                    String role3 = sc.next();
                    switch(role3.toLowerCase()){
                        case "accountant":
                            System.out.println("Allowance for accountant is 20%");
                            int accountant_allowance = 20;
                            double final_salary_account = salary + (salary*accountant_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role3);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_account);
                            if(final_salary_account>=60000){
                                System.out.println("Manager Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        case "auditor":
                            System.out.println("Allowance for auditor is 22%");
                            int auditor_allowance = 22;
                            double final_salary_audit = salary + (salary*auditor_allowance/100);
                            System.out.println("\nEmployee ID: "+ID);
                            System.out.println("Employee name: "+name);
                            System.out.println("Department name: "+department);
                            System.out.println("ROle is "+role3);
                            System.out.println("Basic salary is "+salary);
                            System.out.println("Final Salary is "+final_salary_audit);
                            if(final_salary_audit>=60000){
                                System.out.println("Manager Access");
                            }else{
                                System.out.println("Employee Access");
                            }
                            break;
                        default:
                            System.out.println("Enter a valid role");
                            break;
                    }
                    break;
                default:
                    System.out.println("Enter valid department choice");
                    break;
            }
        }
    }
}