import java.util.Scanner;

/**
 * if-else if-else练习
 * 
 * 题目描述：
 * 		如果你有500w以上可以在四环以内买房，如果你有200w到500w之间可以在四环到五环买房，如果
 * 你有100w到200w你可以在五环外买房，如果有10000到100w之间可以租房住，如果连1w都不到那你只能
 * 露宿街头了...
 * @author jjking
 *
 */
public class Exercise06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		
		if (money>=5000000) {
			System.out.println("四环以内买房！");
		}else if (money >= 2000000) {
			System.out.println("四环到五环");
		}else if (money >= 1000000) {
			System.out.println("五环外");
		}else if (money >= 10000) {
			System.out.println("租房");
		}else {
			System.out.println("露宿街头");
		}
	}
}
