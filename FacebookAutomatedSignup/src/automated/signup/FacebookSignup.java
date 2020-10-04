package automated.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookSignup{
	
	WebDriver driver;
	
	String fbUrl = "https://www.facebook.com/signup";
		
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(fbUrl);
		
			
	}
	
	public void facebookSignUp() {
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("June");
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();		
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		FacebookSignup fsu = new FacebookSignup();
		
		fsu.invokeBrowser();
		fsu.facebookSignUp();
		fsu.closeBrowser();
		
	}

}
