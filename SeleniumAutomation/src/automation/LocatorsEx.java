package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx 
{
	public static void main(String[] args)
	{
      ChromeDriver driver=new ChromeDriver();
      driver.get("https:www.facebook.com");
      
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
   /* WebElement usernm = driver.findElement(By.id("email"));
     usernm.sendKeys("Technolearn");
     
 
    WebElement pass = driver.findElement(By.name("pass"));
     pass.sendKeys("123456789");
     
    WebElement button = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
    button.click();*/
    
      WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
      user.sendKeys("Technolearn");//with the help of real path
      
      /*WebElement findElement = driver.findElement(By.cssSelector("input[type='password']"));
      findElement.sendKeys("123456");//with the help of css selector*/
      
      WebElement findElement2 = driver.findElement(By.linkText("//a[text='Forgotten password?']"));
      findElement2.click();
    // WebElement forgetPass = driver.findElement(By.linkText("Forgotten password?"));
     //forgetPass.click();
    
    //or
     
     //WebElement Partlnltxt = driver.findElement(By.partialLinkText("Forgotten "));
     //Partlnltxt.click();
      
	}

}
