package com.learn.day0723;
/**
 * ������͡������ֵ������Сֵ�ķ���
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
	 * ��������е����ֵ����Сֵ
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
	 * �������������Ԫ�ص��ܺ�
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
	 * �������������Ԫ�ص�ƽ��ֵ
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
