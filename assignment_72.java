package StringFunctions;
public class assignment_72 
{

	public static void main(String[] args) 
	{
		String name="grotechminds167823";//remove all the alphabets from this string
		name.replaceAll("grotechminds167823","");
		System.out.println(name.replaceAll("[a-z]",""));
	}
}
