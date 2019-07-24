import java.util.Scanner;

/**
 * 双重循环
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			System.out.println("请输入第" + (i+1) +"个班的成绩");
			for (int j = 0; j < 3; j++) {
				System.out.println("请输入第" + (j+1) + "个人的成绩：");
				sum += input.nextInt();
			}
			System.out.println("第"+ (i+1) + "个班级的平均成绩为：" + sum/3);
			System.out.println("**************************	");
		}
	}
}
