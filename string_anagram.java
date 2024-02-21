package StringFunctions;
import java.util.Arrays;
public class string_anagram 
{
   public static void main(String[]args) 
   {
	   String a1="animal";
	   String a2="malina";
	   
	   if(a1.length()!=a2.length())
	   {
		 System.out.println("not an anagram");  
	   }
	   else
	   {
		   char[] c1=  a1.toCharArray();
		   Arrays.sort(c1);        //converting string a1 to array
		   Arrays.toString(c1);     //this is to sort the first string a1
		   System.out.println(Arrays.toString(c1));
		   char[] c2=  a2.toCharArray();      
		   //converting string a2 to array
		   Arrays.sort(c2);                  //converting string a2 to array
		   Arrays.toString(c2);             //this is to sort the second string a2
		   System.out.println(Arrays.toString(c2));
		   if (Arrays.equals(c1,c2)==true)             //this is to compare both arrays
		   {
			   System.out.println("anagram decoded");
		   }
	 }
	 
	 
	 
	 
	 
	 
	 
}

}