package seleniumpackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchClass 
{

	public static void main(String[] args) 
	{
		//ChromeDriver c1= new ChromeDriver();
		FirefoxDriver c1= new FirefoxDriver();
		c1.get("https://www.google.com");
		//c1.close();
	}

}
