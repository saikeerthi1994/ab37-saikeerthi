package collectionProgram;
import java.util.Collections;
import java.util.LinkedHashSet;
public class Seventh 
{
   public static void main(String[] args) 
   {
	   LinkedHashSet a1=new LinkedHashSet();
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
	//LinkedHashSet accepts:Indexing,Heterogeneous,Null,Dynamic but not accepting Duplicate and Sorting
	

	}

}
