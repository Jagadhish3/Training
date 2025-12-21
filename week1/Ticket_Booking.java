import java.util.Scanner;
public class Ticket_Booking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();
        System.out.print("Enter passenger ID: ");
        int passenger_ID = sc.nextInt();
        System.out.print("Enter passenger name: ");
        String passenger_name = sc.next();
        System.out.print("Enter age of passenger: ");
        int age = sc.nextInt();
        if(age < 5) {
            System.out.println("Fare ticket - No booking required");
            return;
        } else if (age>80){
            System.out.println("Medical clearence required");
            return;
        }else{
            System.out.println("Travel type 1 for Bus 2 for Train 3 for Flight: ");
            int travel_type = sc.nextInt();
            System.out.print("Base Price: ");
            double base_price = sc.nextInt();
            System.out.println("Is Govt employee: ");
            String govt = sc.next();


            switch(travel_type){
                case 1:
                    System.out.println("1-sleeper, 2-seater");
                    int choice_bus = sc.nextInt();
                    switch(choice_bus){
                        case 1:
                            double fare_after_class_bus = base_price*1.2;
                            if(age>=60){
                            fare_after_class_bus = fare_after_class_bus - (fare_after_class_bus*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_bus = fare_after_class_bus - (fare_after_class_bus*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_bus = fare_after_class_bus - (fare_after_class_bus*50/100);
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Bus");
                            System.out.println("Class: Sleeper");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_bus);
                            System.out.println("Booking Confirmed");
                            
                            break;
                        case 2:
                            double fare_after_class_bus2 = base_price*1.0;
                            if(age>=60){
                            fare_after_class_bus2 = fare_after_class_bus2 - (fare_after_class_bus2*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_bus2 = fare_after_class_bus2 - (fare_after_class_bus2*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_bus2 = fare_after_class_bus2 - (fare_after_class_bus2*50/100);
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Bus");
                            System.out.println("Class: Seater");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_bus2);
                            System.out.println("Booking Confirmed");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1-General, 2-Sleeper, 3-AC");
                    int choice_train = sc.nextInt();
                    switch(choice_train){
                        case 1:
                            double fare_after_class_train = base_price*1.0;
                            if(age>=60){
                            fare_after_class_train = fare_after_class_train - (fare_after_class_train*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_train = fare_after_class_train - (fare_after_class_train*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_train = fare_after_class_train - (fare_after_class_train*50/100);
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Train");
                            System.out.println("Class: General");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_train);
                            System.out.println("Booking Confirmed");
                            break;
                        case 2:
                            double fare_after_class_train3 = base_price*1.3;
                            if(age>=60){
                            fare_after_class_train3 = fare_after_class_train3 - (fare_after_class_train3*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_train3 = fare_after_class_train3 - (fare_after_class_train3*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_train3 = fare_after_class_train3 - (fare_after_class_train3*50/100);
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Train");
                            System.out.println("Class: Sleeper");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_train3);
                            System.out.println("Booking Confirmed");
                            break;
                        case 3:
                            double fare_after_class_train2 = base_price*1.5;
                            if(age>=60){
                            fare_after_class_train2 = fare_after_class_train2 - (fare_after_class_train2*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_train2 = fare_after_class_train2 - (fare_after_class_train2*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_train2 = fare_after_class_train2 - (fare_after_class_train2*50/100);
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Train");
                            System.out.println("Class: AC");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_train2);
                            System.out.println("Booking Confirmed");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1-Economy, 2-Business");
                    int choice_flight = sc.nextInt();
                    switch(choice_flight){
                        case 1:
                            double fare_after_class_flight = base_price*2.5;
                            if(age>=60){
                            fare_after_class_flight = fare_after_class_flight - (fare_after_class_flight*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_flight = fare_after_class_flight - (fare_after_class_flight*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_flight = fare_after_class_flight - (fare_after_class_flight*50/100);
                            }
                            String Booking_status = "Confirmed";

                            if(fare_after_class_flight>10000){
                                if(Booking_status.equals("Confirmed")){
                                    System.out.println("Booking Confirmed");
                                }else{
                                    System.out.println("Booking Waitlisted");
                                }
                            }else{
                                System.out.println("Booking Confirmed");
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Flight");
                            System.out.println("Class: Economy");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_flight);
                            System.out.println("Booking Confirmed");
                            break;
                        case 2:
                            double fare_after_class_flight_b = base_price*3.5;
                            if(age>=60){
                            fare_after_class_flight_b = fare_after_class_flight_b - (fare_after_class_flight_b*30/100);
                            }else if(govt.equals("yes")){
                                fare_after_class_flight_b = fare_after_class_flight_b - (fare_after_class_flight_b*15/100);
                            }else if(age>=5 && age<=12){
                                fare_after_class_flight_b = fare_after_class_flight_b - (fare_after_class_flight_b*50/100);
                            }
                            String Booking_status2 = "Confirmed";

                            if(fare_after_class_flight_b>10000){
                                if(Booking_status2.equals("Confirmed")){
                                    System.out.println("Booking Confirmed");
                                }else{
                                    System.out.println("Booking Waitlisted");
                                }
                            }else{
                                System.out.println("Booking Confirmed");
                            }
                            System.out.println("Passenger ID: "+passenger_ID);
                            System.out.println("Passenger Name: "+passenger_name);
                            System.out.println("Travel Type: Flight");
                            System.out.println("Class: Business");
                            System.out.println("Base Price: "+base_price);
                            System.out.println("Final Fare: "+fare_after_class_flight_b);
                            System.out.println("Booking Confirmed");
                            break;
                    }
            }
        }
            
    }
}