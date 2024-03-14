package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
     ChromeDriver driver=new ChromeDriver();
     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/");
     
     driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
     Thread.sleep(2000);
     
     WebElement monthDD = driver.findElement(By.xpath("//*[@id='month']"));
     
     Select s=new Select(monthDD);
     //s.selectByIndex(0);//its depend upon index position
     //s.selectByValue("2");

     s.selectByVisibleText("Mar");
     
    // List<WebElement> options = s.getOptions();
    // System.out.println(options);
     /*for(WebElement webelement:options)
     {
    	 String text = webelement.getText();
    	 System.out.println(text);
     }*/
     Thread.sleep(2000);   
     driver.close();
	}

}
