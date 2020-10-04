package urlredirection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkRedirection {
	ChromeDriver driver;
	
	String url = "https://qatechhub.com";
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}

	public void verifyPageTitle() {
		String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	public void navigateCommands() {
		//Navigating to a particular url
		driver.navigate().to("https://www.facebook.com");
		
		//Navigate back in the browsing history
		driver.navigate().back();
		
		//Getting the url of the current web page
		String urlFromWebpage = driver.getCurrentUrl();
		System.out.println(urlFromWebpage);
		
		//Navigating forward in the browsing history
		driver.navigate().forward();
		
		//Reloading the page
		driver.navigate().refresh();
				
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		LinkRedirection lr = new LinkRedirection();
		
		lr.invokeBrowser();
		lr.verifyPageTitle();
		lr.navigateCommands();
		lr.closeBrowser();
		
	}
}
