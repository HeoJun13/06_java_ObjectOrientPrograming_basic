package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_필기{
	int[] arr = {87, 100, 11, 72, 92};
}


public class ClassEx03_필기 {

	public static void main(String[] args) {
		
		Ex03_필기 answer = new Ex03_필기(); 
		
		int totle = 0;
		
		for (int i = 0; i < answer.arr.length; i++) {
			totle += answer.arr[i];
			
			// 문제 1) 전체 합 출력
			// 정답 1) 362
			
		}
		System.out.println("tot : " + totle);
		
		
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		totle = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i]  % 4 == 0 ) {
				totle += answer.arr[i];
			}
		}
		System.out.println("tot : " + totle);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i] % 4 == 0) {
				cnt += 1;
			}
		}
		System.out.println("Cnt : " + cnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		cnt = 0;
		for (int i = 0; i < answer.arr.length; i++) {
			if (answer.arr[i] % 2 == 0) {
				cnt += 1;
			}
		}System.out.println("cnt : " + cnt);
		
		
		
		
		
	}
	
	
	
	
	
		
	
		


	}
