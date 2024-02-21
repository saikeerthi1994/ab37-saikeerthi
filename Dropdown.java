package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown
{ 
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement cate_dd=  driver.findElement(By.id("searchDropdownBox")); 
		Select s1=new Select(cate_dd);
		s1.selectByValue("search-alias=mobile-apps");
		s1.selectByVisibleText("Books");
		

	}

}
