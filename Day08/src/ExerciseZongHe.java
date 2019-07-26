import java.util.Scanner;


public class ExerciseZongHe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = {8,3,15};
		boolean flag = true;
		System.out.println("功能开始");
		//选择排序
		ExerciseZongHe ex = new ExerciseZongHe();
		ex.sort(nums);
		do {
			System.out.print("数组的值为：");
			//打印数组元素
			for (int i : nums) {
				System.out.print(i + " ");
			}
			
			System.out.println("\n请输入数字：");
			int num = input.nextInt();
			
			/**
			 * 定义一个新的数组，数组长度就等于初始数组长度加1
			 * 将输入的数字添加到新数组的最后一个位置
			 * 前面的元素和初始数组的元素保持一致 
			 */
			int[] nums2 = new int[nums.length+1];
			for (int i = 0; i < nums2.length; i++) {
				if(i == nums2.length-1){
					nums2[nums2.length-1]=num; 
				}else{
					nums2[i]=nums[i];
				}
				
			}
			
			ex.sort(nums2);
			//输出
			System.out.print("数组的值为：");
			for (int i : nums2) {
				System.out.print(i + " ");
			}
			
			
			System.out.println("\n是否继续？(y/n)");
			String answer = input.next();
			if(answer.equals("n")){
				System.out.println("程序结束，谢谢使用!");
				flag = false;
				break;
			} 

			nums = nums2;
			
		} while (flag);
	}
	
	//选择排序
	public void sort(int[] nums){
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
	}
	
	
}
