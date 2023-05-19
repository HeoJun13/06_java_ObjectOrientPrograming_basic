 package step6_02.method;

import java.util.Scanner;


/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class movieTheater{
	
	Scanner scan = new Scanner(System.in);
	
	int[]seat = new int[10];
	int bookCnt = 0;
	int money = 10;
	
	void showMenu() {
		
		
		System.out.println("===== 롯데시네아 =====");
		System.out.println("1.예매하기");
		System.out.println("2. 종료하기");
		
	  }
	
		void showSeat() {
			
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 0) {
					System.out.println(" [X] ");
				}
				else {
					System.out.println(" [O] ");
			}
		}
			System.out.println();
	}
		
	
}
	





public class MethodEx14_필기 {

	public static void main(String[] args) {

		
	}

}
