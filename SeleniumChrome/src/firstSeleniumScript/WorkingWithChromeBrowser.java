package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChromeBrowser {

	ChromeDriver driver;
	
	String url = "https://qatechhub.com";
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\workspace\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
	}
	
	public void getTitle() {
		String titleOfThePage = driver.getTitle();
		
		System.out.println(titleOfThePage);
		
	}
	
	public void closeBrowser() {
		//closes the current active window
		driver.close();
		
		//closes all the windows that are open
		driver.quit();
	}
	
	public static void main(String[] args) {
		WorkingWithChromeBrowser wc = new WorkingWithChromeBrowser();
		
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
		
	}
}
