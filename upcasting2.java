package StringFunctions;
class new1
{
	void upcast1()
	{
		System.out.println("1");
	}
}
class new2 extends new1
{
	void upcast2()
	{
		System.out.println("2");
	}
}
public class upcasting2 extends new2
{

	public static void main(String[] args) 
	{
		  new1 n1  = new new2();
		  n1.upcast1();
		  
	

	}

}
