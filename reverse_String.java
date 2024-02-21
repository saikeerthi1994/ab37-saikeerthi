package StringFunctions;
public class reverse_String {
    public static void main(String[] args)
	{
		String input="keerthi";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char reverse=    input.charAt(i);
//this is the way to reverse the string.input will be in string and output should be in char
			output=output+reverse;
		}
		System.out.println(output);		
		
	}
}
