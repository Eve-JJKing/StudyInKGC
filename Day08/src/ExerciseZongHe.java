import java.util.Scanner;


public class ExerciseZongHe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = {8,3,15};
		boolean flag = true;
		System.out.println("���ܿ�ʼ");
		//ѡ������
		ExerciseZongHe ex = new ExerciseZongHe();
		ex.sort(nums);
		do {
			System.out.print("�����ֵΪ��");
			//��ӡ����Ԫ��
			for (int i : nums) {
				System.out.print(i + " ");
			}
			
			System.out.println("\n���������֣�");
			int num = input.nextInt();
			
			/**
			 * ����һ���µ����飬���鳤�Ⱦ͵��ڳ�ʼ���鳤�ȼ�1
			 * �������������ӵ�����������һ��λ��
			 * ǰ���Ԫ�غͳ�ʼ�����Ԫ�ر���һ�� 
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
			//���
			System.out.print("�����ֵΪ��");
			for (int i : nums2) {
				System.out.print(i + " ");
			}
			
			
			System.out.println("\n�Ƿ������(y/n)");
			String answer = input.next();
			if(answer.equals("n")){
				System.out.println("���������ллʹ��!");
				flag = false;
				break;
			} 

			nums = nums2;
			
		} while (flag);
	}
	
	//ѡ������
	public void sort(int[] nums){
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
	}
	
	
}
