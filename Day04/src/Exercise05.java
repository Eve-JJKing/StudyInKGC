import java.util.Scanner;

/**
 * 使用switch方法来实现以下功能
 * 百分制成绩，90分及以上的笔记本一台，80分及以上的手机一部，60分及以上的Aj一双，60分以下的来一巴掌
 * @author jjking
 */
public class Exercise05 {
	public static void main(String[] args) {
//		//生成case0-case100
//		for (int i = 0; i < 101; i++) {
//			System.out.println("case "+i+":");
//		}
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		/**
		 * 蛮力法
		 */
		switch (num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50:
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
			System.out.println("一巴掌");
			break;
		case 60:
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
			System.out.println("Aj");
			break;
		case 80:
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
			System.out.println("手机");
			break;
		case 90:
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
			System.out.println("笔记本");
			break;
		default:
			System.out.println("这成绩不对！");
			break;
		}
		
		/**
		 * 数字对10取整法
		 */
		int score = num/10;
		if (num>=0&&num<=100) {
			switch (score) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("一巴掌");
				break;
			case 6:
			case 7:
				System.out.println("Aj");
				break;
			case 8:
				System.out.println("手机");
				break;
			case 9:
			case 10:
				System.out.println("笔记本");
				break;
			default:
				break;
			}
		}else {
			System.out.println("这成绩不对呀！");
		}
		
	}
	
	
	
}
