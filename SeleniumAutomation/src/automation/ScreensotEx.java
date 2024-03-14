package automation;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreensotEx 
{public static void main(String[] args) throws IOException, InterruptedException
 {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");       
JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement button = driver.findElement(By.xpath("//input[@id='email']"));
button.sendKeys("abc@gmail.com");
js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px red')",button);
TakesScreenshot tk=(TakesScreenshot)driver;
Thread.sleep(1000);
File src=tk.getScreenshotAs(OutputType.FILE);	
File des=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumPractice\\screenshot\\facebook.png");		
FileUtils.copyFile(src, des);
driver.close();	
	} 

}
