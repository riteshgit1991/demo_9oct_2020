package methodoverride;

import java.io.FileNotFoundException;

class p1{
	
	protected String Test(int x,int y)   {
		return "parent";
	}
	
	protected Number Test1(int x,int y) throws FileNotFoundException  {
		return x+y;
	}
	
	public void print() {
		System.out.println("p1");
	}
}

class c1 extends p1{
	
	@Override
	public String Test(int x,int y) throws NullPointerException{
		return "child";	
	}
	
	@Override
	protected Integer Test1(int x,int y){
		return x-y;
	}
	
	public void print() {
		System.out.println("c1");
	}
	
}

public class MethodOverrideCases {

	public static void main(String[] args) {
		p1 p = new c1();
		p.print();
	
	}

}
