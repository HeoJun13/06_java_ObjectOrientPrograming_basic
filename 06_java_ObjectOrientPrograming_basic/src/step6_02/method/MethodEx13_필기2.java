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


class leaner {
	
	Random ran = new Random();
	
	int[] omr = {1, 3, 2, 4, 5,};
	int [] rAns = new int [5];
	
	int answerCnt = 0;
	int score = 0;
	
	void makeAnswer() {
		for (int i = 0; i < rAns.length; i++) {
			rAns[i] = ran.nextInt(5)+1;
		}
	}
	
	
	void showAnswer() {
		
		System.out.println("omr = ");
		System.out.println(Arrays.toString(omr));
		
		
		System.out.println("rAns = ");
		System.out.println(Arrays.toString(rAns));
		
	}
	
	void checkAnswer() {
		
		answerCnt = 0;
		System.out.println("정요표= [");
		
		for (int i = 0; i < answerCnt; i++) {
			if (omr[i] == rAns[i]) {
				System.out.println("O ");
				answerCnt++;
				
			}else {
				System.out.println("X ");
			}
		}
		System.out.println("]");
		
		
		score = 20 * answerCnt;
		System.out.println("점 수 :" + score + "입니다." );
	}
	
	void run() {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
		
		
	}
	
	
}


public class MethodEx13_필기2 {
	public static void main(String[] args) {
		
		ScoreMng ms = new ScoreMng();
		ms.run(); 
		
	}
}

