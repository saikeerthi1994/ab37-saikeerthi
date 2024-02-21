package StringFunctions;
public class Reverse_two {

	public static void main(String[] args) 
	{
		String input="devansh";
		String output="";
		for(int i=6;i>=0;i--)
		{
			 char reverse=  input.charAt(i);
			 output=output+reverse;
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");	
		}
		
		
	}

}
