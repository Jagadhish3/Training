public class char_print{
    public static void main(String args[]){
        // Print characters from s to l
        char ch_start = 's';
        char ch_end = 'l';
        System.out.println("Characters from s to l");
        do{
            System.out.println(ch_start--);
        }while(ch_start>=ch_end);

        // Print characters from T to Z
        char ch_start1 = 'T';
        char ch_end1 = 'Z';
        System.out.println("Characters from T to Z");
        do{
            System.out.println(ch_start1++);
        }while(ch_start1<=ch_end1);
    }
}