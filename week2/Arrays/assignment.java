
import java.util.Scanner;
public class assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] sales = {120, 80, 150, 90, 200, 75, 110};
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};
        // Activity 1 Average Temperature
        int tempSum = 0;
        for(int temp : temperatures){
            tempSum += temp;
        }
        double avgTemp = (double)tempSum / temperatures.length;
        System.out.println("Average Temperature: " + avgTemp + "°C");
        // Activity 2 Hottest and Coldest Day
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int maxDay = -1;
        int minDay = -1;
        for(int i=0; i<temperatures.length; i++){
            if(temperatures[i] > maxTemp){
                maxTemp = temperatures[i];
                maxDay = i + 1;
            }
            if(temperatures[i] < minTemp){
                minTemp = temperatures[i];
                minDay = i + 1;
            }
        }
        System.out.println("Highest Temperature: " + maxTemp + "°C");
        System.out.println("Lowest Temperature: " + minTemp + "°C");
        // Activity 3 Count Hot Days
        int hotDaysCount = 0;
        for(int temp : temperatures){
            if(temp > 30){
                hotDaysCount++;
            }
        }
        System.out.println("Number of hot days (>30°C): " + hotDaysCount);
        // Activity 4 – Total and Average Sales
        int salesSum = 0;
        for(int sale : sales){
            salesSum += sale;
        }

        double avgSales = (double)salesSum / sales.length;
        System.out.println("Total Sales: " + salesSum);
        System.out.println("Average Sales: " + avgSales);
        // Activity 5 Record-Breaking Sales
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;
        int maxSaleDay = -1;
        int minSaleDay = -1;
        for(int i=0; i<sales.length; i++){
            if(sales[i] > maxSale){
                maxSale = sales[i];
                maxSaleDay = i + 1;
            }
            if(sales[i] < minSale){
                minSale = sales[i];
                minSaleDay = i + 1;
            }
        }
        System.out.println("Highest Sale: " + maxSale + " on Day " + maxSaleDay);
        System.out.println("Lowest Sale: " + minSale + " on Day " + minSaleDay);
        // Activity 6 Count High-Sales Days
        int highSalesDaysCount = 0;
        for(int sale : sales){
            if(sale > 100){
                highSalesDaysCount++;
            }
        }
        System.out.println("Number of high sales days (>100): " + highSalesDaysCount);
        // Activity 7 Search for a Specific Sale
        int searchSale = 150;
        boolean found = false;

        for(int i=0; i<sales.length; i++){
            if(sales[i] == searchSale){
                System.out.println("Sale " + searchSale + " found on Day " + (i + 1));
                found = true;
                break;
            }
        }   
        if(!found){
            System.out.println("Sale " + searchSale + " not found.");
        }
        // Activity 8 Update Sales Record
        sales[1] = 95; // Update Day 2 sales to ₹95
        System.out.println("Updated sales for Day 2: " + sales[1]);


    }
}