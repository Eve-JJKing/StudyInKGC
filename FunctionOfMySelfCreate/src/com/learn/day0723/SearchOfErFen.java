package com.learn.day0723;
/**
 * ���ֲ��ҷ�
 * @author Administrator
 *
 */
public class SearchOfErFen {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};//��������
		int searchNum = 34;			//Ҫ���ҵ�����
		int startIndex = 0;			//��С���±�
		int endIndex = a.length-1;	//�����±�
		int midIndex = -1;			//�м��±�
		boolean isFind = false;		//�Ƿ��ҵ�
		int count = 0;				//������
		
		do {
			count++;
			midIndex = (startIndex + endIndex)/2;	
			int temp = a[midIndex];
			if(temp == searchNum){
				System.out.println("�ҵ��ˣ����ڵ�" + midIndex +"λ");
				isFind = true;
				break;
			}else if(temp > searchNum){
				endIndex = midIndex -1;
			}else{
				startIndex = midIndex + 1;
			}
		} while (startIndex<=endIndex);
		
		if(!isFind){
			System.out.println("û�ҵ���");
		}
		System.out.println("��ѯ������"+count);
	}
}
