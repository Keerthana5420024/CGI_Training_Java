//Program to Display Current Date and Time

import java.time.LocalDateTime;

public class Q137_Display_Current_Date_and_Time {
	 public static void main(String[] args) {
	        LocalDateTime dateTime = LocalDateTime.now(); // Get current date and time
	        System.out.println("Current Date and Time: " + dateTime);
	    }

}