package step6_02.method;

import java.util.Scanner;

class Ex05_필기{

	void test1() {
		int totle = 0;
		for (int i = 0; i < 5; i++) {
			totle++;
		}
		System.out.println("totle : " + totle);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		scan.close();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "정수 값을 입력 : ");
			arr[i] = scan.nextInt();
		}
		int Maxscore = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Maxscore > arr[i]) {
			Maxscore = arr[i];
		  }
     	}
		System.out.println("Maxscore : " + Maxscore);
		
	}
	
}


public class MethodEx05_필기 {

	public static void main(String[] args) {

	
			Ex05_필기 e = new Ex05_필기();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();

	}

}
