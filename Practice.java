package StringFunctions;

public class Practice 
{
	public static void main(String[] args) 
	{
		String name="KeerthI";
		 System.out.println(name.toLowerCase());
		 System.out.println(name.toUpperCase());
		 String s1="my name is keerthi";
		 String s2=" my name is keerthi ";
		 System.out.println(s1.trim());//using trim
		 System.out.println(s2.trim());
		 System.out.println(s1.length());
		 
		 String fname="gobi";
		 String lname="manchuriyan";
		System.out.println(fname.concat(lname));//using concat
		String name1="world";
		System.out.println(name1.charAt(4));//this is to find character at given index
		System.out.println(name1.indexOf('l')); //this is to find index of particular char
		
		String s3="grotechminds";
		System.out.println(s3.substring(5));//single substring gives op from index 5 to till end
		System.out.println(s3.substring(0, 12));//double ss gives op from the given index in sys. to one index less from the ending
		String s4="my name is manish kumar tiwari";
		
		System.out.println(s4.substring(10));//substring for single parameter
		System.out.println(s4.substring(11,17));//substring for double parameter
		
		System.out.println(s4.contains("m")); //using contains and gives op as true or false
		System.out.println(s3.matches("grotechminds")); //using matches,it should exactly match with the given sting
		
		String s5="";
		System.out.println(s5.isEmpty());//this gives whether string is empty or not
		System.out.println(s4.endsWith("i"));//this gives with what the string is ending and gives T orF
		
		
		
		
		
	}
}
