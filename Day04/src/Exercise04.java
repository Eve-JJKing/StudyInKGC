import java.util.Scanner;
/**
 * ʹ��while ��if �����ʵ�ֲ���·ݵ�����
 * @author jjking
 *
 */
public class Exercise04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
			int month = scanner.nextInt();
			int small = 28;
			int middle = 30;
			int big = 31;
			String leftString = "�·���";
			String rightString = "��";
			
			if (month >= 1 && month <=12) {
				if (month == 4 || month == 6 || month ==9 || month == 11 ) {
					System.out.println(month+leftString+middle+rightString);
				}else if (month == 2) {
					System.out.println(month+leftString+small+rightString);
				}else {
					System.out.println(month+leftString+big+rightString);
				}
			}else {
				break;
			}
		}
		
	}
}
