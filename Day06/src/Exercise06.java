/**
 * for循环
 * 特点：语法简单，使用频次高，适用于循环次数固定的循环场合
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
	
	//1-100奇数之和
	public void oddNumberSumOfOneToOneHundred(){
		int sum = 0;
		for (int i = 1; i < 100; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//1-100之间3整除和3不整除的和
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
		System.out.println("100以内3整除的和："+sum1);
		System.out.println("100以内3不能整除的和："+sum2);
	}
	
	//鸡兔同笼
	public void henAndRubbitInOneCage(){
		int hen;
		for(hen=0;hen<=35;hen++){
			if(hen*2+(35-hen)*4==94){
				System.out.println("小鸡："+hen);
				System.out.println("小兔："+(35-hen));
			}
		}
	}
	
	//斐波那契数列
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
	
	//逢七过
	public void jumpNumberOfSeven(){
		for (int i = 1; i < 100; i++) {
			if(i%7==0 || i/10==7 || i/7 == 10){
				System.out.print("过"+" ");
			}else{
				System.out.print(i+" ");
			}
		}
	}
	
	//判断质数
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
