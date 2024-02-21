package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon 
{
  public static void main(String[] args) 
  {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17622874764476977091&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");

	}

}
