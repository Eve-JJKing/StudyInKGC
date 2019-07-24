import java.util.Arrays;


public class Exercise05 {
	public static void main(String[] args) {
		String strs[] = new String[]{"c","b","a","d","e"};
		Arrays.sort(strs);
		
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println("");
		for (int i = (strs.length-1); i >= 0; i--) {
			System.out.print(strs[i] + " ");
		}
		System.out.println("");
		for (String string : strs) {
			System.out.print(string);
		}
		
	}
}
