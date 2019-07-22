package com.day01.test;
import java.util.Scanner;

/**
 * 从控制台输入一个数，该数不大于1，重新输入，如果大于1，录入输入5打印下图。
　　　 *
      ***
     *****
　　*******
　 ********* 
 * @author jjking
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp=scanner.nextInt();
		if (temp<=1) {
			System.out.println("请从新输入一个数：");
			temp=scanner.nextInt();
		}
		if(temp>1){
			System.out.println("    *     ");
			System.out.println("   ***    ");
			System.out.println("  *****   ");
			System.out.println(" *******  ");
			System.out.println("********* ");
		}
		
	}
}
