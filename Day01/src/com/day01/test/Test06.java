package com.day01.test;


/**
 * 使用除冒泡之外的第二种算法对数组进行排序
 * @author jjking
 *
 */

public class Test06 {
	public static void main(String[] args) {
		int[] a={4,3,2,6,7};
		int min=-1;
		for (int i = 0; i < a.length-1; i++) {
			min=i;
			for (int j = i; j < a.length; j++) {
				if(a[i]>a[j]){
					min=j;
				}
			}
			if (min!=i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
	
}
