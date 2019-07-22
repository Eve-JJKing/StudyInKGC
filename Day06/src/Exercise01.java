import java.util.*;
/**
 *	随意在控制台输入n个成绩
 *	输入结束后显示一共有多少人，80分以上的成绩一共有多少人。
 * @author Administrator
 *
 */
public class Exercise01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score;
		int count = 0;
		int sum=0;
		String judge="y";
	
		/*
		boolean flag=true;
		int[] scores = new int[50];
		
		while(flag==true){
			 System.out.println("请输入第"+(sum+1)+"个人成绩：");
			 score = input.nextInt();
//			 System.out.println(scores.length);
			 
			 scores[sum]=score;
			 if (score>80) {
				 count++;
			}
			 
			 System.out.println("是否继续输入（y/n）:");
			 
			 judge = input.next();
			 if (judge.equals("n")) {
				flag=false;
			}
			 
			 sum++;
		}*/
		
		
	    while(judge.equals("y") || judge.equals("Y")){
			 System.out.println("请输入第"+(sum+1)+"个人成绩：");
			 score = input.nextInt();
			 if (score>80) {
				 count++;
			}
			 System.out.println("是否继续输入（y/n）:");
			 judge = input.next();
			 sum++;
		}
		
		System.out.println("一共有："+sum+"人");
		/*System.out.print("第1个人到第"+sum+"个人的成绩分别为：");
		for (int i : scores) {
			if(i!=0){
				System.out.print(i+" ");
			}
		}*/
		System.out.println("\n80分以上的有："+count+"人");
	}
	
	
}
