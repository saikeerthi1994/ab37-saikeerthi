package collectionProgram;
import java.util.ArrayList;
import java.util.Collections;
public class First_program 
{
   public static void main(String[] args) 
	{
	   ArrayList a1=new ArrayList();
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
	   System.out.println(a1);
	 //ArrayList accepts Indexing,Sorting,Heterogeneous,Duplicate,Null and Dynamic
		

	}

}
