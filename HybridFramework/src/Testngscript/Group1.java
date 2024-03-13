package Testngscript;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("hiiiiiiiii");
	}
	@Test(groups = {"functional","sanity"})
	public void test2()
	{
		System.out.println("hellow");
	}
	@Test(groups = {"smoke","functinal"})
	public void test3()
	{
		System.out.println("byeeeeee");
	}

}
