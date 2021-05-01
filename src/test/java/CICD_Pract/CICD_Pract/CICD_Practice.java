package CICD_Pract.CICD_Pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CICD_Practice {

	public static WebDriver driver;

	@Test
	public void LaunchDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\apr21-workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		System.out.println("Welcome To Naukari Portal");

	}
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("//div[@class='mTxt'][text()='Login']")).click();
		driver.findElement(By.xpath("//*[contains(@placeholder,'Enter your active Email ID')]")).sendKeys("mail.pushprajkumar@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'Enter your password')]")).sendKeys("Alchemist@2019");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
