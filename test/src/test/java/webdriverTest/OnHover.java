package webdriverTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnHover {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://wedoqa.com/#who-we-are");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.className("person"));
		action.moveToElement(element).build().perform();
		//Thread.sleep(3000);
		WebElement toolTip = driver.findElement(By.cssSelector(".popover-content"));
		String toolTipText = toolTip.getText();
		System.out.println(toolTipText);
		
	}
	
	@AfterClass
	public static void cleanUp(){
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
