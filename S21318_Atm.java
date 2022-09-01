package s231318_java04;
import java.util.Scanner;

public class S21318_Atm {
	static int bankAcount; //class 변수
	int acount; 		   //instance 변수

	public static void main(String[] args) {
		//참조 변수
		S21318_Atm a = new S21318_Atm();
		S21318_Atm b = new S21318_Atm();
		
		do {
			Scanner scan =  new Scanner(System.in);
			
			System.out.println("\r메뉴 선택 : 1.입금 2출금 9.종료");
			int selectMenu = scan.nextInt();	
			if(selectMenu == 9) {
				break;
			}
			if(selectMenu < 1 || selectMenu > 2) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			System.out.println("\r계좌 선택 : 전메뉴 = 0 A = 1 B = 2 종료 = 9");
			int selectAcount = scan.nextInt();
			
			if(selectMenu == 9) {
				break;
			} else if(selectAcount == 0) {
				continue;
			}					
			if(selectAcount < 1 || selectAcount > 2) {
				System.out.println("다시 입력하세요");
				continue;
			}
		
			System.out.print("금액 입력 : ");
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
						System.out.println("잔액이 부족합니다");
						continue;
					}	
					a.acount -= money;
					a.bankAcount -= money;				
				}
				if(selectAcount == 2) {
					if(b.bankAcount - money <0) {
						System.out.println("잔액이 부족합니다");
						continue;
					}
					b.acount -= money;
					b.bankAcount -= money;
				}	
			}	
			System.out.println("A잔액"+a.acount + " 총금액:"+a.bankAcount);
			System.out.println("B잔액"+b.acount + " 총금액:"+b.bankAcount);
			System.out.println("총금액:"+S21318_Atm.bankAcount);
		}while(true);
		System.out.println("이용해주셔서 감사합니다");
		
	}
}
