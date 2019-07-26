/**
 * 打印正的直角三角形
 * @author Administrator
 *
 */

public class Exercise03 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0 ; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0 ; j <= (5-i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		for (int i = 0; i < 3; i++) {
			 for (int j = 0; j <i ; j++) {
				System.out.print(" ");
			}
			 for (int j2 = 0; j2 < 5; j2++) {
				System.out.print("*");
			}
			 System.out.println();
		}
		
		System.out.println("------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <(2*i+1); j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		for (int i = 5; i > 0; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j = 2*i-1; j > 0; j-- ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//菱形
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <(2*i+1); j++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i > 0; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j = 2*i-1; j > 0; j-- ){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//空心菱形
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <(2*i+1); j++ ){
				if(j==0||j==2*i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 4; i > 0; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int j = 2*i-1; j > 0; j-- ){
				if(j==2*i-1||j==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
