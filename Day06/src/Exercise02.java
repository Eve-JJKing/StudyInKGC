import java.util.Scanner;

/**
 * ��ѭ����
 * 		�ж�ʲô���Ľ�����ʲô��������
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
		System.out.println("**********************");
		System.out.println("1. ����");
		System.out.println("2. ��Ǯ");
		System.out.println("3. ȡǮ");
		System.out.println("4. ��ѯ");
		System.out.println("5. �˳�");
		System.out.println("**********************");
		int choice = input.nextInt();
		if (choice==1) {
			System.out.println("�����ɹ�");
			int num = (int)(Math.random()*899999+100000);
			System.out.println("���Ŀ��ţ�"+num);
		}else if (choice == 2) {
			System.out.println("�������Ǯ����Ŀ");
		}else if (choice == 3) {
			System.out.println("������ȡǮ��");
		}else if (choice == 4) {
			System.out.println("������Ҫ��ѯ�Ŀ���");
		}else if(choice == 5){
			System.out.println("�˳�");
			break;
		}else{
			System.out.println("����������ֲ���ȷ����������룡");
			continue;
		}
		//while������ѭ����ʱ���ǲ����Ժ�switch���õģ���Ϊ��switch��break�ʹ�����switch���Ľ���
		//��������������while����
		/*switch(choice){
		case 1:
			System.out.println("����");
			break;
		case 5:
			break;
		}*/
		}
	}
}
