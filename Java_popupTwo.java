package seleniumpackage;
import org.openqa.selenium.chrome.ChromeDriver;
public class Java_popupTwo 
{
	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/javascript-popup/");
	driver.switchTo().alert().accept();
	driver.manage().window().maximize();
	driver.getTitle();
	}
}
