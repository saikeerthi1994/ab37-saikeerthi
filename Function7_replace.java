package StringFunctions;
public class Function7_replace 
{
    public static void main(String[] args) 
	{
    	String name="abhishek";
    	name.replaceAll("a", "");
    	System.out.println(name.replaceAll("a", ""));//remove letter a
    	System.out.println(name.replaceAll("a", "A"));//replace a with a
    	
    	String quote="I love my country";
    	System.out.println(quote.replaceAll(" ", ""));//here we get the output with no spaces
    	System.out.println(quote.replaceAll(" ", "   "));//here we get the output with triple space in btwn
    	
    	String a="country123";//remove alphabets,here we get the output as only numerical
    	System.out.println(a.replaceAll("[a-z]",""));
    	
    	String a1="My Name Is Keerthi";//here the output will be all capital letters
    	System.out.println(a1.replaceAll("[a-z]",""));
    	
    	
    	String a2="MyNameIsKeerthi";
    	System.out.println(a2.replaceAll("[a-z]",""));

	}

}
