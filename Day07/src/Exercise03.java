import java.util.Arrays;


public class Exercise03 {
	public static void main(String[] args) {
		//����	���ַ�ʽ��
		//��������[] ������;
		//��������    ������[];
		int[] arr;
		String names[];
		//���ٿռ�
		arr = new int[20];
		names = new String[3];
		//��ֵ
		arr[0] = 23;
		names[2] = "��ã�";
		//ʹ��
		System.out.println(arr[0]);
		System.out.println(names[2]);
		
		//�߼��÷�
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
