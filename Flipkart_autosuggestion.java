package seleniumpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_autosuggestion 
{
  public static void main(String[] args) throws InterruptedException 
	{
	  EdgeDriver driver=new EdgeDriver();
	  driver.get("https://www.flipkart.com");
	  driver.manage().window().maximize();
	  WebElement e1=driver.findElement(By.name("q"));
	  e1.sendKeys("books");
	  Thread.sleep(3000);
	  List<WebElement>e2=  driver.findElements(By.xpath("//form[@class='col-12-12 _2oO9oE']/ul/li"));
	  e2.get(3).click();
	}

}
