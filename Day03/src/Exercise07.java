import java.util.Scanner;

/**
 * Ƕ��if��ϰ
 * ÿ��һ�εĴ�ɨ����ʼ�ˣ� ��ʦ��ͬѧ���������°��ţ�
 * һ�������ϵ�������ˮ��һ�������ϵ�Ů����������һ�������µ������յأ�һ�������µ�Ů��������
 * �밴��Ҫ���дһ������������༶��Ա�Ĺ�������
 * @author jjking
 *
 */
public class Exercise07 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("please input height:");
		int height = in.nextInt();
		System.out.println("please input sex:");
		String sex = in.next();
		
		if (height>=170) {
			if (sex.equals("��")) {
				System.out.println("һ�������ϵ��е�ȥ��ˮ��");
			}else{
				System.out.println("һ�������ϵ�Ů��ȥ��������");
			}
		}else {
			if (sex.equals("��")) {
				System.out.println("һ�������µ��е�ȥ�յذ�");
			}else{
				System.out.println("һ�������µ�Ů��ȥ�����Ӱ�");
			}
		}
	}
}
