package com.day01.test;
import java.util.Scanner;

/**
 * 1����д�����ɼ����������һ���ٷ��Ƴɼ���Ҫ������ɼ��ȼ���A������B������C���͡�D����
 * 90������Ϊ��A����75~89Ϊ��B����60~74Ϊ��C����60������Ϊ��D����
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
			System.out.println("����Ȼ����ɼ��ǼٵΣ�");
		}
	}
}
