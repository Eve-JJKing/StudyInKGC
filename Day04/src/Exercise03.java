
import java.util.Scanner;

/**
 * switch ���ɹᴩ�ԣ������ֶ�ֹͣ��break��
 * case �����ֵ������ͬ������ᱨ��
 * ֻ���ж�  int ��   char ���͵�����
 * ֻ�������Ƚ�ֵ
 * @author jjking
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
		case 1:
			System.out.println("1");
			break;
		default:
			break;
		}
		
//		String name = "�Ұ���";
//		switch (name) {
//		case "�Ұ���":
//			System.out.println("�Ұ���");
//			break;
//		default:
//			break;
//		}
		
		int rank = 1;
		switch (rank) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("�ֻ�");
			break;
		case 3:
			System.out.println("Aj");
			break;
		default:
			System.out.println("һ����");
			break;
		}
		System.out.println();
		
		
		//ʹ��switch�����ж�ÿ���µ�����
		/**
		 * ��ԭʼ���������Ľṹ
		 */
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println(month+"�·�31��");
			break;
		case 2:
			System.out.println(month+"�·�28��");
			break;
		case 3:
			System.out.println(month+"�·�31��");
			break;
		case 4:
			System.out.println(month+"�·�30��");
			break;
		case 5:
			System.out.println(month+"�·�31��");
			break;
		case 6:
			System.out.println(month+"�·�30��");
			break;
		case 7:
			System.out.println(month+"�·�31��");
			break;
		case 8:
			System.out.println(month+"�·�31��");
			break;
		case 9:
			System.out.println(month+"�·�30��");
			break;
		case 10:
			System.out.println(month+"�·�31��");
			break;
		case 11:
			System.out.println(month+"�·�30��");
			break;
		case 12:
			System.out.println(month+"�·�31��");
			break;
		default:
			System.out.println("û�������");
			break;
		}
		
		/**
		 * �������case�Ĺᴩ�ԡ��Ż���Ľṹ
		 */
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"�·�31��");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"�·�30��");
			break;
			
		case 2:
			System.out.println(month+"�·�28��");
			break;
		default:
			System.out.println("û�������");
			break;
		}
		
	}
}
