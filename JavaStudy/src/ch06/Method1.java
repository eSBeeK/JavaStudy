package ch06;

public class Method1
{
	public static void sum(int a, char c)
	{
		System.out.println(2);
		char trans = (char)(c + a);
		System.out.println(trans);
	}
	public static void main(String[] args)
	{
		System.out.println(1);
		sum(2, 'A');
		System.out.println(3);
	}
}