import java.math.BigDecimal;
//import java.math.BigInteger;
/**
 * 
 * ��������������ֵ��ʹ��
 * @author jjking
 *
 */

public class Exercise03 {
	public static void main(String[] args) {
		
		String name="wjj";
		int age=23;
		double money=21.3;
		char sex='��';
		float costMoney=22.22f;
//		short grade=2;
//		long id=231420365;
//		boolean flag=true;
		
//		BigInteger abigBigInteger =BigInteger.valueOf(123);
		BigDecimal bbigBigDecimal =BigDecimal.valueOf(1354.23);
		
//		BigDecimal cBigDecimal = bbigBigDecimal.add(abigBigInteger);
		
		System.out.println("�ҽ�"+name+"������"+age+"���ˣ��Ǹ�"+sex+"�ģ��������"+costMoney+"ԪǮ�ķ������ڻ���"+money+"ԪǮ��");
		
		for(int i=0;i<30;i++ ){
			System.out.println(name+sex+money+age+"asa"+costMoney);
			age++;
			money+=1.1;
			bbigBigDecimal=bbigBigDecimal.add((BigDecimal)BigDecimal.valueOf(1.0));
			System.out.println(bbigBigDecimal);
		}
	}
}
