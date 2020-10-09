package java8;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalJavaValue {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(); 
       
        al.add(null);
        
        for(Integer i :al) {
        	Optional<Integer> op = Optional.ofNullable(i);
        	if(op.isPresent()) {
        		String str = i.toString();
        		System.out.println(str);
        	}
        	
        }
        
        
        Integer value1 = null;
        Integer value2 = new Integer(10);
        
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value1);
        value1 = a.orElse(new Integer(0));
	}
}
