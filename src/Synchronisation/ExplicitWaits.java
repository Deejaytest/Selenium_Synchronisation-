package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
		driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']")).sendKeys(Keys.ENTER);
		
		WebDriverWait explicitWait = new WebDriverWait(driver,20); // Explicit wait
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id='17117062']//a[contains(@class,'flex-link')]")));
		
		driver.findElement(By.xpath("//article[@id='17117062']//a[contains(@class,'flex-link')]")).click();
	}
}
