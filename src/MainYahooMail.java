import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;
public class MainYahooMail {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		WebDriver driver = null;
		System.out.println("Please Enter the browser you would like to do the tests on");
		System.out.println("For Firefox press 1");
		System.out.println("For chrome press 2");
		int browserType = 0;
		do {
		browserType = input.nextInt();
		switch (browserType) {
		case 1:
			System.out.println("firefox has been chosen");
			driver = new FirefoxDriver();
			break;
		case 2:
			System.out.println("chrome has been chosen");
			driver = new ChromeDriver();
			break;
		default:
			System.out.println ("Invalid output");
			System.out.println ("Please re-Enter the browser you would like to do the tests on");
		}
		} while (browserType < 1 || browserType > 2);
		
		System.out.println("Starting Driver");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		//driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();		
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);

		//Compare between the actual and expected title using Assertion by JUNIT 5
		String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Financ, Sports & Videos";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) 
        	System.out.println("The titles are both equal");
        else
        	System.out.println("The titles are different from each other");
        		
        //Assert.assertEquals(actualTitle, expectedTitle);
		
		
		MailPage mail = new MailPage();
		mail.login(driver);
		
		NewsPage news = new NewsPage();
		news.read(driver);
		
		SportsPage Sports=new SportsPage();
		Sports.read(driver);
		
		

	}

}