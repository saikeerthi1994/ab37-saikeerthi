package collectionProgram;
import java.util.Collections;
import java.util.HashSet;
public class Sixth 
{
	public static void main(String[] args) 
	{
		HashSet a1=new HashSet();
		   a1.add("Online");
		   a1.add("Automation");
		   a1.add("Keerthi");
		   a1.add("Course");
		   a1.add("Testing");
		   a1.add(37);
		   a1.add(null);
		   a1.add(true);
		   a1.add('A');               
		   a1.add("Keerthi");
		   a1.add(37);
		   a1.add(true);
		   a1.add('A');  
		   a1.add(null);
		   System.out.println(a1);
//HashSet accepts:Heterogeneous,Null and Dynamic but does not accept Indexing,Sorting,Duplicate
	}

}
