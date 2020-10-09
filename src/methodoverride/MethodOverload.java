package methodoverride;

public class MethodOverload {

	public String print(Long l) {
		return "Hello";
		
	}
	
	public String print(String m) {
		return "Hello";
	}
	
	public static void main(String[] args) {
		MethodOverload m = new MethodOverload();
	}
}
