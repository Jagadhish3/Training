public class swap_3rdCariable {
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping using third variable
        int temp;
        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}