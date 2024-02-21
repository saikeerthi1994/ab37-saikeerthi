package StringFunctions;
public class String_matches 
{
    public static void main(String[] args) 
    {
    	String a="sai";
    	String input="I love my India";
    	boolean a1=a.matches("...");
    	System.out.println(a1);
    	boolean a2=a.matches("s..");
    	System.out.println(a2);
    	boolean a3=a.matches("..");
    	System.out.println(a3);
    	//above are if we know the size of the string and for single char search
    	//below are for multi char search and if we dint know the size
    	boolean a4=input.matches("(.*)love(.*)");
    	System.out.println(a4);
    	boolean a5=a.matches("s((.*))");
    	System.out.println(a5);
    	boolean a6=input.matches("(.*)world(.*)");
    	System.out.println(a6);
    	
		
	}

}
