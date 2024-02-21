package StringFunctions;

public class assignment_73 
{

	public static void main(String[] args) 
	{
		String a1="My Name Is Manish";//here the output will be all capital letters
    	System.out.println(a1.replaceAll("[a-z]",""));
    	String a2="MyNameIsManish";//here the output will be all capital letters with no space
    	System.out.println(a2.replaceAll("[a-z]",""));
		
	}

}
