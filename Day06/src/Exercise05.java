import java.util.Scanner;
/**
 * do-while语句练习
 * 特点：先执行，后判断。
 * @author Administrator
 *
 */

public class Exercise05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "Y";
		do {
			System.out.println("唱跳rap");
			System.out.println("是否继续？(y/n)");
			result = input.next();
		} while (result.equals("Y"));
		System.out.println("结束了！~");
	}
}
