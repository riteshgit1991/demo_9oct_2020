package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addable a1 = (a,b)->(a+b);
		passLambdaAsArgs((a,b)->(a+b));
		//System.out.println(a1.add(2, 4));
		List<Integer> list = Arrays.asList(1,2,3);
		Consumer<Integer> consumer = (n)->System.out.println(n);
		list.forEach(consumer);	
	}
	
	public static void passLambdaAsArgs(Addable a1) {
		System.out.println(a1.add(2, 5));
	}
}
