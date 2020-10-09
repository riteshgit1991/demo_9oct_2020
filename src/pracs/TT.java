package pracs;

public class TT implements C,A{

	public static void main(String[] args) {
		TT ob = new TT();
		ob.test1();
	}

	@Override
	public void test() {
		System.out.println("N");
	}

	@Override
	public String test1() {
		return "Test1";
	}
}
