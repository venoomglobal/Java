/* Date: March 23, 2023
 * Author: Mahesh Bhattarai
 * Program: Work with time and date
 */
package time_date;

public class Time_Date {

    public static void main(String[] args) {
        // TODO code application logic here

        //Total Time since Midnight, Jan 1 1970 
        long total_miliseconds = System.currentTimeMillis();

        //Total seconds
        long total_seconds = total_miliseconds / 1000;

        //Current seconds
        long current_second = (int) (total_seconds % 60);

        //long total Minutes
        long total_minutes = total_seconds / 60;

        //Current minute
        long current_minute = (int) (total_minutes % 60);

        //Long total Hours
        long total_hours = total_minutes / 60;

        //Current Hours
        long current_hour = (int) (total_hours % 24);
        
        System.out.println("The current time is "
                + current_hour + " : "
                + current_minute + " : " 
                + current_second + " GMT ") ;
        

    }

}
