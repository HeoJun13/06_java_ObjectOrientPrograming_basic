package step6_02.method;

import java.util.Arrays;
import java.util.Random;


/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */

class ScoreMng_1 {
	
	Random ran = new Random();
	
	int[] answer = {1, 3, 4, 2, 5};
	int[] scores = new int[5];
	
	int answerNum = 0; //정답을 맞춘 개수
	int rNum = 0; // 정답
	
	void makeAnswer() {
		for (int i = 0; i < answer.length; i++) {
			scores[i] =  ran.nextInt(5)+1;
			
		}
	}
	void showAnswer() {
		System.out.println("answer = ");
		System.out.println(Arrays.toString(answer));
		
		System.out.println("scores = ");
		System.out.println(Arrays.toString(scores));
	}
	
	void checkAnswer() {
		
		answerNum = 0;
		System.out.println("정오표= [");
		
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] == scores[i]) {
				System.out.println("0 ");
				answerNum++;
			}
			else {
				System.out.println("x ");
			}
		}
		System.out.println("] ");
		
		rNum = 20 * answerNum;
		System.out.println(" 점 수= " + rNum + "점");
		
	}
	
	void run( ) {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
}
		
		
		
		
		
		
		/*
		 * # 유용한 단축키
		 * 
		 * 1) ctrl + 메서드 호출부 클릭 > 메서드 정의부로 이동
		 * 2) 1)번 작업 이후 alt 왼쪽,오른쪽방향키로 메서드 호출부 정의부 자유롭게 이동
		 * 
		 * */
		
		

public class MethodEx13_필기 {
	public static void main(String[] args) {
		
		ScoreMng ans = new ScoreMng();
		ans.run();

	}

}
