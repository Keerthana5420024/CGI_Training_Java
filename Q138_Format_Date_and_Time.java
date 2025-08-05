// Program to Format Date and Time

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q138_Format_Date_and_Time {
	 public static void main(String[] args) {
	        LocalDateTime now = LocalDateTime.now();

	        // Define your format (e.g., "dd-MM-yyyy HH:mm:ss")
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	        String formattedDateTime = now.format(formatter);
	        System.out.println("Formatted Date and Time: " + formattedDateTime);
	    }
	

}
