package maven.test;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {
	
	@Test
	public void test(){
		
		int expected = DayOfTheYear.getDayOfTheYear();
		int entered = App.readConsoleLine();
		
		Assert.assertEquals("Wrong!", expected, entered, 0);
	}

}
