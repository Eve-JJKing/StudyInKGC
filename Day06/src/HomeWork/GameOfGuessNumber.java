package HomeWork;
/**
 * ������С��Ϸ
 * ����һ��1-100 ֮�������������ڿ���̨�������֣��¸�����
 * ����10�Σ����к���ʾ���
 * 1�Σ�����		2-4�Σ����		5-7�Σ�����		8-10�Σ�����  
 */
import java.util.Scanner;

public class GameOfGuessNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*99+1);
		System.out.println(num);
		int count=0;
		System.out.println("��°ɣ�");
		for (int i = 0; i < 10; i++) {
			int guessNum = input.nextInt();
			count++;
			if(guessNum==num){
				if(count==1){
					System.out.println(count+"�ξͲ����ˣ�����");
				}else if(count>=2 && count<=4){
					System.out.println(count+"�ξͲ����ˣ����");
				}else if(count>=5 && count<=7){
					System.out.println(count+"�βŲ����ˣ�����");
				}else{
					System.out.println(count+"�βŲ��У�������");
				}
				break;
			}else if (guessNum>num) {
				System.out.println("���ˣ�С��£�");
			}else{
				System.out.println("С�ˣ����£�");
			}
		}
		
	}
}
