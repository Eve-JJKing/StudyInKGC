/**
 * ����ת��char int double ֮���������ת��
 * @author jjking
 *
 */
public class Exercise04 {
	
	
	public static void main(String[] args) {
		
		
		//	��		��		�� 	25105	29233	20320
		
		int a = 23;
		double b = a;
		System.out.println(b);
		
		double c = 3.3;
		int d = (int)c;
		System.out.println(d);
		
		
		char wo = '��';
		char ai = 'ҧ';
		char ni = '��';
		
		int woq = wo;
		int aiq = ai;
		int niq = ni;
	
		System.out.print(woq);
		System.out.print(aiq);
		System.out.print(niq);
		
		
		System.out.println("");
		String woAiNiString = "25105,29233,20320";
		String[] result=woAiNiString.split(",");
		for (String string : result) {
			System.out.print(string+" ");
		}
		
		String name = "smith";
		System.out.println(initCap(name));
	}
	
	public static String initCap(String str){
		if(str == null || "".equals(str))
		{
			return str;
		}
		if(str.length()>1)
		{
			return str.substring(0,1).toUpperCase() + str.substring(1);
		}
		return str.toUpperCase();
	}
	
}
