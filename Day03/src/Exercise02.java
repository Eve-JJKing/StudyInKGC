import java.util.Scanner;

/**
 * ������λ���ĸ���λ
 * @author jjking
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
//		int qian = a/1000;	
//		int bai = a%1000/100;	
//		int shi = a%100/10;
//		int ge = a%10;
		int qian = a/1000;	
		int bai  = a/100%10;	
		int shi  = a/10%10;
		int ge   = a/1%10;
		System.out.println("ǧλ��"+qian);
		System.out.println("��λ��"+bai);
		System.out.println("ʮλ��"+shi);
		System.out.println("��λ��"+ge);
	}
}
