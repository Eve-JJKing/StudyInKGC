import java.util.Scanner;

/**
 * 嵌套if练习
 * 每周一次的大扫除开始了， 老师对同学们做了如下安排：
 * 一米七以上的男生挑水，一米七以上的女生擦玻璃，一米七以下的男生墩地，一米七以下的女生擦桌子
 * 请按照要求编写一个程序来分配班级人员的工作分组
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
			if (sex.equals("男")) {
				System.out.println("一米七以上的男的去挑水吧");
			}else{
				System.out.println("一米七以上的女的去擦玻璃吧");
			}
		}else {
			if (sex.equals("男")) {
				System.out.println("一米七以下的男的去墩地吧");
			}else{
				System.out.println("一米七以下的女的去擦桌子吧");
			}
		}
	}
}
