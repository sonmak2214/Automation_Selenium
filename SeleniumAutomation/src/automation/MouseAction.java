package automation;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseAction 
{
	public static void main(String[] args) throws AWTException 
	{
		 ChromeDriver driver=new ChromeDriver();
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.com/");
	      
		 WebElement hello  = driver.findElement(By.xpath("//*[@id='nav-orders']"));
         Actions a=new Actions(driver);//we can perform action by using action cls
         a.moveToElement(hello).perform();
     
        
         WebElement account = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
         Actions a1=new Actions(driver);
         a1.contextClick(account).perform();//right click
         //a.doubleClick(returns).perform();  //double click or single click--normal click
         
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_DOWN);
         r.keyPress(KeyEvent.VK_DOWN);
         
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_ENTER);
         
         String parentId = driver.getWindowHandle();
         
         System.out.println("The Id Of the Parent Window Is:="+parentId);
         
         Set<String> windowHandles = driver.getWindowHandles();//depend on value
         
         ArrayList<String> allids=new ArrayList<String>();//convert set into string here..
         allids.addAll(windowHandles);
         
        for(int i=0;i<allids.size();i++)
         {
        	 System.out.println(allids.get(i));
         }
       //  System.out.println(allids.get(0));
         driver.switchTo().window(allids.get(1));
       
	}
	
	 

}
 