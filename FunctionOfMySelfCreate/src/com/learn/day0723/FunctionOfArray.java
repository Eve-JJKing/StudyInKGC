package com.learn.day0723;
/**
 * 数组求和、求最大值、求最小值的方法
 * @author Administrator
 *
 */
public class FunctionOfArray {
	public static void main(String[] args) {
		
		int[] nums = {1,3,4,5,7,6,4};
		
		FunctionOfArray test = new FunctionOfArray();
		test.MaxAndMinOfArray(nums);
		test.sumOfArray(nums);
		test.avgOfArray(nums);
	}
	
	/**
	 * 获得数组中的最大值和最小值
	 * @param arr
	 */
	public void MaxAndMinOfArray(int[] arr){
		int min = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i==0){
				min = arr[0];
				max = arr[0];
			}else{
				if (arr[i] > max) {
					max = arr[i];
				}else if(arr[i] < min){
					min = arr[i];
				}
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
	
	/**
	 * 获得数组中所有元素的总和
	 * @param arr
	 */
	public void sumOfArray(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
	}
	
	/**
	 * 获得数组中所有元素的平均值
	 * @param arr
	 */
	public void avgOfArray(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Avg: " + sum/arr.length);
	}
}
