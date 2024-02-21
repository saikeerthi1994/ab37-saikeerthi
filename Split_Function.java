package StringFunctions;
import java.util.Arrays;
import java.util.Scanner;
public class Split_Function 
{
     public static void main(String[] args) 
     {
		String s1="My name is Keerthi";
		String s2[]=             s1.split(" ");
		System.out.println(Arrays.toString(s2));
		System.out.println(s2[2]);
		System.out.println(s2[0]);
	}
}