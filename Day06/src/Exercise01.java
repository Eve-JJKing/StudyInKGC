import java.util.*;
/**
 *	�����ڿ���̨����n���ɼ�
 *	�����������ʾһ���ж����ˣ�80�����ϵĳɼ�һ���ж����ˡ�
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
			 System.out.println("�������"+(sum+1)+"���˳ɼ���");
			 score = input.nextInt();
//			 System.out.println(scores.length);
			 
			 scores[sum]=score;
			 if (score>80) {
				 count++;
			}
			 
			 System.out.println("�Ƿ�������루y/n��:");
			 
			 judge = input.next();
			 if (judge.equals("n")) {
				flag=false;
			}
			 
			 sum++;
		}*/
		
		
	    while(judge.equals("y") || judge.equals("Y")){
			 System.out.println("�������"+(sum+1)+"���˳ɼ���");
			 score = input.nextInt();
			 if (score>80) {
				 count++;
			}
			 System.out.println("�Ƿ�������루y/n��:");
			 judge = input.next();
			 sum++;
		}
		
		System.out.println("һ���У�"+sum+"��");
		/*System.out.print("��1���˵���"+sum+"���˵ĳɼ��ֱ�Ϊ��");
		for (int i : scores) {
			if(i!=0){
				System.out.print(i+" ");
			}
		}*/
		System.out.println("\n80�����ϵ��У�"+count+"��");
	}
	
	
}
