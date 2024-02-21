package collectionProgram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
public class Second_Program 
{
   public static void main(String[] args) 
	{
	   Vector a1=new Vector();
	   a1.add("Manish");
	   a1.add("Ramu");
	   a1.add("Sagar");
	   a1.add("Padmini");
	   a1.add("Keerthi");
	   Collections.sort(a1);
	   a1.add(18);
	   a1.add(true);
	   a1.add('A');               
	   a1.add("Keerthi");
	   a1.add(18);
	   a1.add(true);
	   a1.add('A');               
	   a1.add(null); 
	   a1.add("Sagar");
	   a1.add("Padmini");
	   a1.add("Keerthi");
	   a1.add(18);
	   a1.add(null);              
	   System.out.println(a1);
	   //vector accepts : Sorting,Duplicate,Null,Indexing,Heterogeneous and Dynamic
		

	}

}