package com.learn.day0724;
/**
 * ð������
 * 		���N-1���ڲ�N-1-i
 * @author Administrator
 *
 */
public class SortOfPop {
	public static void main(String[] args) {
		int[] nums = {1,4,3,6,5,2,8};
		//���ѭ�� 	N-1��	��N���鳤�ȣ�
		for (int i = 0; i < nums.length-1; i++) {
			//�ڲ�ѭ��	N-1-i��
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
