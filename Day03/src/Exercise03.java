import java.util.Scanner;

/**
 * ������
 * @author jjking
 *
 */
public class Exercise03 {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a num of 5 wei:");
		
		int num  = scanner.nextInt();
		int wan  = num/10000;
		int qian = num%10000/1000;
		int shi  = num%100/10;
		int ge   = num%10;
		
		if(wan==ge&&qian==shi){
			System.out.println(num+"���Ǹ�������");
		}
		else {
			System.out.println("�ⲻ�ǻ�����");
		}
		
		for (int j = 10000; j < 100000; j++) {
			Exercise03 exercise03 = new Exercise03();
			exercise03.func(j);
		}
		
		System.out.println(count);
	}
	
	
	/**
	 * ��ӡ����������
	 * @param a
	 */
	public void func(int a) {
		
		int wan = a/10000;
		int qian = a%10000/1000;
		int shi = a%100/10;
		int ge = a%10;
		
		if(wan==ge&&qian==shi){
			System.out.println(a+"���Ǹ�������");
			count++;
		}
	}
}
