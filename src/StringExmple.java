
public class StringExmple {

	public static void main(String[] args) {
		
		//How do you remove all white spaces from a string in java
		//Method1
		String str = "India Is My Country";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		//method2
		String[] strarr = str.split("\\s");
		int i=0;
		String strWithoutSpace=null;
		for(String s:strarr) {
			if(i==0) {
				strWithoutSpace = s;
			}else {
				strWithoutSpace = strWithoutSpace+s;
			}
			i++;
		}
		System.out.println(strWithoutSpace);
		
		//Write a java program to reverse a given string with preserving the position of spaces		
		String[] strarr1 = str.split("\\s");
		String finalString = "";
		StringBuilder sb = new StringBuilder();
		for(String s:strarr1) {
			sb.append(s);
			sb.reverse();
			finalString = finalString+sb.toString()+" ";
		}
		System.out.println(finalString);
	}
}
