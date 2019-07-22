/**
 *
 * 功能：
 * 作者：jjking 
 * 时间：2019-7-18
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		
		int math = (int)(Math.random()*100);
		System.out.println(math);
		int chinese = 100;
		if (math >= 90 && chinese >= 90) {
			System.out.println("两科都够90了，奖励你！");
		}else {
			System.out.println("至少有一科不够90，一巴掌！");
		}
		
		if (math >= 90 || chinese >= 90) {
			System.out.println("有一科够90就奖励你");
		}else {
			System.out.println("一科够90的都没有，来一巴掌！");
		}
		
		
		
		//产生一个四位数的卡号
		int cardId = (int)(Math.random()*8999)+1000;
		System.out.println(cardId);
	}
}
