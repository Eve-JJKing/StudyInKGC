import java.math.BigDecimal;
//import java.math.BigInteger;
/**
 * 
 * 变量的声明、赋值、使用
 * @author jjking
 *
 */

public class Exercise03 {
	public static void main(String[] args) {
		
		String name="wjj";
		int age=23;
		double money=21.3;
		char sex='男';
		float costMoney=22.22f;
//		short grade=2;
//		long id=231420365;
//		boolean flag=true;
		
//		BigInteger abigBigInteger =BigInteger.valueOf(123);
		BigDecimal bbigBigDecimal =BigDecimal.valueOf(1354.23);
		
//		BigDecimal cBigDecimal = bbigBigDecimal.add(abigBigInteger);
		
		System.out.println("我叫"+name+"，今年"+age+"岁了，是个"+sex+"的，中午吃了"+costMoney+"元钱的饭。现在还有"+money+"元钱。");
		
		for(int i=0;i<30;i++ ){
			System.out.println(name+sex+money+age+"asa"+costMoney);
			age++;
			money+=1.1;
			bbigBigDecimal=bbigBigDecimal.add((BigDecimal)BigDecimal.valueOf(1.0));
			System.out.println(bbigBigDecimal);
		}
	}
}
