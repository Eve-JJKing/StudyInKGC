/**
 *
 * ���ܣ�
 * ���ߣ�jjking 
 * ʱ�䣺2019-7-18
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		
		int math = (int)(Math.random()*100);
		System.out.println(math);
		int chinese = 100;
		if (math >= 90 && chinese >= 90) {
			System.out.println("���ƶ���90�ˣ������㣡");
		}else {
			System.out.println("������һ�Ʋ���90��һ���ƣ�");
		}
		
		if (math >= 90 || chinese >= 90) {
			System.out.println("��һ�ƹ�90�ͽ�����");
		}else {
			System.out.println("һ�ƹ�90�Ķ�û�У���һ���ƣ�");
		}
		
		
		
		//����һ����λ���Ŀ���
		int cardId = (int)(Math.random()*8999)+1000;
		System.out.println(cardId);
	}
}
