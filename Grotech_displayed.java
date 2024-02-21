package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Grotech_displayed
{
  public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement first_name=  driver.findElement(By.xpath("//input[@id='fname']"));
	boolean checking_first_name =first_name.isDisplayed();//we check whether the component is present or not
	if(checking_first_name==true)
	{
		first_name.sendKeys("Saikeerthi");
	}
	else
	{
		System.out.println("Do nothing");
	}
	}
}
