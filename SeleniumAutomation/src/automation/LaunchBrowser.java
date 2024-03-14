package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().window().maximize();
	 
	  Thread.sleep(1000);
	  
	 // WebElement usernmtextfield = driver.findElement(By.xpath("//input[@id='email']"));
	 // usernmtextfield.sendKeys("sonal23@gmail.com");
	  
	 // WebElement lgnbtn = driver.findElement(By.xpath("//button[@name='login']"));
	 // lgnbtn.click();
	  
	  String title=driver.getTitle();
	  System.out.println("Title Of The WebPage Is:="+title);

	  
	  String currentUrl=driver.getCurrentUrl();
	  System.out.println("Current Url Of The WebPage Is:="+currentUrl);
	  
	  
	  String pageSource=driver.getPageSource();
	  System.out.println("PageSource of the WebPage Is:="+pageSource);
	  Thread.sleep(1000);
	  driver.close();
	  
	  
	  
	}

}
