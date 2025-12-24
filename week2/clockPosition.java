//Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.

	// Problem Requirements
	// input1 represents the current hour position on a clock (1–12).
	// input2 represents the number of jumps/multiplication factor.
	// Multiply input1 and input2 to calculate the movement.
	// The clock should always stay within 1 to 12.
	// If the calculated value exceeds 12, it should wrap around using clock logic.
	// If the final calculated position becomes 0, it must be treated as 12.
import java.util.Scanner;
public class clockPosition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current hour position (1-12): ");
		int input1_currHour = sc.nextInt();
		int input2_Multiplication_factor = sc.nextInt();
		int movement = input1_currHour*input2_Multiplication_factor;

		int final_pos = movement%12;
		if(final_pos==0){
			final_pos=12;
		}
		System.out.println("Final calculated position is:"+final_pos);

    }
}