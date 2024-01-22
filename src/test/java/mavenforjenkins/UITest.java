package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UITest {  
	
	@Test
	public void browsercheck() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not contain Orange");
		driver.close();
		driver.quit();	  //This is created to test Maven project from jenkins
	}
}
