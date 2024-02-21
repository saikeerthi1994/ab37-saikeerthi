package seleniumpackage;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchClass_two
{

	public static void main(String[] args) 
	{
		//EdgeDriver e1=new EdgeDriver();
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.flipkart.com");
		//System.out.println(c1.getWindowHandle());//first id in console is o/p of getwindowhandle
		//System.out.println(c1.getWindowHandles());//second id in console is o/p of getwindowhandles
		System.out.println(c1.getTitle());	
		}
}
