/**
 * �ڲ���ֵ�������
 * 		boolean Ĭ����  	false
 * 		int 	Ĭ����     	0
 * 		String  Ĭ����  	null
 * 		double  Ĭ����  	0.0
 * 		char	Ĭ����	��		
 * 		byte	Ĭ���� 	0
 * 		long	Ĭ����	0
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
