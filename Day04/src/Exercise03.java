
import java.util.Scanner;

/**
 * switch 具由贯穿性，必须手动停止，break；
 * case 后面的值不能相同，否则会报错
 * 只能判断  int 和   char 类型的数据
 * 只能用来比较值
 * @author jjking
 *
 */
public class Exercise03 {
	public static void main(String[] args) {
		int a = 1;
		switch (a) {
		case 1:
			System.out.println("1");
			break;
		default:
			break;
		}
		
//		String name = "我爱你";
//		switch (name) {
//		case "我爱你":
//			System.out.println("我爱你");
//			break;
//		default:
//			break;
//		}
		
		int rank = 1;
		switch (rank) {
		case 1:
			System.out.println("电脑");
			break;
		case 2:
			System.out.println("手机");
			break;
		case 3:
			System.out.println("Aj");
			break;
		default:
			System.out.println("一巴掌");
			break;
		}
		System.out.println();
		
		
		//使用switch方法判断每个月的天数
		/**
		 * 最原始、最正常的结构
		 */
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println(month+"月份31天");
			break;
		case 2:
			System.out.println(month+"月份28天");
			break;
		case 3:
			System.out.println(month+"月份31天");
			break;
		case 4:
			System.out.println(month+"月份30天");
			break;
		case 5:
			System.out.println(month+"月份31天");
			break;
		case 6:
			System.out.println(month+"月份30天");
			break;
		case 7:
			System.out.println(month+"月份31天");
			break;
		case 8:
			System.out.println(month+"月份31天");
			break;
		case 9:
			System.out.println(month+"月份30天");
			break;
		case 10:
			System.out.println(month+"月份31天");
			break;
		case 11:
			System.out.println(month+"月份30天");
			break;
		case 12:
			System.out.println(month+"月份31天");
			break;
		default:
			System.out.println("没有这个月");
			break;
		}
		
		/**
		 * 充分利用case的贯穿性。优化后的结构
		 */
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"月份31天");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"月份30天");
			break;
			
		case 2:
			System.out.println(month+"月份28天");
			break;
		default:
			System.out.println("没有这个月");
			break;
		}
		
	}
}
