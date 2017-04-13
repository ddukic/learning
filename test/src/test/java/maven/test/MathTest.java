package maven.test;

import org.junit.Assert;
import org.junit.Test;
import maven.test.App;

public class MathTest {
	
	@Test
	public void test(){
		
		int expected = MathOperation.add(4, 5);
		int entered = App.readConsoleLine();
		
		Assert.assertEquals("Wrong!", expected, entered, 0);
	}
	
}
