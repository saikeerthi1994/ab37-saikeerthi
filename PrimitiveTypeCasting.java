package StringFunctions;
public class PrimitiveTypeCasting
{
   public static void main(String[] args) 
   {
	   //1st pblm :: given weight in int,convert it into double:
	   double myweight=55;//widening
	   //here it is implicit(automatically)
	   System.out.println(myweight);
	   
	   //2nd problem ::given weight in double,convert it into int:
	   int yourweight=(int)55.66;//narrowing
	   //here it is explicitly(forcefully)
	   System.out.println(yourweight);
	 
      //3rd problem:given age is in byte,convert it into short:
        byte a1=20;
        short a2= a1;
        System.out.println(a2);
     }
}