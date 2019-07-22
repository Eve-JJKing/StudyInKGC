import java.util.Scanner;

/**
 * 死循环：
 * 		判断什么样的节日买什么样的礼物
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
		System.out.println("**********************");
		System.out.println("1. 开户");
		System.out.println("2. 存钱");
		System.out.println("3. 取钱");
		System.out.println("4. 查询");
		System.out.println("5. 退出");
		System.out.println("**********************");
		int choice = input.nextInt();
		if (choice==1) {
			System.out.println("开户成功");
			int num = (int)(Math.random()*899999+100000);
			System.out.println("您的卡号："+num);
		}else if (choice == 2) {
			System.out.println("请输入存钱的数目");
		}else if (choice == 3) {
			System.out.println("请输入取钱数");
		}else if (choice == 4) {
			System.out.println("请输入要查询的卡号");
		}else if(choice == 5){
			System.out.println("退出");
			break;
		}else{
			System.out.println("您输入的数字不正确，请从新输入！");
			continue;
		}
		//while是无限循环的时候是不可以和switch连用的，因为在switch中break就代表了switch语句的结束
		//不能作用在外层的while中了
		/*switch(choice){
		case 1:
			System.out.println("开户");
			break;
		case 5:
			break;
		}*/
		}
	}
}
