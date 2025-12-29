/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1 :
Input:
	nums = [1,2,3,4]
Output:
	[24,12,8,6]
	
Example 2 :
Input:
	nums = [-1,1,0,-3,3]
Output:
	[0,0,9,0,0]
	
	
Constraints
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/
public class assignment1 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Calculate left products
        answer[0] = 1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];

        }

        int right = 1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*right;
            right*=nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        // assignment1 obj = new assignment1();
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println("\nResultant Array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}