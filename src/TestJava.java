import java.util.HashSet;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add("Ritesh");
		set.add("Raj");
		set.add("Singh");
		
		HashSet set1 = new HashSet();
		set1.add("Kumar");
		set1.add("Raj");
		
		set.retainAll(set1);
		
		System.out.println(set);
	}

}
