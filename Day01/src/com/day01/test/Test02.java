package com.day01.test;
/**
 * ʹ��whileѭ��ʵ��1+2+3+...+100�ĺ�
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
