package com.day01.test;
import java.util.Scanner;

/**
 * �ӿ���̨����һ����������������1���������룬�������1��¼������5��ӡ��ͼ��
������    *
      ***
     *****
����*******
�� ********* 
 * @author jjking
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp=scanner.nextInt();
		if (temp<=1) {
			System.out.println("���������һ������");
			temp=scanner.nextInt();
		}
		if(temp>1){
			for (int i = 0; i < temp; i++) {
				for (int j = 0; j < temp-i-1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <2*i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}
