package HomeWork;

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
					break;
				}else if(count>=2 && count<=4){
					System.out.println(count+"次就猜中了，天才");
					break;
				}else if(count>=5 && count<=7){
					System.out.println(count+"次才猜中了，凡人");
					break;
				}else{
					System.out.println(count+"次才猜中，垃圾！");
					break;
				}
			}
			System.out.println("再猜！");
			
		}
	}
}
