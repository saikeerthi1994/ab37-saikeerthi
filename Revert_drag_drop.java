package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Revert_drag_drop 
{
public static void main(String[] args) throws InterruptedException 
    {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	driver.manage().window().maximize();
	WebElement drop= driver.findElement(By.id("div1"));
	
	WebElement drag= driver.findElement(By.id("drag7"));
	Actions a1= new Actions(driver);
	a1.dragAndDrop(drop, drag);
	Thread.sleep(4000);
	}
}
