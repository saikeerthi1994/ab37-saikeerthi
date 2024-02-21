package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Grotech 
{
	public static void main(String[] args) 
	{
		 ChromeDriver driver=new ChromeDriver();
		  driver.get("https://grotechminds.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.tagName("a")).click();
    }
}
