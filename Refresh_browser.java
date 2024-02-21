package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	}

}
