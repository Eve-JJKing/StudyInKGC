/**
 * ��֧�ṹ
 * @author jjking
 *
 */
public class Exercise05 {
	public static void main(String[] args) {
		
		boolean isFull=false;
		
		int a = 2;
		System.out.println(isFull);
		
		//	������if�ṹ
		/*
		 * 		if��������{
		 * 			����
		 * 		}
		 */
		int num = 3;
		if (num >= 0) {
			System.out.println("if�ṹ");
		}
		if(false == 2>=4){
			System.out.println("1");
		}
		
		//	if-else�ṹ
		/*
		 * 		if(����){
		 * 			����
		 * 		}else{
		 * 			����
		 * 		}
		 */
		if (isFull==true) {
			System.out.println(isFull);
		}else {
			System.out.println(!isFull);
		}
		int rank = 2;
		if (rank==1) {
			System.out.println("ɶ�������У�");
		}else {
			System.out.println("������һ���ƣ�");
		}
		
		//	if-else if-else�ṹ
		/**
		 * if(����1){
		 * 		����1
		 * }else if(����2){
		 * 		����2
		 * }else if(����3){
		 * 		����3
		 * }else{
		 * 		����4
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
		
		//Ƕ��if���
		/*
		 *	if(����1){
		 *		if(����2){
		 *			����
		 *		}
		 *	}
		 */
		if (isFull==false) {
			if (a==2) {
				System.out.println("Ƕ��if");
			}
		}
		
		//	switch ���
		/*
		 *	switch(����){
		 *		case ֵ1:
		 *			����1
		 *			break;
		 *		case ֵ2��
		 *			����2
		 *			break;
		 *		default:
		 *			����3
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
			System.out.println("ɶ��û��");
			break;
		}
	}
}
