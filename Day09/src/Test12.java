import java.util.Scanner;
/**
 * 商品管理系统
 * 功能：
 * 查询所有商品、添加、修改、删除、退出
 * 查询：
 * 	编号		名称		价格
 * 	  1		 ……		 30
 * 	  2		 ……		 4
 * 添加：
 * 		输入编号名称价格添加到数组中
 * 修改：
 * 		根据编号修改名称、价格
 * 删除：
 * 		根据编号删除商品
 * 退出：
 * 		结束程序， 谢谢使用！
 * @author Administrator
 *
 */
public class Test12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ids[] = {1,2,3};
		String names[] = {"肥皂","洗衣液","搓澡巾"};
		int prices[] = {5,20,8};
		
		System.out.println("**************************");
		System.out.println("******欢迎使用商品管理系统******");
		System.out.println("**************************");
		
		while(true){
			System.out.println("**************************");
			System.out.println("1.查询商品");
			System.out.println("2.添加商品");
			System.out.println("3.修改商品");
			System.out.println("4.删除商品");
			System.out.println("5.退出");
			System.out.println("**************************");
			System.out.println("请选择：");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("**************************");
				System.out.println("编号\t名称\t价格");
				System.out.println("**************************");
				for (int i = 0; i < ids.length; i++) {
					System.out.print(ids[i] + "\t");
					System.out.print(names[i] + "\t");
					System.out.print(prices[i] + "\t");
					System.out.println();
				}
				System.out.println("**************************");
			} else if (choice == 2) {
				//输入内容
				System.out.println("请输入编号");
				int id = input.nextInt();
				
				System.out.println("请输入名称");
				String name = input.next();
				
				System.out.println("请输入价格");
				int price = input.nextInt();
				
				boolean flag = true;
				
				//判断id是否存在
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						System.out.println("编号重复，请重新输入");
						flag = false;
					}
				}
				
				if (flag) {
					//添加到新数组中
					int newIds[] = new int[ids.length + 1];
					String newNames[] = new String[ids.length + 1];
					int newPrices[] = new int[ids.length + 1];
					
					for (int i = 0; i < ids.length; i++) {
						newIds[i] = ids[i];
						newNames[i] = names[i];
						newPrices[i] = prices[i];
					}
					newIds[newIds.length - 1] = id;
					newNames[newNames.length - 1] = name;
					newPrices[newPrices.length - 1] = price;
					
					//数组赋值
					ids = newIds;
					names = newNames;
					prices = newPrices;
					System.out.println("添加成功");
				}
			} else if (choice == 3) {
				//输入内容
				System.out.println("请输入编号");
				int id = input.nextInt();
				
				System.out.println("请输入名称");
				String name = input.next();
				
				System.out.println("请输入价格");
				int price = input.nextInt();
				int index = -1;
				//判断id是否存在
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						index = i;
					}
				}
				
				if (index >= 0) {
					names[index] = name;
					prices[index] = price;
					System.out.println("修改成功");
				} else {
					System.out.println("编号不存在，请重新输入");
				}
				
			} else if (choice == 4) {
				System.out.println("请输入编号");
				int id = input.nextInt();
				
				int index = -1;
				//判断id是否存在
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						index = i;
					}
				}
				
				if (index >= 0) {
					int newIds[] = new int[ids.length - 1];
					String newNames[] = new String[ids.length - 1];
					int newPrices[] = new int[ids.length - 1];
					for (int i = index; i < ids.length-1; i++) {
						ids[i] = ids[i + 1];
						names[i] = names[i + 1];
						prices[i] = prices[i + 1];
					}
					
					for (int i = 0; i < newIds.length; i++) {
						newIds[i] = ids[i];
						newNames[i] = names[i];
						newPrices[i] = prices[i];
					}
					
					ids = newIds;
					names = newNames;
					prices = newPrices;
					System.out.println("删除成功");
				} else {
					System.out.println("编号不存在，请重新输入");
				}
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}
		System.out.println("程序结束，谢谢使用");
	}
}
