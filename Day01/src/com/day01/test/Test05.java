package com.day01.test;
import java.util.Scanner;
/**
 * �Զ���һ���������� a������һ������ n����� n �������д��ڣ������ n ���±ꣻ��� 
	�����ڣ������-1���ٰ��������������Ԫ�ؽ����������
 * @author jjking
 *
 */
public class Test05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] nums = {1,2,3,4,9,6};
		int num = input.nextInt();
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				index = i;
			}
		}
		System.out.println(index);
		
		for (int i = nums.length-1; i >=0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
	
	
	/*
	 * public static int[] sort(int[] a) {
		int temp,i,j;
		for (i = 0; i < a.length; i++) {
			for (j = i; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		boolean flag=false;
		
		int[] a = {7,2,3,5,6};
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if (temp==a[i]) {
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("-1");
		}else {
			for (int i = 0; i < a.length; i++) {
				if (temp==a[i]) {
					System.out.println(i);
					break;
				}
			}
		}
		
		@SuppressWarnings("unused")
		Test05 t = new Test05();
		Test05.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	*/
	
	
	
}
