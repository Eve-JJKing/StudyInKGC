import java.util.Scanner;

/**
 * ˫��ѭ��
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			System.out.println("�������" + (i+1) +"����ĳɼ�");
			for (int j = 0; j < 3; j++) {
				System.out.println("�������" + (j+1) + "���˵ĳɼ���");
				sum += input.nextInt();
			}
			System.out.println("��"+ (i+1) + "���༶��ƽ���ɼ�Ϊ��" + sum/3);
			System.out.println("**************************	");
		}
	}
}
