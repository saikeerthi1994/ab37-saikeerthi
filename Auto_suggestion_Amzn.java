package seleniumpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Auto_suggestion_Amzn 
{

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement t1= driver.findElement(By.id("twotabsearchtextbox"));
	t1.sendKeys("mouse");
	Thread.sleep(2000);
	List<WebElement>t2=   driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
	t2.get(5).click();//it gives 5th position 
	}
}

