package com.day01.test;
/**
 * ¥Ú”°æ≈æ≈≥À∑®±Ì
 * @author jjking
 *
 */
public class Test08 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println("");
		}
	}
}
