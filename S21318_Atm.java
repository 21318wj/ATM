package s231318_java04;
import java.util.Scanner;

public class S21318_Atm {
	static int bankAcount; //class ����
	int acount; 		   //instance ����

	public static void main(String[] args) {
		//���� ����
		S21318_Atm a = new S21318_Atm();
		S21318_Atm b = new S21318_Atm();
		
		do {
			Scanner scan =  new Scanner(System.in);
			
			System.out.println("\r�޴� ���� : 1.�Ա� 2��� 9.����");
			int selectMenu = scan.nextInt();	
			if(selectMenu == 9) {
				break;
			}
			if(selectMenu < 1 || selectMenu > 2) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
			
			System.out.println("\r���� ���� : ���޴� = 0 A = 1 B = 2 ���� = 9");
			int selectAcount = scan.nextInt();
			
			if(selectMenu == 9) {
				break;
			} else if(selectAcount == 0) {
				continue;
			}					
			if(selectAcount < 1 || selectAcount > 2) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		
			System.out.print("�ݾ� �Է� : ");
			int money = scan.nextInt();
			
			if(selectMenu == 1) {
				if(selectAcount == 1) {
					a.acount += money;
					a.bankAcount += money;				
				}
				if(selectAcount == 2) {
					b.acount += money;
					b.bankAcount += money;
				}
			}
			if(selectMenu == 2) {
				if(selectAcount == 1) {
					if(a.bankAcount - money <0) {
						System.out.println("�ܾ��� �����մϴ�");
						continue;
					}	
					a.acount -= money;
					a.bankAcount -= money;				
				}
				if(selectAcount == 2) {
					if(b.bankAcount - money <0) {
						System.out.println("�ܾ��� �����մϴ�");
						continue;
					}
					b.acount -= money;
					b.bankAcount -= money;
				}	
			}	
			System.out.println("A�ܾ�"+a.acount + " �ѱݾ�:"+a.bankAcount);
			System.out.println("B�ܾ�"+b.acount + " �ѱݾ�:"+b.bankAcount);
			System.out.println("�ѱݾ�:"+S21318_Atm.bankAcount);
		}while(true);
		System.out.println("�̿����ּż� �����մϴ�");
		
	}
}
