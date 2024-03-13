package programs;

public class reversestring {
public static void main(String[] args) {
	String s1="kavita";
	String s2="";
	int n=s1.length()-1;
	for(int i=n;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
}

}
