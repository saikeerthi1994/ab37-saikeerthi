package seleniumpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_DDT 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\VENKAT\\eclipse-workspace\\Selenium\\keerthi\\saikeerthi.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		//String un= wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pwd= wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String un= NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		
		 
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement signin= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		WebElement email= driver.findElement(By.id("ap_email"));
		email.sendKeys(un);
		WebElement con= driver.findElement(By.id("continue"));
		con.click();
		}

}
