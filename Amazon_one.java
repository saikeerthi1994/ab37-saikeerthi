package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Amazon_one
{
   public static void main(String[] args) 
   {
	EdgeDriver driver=new EdgeDriver();	
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//input)[7]")).sendKeys("keerthi321@gmail.com");
	driver.findElement(By.xpath("(//input)[10]")).click();
	driver.findElement(By.xpath("(//input)[9]")).sendKeys("12345");
	driver.findElement(By.xpath("(//input)[11]")).click();
	driver.findElement(By.xpath("(//input)[14]")).sendKeys("rh1tfn");
	driver.findElement(By.xpath("(//input)[15]")).click();

	}

}
