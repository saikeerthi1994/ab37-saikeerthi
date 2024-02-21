package StringFunctions;

public class palindrome_string {

	public static void main(String[] args) 
	{
		String input="malayalam";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char reverse=    input.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("the given string is palindrome");
		
		}
		else
		{
			System.out.println("if the given string is not palindrome");
		}
		
	}
}
