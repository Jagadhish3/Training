import java.util.Scanner;
public class char_print{
    public static void main(String args[]){
        char ch_start = 'A';
        char ch_end = 'M';
        System.out.println("Charaters from A to M");
        while(ch_start<=ch_end){
            System.out.println(ch_start++);
        }
        char ch_start1 = 'x';
        char ch_end1 = 'm';
        System.out.println("Charaters from x to x");
        while(ch_start1>=ch_end1){
            System.out.println(ch_start1--);
        }
    }
}