package com.learn.day0724;
/**
 * 冒泡排序
 * 		外层N-1，内层N-1-i
 * @author Administrator
 *
 */
public class SortOfPop {
	public static void main(String[] args) {
		int[] nums = {1,4,3,6,5,2,8};
		//外层循环 	N-1次	（N数组长度）
		for (int i = 0; i < nums.length-1; i++) {
			//内层循环	N-1-i次
			for (int j = 0; j < nums.length-1-i; j++) {
				//
				if(nums[j]>nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		for (int i : nums) {
			System.out.println(i);
		}
	}
}
