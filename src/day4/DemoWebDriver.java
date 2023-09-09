package day4;

public class DemoWebDriver {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.openBrowser();
		
		driver.closeBrowser();
		
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.headlessChrome();
		
	}

}
