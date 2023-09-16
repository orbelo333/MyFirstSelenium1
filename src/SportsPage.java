
	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	public class SportsPage{
		
		public void read(WebDriver driver) throws InterruptedException {
			
			driver.findElement(By.id("root_1")).click();
			System.out.println("Starting Sports Page");

			Thread.sleep(10000);
			//Redirect to the Sports Page 
			driver.get("https://sports.yahoo.com/");
			Thread.sleep(2000);
			//Pressing on the News link
			driver.findElement(By.linkText("Sports")).click();	
			Thread.sleep(2000);
			//Pressing on the search bar
		    driver.findElement(By.id("ybar-sbq")).click();
			//Insert the search bar text
		    driver.findElement(By.id("ybar-sbq")).sendKeys("NFL");
		    //clicking the search bar
		    //driver.findElement(By.id("NFL")).click();
		    Thread.sleep(10000);
		    
		    //The driver coouldn't find the element despite it is exists on page
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    try {
		    	wait.until(ExpectedConditions.textToBe(By.className("._itemTitleOnly_xszgl_199._itemTitle_xszgl_186._Ell_xszgl_157"), "NFL"));
		    } catch (TimeoutException e) {
		    	System.out.println("No element has been found");
		    	e.printStackTrace();
		    } finally {
		    	driver.close();
		    }
		    
		    //Several attempts we tried to do in order to try make it working :(
		    
		    //driver.findElement(By.className(className)).click();
		    //driver.findElement(By.xpath("//div[@class=(text(),'._itemTitleOnly_xszgl_199._itemTitle_xszgl_186._Ell_xszgl_157')]")).click();
		    //driver.findElement(By.className("._itemTitleOnly_xszgl_199._itemTitle_xszgl_186._Ell_xszgl_157")).click();
		     //$('._itemTitleOnly_xszgl_199._itemTitle_xszgl_186._Ell_xszgl_157').click()
		    
		   // driver.findElement(By.id()).click();
		  //Insert the search bar text
		    //driver.findElement(By.id("ybar-search")).click();
		  //Insert the search bar text
		  //Pressing on the search bar
		    //clicking the search bar
		    //wait for page rendering
		    //driver.findElement(By.cssSelector("li[title=" + value + "]")).click();
		    //driver.findElement(By.xpath("//li[contains(text(), 'Duke')]")).click();
		    //driver.findElement_by_partial_link_text("Annual Reports").click()
		    //driver.findElement(By.partialLinkText(team)).click();

		   
		    
		}

}