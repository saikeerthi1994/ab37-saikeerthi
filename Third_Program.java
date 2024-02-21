package collectionProgram;
import java.util.Collections;
import java.util.LinkedList;
public class Third_Program 
{
   public static void main(String[] args) 
	{
	   LinkedList a1=new LinkedList();
	   a1.add("Manish");
	   a1.add("Keerthi");
	   a1.add("Padmini");
	   Collections.sort(a1);
	   a1.add(25);
	   a1.add(null);  
	   a1.add(true);
	   a1.add('A');               
	   a1.add("Keerthi");
	   a1.add(25);
	   a1.add(true);
	   a1.add('A');               
	   a1.add(null); 
	   a1.add("Sagar");
	   a1.add("Padmini");
	   a1.add("Keerthi");
	   a1.add(18);
	   a1.add(null);              
	   System.out.println(a1);
	   //LinkedList accepts : Sorting,Duplicate,Null,Indexing,Heterogeneous,Dynamic.
		

	}

}