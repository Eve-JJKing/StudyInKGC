package com.learn.day0723;
/**
 * 选择排序
 * @author Administrator
 *
 */
public class SortNums {
	public static void main(String[] args) {
		int[] nums = {3,1,2,5,4};
		
		int min = -1;
		//外层控制循环次数
		for (int i = 0; i < nums.length-1; i++) {
			min = i;
			//内层：当前元素和后面元素比较，记录最新的最小下标元素
			for (int j = i+1; j < nums.length; j++) {
				if (nums[min]>nums[j]) {	//如果是降序就将大于号改成小于号
					min = j;
				}
			}
			
			//如果min值发生变化，说明发现了最小值，进行置换
			if(min!=i){
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
			}
		}
		
		//输出
		for (int i : nums) {
			System.out.println(i);
		}
		
	}
}
