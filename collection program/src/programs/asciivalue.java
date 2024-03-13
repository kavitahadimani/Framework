package programs;

public class asciivalue {
public static void main(String[] args) 
{
System.out.println("ascii value of uppaercase latter A-Z:");
for(char c='A';c<='Z';c++)
{
	int asciivalue=(int)c;
	System.out.println(c+":"+asciivalue);
}
System.out.println("ascii value of lower latter a-z:");
for(char c='a';c<='z';c++)
{
	int asciivalue=(int)c;
	System.out.println(c+":"+asciivalue);
}
}
}
