package collection;

import java.util.HashMap;
import java.util.Map;


class Emp{
	
	private String name;

	public Emp(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}	
	
	
}

public class HashMapJava8 {

	public static void main(String[] args) {
		
		 	Map<Emp, String> map = new HashMap<>();
		 	map.put(new Emp("Ritesh"), "a");
		    map.put(new Emp("Dinesh"), "c");
		    map.put(new Emp("jack"), "b");
		    map.put(new Emp("Tom"), "z");
		    map.forEach((k,v)->System.out.println(k.getName()+" " + v));
		    //getOrDefault.
		
		    System.out.println("----------------------------");
		    

	}

}
