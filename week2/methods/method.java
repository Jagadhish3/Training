
/* method can be created only in class area/global area

Access modifier/ specifier
Return type of method
name of method

we can ceate n number of methods in a class
method will be executed when it is called
one method can be called n number of times
    method calling syntax: methodName();
    method creation syntax:
    access_modifier return_type methodName(parameter_list){
          //method body
    }

*/
public class method{
    public static void main(String args[]){
        //local area or main method area
        System.out.println("main method started");
        powerButton();//powerButton method calling
        volumeButton();//volumeButton method calling
        System.out.println("main method ended");
    }

    public static void powerButton(){
        //powerButton method area
        System.out.println("Screen on");
        System.out.println("Screen off");
    }

    public static void volumeButton(){
        //volumeButton method area
        System.out.println("Volume up");
        System.out.println("Volume down");
    }
}