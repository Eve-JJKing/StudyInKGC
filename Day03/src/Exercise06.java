import java.util.Scanner;

/**
 * if-else if-else��ϰ
 * 
 * ��Ŀ������
 * 		�������500w���Ͽ������Ļ������򷿣��������200w��500w֮��������Ļ����廷�򷿣����
 * ����100w��200w��������廷���򷿣������10000��100w֮������ⷿס�������1w����������ֻ��
 * ¶�޽�ͷ��...
 * @author jjking
 *
 */
public class Exercise06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		
		if (money>=5000000) {
			System.out.println("�Ļ������򷿣�");
		}else if (money >= 2000000) {
			System.out.println("�Ļ����廷");
		}else if (money >= 1000000) {
			System.out.println("�廷��");
		}else if (money >= 10000) {
			System.out.println("�ⷿ");
		}else {
			System.out.println("¶�޽�ͷ");
		}
	}
}
