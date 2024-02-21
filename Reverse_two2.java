package StringFunctions;
public class Reverse_two2 {

	public static void main(String[] args) 
	{
		String input="Devansh";
		String output="";
		for(int i=0;i>=input.length()-1;i--)
		{
			 char reverse=  input.charAt(i);
			 output=output+reverse;
		}
		System.out.println(output);
		
		
	}

}
