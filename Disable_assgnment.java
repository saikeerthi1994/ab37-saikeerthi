/*Perform any action onthe disabled componentand find out which
exceeption we are getting asnmnt 125*/

package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable_assgnment 
{
	public static void main(String[] args)
   {
		ChromeDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/VENKAT/Downloads/learningHTML1.html");
		  driver.manage().window().maximize();
		 WebElement ln= driver.findElement(By.id("121"));
		 ln.sendKeys("Rayala");
		
	}

}
