package day4;

public class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {

		System.out.println(" chrome driver - Open Browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("chrome driver - Close Browser");

	}

	@Override
	public void setCookies() {
		System.out.println("chrome driver - Set cookies Browser");

	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	
	public void headlessChrome() {
		
	}

}
