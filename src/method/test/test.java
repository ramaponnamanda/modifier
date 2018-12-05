package method.test;

public class test {
	int a=10;
	static int b=20;
	public static void main(String[] args)
	{
		test t=new test();
		System.out.println(b);
		t.m1();
	}
	public void m1()

	{
		System.out.println(a);

		System.out.println(b);
		
	}
}
