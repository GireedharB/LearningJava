package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		System.out.println("Visited to Ebay website successfully");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		WebElement el = driver.findElement(By.linkText("Electronics"));
		ac.moveToElement(el).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Visited Samsung sub category under electronic main category on ebay website");
		driver.findElement(By.name("_nkw")).sendKeys("Samsung Galaxy S23 Ultra");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[3]/div[1]/div[2]/ul/li[2]/div/div[2]/a")).click();
		Thread.sleep(3000);
		Set<String> windowhandler = driver.getWindowHandles();	
		Iterator<String> itr = windowhandler.iterator();
		String ParentWindowhandler = itr.next();
		String ChildWindowhandler = itr.next();
		driver.switchTo().window(ChildWindowhandler);
		Thread.sleep(1000);
		Select colour = new Select(driver.findElement(By.id("x-msku__select-box-1000")));
		colour.selectByIndex(7);
		Thread.sleep(3000);
		System.out.println("switch to child window and selected dropdown option sucessfully");
		driver.switchTo().window(ParentWindowhandler);
		Thread.sleep(2000);
		System.out.println("Switched to parent window successfully");
		driver.quit();
	}

}
