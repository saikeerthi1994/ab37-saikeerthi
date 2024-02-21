package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
public class Facebook_one 
{
   public static void main(String[] args) 
   {
	EdgeDriver driver=new EdgeDriver();	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("keerthi321@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("3457oop");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	

	}

}