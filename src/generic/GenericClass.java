package generic;


class  Test<T>{
	
	T obj;

	public Test(T obj) {
		super();
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}


public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test<Integer> i = new Test<Integer>(15);
		System.out.println(i.getObject());
		
		Test<String> s = new Test<String>("Tom");
		System.out.println(s.getObject());
	}

}
