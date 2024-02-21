package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Jsam_selected 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Users/VENKAT/Downloads/learningHTML1.html");
		  driver.manage().window().maximize();
		 WebElement check_box=  driver.findElement(By.xpath("(/html/body/input)[6]"));
		 check_box.click();
		 Thread.sleep(3000);
		 if(check_box.isSelected()==true)
		 {
			System.out.println("click on submit button");
		 }
		 else
		 {
			 check_box.click();
		 }
	}
}