package StringFunctions;
class one
{
	void add()
	{
	 System.out.println("addition");	
	}
}
class two extends one
{
	void sub()
	{
		System.out.println("subtraction");
	}
}
public class upcasting3 extends two
{

	public static void main(String[] args)
	{
		    two t1= new  upcasting3();
		    t1.add();
		    t1.sub();

	}

}
