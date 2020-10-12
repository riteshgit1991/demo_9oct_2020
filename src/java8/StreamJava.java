package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		List<String> filterStrings = strings.stream().skip(3).filter((s)->!s.isEmpty()).collect(Collectors.toList());
		
		filterStrings.forEach((s)->System.out.println(s));
		
		
		
		//getCount of empty String
		
		long count = strings.stream().filter((s)->s.isEmpty()).count();
		System.out.println(count);
		
		//getCountlenght 3 of String

		long countlen = strings.stream().filter((s)->!s.isEmpty() && s.length()==3).count();
		System.out.println(countlen);
		System.out.println(countlen);
		
		
		//deleteEmptyStringsUsingJava7
		
		////Eliminate empty string and join using comma.
		
		
		
		
	}

}
