package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebsiteInfoEx
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement tagline=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String taglinetext=tagline.getText();
		System.out.println("The Text Of The Element Is:"+taglinetext);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String attribute=link.getAttribute("href");
		System.out.println("The Value Of Attribute Is:"+attribute);	
		String tagName=link.getTagName();
		System.out.println("Tag Of The Element Is:"+tagName);
		
		Point location=link.getLocation();
		System.out.println("The X Co-ordinate Is:"+location.getX());
		System.out.println("The Y Co-ordinate Is:"+location.getY());
		
		
		Dimension size=link.getSize();
	    System.out.println("The Width Of The Element Is:"+size.width);
	    System.out.println("The Height Of The Element Is:"+size.height);
	    
	    boolean displayed=link.isDisplayed();
	    System.out.println("Is The Element Displayed:"+displayed);
	    
	    boolean enabled=link.isEnabled();
	    System.out.println("Is Link Enabled:"+enabled);
	    
	    boolean selected=link.isSelected();
	    System.out.println("Is Link Selected:"+selected);
	    
	    String x1=link.getCssValue("font-family");
	    System.out.println(x1);
	    
	    String x2=link.getCssValue("font-size");
	    System.out.println(x2);
	    
	    String x3=link.getCssValue("font-weight");
	    System.out.println(x3);
	    
	    String x4=link.getCssValue("color");
	    System.out.println(x4);
	    
	    String x5=link.getCssValue("font-background");
	    System.out.println(x5);
	    			
		driver.close();
		
		
	}

}
