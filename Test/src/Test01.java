import java.util.Scanner;

/**
 * �Ƴ�Ա������ϵͳ
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int[] types = {};				//�洢����
		String[] names = {};			//�洢����
		String[] ids = {};				//�洢����
		String[] works = {				//����ְ��
				"����༶������",
				"�����ճ���ѧ����",
				"�����������ŵĹ�����"
				};
		String[] vips = {				//VIP����
				"�����ṩ��VIP����ѧԱ��̸��ѧԺ�ҷ�",
				"�����ṩ��VIP���񣺿κ󸨵�����ҵ���",
				"û��VIP��������ṩ"
				};
		
		double prise = 0;				//���ž�����
		
		while (true) {
			//��ӭ����
			System.out.println("**********�Ƴ�Ա������ϵͳ**********");
			System.out.println("**********[1]Ա����ְ**********");
			System.out.println("**********[2]Ա���б�**********");
			System.out.println("**********[3]��ѯԱ��**********");
			System.out.println("**********[4]Ա����ְ**********"); 
			System.out.println("**********[0]�˳�ϵͳ**********");
			System.out.println("��ѡ���ܣ�");
			
			//���ݲ�ͬ�����ѡ��ͬ�Ĺ���
			String choice = input.next();
			
			if (choice.equals("1")) {		//Ա����ְ
				//ѭ������
				String select = "y";		
				boolean flag;
				do{
					flag = true;
					System.out.println("������Ա��������");
					String addName = input.next(); 
					System.out.println("Ա�����ţ�");
					String addId = input.next();
					System.out.println("ѡ��Ա�����ͣ�1 ������  2 ��Ա  3 ���ž�����");
					int addType = input.nextInt();
					//�ж��Ƿ��ظ�������ظ�����ʾ֮���������
					for (int i = 0; i < ids.length; i++) {
						//�жϹ���
						if (addId.equals(ids[i])) {
							System.out.println("�����ظ�������ϸ�˶Ժ��������룡");
							flag = false;
						}
					}
					//�ж�Ա�����������Ƿ�Ϸ�
					if (addType < 1 || addType > 3) {
						System.out.println("���棡Ա�����Ͳ���ȷ");
						flag = false;
					}
					//���벻��ȷ��������
					if(flag == false){
						continue;
					}
					//���ž���Ľ�������
					if (addType == 3) {
						System.out.println("�����뽱���");
						prise = input.nextDouble();
					}
					
					//���Ų��ظ���������ӹ���
					String[] newNames = new String[names.length + 1];
					String[] newIds = new String[ids.length + 1];
					int[] newTypes = new int[types.length + 1];
					for (int i = 0; i < ids.length; i++) {
						newNames[i] = names[i];
						newIds[i] = ids[i];
						newTypes[i] = types[i];
					}
					
					newNames[newNames.length -1] = addName;
					newIds[newIds.length - 1] = addId;
					newTypes[newTypes.length -1] = addType;
					
					//������¸�ֵ
					names = newNames;
					ids = newIds;
					types = newTypes;
					
					//�Ƿ�������
					System.out.println("���Ա����ɣ�");
					System.out.println("�Ƿ������ӣ�y��������������أ�");
					select = input.next();
				}while(select.equals("y"));
			}else if(choice.equals("2")){		//��ʾԱ���б�
				for (int i = 0; i < ids.length; i++) {
					System.out.print("ְλ��");
					//types�еĲ�ͬ���ֶ�Ӧ�Ĳ�ְͬλ��ʾ���Լ���ͬ�Ĺ���
					if (types[i] == 1) {
						System.out.println("������");
						System.out.println("Ա������Ϊ��" + ids[i] +"������Ϊ��" + names[i]);
						System.out.println(works[0] + "\n" + vips[0]);
						System.out.println();
					}else if (types[i] == 2) {
						System.out.println("��Ա");
						System.out.println("Ա������Ϊ��" + ids[i] +"������Ϊ��" + names[i]);
						System.out.println(works[1] + "\n" + vips[1]);
						System.out.println();
					}else{
						System.out.println("���ž���");
						System.out.println("Ա������Ϊ��" + ids[i] +"������Ϊ��" + names[i] + "������Ϊ��" + prise);
						System.out.println(works[2] + "\n" + vips[2]);
						System.out.println();
					}
				}
			}else if(choice.equals("3")){		//��ѯԱ��
				System.out.println("������Ҫ��ѯ��Ա��������");
				String queryName = input.next();
				boolean isFind = false;
				int index =-1;
				for (int i = 0; i < names.length; i++) {
					if (names[i].equals(queryName)||names[i].contains(queryName)) {
						isFind = true;
						index = i;
					}
				}
				if (isFind == false) {
					System.out.println("û�в��ҵ���ؽ��");
				}else{
					if (types[index] == 1) {
						
						System.out.println("������");
						System.out.println("Ա������Ϊ��" + ids[index] +"������Ϊ��" + names[index]);
						System.out.println(works[0] + "\n" + vips[0]);
					}else if (types[index] == 2) {
						System.out.println("��Ա");
						System.out.println("Ա������Ϊ��" + ids[index] +"������Ϊ��" + names[index]);
						System.out.println(works[1] + "\n" + vips[1]);
					}else{
						System.out.println("���ž���");
						System.out.println("Ա������Ϊ��" + ids[index] +"������Ϊ��" + names[index] + "������Ϊ��" + prise);
						System.out.println(works[2] + "\n" + vips[2]);
					}
				}
			}else if(choice.equals("4")){		//Ա����ְ
				
				System.out.println("��������Ҫ��ְ��Ա����ţ�");
				String delId = input.next();
				boolean isActive = false;
				//�ж�Ա������Ƿ����
				for (int i = 0; i < ids.length; i++) {
					if (ids[i].equals(delId)) {
						isActive = true;
						if (i != (ids.length - 1)) {
							ids[i]=ids[ids.length - 1];
							names[i]=names[ids.length - 1];
							types[i]=types[ids.length - 1];
						}
					}
				}
				if (isActive == true) {
					String[] newNames = new String[names.length - 1];
					String[] newIds = new String[ids.length - 1];
					int[] newTypes = new int[types.length - 1];
					
					for (int i = 0; i < newIds.length; i++) {
						newNames[i] = names[i];
						newIds[i] = ids[i];
						newTypes[i] = types[i];
					}
					//������¸�ֵ
					names = newNames;
					ids = newIds;
					types = newTypes;
					System.out.println("ɾ���ɹ���");
				}else {
					System.out.println("�����������ɾ��ʧ�ܣ�");
				}
			}else if(choice.equals("0")){		//�˳�
				break;
			}else {
				System.out.println("�Բ�����ѡ��Ĺ�����δ���ţ�");
			}
		}
		
		System.out.println("ϵͳ�˳���...");
		Thread.sleep(1500);
		System.out.println("ϵͳ�Ƴ��ɹ�,��л����ʹ�ã�");
		
	}
}
