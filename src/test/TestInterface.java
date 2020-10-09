package test;

public interface TestInterface {
	
	abstract void Test();
	
	default void T() {
		System.out.println("Hello");
	}
}
