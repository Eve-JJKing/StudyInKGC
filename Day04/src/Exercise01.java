
/**
 * @name 三重if嵌套使用练习
 * 
 * 功能：
 * 三重if嵌套使用练习
 * 运动会上，速度大于等于8米每秒的，身高170以上的男生——跨栏
 * 运动会上，速度大于等于8米每秒的，身高170以上的女生——跳远
 * 运动会上，速度大于等于8米每秒的，身高170以下的男生——长跑
 * 运动会上，速度大于等于8米每秒的，身高170以下的女生——短跑
 * 运动会上，速度小于8米每秒的，身高170以上的男生——跳高
 * 运动会上，速度小于8米每秒的，身高170以上的女生——啦啦队
 * 运动会上，速度小于8米每秒的，身高170以上的男生——打杂
 * 运动会上，速度小于8米每秒的，身高170以上的女生——观众
 * @author jjking
 * 时间：2019-7-18
 */
public class Exercise01 {
	public static void main(String[] args) {
		int height = 175;
		int speed = 9;
		char sex ='男';
		double d = 1.0f;
		float f = (int)1.0;
//		float g = (double)1.0f;
		
		if (speed >= 8) {
			if (height >= 170) {
				if (sex == '男') {
					System.out.println("速度够身高够的男的去跨栏");
				}else {
					System.out.println("速度够身高够的女的去跳远");
				}
			}else {
				if (sex == '男') {
					System.out.println("速度够身高不够的男的去长跑");
				}else {
					System.out.println("速度够身高不够的女的去短跑");
				}
			}
		}else {
			if (height >= 170) {
				if (sex == '男') {
					System.out.println("速度不够身高够的男的去跳高");
				}else {
					System.out.println("速度不够身高够的女的去啦啦队");
				}
			}else {
				if (sex == '男') {
					System.out.println("速度不够身高不够的男的去打杂");
				}else {
					System.out.println("速度不够身高不够的女的去当观众");
				}
			}
		}
	}
}
