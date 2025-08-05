package pac1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;
public class Lab14 {
	
	public static void printDateTimeByZone(String zone) {
	        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone));
	        System.out.println("Current date and time in " + zone + ": " + zonedDateTime);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Zone ID (e.g., America/New_York): ");
	        String zoneId = sc.nextLine();
	        printDateTimeByZone(zoneId);
	    }
	}

