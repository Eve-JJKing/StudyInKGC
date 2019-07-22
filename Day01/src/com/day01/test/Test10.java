package com.day01.test;
/**
 * 如果一个数等于其所有因子之和,我们就称这个数为"完数",例如 6 的因子为 
	1,2,3 6=1+2+3 6 就是一个完数.请编程打印出 1000 以内所有的完数
 * @author jjking
 *
 */
public class Test10 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int c=1;
		int a=1;
		int index=0;
		while(c<=6){
			
			for (int i = 1; i < c; i++) {
				
				if(c%i==0){
					int[] b = new int[c];
					b[index]=i;
					System.out.println("i="+i);
					index++;
					System.out.println("index="+index);
					for (int j = 0; j < b.length; j++) {
						sum+=b[j];
					}
				}
				
				
			}
			
			
			if(sum==a){
				System.out.println(a);
			}
			
			c++;
			
		}
	}
}
