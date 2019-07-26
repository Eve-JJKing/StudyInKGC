/**
 * 在不赋值的情况下
 * 		boolean 默认是  	false
 * 		int 	默认是     	0
 * 		String  默认是  	null
 * 		double  默认是  	0.0
 * 		char	默认是	□		
 * 		byte	默认是 	0
 * 		long	默认是	0
 * @author Administrator
 *
 */
public class Exercise01 {
	public static void main(String[] args) {
		char[] chars = new char[1];
		String[] strs = new String[1];
		int[] nums = new int[1];
		boolean[] bool = new boolean[1];
		double[] dou = new double[1];
		byte[] a = new byte[1];
		long[] lon = new long[1];
		for (long l : lon) {
			System.out.println(l);
		}
		for (byte b : a) {
			System.out.println(b);
		}
		
		
		for (char d : chars) {
			System.out.println(d);
		}
		
		for (double d : dou) {
			System.out.println(d);
		}
		
		for (boolean b : bool) {
			System.out.println(b);
		}
		
		for (int i : nums) {
			System.out.println(i);
		}
		
		for (String string : strs) {
			System.out.println(string);
		}

	}
}
