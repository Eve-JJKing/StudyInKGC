package com.learn.day0724;
/**
 * 打印平行四边形
 * @author Administrator
 *
 */
public class PrintParallelogram {
	public static void main(String[] args) {
		for(int i=0; i<6; i++){
			for (int j = i; j<5 ; j++) {
				System.out.print(" ");
			}
			System.out.println("******");
		}
	}
}
