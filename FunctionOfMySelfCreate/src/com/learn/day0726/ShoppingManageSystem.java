package com.learn.day0726;
/**
 * ��Ʒ����ϵͳ
 * ���ܣ�
 * ��ѯ������Ʒ����ӡ��޸ġ�ɾ�����˳�
 * ��ѯ��
 * 	���		����		�۸�
 * 	  1		 ����		 30
 * 	  2		 ����		 4
 * ��ӣ�
 * 		���������Ƽ۸���ӵ�������
 * �޸ģ�
 * 		���ݱ���޸����ơ��۸�
 * ɾ����
 * 		���ݱ��ɾ����Ʒ
 * �˳���
 * 		�������� ллʹ�ã�
 * @author Administrator
 *
 */
import java.util.Scanner;
public class ShoppingManageSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ids = {1,2,3};
		String[] names = {"�㽶","ƻ��","����"};
		double[] prices = {1.2,3.2,1.5};
		//��ӭ����
		System.out.println("*********************************");
		System.out.println("*****��ӭʹ��JJ��Ʒ����ϵͳ*******");
		System.out.println("*********************************");
		System.out.println("=================================");
		//����ѡ��
		while (true) {
			System.out.println("**************************");
			System.out.println("**   1����ѯ��Ʒ         *******");
			System.out.println("**   2�������Ʒ         *******");
			System.out.println("**   3���޸���Ʒ         *******");
			System.out.println("**   4��ɾ����Ʒ         *******");
			System.out.println("**   5���˳�                   *******");
			System.out.println("**************************");
			System.out.println("��ѡ���ܣ�");
			String choose = input.next();

			if (choose.equals("1")) {		//��ѯ��Ʒ����
				System.out.println("���\t����\t�۸�");
				System.out.println("-------------------------");
				for (int i = 0; i < prices.length; i++) {
					if (ids[i]>=0) {
						System.out.print(ids[i] + "\t");
						System.out.print(names[i] + "\t");
						System.out.println(prices[i] + "\t");
					}
				}
				System.out.println();
			}else if (choose.equals("2")) {			//�����Ʒ����
					int addId;
					String addName;
					double addPrice;
					while (true) {
						//������ӵ���Ʒ��Ϣ
						System.out.println("������Ҫ��ӵ���Ʒ���");
						addId = input.nextInt();
						System.out.println("������Ҫ��ӵ���Ʒ����");
						addName = input.next();
						System.out.println("������Ҫ��ӵ���Ʒ�۸�");
						addPrice = input.nextDouble();
						boolean flag = true;
						//�жϱ���Ƿ��ظ����ظ��������룬���ظ��������
						for (int i = 0; i < ids.length; i++) {
							if (addId == ids[i]) {
								System.out.println("����ظ�������");
								flag = false;
							}
						}
						if(flag == false){
							continue;
						}
						//�½�����
						int[] newIds = new int[ids.length+1];
						String[] newNames = new String[names.length+1];
						double[] newPrices = new double[prices.length+1];
						//�����ݷ����µ�������
						for (int i = 0; i < prices.length; i++) {
							newIds[i] = ids[i];
							newNames[i] = names[i];
							newPrices[i] = prices[i];
						}
						newIds[newIds.length-1] = addId;
						newNames[newNames.length-1] = addName;
						newPrices[newPrices.length-1] = addPrice;
						//���鸳ֵ
						ids = newIds;
						names = newNames;
						prices = newPrices;
						System.out.println("Success!");
						break;
					}
			}else if (choose.equals("3")) {			//�޸���Ʒ����
				int updateId;
				String updateName;
				double updatePrice;
				while (true) {
					//������ӵ���Ʒ��Ϣ
					System.out.println("������Ҫ�޸ĵ���Ʒ���");
					updateId = input.nextInt();
					System.out.println("������Ҫ�޸ĵ���Ʒ����");
					updateName = input.next();
					System.out.println("������Ҫ�޸ĵ���Ʒ�۸�");
					updatePrice = input.nextDouble();
					boolean flag = true;
					//�жϱ���Ƿ���ڣ������ڴ������룬�����޸�
					for (int i = 0; i < ids.length; i++) {
						if (updateId == ids[i]) {
							names[i] = updateName;
							prices[i] = updatePrice;
							flag = false;
							System.out.println("�޸ĳɹ���");
						}else{
							
						}
					}
					if(flag == false){
						break;
					}
					System.out.println("��Ų����ڣ����������룡");
				}
			}else if (choose.equals("4")) {			//ɾ����Ʒ����
				while(true){
					System.out.println("������Ҫɾ������Ʒ��ţ�");
					int delId = input.nextInt();
					boolean flag = true;
					for (int i = 0; i < ids.length; i++) {
						if (delId == ids[i]) {
							ids[i] = -1;
							System.out.println("ɾ���ɹ���");
							flag = false;
						}else{
						
						}
					}
					if (flag == false) {
						break;
					}
					System.out.println("û�и���Ʒ�������ѡ��");
				}
			}else if (choose.equals("5")) {			//�˳�
				break;
			}else{
				System.out.println("������Ĺ��ܲ����ڣ����������룺");
			}
		}
		System.out.println("���������ллʹ�á�");
	}
}
