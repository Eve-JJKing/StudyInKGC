import java.util.Arrays;
import java.util.Scanner;

/**
 * 任意的一个数组
 * 输出最大值、最小值、平均值、所有元素的总和
 * @author Administrator
 */

public class Exercise04 {
	public static void main(String[] args) {
		//现阶段初级方法	 2019年7月23日16:44:50
		Scanner input = new Scanner(System.in);
		System.out.println("准备创建数组...");
		System.out.println("开始创建数组！");
		System.out.println("请输入要建立的数组长度：");
		int length = input.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("请输入第"+(i+1)+"个元素");
			nums[i] = input.nextInt();
		}
		System.out.println("数组创建过程中.....");
		System.out.println("数组创建完成");
		int sum=0;
		int avg=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		Arrays.sort(nums);
		avg = sum/nums.length;
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + avg);
		System.out.println("Max: " + nums[nums.length-1]);
		System.out.println("Min: " + nums[0]);
		
		//中级方法
		System.out.println("****************************");
		Exercise04 ex = new Exercise04();
		ex.minAndMax(nums);
		ex.sumOfArray(nums);
		ex.avgOfArray(nums);
	}
	
	/**
	 * 求数组中的最大值和最小值
	 * @param a
	 */
	public void minAndMax(int[] a){
		int min=0;
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(i==0){
				min=a[0];
				max=a[0];
			}else{
				if(a[i] > max){
					max = a[i];
				}else if(a[i] < min){
					min = a[i];
				}
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
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
