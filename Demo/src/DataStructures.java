import java.util.Enumeration;
import java.util.Vector;

public class DataStructures {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration days;
		
		Vector dayNames = new Vector();
		
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		dayNames.add("Sunday");
		
		days = dayNames.elements();
		
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}

}
