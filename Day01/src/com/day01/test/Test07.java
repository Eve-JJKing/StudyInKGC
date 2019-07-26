package com.day01.test;
/**
 * 如何用*打印矩形图案，使用二重循环实现
	 ******
	 ******
	 ******
	 ******
 * @author jjking
 *
 */
public class Test07 {
	public static void main(String[] args) {
//		System.out.println("----------");
		for (int i = 0; i <4; i++) {
			
			for (int j = 0; j <6; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
