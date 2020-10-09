package test;

class C{
	 

}

  public class R extends C{

	public void Test(R r) {
		System.out.println("R");
   }
	
  public void Test(C c) {
		
 }

 public static void main(String[] args) {
	 
	 R c = new R();
	 c.Test(c);
	 c.Test(null);
 }
 
}


