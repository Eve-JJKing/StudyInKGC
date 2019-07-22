import java.util.Scanner;
/**
 * break 和continue 流程控制语句
 * break功能:结束循环，直行循环后面的内容
 * continue功能：结束本次循环进入下次循环
 * @author Administrator
 *
 */

public class Exercise03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i <=5){
			i++;
			int num = input.nextInt();
			if(num!=5){
				System.out.println("不对");
				continue;
			}
			System.out.println("YES!");
			break;
		}
	}
}
