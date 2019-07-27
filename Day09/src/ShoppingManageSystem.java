import java.util.Scanner;

/**
 * 商品管理系统
 * 实现商品的增删改查
 * @author Administrator
 *
 */
public class ShoppingManageSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] goods = {
			"\t苹果\t\t3.0",
			"\t香蕉\t\t2.5"	
		};
		
		while(true){
			System.out.println("*********************************");
			System.out.println("* 1.查询                                                              ");
			System.out.println("* 2.添加						");
			System.out.println("* 3.修改						");
			System.out.println("* 4.删除						");
			System.out.println("* 5.退出						");
			System.out.println("*********************************");
			System.out.println("请选择操作：");
			int select = input.nextInt();
			if(select ==1){		//查询
				System.out.println("编号\t名称\t\t价格");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println();
			}else if(select ==2){	//添加
				System.out.println("请输入商品的名称");
				String name = input.next(); 
				System.out.println("请输入商品的价格");
				String price = input.next();
				String good = "\t"+ name +"\t\t"+ price;
//				System.out.println(good);
				String [] newGoods = new String[goods.length+1];
				for (int  i= 0;  i< goods.length; i++) {
					newGoods[i] = goods[i];
				}
				newGoods[newGoods.length-1] = good;
				goods = newGoods;
			}else if(select ==3){	//修改
				System.out.println("编号\t名称\t\t价格");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println("请选择要修改的编号：");
				int no = input.nextInt();
				if(no>1 && no <=goods.length){
					if(!(goods[no-1].equals(null))||!(goods[no-1].equals(""))){
						System.out.println("请输入商品的名称");
						String update_name = input.next(); 
						System.out.println("请输入商品的价格");
						String update_price = input.next();
						String update_good = "\t"+ update_name +"\t\t"+ update_price;
//						System.out.println("马上将"+goods[no]+"\n更改为："+update_good);
						goods[no-1] = update_good;
					}else{
						System.out.println("sorry，没有这件商品！");
					}
				}else{
					System.out.println("sorry,没有这件商品！");
				}
			}else if(select ==4){	//删除
				System.out.println("请出入要删除的商品编号：");
				int del_no = input.nextInt();
				goods[del_no-1] = "";
			}else if(select ==5){	//退出
				System.out.println("程序结束，退出！");
				break;
			}else{
				System.out.println("对不起，没有这项！请输入正确的数字！！！");
			}
				
			
			
			
			
			
				/*
			if(select==5){
				System.out.println("程序结束，退出！");
				break;
			}
			switch (select) {
			//查询
			case 1:
				System.out.println("编号\t名称\t\t价格");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println();
				break;
				
				
			//添加
			case 2:
				System.out.println("请输入商品的名称");
				String name = input.next(); 
				System.out.println("请输入商品的价格");
				String price = input.next();
				String good = "\t"+ name +"\t\t"+ price;
				System.out.println(good);
				String [] newGoods = new String[goods.length+1];
				for (int  i= 0;  i< goods.length; i++) {
					newGoods[i] = goods[i];
				}
				newGoods[newGoods.length-1] = good;
				goods = newGoods;
				break;
				
				
			//修改
			case 3:
				System.out.println("编号\t名称\t\t价格");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println("请选择要修改的编号：");
				int no = input.nextInt();
				if(no>1 && no <=goods.length){
					if(!(goods[no-1].equals(null))||!(goods[no-1].equals(""))){
						System.out.println("请输入商品的名称");
						String update_name = input.next(); 
						System.out.println("请输入商品的价格");
						String update_price = input.next();
						String update_good = "\t"+ update_name +"\t\t"+ update_price;
						System.out.println("马上将"+goods[no]+"\n更改为："+update_good);
						goods[no-1] = update_good;
					}else{
						System.out.println("sorry，没有这件商品！");
					}
				}else{
					System.out.println("sorry,没有这件商品！");
				}
				break;
				
			//删除
			case 4:
				System.out.println("请出入要删除的商品编号：");
				int del_no = input.nextInt();
				goods[del_no-1] = "";
				break;
				
			default:
				System.out.println("对不起，没有这项！请输入正确的数字！！！");
				break;
			}*/
		}
	}
}
