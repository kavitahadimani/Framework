package programs;

public class repeatchar {
	public static void main(String[] args) {
		String s1="kavita";
		
		int count=0;
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
