package HomeWork;
/**
 * 猜数字小游戏
 * 生成一个1-100 之间的随机数，并在控制台输入数字，猜该数字
 * 最多猜10次，猜中后显示结果
 * 1次：大神		2-4次：天才		5-7次：凡人		8-10次：……  
 */
import java.util.Scanner;

public class GameOfGuessNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*99+1);
		System.out.println(num);
		int count=0;
		System.out.println("你猜吧！");
		for (int i = 0; i < 10; i++) {
			int guessNum = input.nextInt();
			count++;
			if(guessNum==num){
				if(count==1){
					System.out.println(count+"次就猜中了，大神！");
				}else if(count>=2 && count<=4){
					System.out.println(count+"次就猜中了，天才");
				}else if(count>=5 && count<=7){
					System.out.println(count+"次才猜中了，凡人");
				}else{
					System.out.println(count+"次才猜中，垃圾！");
				}
				break;
			}else if (guessNum>num) {
				System.out.println("大了，小点猜！");
			}else{
				System.out.println("小了，大点猜！");
			}
		}
		
	}
}
