package com.day01.test;
/**
 * 如果一个数等于其所有因子之和,我们就称这个数为"完数",例如 6 的因子为 
	1,2,3 6=1+2+3 6 就是一个完数.请编程打印出 1000 以内所有的完数
 * @author jjking
 *
 */
public class Test10 {
	
	public static void main(String[] args) {
		/*
		 * 学习方法
		 */
		for (int i = 1; i < 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int i = 1;
		while(i<=1000){
			
			int[] cunshu = new int[i];
			int index = 0;
			//如果可以整除就说明这个数是因数，存到数组中，不能整除就继续下一次循环
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					cunshu[index]=j;
					index++;
				}else{
					continue;
				}
			}
			
			//将数组中的数字加起来如果是和被除数相等，就进行输出
			int sum = 0;
			for (int j : cunshu) {
				sum += j;
			}
			if (sum == i) {
				System.out.println(i);
			}
			
			i++;
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int sum = 0;
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
			
		}*/
	}
}
