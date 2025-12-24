public class numbers_print{
    public static void main(String args[]){
        
        // Print numbers from -111 to -101
        int a_start = -111;
        int a_end = -101;
        System.out.println("Numbers from -111 to -101");
        do{
            System.out.println(a_start++);
        }while(a_start<=a_end);

        // Print numbers from 123 to 113
        int b_start = 123;
        int b_end = 113;
        System.out.println("Numbers from 123 to 113");
        do{
            System.out.println(b_start--);
        }while(b_start>=b_end);

        // Print numbers from 5 to -5
        int c_start = 5;
        int c_end = -5;
        System.out.println("Numbers from 5 to -5");
        do{
            System.out.println(c_start--);
        }while(c_start>=c_end);

        // Print numbers from -10 to 0
        int d_start = -10;
        int d_end = 0;
        System.out.println("Numbers from -10 to 0");
        do{
            System.out.println(d_start++);
        }while(d_start<=d_end);
    }
}