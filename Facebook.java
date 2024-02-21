package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook
{
    public static void main(String[] args) 
	{
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("keerthi321@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("sai@987");
	 driver.findElement(By.name("login")).click();
		

	}

}
