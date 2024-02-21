package StringFunctions;

import java.util.Arrays;

public class Practice_three 
{
	public static void main(String[] args) 
	{
	    String name="abhishek";
		System.out.println(name.replaceAll("a", ""));//this removes particular char
		System.out.println(name.replaceAll("a", "A")); //this replaces the value with A
		String s1="I love my country";
		System.out.println(s1.replaceAll(" ",""));//it removes spaces
		
		String s2="keerthi123";
		System.out.println(s2.replaceAll("[a-z]",""));
		 
		String s3="My Name Is Keerthi";
		System.out.println(s3.replaceAll("[a-z]",""));
		String s5="MyNameIsKeerthi";
		System.out.println(s5.replaceAll("[a-z]",""));
		
		String s4="KeErThI";
		System.out.println(s4.replaceAll("[a-z]",""));
		System.out.println(s4.replaceAll("[A-Z]",""));
		
		String a="My name is Manish";
		String a1[] =a.split(" ");
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
	}

}
