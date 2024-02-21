package StringFunctions;
import java.util.Date;
public class DateandTime
{
public static void main(String[] args) 
	{
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime()+(1000*60*60*24*4));
	//this is to find out future time and past time.for future we should do+ and for past we should use-//
	System.out.println(d2);//d2 should be converted to String with the help of toString();
	String mydate=d2.toString();
	String year=mydate.substring(24);
	System.out.println(year);
	
	String month=mydate.substring(4,7);
	System.out.println(month);
	
	String date=mydate.substring(8,10);
	System.out.println(date);
	
	String day=mydate.substring(0,3);
	System.out.println(day);
	
	System.out.println(date.concat(month).concat(year));
	System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	}
}
