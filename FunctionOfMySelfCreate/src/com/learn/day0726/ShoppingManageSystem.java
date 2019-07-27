package com.learn.day0726;
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
import java.util.Scanner;
public class ShoppingManageSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ids = {1,2,3};
		String[] names = {"香蕉","苹果","橘子"};
		double[] prices = {1.2,3.2,1.5};
		//欢迎界面
		System.out.println("*********************************");
		System.out.println("*****欢迎使用JJ商品管理系统*******");
		System.out.println("*********************************");
		System.out.println("=================================");
		//功能选择
		while (true) {
			System.out.println("**************************");
			System.out.println("**   1、查询商品         *******");
			System.out.println("**   2、添加商品         *******");
			System.out.println("**   3、修改商品         *******");
			System.out.println("**   4、删除商品         *******");
			System.out.println("**   5、退出                   *******");
			System.out.println("**************************");
			System.out.println("请选择功能：");
			String choose = input.next();

			if (choose.equals("1")) {		//查询商品功能
				System.out.println("编号\t名称\t价格");
				System.out.println("-------------------------");
				for (int i = 0; i < prices.length; i++) {
					if (ids[i]>=0) {
						System.out.print(ids[i] + "\t");
						System.out.print(names[i] + "\t");
						System.out.println(prices[i] + "\t");
					}
				}
				System.out.println();
			}else if (choose.equals("2")) {			//添加商品功能
					int addId;
					String addName;
					double addPrice;
					while (true) {
						//输入添加的商品信息
						System.out.println("请输入要添加的商品编号");
						addId = input.nextInt();
						System.out.println("请输入要添加的商品名称");
						addName = input.next();
						System.out.println("请输入要添加的商品价格");
						addPrice = input.nextDouble();
						boolean flag = true;
						//判断编号是否重复，重复从新输入，不重复继续添加
						for (int i = 0; i < ids.length; i++) {
							if (addId == ids[i]) {
								System.out.println("编号重复请重试");
								flag = false;
							}
						}
						if(flag == false){
							continue;
						}
						//新建数组
						int[] newIds = new int[ids.length+1];
						String[] newNames = new String[names.length+1];
						double[] newPrices = new double[prices.length+1];
						//将数据放入新的数组中
						for (int i = 0; i < prices.length; i++) {
							newIds[i] = ids[i];
							newNames[i] = names[i];
							newPrices[i] = prices[i];
						}
						newIds[newIds.length-1] = addId;
						newNames[newNames.length-1] = addName;
						newPrices[newPrices.length-1] = addPrice;
						//数组赋值
						ids = newIds;
						names = newNames;
						prices = newPrices;
						System.out.println("Success!");
						break;
					}
			}else if (choose.equals("3")) {			//修改商品功能
				int updateId;
				String updateName;
				double updatePrice;
				while (true) {
					//输入添加的商品信息
					System.out.println("请输入要修改的商品编号");
					updateId = input.nextInt();
					System.out.println("请输入要修改的商品名称");
					updateName = input.next();
					System.out.println("请输入要修改的商品价格");
					updatePrice = input.nextDouble();
					boolean flag = true;
					//判断编号是否存在，不存在从新输入，存在修改
					for (int i = 0; i < ids.length; i++) {
						if (updateId == ids[i]) {
							names[i] = updateName;
							prices[i] = updatePrice;
							flag = false;
							System.out.println("修改成功！");
						}else{
							
						}
					}
					if(flag == false){
						break;
					}
					System.out.println("编号不存在，请重新输入！");
				}
			}else if (choose.equals("4")) {			//删除商品功能
				while(true){
					System.out.println("请输入要删除的商品编号：");
					int delId = input.nextInt();
					boolean flag = true;
					for (int i = 0; i < ids.length; i++) {
						if (delId == ids[i]) {
							ids[i] = -1;
							System.out.println("删除成功！");
							flag = false;
						}else{
						
						}
					}
					if (flag == false) {
						break;
					}
					System.out.println("没有该商品，请从新选择！");
				}
			}else if (choose.equals("5")) {			//退出
				break;
			}else{
				System.out.println("您输入的功能不存在，请重新输入：");
			}
		}
		System.out.println("程序结束，谢谢使用。");
	}
}
