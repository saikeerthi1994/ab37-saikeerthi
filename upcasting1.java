package StringFunctions;
class Excelsheet
{
	void datafetching()
	{
	System.out.println("fetching the data");
	}
}

public class upcasting1 extends Excelsheet
{
	void logintologout()
	{
		System.out.println("login to logout");
	}
   public static void main(String[] args) 
   {
	   //upcasting
	   Excelsheet e1= new upcasting1();//this is the way to do upcasting
	   e1.datafetching();
	   //we can fetch only the parent class properties with the help of RV and cannot fetch child class properties
	   
	 
		

	}

}
