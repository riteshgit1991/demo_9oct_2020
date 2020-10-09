package statickeyword;

public class TestStatic {

	static int x = 10;
	int m = 20;
	
	{
		System.out.println("Instance block");
	}
	
	
	public static void main(String[] args) {
		
		
		TestStatic obj1 = new TestStatic();
		TestStatic obj2 = new TestStatic();
		System.out.println(obj1.m);
		System.out.println(obj2.m);	
		obj1.m = 90;
		System.out.println(obj1.m);
		System.out.println(obj2.m);
		name();
		
	}
	
	static{
		System.out.println("first");
	}
	
	public static void name() {
		
	}
}
