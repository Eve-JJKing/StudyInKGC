package com.day01.test;
import java.util.Scanner;

/**
 * ��for ѭ��������һ��С�� 10 ������ n��������Ľ׳� n!
 * @author jjking
 *
 */
public class Test09{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��С��10 �����֣�");
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
