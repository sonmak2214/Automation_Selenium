package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMtdEx
{
	public static void main(String[] args) throws InterruptedException 
	{
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
       driver.get("https://www.amazon.com");
       
       Thread.sleep(3000);
      
      driver.navigate().to("https://www.faceook.com");
      
      Thread.sleep(3000);
      
      driver.navigate().back();
      
      Thread.sleep(30000);
      
      driver.navigate().forward();
      
      Thread.sleep(3000);
      driver.navigate().refresh();
      
	}

}
