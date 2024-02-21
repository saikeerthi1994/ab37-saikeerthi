package seleniumpackage;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukuri 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.manage().window().maximize();
	WebElement google_link=   driver.findElement(By.xpath("//span[.='Google']"));
	google_link.click();
    String parentid =  driver.getWindowHandle();
	Set<String>parentandchild=  driver.getWindowHandles();
	System.out.println(parentid);
	System.out.println(parentandchild);
	Thread.sleep(3000);
	Iterator<String> pcid=  parentandchild.iterator();
	String parentid1=   pcid.next();//this gives the parent id
	String childid=     pcid.next();//this gives the first child id
	System.out.println(parentid1);
	System.out.println(childid);
	driver.switchTo().window(childid);//this is to move control to child
	Thread.sleep(3000);
	driver.close();
	//WebElement username=driver.findElement(By.id("identifierId"));
	//username.sendKeys("bodapatisaikeerthi27@gmail.com");
	}
}
