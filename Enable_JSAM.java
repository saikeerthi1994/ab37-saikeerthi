package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Enable_JSAM 
{
  public static void main(String[] args) 
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/VENKAT/Downloads/learningHTML1.html");
	  driver.manage().window().maximize();
	  WebElement pwd=driver.findElement(By.id("121"));
	  boolean checking_ln=   pwd.isEnabled();
	  if(checking_ln==true&&pwd.isDisplayed()==true) 
	  {
		pwd.sendKeys("keerthi345");
	  }
	  else
	  {
		 System.out.println("either component is not displaying or disabled");
	  }

	}

}
