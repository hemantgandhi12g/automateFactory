package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void Setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{

		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("hemantgandhi259@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//driver.findElement(By.id("Passwd")).sendKeys("sdsfsdf");
		//driver.findElement(By.id("Passwd")).sendKeys("sdsfsdf");
	}
	
	@AfterSuite
	public void TearDown()
	{
		driver.quit();
	}
}
