package programs;

public class Stringfunctions {
public static void main(String[] args) 
{
	String s1="QspidersmeansJava";
	
	int n=s1.length();
	System.out.println(n);
	
	String s2=s1.toUpperCase();
	System.out.println(s2);
	
	String s3=s1.toLowerCase();
	System.out.println(s3);
   
	String s4 = s1.substring(0,8);
	System.out.println(s4);
    
	String s5 = s1.substring(15);
    System.out.println(s5);
	
}
}
