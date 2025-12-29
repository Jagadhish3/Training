public class p1{
    // int a = 10;
    // public static void ain(String args[]){
    //     System.out.println("Main start");
    //     System.println(new p1());
    //     System.println(new p1());
    //     p1 ref = new p1();
    //     System.out.println(ref);
    //     System.out.println(ref.a);
    //     System.out.println("Main end");
    // }

    //static variable
    // static String UserName;
    // public static void main(String args[]){
    //     System.out.println("Main start");
    //     p1 ref1 = new p1();
    //     ref1.UserName = "Ravi";
    //     p1 ref2 = new p1();
    //     ref2.UserName = "Ramu";
    //     p1 ref3 = new p1();
    //     ref3.UserName = "Raju";

    //     System.out.println("USERNAME_1: "+ref1.UserName);
    //     System.out.println("USERNAME_2: "+ref2.UserName);
    //     System.out.println("USERNAME_3: "+ref3.UserName);

    //     System.out.println("Main end");
    // }

    //Non static variable
    // String UserName;
    // public static void main(String args[]){
    //     System.out.println("Main start");
    //     p1 ref1 = new p1();
    //     ref1.UserName = "Ravi";
    //     p1 ref2 = new p1();
    //     ref2.UserName = "Ramu";
    //     p1 ref3 = new p1();
    //     ref3.UserName = "Raju";

    //     System.out.println("USERNAME_1: "+ref1.UserName);
    //     System.out.println("USERNAME_2: "+ref2.UserName);
    //     System.out.println("USERNAME_3: "+ref3.UserName);

    //     System.out.println("Main end");

        public void test(){
            System.out.println("Test start");
            System.out.println("THIS:"+this);
            System.out.println("Test end");
        }
    public static void main(String args[]){

        System.out.println("Main start");
        p1 ref1 = new p1();
        System.out.println("REF:"+ref1);
        p1 ref2 = new p1();
        System.out.println("REF:"+ref2);
        p1 ref3 = new p1();
        System.out.println("REF:"+ref3);

        ref2.test();  //output is address of ref2 object
        System.out.println("THIS in main:"+this); //error: non static variable this cannot be referenced from a static context
        System.out.println("Main end");
        }
}
//difference between static and non static variable --- IGNORE ---

//Static variable is shared among all instances of the class, meaning there is only one copy of the variable regardless of how many objects are created. 
// Non-static variable (instance variable) is unique to each instance of the class, meaning each object has its own copy of the variable.