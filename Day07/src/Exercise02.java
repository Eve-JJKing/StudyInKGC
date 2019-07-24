/**
 * 数组
 * @author Administrator
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
			/*int data[] = null;
			data = new int[3]; //开辟一个长度为3的数组
			int temp[] = null; //声明对象
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
			//如果在进行输出的时候一定要使用双重循环，
			//外部的循环控制输出的行数，而内部的循环控制输出列数
			for(int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[i].length; j++) {
					System.out.print("data[" + i + "][" + j + "]=" + data[i][j] + "、");
				}
				System.out.println();
			}
	}
}
