package seleniumpackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sbi_signin_DDT 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\VENKAT\\eclipse-workspace\\Selenium\\keerthi\\saikeerthi.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		String un1= wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pwd= wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login= driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login.click();
		WebElement username=  driver.findElement(By.id("username"));
		username.sendKeys(un1);
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys(pwd);
	
	}
}
