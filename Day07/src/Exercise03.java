import java.util.Arrays;


public class Exercise03 {
	public static void main(String[] args) {
		//声明	两种方式：
		//数据类型[] 数组名;
		//数据类型    数组名[];
		int[] arr;
		String names[];
		//开辟空间
		arr = new int[20];
		names = new String[3];
		//赋值
		arr[0] = 23;
		names[2] = "你好！";
		//使用
		System.out.println(arr[0]);
		System.out.println(names[2]);
		
		//高级用法
		int[] nums = new int[]{1,7,3,4,5,6};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n***************************");
		for (int i = (nums.length-1); i >= 0; i--) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("\n***************************");
		for(int i:nums){
			System.out.print(i+" ");
		}
	}
}
