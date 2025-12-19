import java.util.*;
class HelloWorld{
public static void main(String args[]){
//This is the Hello World program
System.out.println("Hello world");
System.out.println();

//Swap two numbers using 3rd variable
System.out.println("Swapping");
int x=2;
int y=3;
int temp;
temp = x;
x=y;
y=temp;
System.out.println("Swapping with 3rd variable "+x+" "+y);
System.out.println();

//swap two numbers without using third variable
int m=4;
int n=5;
m=m+n;
n=m-n;
m=m-n;
System.out.println("Swapping without 3rd variable "+m+" "+n);
System.out.println();

//Sum and average of three numbers
System.out.println("Sum and Average");
int g=2;
int e=3;
int f=4;

int sum = g+e+f;
System.out.println("Sum of 2 3 4 is "+sum);
System.out.println("Average of 2 3 4 is "+sum/3);
System.out.println();

//Temperature Converstion
System.out.println("Celsius to Fahrenheit");
int clcs = 36;
float farnht = (float)(clcs*9)/5+32;
System.out.println(clcs+" degrees Celsius into Fahrenheit is "+farnht);
System.out.println();
//Taking input of an integer
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check even or odd");
int num = sc.nextInt();
if(num%2==0){
System.out.println(num +" is Even");
}else{
System.out.println(num+ " is Odd");

//All primitive datatypes printing values and types
byte b1=25;
short s1 = 190;
int i1 = 260;
long l1=2909l;
float f1 = 2.4f;
double d1=2.34;
char ch='a';
boolean b=true;
System.out.println(b1+" "+((Object)b1).getClass().getSimpleName());
System.out.println(s1+" "+((Object)s1).getClass().getSimpleName());
System.out.println(i1+" "+((Object)i1).getClass().getSimpleName());
System.out.println(l1+" "+((Object)l1).getClass().getSimpleName());
System.out.println(f1+" "+((Object)f1).getClass().getSimpleName());
System.out.println(d1+" "+((Object)d1).getClass().getSimpleName());
System.out.println(ch+" "+((Object)ch).getClass().getSimpleName());
System.out.println(b+" "+((Object)b).getClass().getSimpleName());


		}
	}
}
