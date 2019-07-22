/**
 * 分支结构
 * @author jjking
 *
 */
public class Exercise05 {
	public static void main(String[] args) {
		
		boolean isFull=false;
		
		int a = 2;
		System.out.println(isFull);
		
		//	单纯的if结构
		/*
		 * 		if（条件）{
		 * 			内容
		 * 		}
		 */
		int num = 3;
		if (num >= 0) {
			System.out.println("if结构");
		}
		if(false == 2>=4){
			System.out.println("1");
		}
		
		//	if-else结构
		/*
		 * 		if(条件){
		 * 			内容
		 * 		}else{
		 * 			内容
		 * 		}
		 */
		if (isFull==true) {
			System.out.println(isFull);
		}else {
			System.out.println(!isFull);
		}
		int rank = 2;
		if (rank==1) {
			System.out.println("啥奖励都有！");
		}else {
			System.out.println("奖励你一巴掌！");
		}
		
		//	if-else if-else结构
		/**
		 * if(条件1){
		 * 		内容1
		 * }else if(条件2){
		 * 		内容2
		 * }else if(条件3){
		 * 		内容3
		 * }else{
		 * 		内容4
		 * }
		 */
		if(a==0) {
			System.out.println("a=0");
		}else if(a==1) {
			System.out.println("a==1");
		}else if(a==2){
			System.out.println("a=2");
		}else{
			System.out.println("a>2");
		}
		
		//嵌套if语句
		/*
		 *	if(条件1){
		 *		if(条件2){
		 *			内容
		 *		}
		 *	}
		 */
		if (isFull==false) {
			if (a==2) {
				System.out.println("嵌套if");
			}
		}
		
		//	switch 语句
		/*
		 *	switch(变量){
		 *		case 值1:
		 *			内容1
		 *			break;
		 *		case 值2：
		 *			内容2
		 *			break;
		 *		default:
		 *			内容3
		 *			break;
		 *	}
		 */
		switch (a) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("啥都没有");
			break;
		}
	}
}
