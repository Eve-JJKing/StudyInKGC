package com.day01.test;
/**
 * 使用while循环实现1+2+3+...+100的和
 * @author jjking
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while (i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
