public class productOfNumbers {
    public static void main(String[] args) {
        // Product of numbers from 1 to 10
        int product = 1;
        for(int i=1; i<=10; i++) {
            product*= i;
        }
        System.out.println("Product of numbers from 1 to 10: " + product);
    }
}