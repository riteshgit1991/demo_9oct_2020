import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
		
		list.stream().distinct().sorted().collect(Collectors.toList());
		
		/*Integer o = list.stream().findAny().orElseGet(()->0);
		
		System.out.println(o);*/
	}

}
