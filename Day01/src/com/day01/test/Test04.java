package com.day01.test;
import java.util.Random;
import java.util.Scanner;

/**
 * 	实现注册
　　输入用户名和密码，系统产生4位随机数作为卡号。
　　注册成功，显示注册信息
 * @author jjking
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String id = scanner.next();
		System.out.println("请输入密码：");
		String pwd = scanner.next();
		Random random = new Random();
		int cardId = (int)random.nextInt(9999);
		System.out.println("success!");
		System.out.println("用户名："+id+"\n密码："+pwd+"\n卡号："+cardId);
	}
}
