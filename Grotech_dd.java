package seleniumpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Grotech_dd 
{
	public static void main(String[]args)
	{
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://grotechminds.com/x-path/");
	driver.manage().window().maximize();
	WebElement clothes= driver.findElement(By.xpath("//a[@id=' Clothes']"));
	clothes.click();	  
	}

}
