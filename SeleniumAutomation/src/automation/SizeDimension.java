package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeDimension 
{

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      
    Dimension d=new Dimension(500,800);//for height & Width point of view
    driver.manage().window().setSize(d);
      
    Thread.sleep(2000);
    
    Dimension d1=new Dimension(1000,650);
    driver.manage().window().setSize(d1);
    
    
    Point p=new Point(200,100);//for x& y axis point of view--as coordinates
    driver.manage().window().setPosition(p);
	/*
	 * driver.manage().window().setPosition(p);
	 * 
	 * driver.manage().window().maximize();
	 */    
  
	}

}
