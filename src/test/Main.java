package test;

public class Main {
	
	public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = new Integer(i); 
	      i = j; 
	      j = temp; 
	   } 

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		System.out.println("i=="+i+" j=="+j);
		swap(10,20);
		System.out.println("i=="+i+" j=="+j);
	}

}

class AA {
	int i;
	
	public AA(int i) {
		super();
		this.i = i;
	}
}
