import java.util.Scanner;
/**
 * do-while�����ϰ
 * �ص㣺��ִ�У����жϡ�
 * @author Administrator
 *
 */

public class Exercise05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "Y";
		do {
			System.out.println("����rap");
			System.out.println("�Ƿ������(y/n)");
			result = input.next();
		} while (result.equals("Y"));
		System.out.println("�����ˣ�~");
	}
}
