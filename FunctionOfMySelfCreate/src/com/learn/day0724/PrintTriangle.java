package com.learn.day0724;

import java.util.Scanner;

/**
 * 打印三角形
 * @author Administrator
 *
 */
public class PrintTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		for (int i = 0; i < row; i++) {	//外层控制行数
			
			for (int j = i; j < row-1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
