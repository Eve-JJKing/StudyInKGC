package com.day01.test;
/**
 * ���һ������������������֮��,���Ǿͳ������Ϊ"����",���� 6 ������Ϊ 
	1,2,3 6=1+2+3 6 ����һ������.���̴�ӡ�� 1000 �������е�����
 * @author jjking
 *
 */
public class Test10 {
	
	public static void main(String[] args) {
		/*
		 * ѧϰ����
		 */
		for (int i = 1; i < 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int i = 1;
		while(i<=1000){
			
			int[] cunshu = new int[i];
			int index = 0;
			//�������������˵����������������浽�����У����������ͼ�����һ��ѭ��
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					cunshu[index]=j;
					index++;
				}else{
					continue;
				}
			}
			
			//�������е����ּ���������Ǻͱ�������ȣ��ͽ������
			int sum = 0;
			for (int j : cunshu) {
				sum += j;
			}
			if (sum == i) {
				System.out.println(i);
			}
			
			i++;
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int sum = 0;
		int c=1;
		int a=1;
		int index=0;
		while(c<=6){
			
			for (int i = 1; i < c; i++) {
				
				if(c%i==0){
					int[] b = new int[c];
					b[index]=i;
					System.out.println("i="+i);
					index++;
					System.out.println("index="+index);
					for (int j = 0; j < b.length; j++) {
						sum+=b[j];
					}
				}
				
				
			}
			
			
			if(sum==a){
				System.out.println(a);
			}
			
			c++;
			
		}*/
	}
}
