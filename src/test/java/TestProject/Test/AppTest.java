package TestProject.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;

	@Test(priority = 0)
	public void amazonLaunchTest() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		//The comment

	}

	@Test(priority = 1)
	public void helpURLTest() {
		By helpLocator = By.xpath("//*[text()='Help']");
		WebElement element = driver.findElement(helpLocator);
		element.click();
		Assert.assertEquals(driver.getCurrentUrl().contains("help"), true);

	}
}
