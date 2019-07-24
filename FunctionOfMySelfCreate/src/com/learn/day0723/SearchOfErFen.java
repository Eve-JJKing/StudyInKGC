package com.learn.day0723;
/**
 * 二分查找法
 * @author Administrator
 *
 */
public class SearchOfErFen {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};//设置数组
		int searchNum = 34;			//要查找的数字
		int startIndex = 0;			//最小的下标
		int endIndex = a.length-1;	//最大的下标
		int midIndex = -1;			//中间下标
		boolean isFind = false;		//是否找到
		int count = 0;				//计数器
		
		do {
			count++;
			midIndex = (startIndex + endIndex)/2;	
			int temp = a[midIndex];
			if(temp == searchNum){
				System.out.println("找到了！它在第" + midIndex +"位");
				isFind = true;
				break;
			}else if(temp > searchNum){
				endIndex = midIndex -1;
			}else{
				startIndex = midIndex + 1;
			}
		} while (startIndex<=endIndex);
		
		if(!isFind){
			System.out.println("没找到！");
		}
		System.out.println("查询次数："+count);
	}
}
