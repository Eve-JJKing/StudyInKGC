package com.day01.test;
import java.util.Random;
import java.util.Scanner;

/**
 * 	ʵ��ע��
���������û��������룬ϵͳ����4λ�������Ϊ���š�
����ע��ɹ�����ʾע����Ϣ
 * @author jjking
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String id = scanner.next();
		System.out.println("���������룺");
		String pwd = scanner.next();
		Random random = new Random();
		int cardId = (int)random.nextInt(9999);
		System.out.println("success!");
		System.out.println("�û�����"+id+"\n���룺"+pwd+"\n���ţ�"+cardId);
	}
}
