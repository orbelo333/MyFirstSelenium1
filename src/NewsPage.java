import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
	
	public void read(WebDriver driver) throws InterruptedException {
		System.out.println("Starting News Page");

		Thread.sleep(10000);
		//Redirect to the News Page 
		driver.get("https://news.yahoo.com/");
		Thread.sleep(2000);
		//Pressing on the News link
		driver.findElement(By.linkText("NEWS")).click();	
		Thread.sleep(2000);
		//Pressing on the search bar
	    driver.findElement(By.id("ybar-sbq")).click();
		//Insert the search bar text
	    driver.findElement(By.id("ybar-sbq")).sendKeys("politics");
	    //clicking the search bar
	    driver.findElement(By.id("ybar-search")).click();
	    
		 int count = 0;
		 int expectedLinks = 81;
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 System.out.println(link.size()); // this will print the number of links in a page.
		 count =  link.size();
		 
		 if(count==expectedLinks){
			 System.out.println("Number of links in the News page are correct " + count );
		 }else
		 {
			 System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
		 } 
		/* for (WebElement link1 : link) {
	            int attempts = 0;
	            while (attempts < 2) { // You can adjust the number of retry attempts
	                try {
	                    // Attempt to get the text of the link
	                    String linkName = link1.getText();
	                    System.out.println("Link Name: " + linkName);
	                    break; // If successful, exit the retry loop
	                } catch (org.openqa.selenium.StaleElementReferenceException ex) {
	                    // Handle the stale element exception by re-locating the element
	                    link1 = driver.findElement(By.id(link1.getAttribute("id")));
	                }
	                attempts++;
	            }
	        }
		 */
	        
	    }
	}



