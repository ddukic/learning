package maven.test;

import java.time.LocalDateTime;

public class DayOfTheYear {
	public static int getDayOfTheYear() {
		LocalDateTime date1 = LocalDateTime.now();
    	int day = date1.getDayOfYear();
    	
    	return day;
	}
}
