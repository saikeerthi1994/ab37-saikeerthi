package seleniumpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_links 
{
    public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	List<WebElement>links= driver.findElements(By.xpath("//a"));
	System.out.println("the number of links is:"+ links.size());
	//Thread.sleep(2000);
	for(int i=0;i<=links.size()-1;i++)
	{
		WebElement a= links.get(i);
		String url=  a.getAttribute("href");
		System.out.println(url);
	}
	}
}
