import java.util.Scanner;
/**
 * break ��continue ���̿������
 * break����:����ѭ����ֱ��ѭ�����������
 * continue���ܣ���������ѭ�������´�ѭ��
 * @author Administrator
 *
 */

public class Exercise03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i <=5){
			i++;
			int num = input.nextInt();
			if(num!=5){
				System.out.println("����");
				continue;
			}
			System.out.println("YES!");
			break;
		}
	}
}
