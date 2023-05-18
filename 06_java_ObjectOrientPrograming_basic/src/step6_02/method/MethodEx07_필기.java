package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class Ex07 {
	
	void printEvenOrOdd(int x) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = 0;
		System.out.println("입력 :");
		int ch = scan.nextInt();
		if (ch % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
	void getAvgBetweenValues(int x, int y) {
		
		int total = 0;
		int lenght = 0;
		for (int i = x; i <= y; i++) {
			total += 1;
			lenght++;
		}
		double avg = (double)total/ lenght;
		System.out.println("average" + avg);
		
	}

	void printPrimeNums(int primeNumber) {
		
		for (int i = 2; i <= primeNumber; i++) {
			int count = 0;
			for (int j = 1; j <= 1; j++) {
				if (1 % j == 0) {
					count++;
				}
			}
			if ( count == 2) {
				System.out.print(1 + " ");
			}
			
		}
		System.out.println();
		
	}
}


public class MethodEx07_필기 {

	public static void main(String[] args) {
		
		
			Ex07 e = new Ex07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		


	}

}
