package tricky;

 class A {
	 
	 public void add() {
		System.out.println("A");
	}
}

class B extends A{

	public void add() {
		super.add();
		System.out.println("B");
	}
}


class C extends B{

	public void add() {
		super.add();
		System.out.println("C");
	}
}

 