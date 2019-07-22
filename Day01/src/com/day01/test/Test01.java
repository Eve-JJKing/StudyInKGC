package com.day01.test;
import java.util.Scanner;

/**
 * 1、编写程序：由键盘输入给出一个百分制成绩，要求输出成绩等级’A’、’B’、’C’和’D’，
 * 90分以上为’A’，75~89为’B’，60~74为’C’，60分以下为’D’。
 * @author jjking
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score>=90 && score<=100) {
			System.out.println("A");
		}else if (score>=75 && score<=89) {
			System.out.println("B");
		}else if (score>=60 && score<=74) {
			System.out.println("C");
		}else if (score<60 && score>=0) {
			System.out.println("D");
		}else{
			System.out.println("很显然，这成绩是假滴！");
		}
	}
}
