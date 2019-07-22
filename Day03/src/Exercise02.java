import java.util.Scanner;

/**
 * 分离四位数的各个位
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
		System.out.println("千位："+qian);
		System.out.println("百位："+bai);
		System.out.println("十位："+shi);
		System.out.println("个位："+ge);
	}
}
