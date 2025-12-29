/*Write a Java program that satisfies all the following conditions:

Requirements
	1.	Create a class named Processor.
	2.	Declare two non-static variables x and y.

	4.	Initialize the instance variables only inside a non-static method using the this keyword.
	5.	Create three non-static methods:
	•	initialize() – assigns values to x and y using this.
	•	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local variable with the same name as one instance variable.
	•	display() – prints the final values of the instance variables.
	6.	One non-static method must call another non-static method using the this keyword.*/
public class Processor{
    //non static variables declaration
    int x;
    int y;
    
    public void initialize(){
        //initializing instance variables using this keyword
        this.x = 10;
        this.y = 20;
        //calling update method using this keyword
        this.update();
    }
    public void update(){
        //updating instance variable using this keyword
        int x=30;
        int y=50;
        this.x=x;
        this.y=y;
        //calling display ethod using this keyword
        this.display();

    }
    public void display(){
        //diplaying the x, y using this keyword
        System.out.println("X: "+this.x+" \nY: "+this.y);
    }

    public static void main(String args[]){
        Processor p = new Processor();
        p.initialize();
        
    }

}