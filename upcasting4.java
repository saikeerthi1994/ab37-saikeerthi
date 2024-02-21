package StringFunctions;
class testcase1
{
	void tc1()
	 {
      System.out.println("executing test case one");

     }
}
class testcase2 extends testcase1
{
	void tc2()
	{
		System.out.println("executing test case two");
	}
}
class testcase3 extends testcase2
{
	void tc3()
	{
		System.out.println("executing test case three");	
	}
}
public class upcasting4 extends testcase3
{

	public static void main(String[] args)
	{
		testcase2 t2    = new testcase3();
		t2.tc1();
		t2.tc2();
	}
}
