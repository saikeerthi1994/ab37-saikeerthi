package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_popup
{
	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/VENKAT/Downloads/learningHTML1.html");
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	driver.manage().window().maximize();
	WebElement firstname= driver.findElement(By.id("1"));
	firstname.sendKeys("keerthi");
	}

}
