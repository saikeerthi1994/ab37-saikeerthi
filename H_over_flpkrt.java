package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_over_flpkrt 
{
	public static void main(String[] args) 
	{
	EdgeDriver driver=new EdgeDriver();
	 driver.get("https://www.flipkart.com");
	 driver.manage().window().maximize();
	 WebElement fashion=driver.findElement(By.xpath("//div[@id=toast-ctn]"));
	 Actions a1=new Actions(driver);
	 a1.moveToElement(fashion).perform();
	}
}