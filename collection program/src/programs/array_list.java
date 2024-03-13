package programs;

import java.util.ArrayList;

public class array_list {
	public static void main(String[] args)
	{
	ArrayList<String> al=new ArrayList<>();
	al.add("hi");
	al.add("kavita");
	al.add("bye");
	System.out.println(al);
	al.add(0, "kavita");
	System.out.println(al);
	al.remove(0);
	System.out.println(al);
	al.retainAll(al);
	System.out.println(al);
	}

}
