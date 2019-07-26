package com.day01.exercise;
import java.util.Scanner;

public class Test01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("Hello "+number);
		int a = 10*-3;
		System.out.println(a);
		*/
		int i = 1;
		int j = i++;
		int k = 2;
		i += k+k;
		System.out.println(i);
		if(i>++j){
			i+=j;
		}
		System.out.println(i);
	}
}
