package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Visited to Facebook website successfully");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(2000);
		System.out.println("Visited to signup page");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("Avdhut");
		driver.findElement(By.name("lastname")).sendKeys("Birajdar");
		driver.findElement(By.name("reg_email__")).sendKeys("avdhutbirajdar2112@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("avdhutbirajdar2112@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Avdhut@2112");
		Thread.sleep(2000);
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("21");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		System.out.println("All done");
		// Test comment
		
		driver.close();
		

	}

}
