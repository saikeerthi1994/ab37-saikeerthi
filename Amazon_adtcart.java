package seleniumpackage;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_adtcart 
{
   public static void main(String[] args) throws InterruptedException 
   {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	WebElement shoes= driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"));
	shoes.click();
	Set<String> selected_shoe=  driver.getWindowHandles();
	System.out.println(selected_shoe);
	Iterator<String>pcid=selected_shoe.iterator();
	String pid= pcid.next();//parent id alone
	String cid= pcid.next();//child id alone
	driver.switchTo().window(cid);
	Thread.sleep(3000);
	//driver.close();
	WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
	addtocart.click();
	}
}