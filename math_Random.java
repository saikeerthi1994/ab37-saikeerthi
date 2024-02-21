package StringFunctions;
public class math_Random 
{

	public static void main(String[] args) 
	{
		int answer=Math.addExact(10, 20);
		System.out.println(answer);
		int answer1=Math.subtractExact(10,20);
		System.out.println(answer1);
		int a1=Math.multiplyExact(answer, answer1);
		System.out.println(a1);
		double pi=Math.PI;
		System.out.println(pi);
		for(int i=0;i<=10;i++)
		{
			System.out.println(Math.random());
		}
	}
}
