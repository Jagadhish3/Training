public class main_overloading {
    public static void main(String[] args) {
        System.out.println("This is the standard main method.");
        main(10); // Calling overloaded main method
        main("Hello, World!"); // Calling another overloaded main method
    }

    // Overloaded main method with an integer parameter
    public static void main(int number) {
        System.out.println("Overloaded main method with integer parameter: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String parameter: " + message);
    }
}