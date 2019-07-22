/**
 * 熟练程序的入口main方法，熟悉快捷键	alt+/ 的使用
 * 转义符的使用 \		\n	\t
 * 注释的使用
 * @author jjking
 *
 * @version 
 */
public class Exercise01 {
	public static void main(String[] args) {
		
		/*
		 * System.out.println	输出后换行
		 * System.out.print		输出后不换行
		 */
		System.out.print("这句话不换行——————");
		System.out.println("这是第一行！");
		
		//	这是单行注释
		
		/*
		 * 这是多行注释
		 */
		
		//	\n	换行
		System.out.println("换行字符开始，准备换行......\n换完了，显示一下换行的字符\\n");
		
		//	\t	制表位    8个字节  （64位）
		System.out.println("制表位来了\t用\\t来显示的");
		System.out.println("a\tx");
		System.out.println("abc\tx");
		System.out.println("abcd\tx");
		System.out.println("abcde\tx");
		System.out.println("abcdef\tx");
		System.out.println("abcdefg\tx");
		System.out.println("abcdefgh\tx");
		System.out.println("abcdefghi\tx");
		
		//	输出英文的双引号\"\"
		System.out.println("\"Hello!\"");
	}

}
