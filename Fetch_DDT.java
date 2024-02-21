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
import org.openqa.selenium.edge.EdgeDriver;

public class Fetch_DDT 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\VENKAT\\eclipse-workspace\\Selenium\\keerthi\\saikeerthi.xlsx");
	Workbook wb= WorkbookFactory.create(f1);//to open xcel sheet
	Sheet s1= wb.getSheet("login");//sheet name from xcel sheet
	Row r1= s1.getRow(1);//row value from xcel sheet
	Cell c1=r1.getCell(0);//cell value
	String un1= c1.getStringCellValue();
	System.out.println(un1);
	Row r2= s1.getRow(1);
	 Cell c2= r2.getCell(1);
	 String pwd= c2.getStringCellValue();
	 System.out.println(pwd);
	 
	 EdgeDriver driver=new EdgeDriver();	
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[7]")).sendKeys(un1);
		driver.findElement(By.xpath("(//input)[10]")).click();
		driver.findElement(By.xpath("(//input)[9]")).sendKeys(pwd);
		driver.findElement(By.xpath("(//input)[11]")).click();
	 
	
	
	}

}
