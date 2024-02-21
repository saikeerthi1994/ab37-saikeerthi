package StringFunctions;
public class Function3 
{
public static void main(String[] args) 
{
	String name="Grotechminds";
	System.out.println(name.charAt(1));
	System.out.println(name.indexOf('m'));
	System.out.println(name.substring(2));//substring with single parameter
	System.out.println(name.substring(2, 6));//substring with double parameter
	System.out.println(name.contains("minds"));
	System.out.println(name.matches("Grotechminds"));
	System.out.println(name.isEmpty());
	String s1="";//here the string is empty,so it is true in output
	String s2="keerthi";//here the string is not empty,so it is false in output as it is Empty condition
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(name.endsWith("s"));
}
}
