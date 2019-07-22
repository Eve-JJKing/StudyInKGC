package com.day01.test;
import java.util.Scanner;

/**
 * （for 循环）读入一个小于 10 的整数 n，输出它的阶乘 n!
 * @author jjking
 *
 */
public class Test09{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个小于10 的数字：");
		int num=scanner.nextInt();
		int i;
		int total=1;
		for(i=1;i<=num;i++){
			total=total*i;
//			System.out.println(total);
		}
		System.out.println(total);
	}
}
