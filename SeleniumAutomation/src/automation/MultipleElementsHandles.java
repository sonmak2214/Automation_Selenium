package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsHandles 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("All Links Of WebElements Are:="+alllinks.size());
		
		for(WebElement webelement:alllinks)
		{
			String text = webelement.getText();
			System.out.println("The Text Of The Link Is:="+text);
			
			String attribute = webelement.getAttribute("href");
			System.out.println("The Redirected URL Is:="+attribute);
			
			String tagName = webelement.getTagName();
			System.out.println("Tagname Of The WebElement Links are:="+tagName);
		}
		
		driver.close();
	}

}
