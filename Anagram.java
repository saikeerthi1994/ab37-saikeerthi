package StringFunctions;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1="ramsita";
		String s2="sitaram";
		if(s1.length()!=s2.length())
		{
			System.out.println("it is not an anagaram");
		}
		else
		{
			char[] c1=  s1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char c2[]=s2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("anagram decoded");
			}
		}

	}

}
