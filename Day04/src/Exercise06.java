import java.util.Scanner;

/**
 * Scanner ����̨������ϰ
 * == �� .equals �ĶԱ�
 * @author jjking
 *
 */
public class Exercise06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		System.out.println(num);
//		int num2 = input.nextInt();
//		System.out.println(num2);
//		System.out.println(num==num2);
		
		String name1 = input.next();
		String name2 = input.next();
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
	
		
	}
}
