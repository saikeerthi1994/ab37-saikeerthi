package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_popup 
{
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement choosefile=  driver.findElement(By.id("Resume"));
	choosefile.sendKeys("C:\\Users\\VENKAT\\Documents\\MAnish Kumar Tiwari.pdf");
	}

}
