/**
 * ����
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
			/*int data[] = null;
			data = new int[3]; //����һ������Ϊ3������
			int temp[] = null; //��������
			data[0] = 10;
			data[1] = 20;
			data[2] = 30;
			temp = data;  //int temp[] = data;
			temp[0] = 99;
			for(int i = 0; i < temp.length; i++) {
				System.out.println(data[i]);
			}
			System.out.println(new int[] {1, 2, 4, 545, 11, 32, 13131, 4444}.length);
			*/
		int data[][] = new int[][] {
				{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
			//����ڽ��������ʱ��һ��Ҫʹ��˫��ѭ����
			//�ⲿ��ѭ��������������������ڲ���ѭ�������������
			for(int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[i].length; j++) {
					System.out.print("data[" + i + "][" + j + "]=" + data[i][j] + "��");
				}
				System.out.println();
			}
	}
}
