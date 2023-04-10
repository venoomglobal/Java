
package calculate_time;

import java.util.Scanner;

public class Calculate_time {

    public static void main(String[] args) {
        String begin = "This program was created by: Mahesh Bhattarai "
                + "\nDate: March 24, 2023 "
                + "\nProgram: It checks the # of seconds, minutes, hours and days "
                + "\nBased on user's input\n";

        System.out.println(begin);
        
        String end = "That's all for this program. "
                + "\nSee you in the next program";
        

        //Constants
        final double SECONDS_MINUTE = 60.0; // seconds in a min
        final double SECONDS_HOUR = 3600.0;    //# of seconds in hour
        final double SECONDS_DAY = 86400.0;    //# of seconds in a day
       

        double seconds, minutes = 0, hours = 0, days = 0;
        System.out.print("Enter the number of seconds: ");

        Scanner scan = new Scanner(System.in);
        seconds = scan.nextInt();

        // Display number of minutes in that given seconds
        if (seconds >= SECONDS_MINUTE) 
            minutes =  (seconds / SECONDS_MINUTE);
            System.out.println("There are " + minutes
                    + " minutes in " + seconds
                    + " seconds ");
        

        // Display number of Hours in that given seconds
        if (seconds >= SECONDS_HOUR) 
            hours =  (seconds / SECONDS_HOUR);
            System.out.println("There are " + hours
                    + " Hours in " + seconds
                    + " seconds ");
        
        
         // Display number of Days in that given seconds
        if(seconds >=SECONDS_DAY) 
            days =  (seconds / SECONDS_DAY);
            System.out.println("There are " + days
                    + " days in " + seconds
                    + " seconds ");
            
            System.out.println(end);
    }

}
