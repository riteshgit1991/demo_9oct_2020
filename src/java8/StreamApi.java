package java8;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList();
		
		String val = list.stream().findFirst().orElseGet(()->"No");
	
		System.out.println(val);
	}
}
