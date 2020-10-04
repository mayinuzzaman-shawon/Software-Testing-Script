package mouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtility;

public class FlipkartProject {
    ChromeDriver driver;
	
	String url = "http://flipkart.com";
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
				
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
}
	
	public void mouseHover() {
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WaitUtility.waitTillElementVisible(driver, By.xpath("//span[text()='Electronics']"),10);
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(electronicsLink).build().perform();
		
				
	}
	
	public static void main(String[] args) {
		FlipkartProject fp = new FlipkartProject();
		
		fp.invokeBrowser();
		fp.mouseHover();
	}

}