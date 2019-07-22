package com.learn.day0722;

import java.util.*;
public class JudgePrimeNumber {

	/**
	 * 判断质数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i = 2;
		int count = 0;
		
		while(i<num){
			if(num%i==0){
				count++;
			}
			if(count>0){
				System.out.println("不是质数");
				break;
			}
			i++;
		}
		
		if(count==0){
			System.out.println("是质数");
		}
	}

}
