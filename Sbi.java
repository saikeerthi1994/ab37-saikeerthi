//Launch online sbi link,click on login button, and inspect username,password and captcha

package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login= driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login.click();
		WebElement username=  driver.findElement(By.id("username"));
		username.sendKeys("Saikeerthi");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("12345");
		WebElement captcha= driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("wnxw6");

	}

}
