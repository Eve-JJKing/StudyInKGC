package com.learn.day0723;
/**
 * ѡ������
 * @author Administrator
 *
 */
public class SortNums {
	public static void main(String[] args) {
		int[] nums = {3,1,2,5,4};
		
		int min = -1;
		//������ѭ������
		for (int i = 0; i < nums.length-1; i++) {
			min = i;
			//�ڲ㣺��ǰԪ�غͺ���Ԫ�رȽϣ���¼���µ���С�±�Ԫ��
			for (int j = i+1; j < nums.length; j++) {
				if (nums[min]>nums[j]) {	//����ǽ���ͽ����ںŸĳ�С�ں�
					min = j;
				}
			}
			
			//���minֵ�����仯��˵����������Сֵ�������û�
			if(min!=i){
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
			}
		}
		
		//���
		for (int i : nums) {
			System.out.println(i);
		}
		
	}
}
