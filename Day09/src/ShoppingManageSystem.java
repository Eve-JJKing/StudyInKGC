import java.util.Scanner;

/**
 * ��Ʒ����ϵͳ
 * ʵ����Ʒ����ɾ�Ĳ�
 * @author Administrator
 *
 */
public class ShoppingManageSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] goods = {
			"\tƻ��\t\t3.0",
			"\t�㽶\t\t2.5"	
		};
		
		while(true){
			System.out.println("*********************************");
			System.out.println("* 1.��ѯ                                                              ");
			System.out.println("* 2.���						");
			System.out.println("* 3.�޸�						");
			System.out.println("* 4.ɾ��						");
			System.out.println("* 5.�˳�						");
			System.out.println("*********************************");
			System.out.println("��ѡ�������");
			int select = input.nextInt();
			if(select ==1){		//��ѯ
				System.out.println("���\t����\t\t�۸�");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println();
			}else if(select ==2){	//���
				System.out.println("��������Ʒ������");
				String name = input.next(); 
				System.out.println("��������Ʒ�ļ۸�");
				String price = input.next();
				String good = "\t"+ name +"\t\t"+ price;
//				System.out.println(good);
				String [] newGoods = new String[goods.length+1];
				for (int  i= 0;  i< goods.length; i++) {
					newGoods[i] = goods[i];
				}
				newGoods[newGoods.length-1] = good;
				goods = newGoods;
			}else if(select ==3){	//�޸�
				System.out.println("���\t����\t\t�۸�");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println("��ѡ��Ҫ�޸ĵı�ţ�");
				int no = input.nextInt();
				if(no>1 && no <=goods.length){
					if(!(goods[no-1].equals(null))||!(goods[no-1].equals(""))){
						System.out.println("��������Ʒ������");
						String update_name = input.next(); 
						System.out.println("��������Ʒ�ļ۸�");
						String update_price = input.next();
						String update_good = "\t"+ update_name +"\t\t"+ update_price;
//						System.out.println("���Ͻ�"+goods[no]+"\n����Ϊ��"+update_good);
						goods[no-1] = update_good;
					}else{
						System.out.println("sorry��û�������Ʒ��");
					}
				}else{
					System.out.println("sorry,û�������Ʒ��");
				}
			}else if(select ==4){	//ɾ��
				System.out.println("�����Ҫɾ������Ʒ��ţ�");
				int del_no = input.nextInt();
				goods[del_no-1] = "";
			}else if(select ==5){	//�˳�
				System.out.println("����������˳���");
				break;
			}else{
				System.out.println("�Բ���û�������������ȷ�����֣�����");
			}
				
			
			
			
			
			
				/*
			if(select==5){
				System.out.println("����������˳���");
				break;
			}
			switch (select) {
			//��ѯ
			case 1:
				System.out.println("���\t����\t\t�۸�");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println();
				break;
				
				
			//���
			case 2:
				System.out.println("��������Ʒ������");
				String name = input.next(); 
				System.out.println("��������Ʒ�ļ۸�");
				String price = input.next();
				String good = "\t"+ name +"\t\t"+ price;
				System.out.println(good);
				String [] newGoods = new String[goods.length+1];
				for (int  i= 0;  i< goods.length; i++) {
					newGoods[i] = goods[i];
				}
				newGoods[newGoods.length-1] = good;
				goods = newGoods;
				break;
				
				
			//�޸�
			case 3:
				System.out.println("���\t����\t\t�۸�");
				System.out.println("-----------------------------");
				for (int i = 0;i<goods.length;i++) {
					if (goods[i].equals(null)||goods[i].equals("")) {
						continue;
					}
					System.out.print(i+1);
					System.out.println(goods[i]);
				}
				System.out.println("��ѡ��Ҫ�޸ĵı�ţ�");
				int no = input.nextInt();
				if(no>1 && no <=goods.length){
					if(!(goods[no-1].equals(null))||!(goods[no-1].equals(""))){
						System.out.println("��������Ʒ������");
						String update_name = input.next(); 
						System.out.println("��������Ʒ�ļ۸�");
						String update_price = input.next();
						String update_good = "\t"+ update_name +"\t\t"+ update_price;
						System.out.println("���Ͻ�"+goods[no]+"\n����Ϊ��"+update_good);
						goods[no-1] = update_good;
					}else{
						System.out.println("sorry��û�������Ʒ��");
					}
				}else{
					System.out.println("sorry,û�������Ʒ��");
				}
				break;
				
			//ɾ��
			case 4:
				System.out.println("�����Ҫɾ������Ʒ��ţ�");
				int del_no = input.nextInt();
				goods[del_no-1] = "";
				break;
				
			default:
				System.out.println("�Բ���û�������������ȷ�����֣�����");
				break;
			}*/
		}
	}
}
