package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_three {

	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://grotechminds.com/registration/");
		c1.manage().window().maximize();
		c1.findElement(By.id("fname")).sendKeys("Saikeerthi");
		c1.findElement(By.id("lname")).sendKeys("Bodapati");
		c1.findElement(By.id("Username")).sendKeys("keerthi123");
		c1.findElement(By.id("password")).sendKeys("sai@8976");
		c1.findElement(By.id("FeMale")).click();
		c1.findElement(By.id("Skills")).click();
		c1.findElement(By.id("technicalskills")).click();		}

}
