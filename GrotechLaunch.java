package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class GrotechLaunch
{
  public static void main(String[] args) 
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://grotechminds.com/registration/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("fname")).sendKeys("SaiKeerthi");
	  driver.findElement(By.id("lname")).sendKeys("Bodapati");
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  driver.findElement(By.id("lname")).sendKeys(Keys.BACK_SPACE);
	  
	  
	  
		

	}

}
