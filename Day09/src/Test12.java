import java.util.Scanner;
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
public class Test12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ids[] = {1,2,3};
		String names[] = {"����","ϴ��Һ","�����"};
		int prices[] = {5,20,8};
		
		System.out.println("**************************");
		System.out.println("******��ӭʹ����Ʒ����ϵͳ******");
		System.out.println("**************************");
		
		while(true){
			System.out.println("**************************");
			System.out.println("1.��ѯ��Ʒ");
			System.out.println("2.�����Ʒ");
			System.out.println("3.�޸���Ʒ");
			System.out.println("4.ɾ����Ʒ");
			System.out.println("5.�˳�");
			System.out.println("**************************");
			System.out.println("��ѡ��");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("**************************");
				System.out.println("���\t����\t�۸�");
				System.out.println("**************************");
				for (int i = 0; i < ids.length; i++) {
					System.out.print(ids[i] + "\t");
					System.out.print(names[i] + "\t");
					System.out.print(prices[i] + "\t");
					System.out.println();
				}
				System.out.println("**************************");
			} else if (choice == 2) {
				//��������
				System.out.println("��������");
				int id = input.nextInt();
				
				System.out.println("����������");
				String name = input.next();
				
				System.out.println("������۸�");
				int price = input.nextInt();
				
				boolean flag = true;
				
				//�ж�id�Ƿ����
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						System.out.println("����ظ�������������");
						flag = false;
					}
				}
				
				if (flag) {
					//��ӵ���������
					int newIds[] = new int[ids.length + 1];
					String newNames[] = new String[ids.length + 1];
					int newPrices[] = new int[ids.length + 1];
					
					for (int i = 0; i < ids.length; i++) {
						newIds[i] = ids[i];
						newNames[i] = names[i];
						newPrices[i] = prices[i];
					}
					newIds[newIds.length - 1] = id;
					newNames[newNames.length - 1] = name;
					newPrices[newPrices.length - 1] = price;
					
					//���鸳ֵ
					ids = newIds;
					names = newNames;
					prices = newPrices;
					System.out.println("��ӳɹ�");
				}
			} else if (choice == 3) {
				//��������
				System.out.println("��������");
				int id = input.nextInt();
				
				System.out.println("����������");
				String name = input.next();
				
				System.out.println("������۸�");
				int price = input.nextInt();
				int index = -1;
				//�ж�id�Ƿ����
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						index = i;
					}
				}
				
				if (index >= 0) {
					names[index] = name;
					prices[index] = price;
					System.out.println("�޸ĳɹ�");
				} else {
					System.out.println("��Ų����ڣ�����������");
				}
				
			} else if (choice == 4) {
				System.out.println("��������");
				int id = input.nextInt();
				
				int index = -1;
				//�ж�id�Ƿ����
				for (int i = 0; i < ids.length; i++) {
					if (ids[i] == id) {
						index = i;
					}
				}
				
				if (index >= 0) {
					int newIds[] = new int[ids.length - 1];
					String newNames[] = new String[ids.length - 1];
					int newPrices[] = new int[ids.length - 1];
					for (int i = index; i < ids.length-1; i++) {
						ids[i] = ids[i + 1];
						names[i] = names[i + 1];
						prices[i] = prices[i + 1];
					}
					
					for (int i = 0; i < newIds.length; i++) {
						newIds[i] = ids[i];
						newNames[i] = names[i];
						newPrices[i] = prices[i];
					}
					
					ids = newIds;
					names = newNames;
					prices = newPrices;
					System.out.println("ɾ���ɹ�");
				} else {
					System.out.println("��Ų����ڣ�����������");
				}
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("�����������������");
			}
		}
		System.out.println("���������ллʹ��");
	}
}
