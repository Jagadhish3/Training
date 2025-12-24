public class swap_without_3rd {
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swapping without using third variable
        a = a + b + c; // a now holds the sum of all three
        b = a - (b + c); // b is now original a
        c = a - (b + c); // c is now original b
        a = a - (b + c); // a is now original c

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        //for 2 variable swapping
        int x = 20;
        int y = 30;
        System.out.println("Before swapping 2 variables:");
        System.out.println("x = " + x + ", y = " + y);
        x = x + y; // x now holds the sum of x and y
        y = x - y; // y is now original x
        x = x - y; // x is now original y
        System.out.println("After swapping 2 variables:");
        System.out.println("x = " + x + ", y = " + y);
    }
}

