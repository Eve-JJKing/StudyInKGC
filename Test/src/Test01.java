import java.util.Scanner;

/**
 * 唐城员工管理系统
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int[] types = {};				//存储类型
		String[] names = {};			//存储姓名
		String[] ids = {};				//存储工号
		String[] works = {				//工作职责
				"负责班级管理工作",
				"负责日常教学工作",
				"负责整个部门的管理工作"
				};
		String[] vips = {				//VIP服务
				"可以提供的VIP服务：学员访谈，学院家访",
				"可以提供的VIP服务：课后辅导，作业检查",
				"没有VIP服务可以提供"
				};
		
		double prise = 0;				//部门经理奖金
		
		while (true) {
			//欢迎界面
			System.out.println("**********唐城员工管理系统**********");
			System.out.println("**********[1]员工入职**********");
			System.out.println("**********[2]员工列表**********");
			System.out.println("**********[3]查询员工**********");
			System.out.println("**********[4]员工离职**********"); 
			System.out.println("**********[0]退出系统**********");
			System.out.println("请选择功能：");
			
			//根据不同的序号选择不同的功能
			String choice = input.next();
			
			if (choice.equals("1")) {		//员工入职
				//循环条件
				String select = "y";		
				boolean flag;
				do{
					flag = true;
					System.out.println("请输入员工姓名：");
					String addName = input.next(); 
					System.out.println("员工工号：");
					String addId = input.next();
					System.out.println("选择员工类型（1 班主任  2 教员  3 部门经理）：");
					int addType = input.nextInt();
					//判断是否重复，如果重复，提示之后从新输入
					for (int i = 0; i < ids.length; i++) {
						//判断工号
						if (addId.equals(ids[i])) {
							System.out.println("工号重复，请仔细核对后重新输入！");
							flag = false;
						}
					}
					//判断员工类型输入是否合法
					if (addType < 1 || addType > 3) {
						System.out.println("警告！员工类型不正确");
						flag = false;
					}
					//输入不正确重新输入
					if(flag == false){
						continue;
					}
					//部门经理的奖金设置
					if (addType == 3) {
						System.out.println("请输入奖金金额：");
						prise = input.nextDouble();
					}
					
					//工号不重复，进行添加功能
					String[] newNames = new String[names.length + 1];
					String[] newIds = new String[ids.length + 1];
					int[] newTypes = new int[types.length + 1];
					for (int i = 0; i < ids.length; i++) {
						newNames[i] = names[i];
						newIds[i] = ids[i];
						newTypes[i] = types[i];
					}
					
					newNames[newNames.length -1] = addName;
					newIds[newIds.length - 1] = addId;
					newTypes[newTypes.length -1] = addType;
					
					//数组从新赋值
					names = newNames;
					ids = newIds;
					types = newTypes;
					
					//是否继续添加
					System.out.println("添加员工完成！");
					System.out.println("是否继续添加（y继续，任意键返回）");
					select = input.next();
				}while(select.equals("y"));
			}else if(choice.equals("2")){		//显示员工列表
				for (int i = 0; i < ids.length; i++) {
					System.out.print("职位：");
					//types中的不同数字对应的不同职位显示，以及不同的工作
					if (types[i] == 1) {
						System.out.println("班主任");
						System.out.println("员工工号为：" + ids[i] +"，姓名为：" + names[i]);
						System.out.println(works[0] + "\n" + vips[0]);
						System.out.println();
					}else if (types[i] == 2) {
						System.out.println("教员");
						System.out.println("员工工号为：" + ids[i] +"，姓名为：" + names[i]);
						System.out.println(works[1] + "\n" + vips[1]);
						System.out.println();
					}else{
						System.out.println("部门经理");
						System.out.println("员工工号为：" + ids[i] +"，姓名为：" + names[i] + "，奖金为：" + prise);
						System.out.println(works[2] + "\n" + vips[2]);
						System.out.println();
					}
				}
			}else if(choice.equals("3")){		//查询员工
				System.out.println("请输入要查询的员工姓名：");
				String queryName = input.next();
				boolean isFind = false;
				int index =-1;
				for (int i = 0; i < names.length; i++) {
					if (names[i].equals(queryName)||names[i].contains(queryName)) {
						isFind = true;
						index = i;
					}
				}
				if (isFind == false) {
					System.out.println("没有查找到相关结果");
				}else{
					if (types[index] == 1) {
						
						System.out.println("班主任");
						System.out.println("员工工号为：" + ids[index] +"，姓名为：" + names[index]);
						System.out.println(works[0] + "\n" + vips[0]);
					}else if (types[index] == 2) {
						System.out.println("教员");
						System.out.println("员工工号为：" + ids[index] +"，姓名为：" + names[index]);
						System.out.println(works[1] + "\n" + vips[1]);
					}else{
						System.out.println("部门经理");
						System.out.println("员工工号为：" + ids[index] +"，姓名为：" + names[index] + "，奖金为：" + prise);
						System.out.println(works[2] + "\n" + vips[2]);
					}
				}
			}else if(choice.equals("4")){		//员工离职
				
				System.out.println("请输入需要离职的员工编号：");
				String delId = input.next();
				boolean isActive = false;
				//判断员工编号是否存在
				for (int i = 0; i < ids.length; i++) {
					if (ids[i].equals(delId)) {
						isActive = true;
						if (i != (ids.length - 1)) {
							ids[i]=ids[ids.length - 1];
							names[i]=names[ids.length - 1];
							types[i]=types[ids.length - 1];
						}
					}
				}
				if (isActive == true) {
					String[] newNames = new String[names.length - 1];
					String[] newIds = new String[ids.length - 1];
					int[] newTypes = new int[types.length - 1];
					
					for (int i = 0; i < newIds.length; i++) {
						newNames[i] = names[i];
						newIds[i] = ids[i];
						newTypes[i] = types[i];
					}
					//数组从新赋值
					names = newNames;
					ids = newIds;
					types = newTypes;
					System.out.println("删除成功！");
				}else {
					System.out.println("工号输入错误，删除失败！");
				}
			}else if(choice.equals("0")){		//退出
				break;
			}else {
				System.out.println("对不起，您选择的功能暂未开放！");
			}
		}
		
		System.out.println("系统退出中...");
		Thread.sleep(1500);
		System.out.println("系统推出成功,感谢您的使用！");
		
	}
}
