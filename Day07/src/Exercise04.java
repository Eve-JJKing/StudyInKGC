import java.util.Arrays;
import java.util.Scanner;

/**
 * �����һ������
 * ������ֵ����Сֵ��ƽ��ֵ������Ԫ�ص��ܺ�
 * @author Administrator
 */

public class Exercise04 {
	public static void main(String[] args) {
		//�ֽ׶γ�������	 2019��7��23��16:44:50
		Scanner input = new Scanner(System.in);
		System.out.println("׼����������...");
		System.out.println("��ʼ�������飡");
		System.out.println("������Ҫ���������鳤�ȣ�");
		int length = input.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("�������"+(i+1)+"��Ԫ��");
			nums[i] = input.nextInt();
		}
		System.out.println("���鴴��������.....");
		System.out.println("���鴴�����");
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
		
		//�м�����
		System.out.println("****************************");
		Exercise04 ex = new Exercise04();
		ex.minAndMax(nums);
		ex.sumOfArray(nums);
		ex.avgOfArray(nums);
	}
	
	/**
	 * �������е����ֵ����Сֵ
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
