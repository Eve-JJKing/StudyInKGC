/**
 * forѭ��
 * �ص㣺�﷨�򵥣�ʹ��Ƶ�θߣ�������ѭ�������̶���ѭ������
 * @author Administrator
 *
 */
public class Exercise06 {
	
	public static void main(String args[]){
		Exercise06 test = new Exercise06();
		test.oneToOneHunderd();
		System.out.println("*******************************************");
		test.oddNumberSumOfOneToOneHundred();
		System.out.println("*******************************************");
		test.threeExceptAndThreeCannotExceptOfOneToOneHundred();
		System.out.println("*******************************************");
		test.henAndRubbitInOneCage();
		System.out.println("*******************************************");
		test.fibonacci();
		System.out.println("*******************************************");
		test.jumpNumberOfSeven();
		System.out.println("\n*******************************************");
		test.judgePrime();
	}
	
	//1-100
	public void oneToOneHunderd(){
		for(int i = 1; i <= 100; i++){
			System.out.print(i+"\t");
			if(i%10==0){
				System.out.println("");
			}
		}
	}
	
	//1-100����֮��
	public void oddNumberSumOfOneToOneHundred(){
		int sum = 0;
		for (int i = 1; i < 100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//1-100֮��3������3�������ĺ�
	public void threeExceptAndThreeCannotExceptOfOneToOneHundred(){
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0){
				sum1+=i;
			}else{
				sum2+=i;
			}
		}
		System.out.println("100����3�����ĺͣ�"+sum1);
		System.out.println("100����3���������ĺͣ�"+sum2);
	}
	
	//����ͬ��
	public void henAndRubbitInOneCage(){
		int hen;
		for(hen=0;hen<=35;hen++){
			if(hen*2+(35-hen)*4==94){
				System.out.println("С����"+hen);
				System.out.println("С�ã�"+(35-hen));
			}
		}
	}
	
	//쳲���������
	public void fibonacci(){
		int num1 = 1;
		int num2 = 1;
		for(int i=1;i<=15;i++){
			System.out.println(num1);
			System.out.println(num2);
			num1 = num1+num2;
			num2 = num2+num1;
		}
	}
	
	//���߹�
	public void jumpNumberOfSeven(){
		for (int i = 1; i < 100; i++) {
			if(i%7==0 || i/10==7 || i/7 == 10){
				System.out.print("��"+" ");
			}else{
				System.out.print(i+" ");
			}
		}
	}
	
	//�ж�����
	public void judgePrime(){
		int count;
		for (int i = 2; i < 100; i++) {
			count=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
				}
				if(count!=0){
					break;
				}
			}
			if(count==0){
				System.out.print(i+" ");
			}else{
				continue;
			}
		}
	}
}
