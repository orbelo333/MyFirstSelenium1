import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage {
	
	public void login(WebDriver driver) throws InterruptedException {
		
		//Link to the Mail section from the Yahoo.com 
		
		System.out.println("Starting Mail Page");

		//Pressing the Mail Page link
				driver.findElement(By.id("root_1")).click();

				Thread.sleep(2000);

				//Pressing on Sign-In from the Pink page (only if you logged out)
				driver.findElement(By.linkText("Sign in")).click();			    
				Thread.sleep(5000);

			
				
			    //Pressing on the Next button	
			    driver.findElement(By.id("login-username")).sendKeys("qaclass2022");
				Thread.sleep(2000);

				//Click on CheckBox "Stay signed in"
			    driver.findElement(By.ByXPath.cssSelector("label:nth-child(2)")).click();

			    
			    //Pressing on the Next button
			    driver.findElement(By.id("login-signin")).click();
				Thread.sleep(2000);
				
			    driver.findElement(By.id("login-passwd")).sendKeys("QA2409!");
				Thread.sleep(2000);
			    driver.findElement(By.id("login-signin")).click();

				Thread.sleep(5000);
				
				//Choosing value from ComboBox inside the mail box
			    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();
				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-date_desc']")).click();
				Thread.sleep(2000);
			    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();

			    driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-date_asc']")).click();
			
			    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();

				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-unread']")).click();
			    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();

				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-flagged']")).click();
				Thread.sleep(2000);
				
				//Choosing Radio Buttons inside the Setting area
				
				//Press on Setting
			    driver.findElement(By.ByXPath.cssSelector(".P_0 > .i_0")).click();
				Thread.sleep(2000);
				
				//Choose Different Radio Buttons
			    driver.findElement(By.ByXPath.cssSelector(".W_73HH")).click();
				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector("li:nth-child(3) > div > .e_dRA")).click();
				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector(".e_dRA > .W_6D6F")).click();
				Thread.sleep(2000);
			    driver.findElement(By.ByXPath.cssSelector("li:nth-child(2) > div > .e_dRA")).click();
				Thread.sleep(2000);
				Thread.sleep(2000);
				
				//Go out of setting
				driver.findElement(By.ByXPath.cssSelector("div[data-test-id='virtual-list-container']")).click();

	}

}