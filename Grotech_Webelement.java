//LauLaunch grotechminds registration form and locate dropdowns skills,country and religion 
//perform action on them..assnmnt 123

package seleniumpackage;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Grotech_Webelement
{
  public static void main(String[] args) 
  {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://grotechminds.com/registration/");
	  driver.manage().window().maximize();
	  WebElement firstname_tf= driver.findElement(By.name("fname"));
	  firstname_tf.sendKeys("Saikeerthi");
	  firstname_tf.sendKeys(Keys.ENTER);
	  WebElement lastname_tf= driver.findElement(By.name("lname"));
	  lastname_tf.sendKeys("Bodapati");
	  lastname_tf.sendKeys(Keys.ENTER);
	  WebElement username_tf= driver.findElement(By.name("Username"));
	  username_tf.sendKeys("Keerthi321");
	  username_tf.sendKeys(Keys.ENTER);
	  WebElement password_tf= driver.findElement(By.name("password"));
	  password_tf.sendKeys("keerthi@00");
	  password_tf.sendKeys(Keys.ENTER);
	  WebElement preaddress_tf= driver.findElement(By.name("w3review"));
	  preaddress_tf.sendKeys("Kukatpally,Hydreabad");
	  preaddress_tf.sendKeys(Keys.ENTER);
	  WebElement permaddress_tf= driver.findElement(By.id("Address"));
	  permaddress_tf.sendKeys("Bhadrachalam,Telangana,507128");
	  permaddress_tf.sendKeys(Keys.ENTER);
	  
	  WebElement Grotech_ss=  driver.findElement(By.id("Skills"));
		Select s1=new Select(Grotech_ss);
		s1.selectByValue("select1");
		
		
	  WebElement Grotech_sc=  driver.findElement(By.id("Country"));
		Select s11=new Select(Grotech_sc);
		s11.selectByValue("India");
		
		WebElement Grotech_sr=  driver.findElement(By.id("Relegion"));
		Select s111=new Select(Grotech_sr);
		s111.selectByValue("Hindu");
	  }
}