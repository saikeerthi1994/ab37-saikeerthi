package seleniumpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Auto_suggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
	    e1.sendKeys("India");
	    Thread.sleep(1000);
	    List<WebElement> results=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	    //List<WebElement> have a method called as size because it deals with multiple elements
	    int counting_auto =   results.size();//one of the abstract method is size
	    System.out.println(counting_auto);
	    Thread.sleep(3000);
	    results.get(counting_auto-7).click();//means 10-7,we get 4th option
	    }

}
