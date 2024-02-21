package seleniumpackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukuri_DDT 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
     FileInputStream f= new FileInputStream("C:\\Users\\VENKAT\\eclipse-workspace\\Selenium\\keerthi\\saikeerthi.xlsx");
     Workbook wb= WorkbookFactory.create(f);
     String un= wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
     String pwd= wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
     
     ChromeDriver driver= new ChromeDriver();
     driver.get("https://www.naukri.com/");
     driver.manage().window().maximize();
     WebElement login= driver.findElement(By.id("login_Layer"));
     login.click();
     WebElement uname= driver.findElement(By.linkText("text"));
     uname.sendKeys("un");
     
     
	}

}
