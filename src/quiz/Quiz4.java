package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 수학, 영어, 국어의 점수가 각각 90, 70, 100일 때 이 과목들의 총점과 평균을 구하세요
		
		int mathScore = 90;
		int engSccore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engSccore + korScore;
		System.out.println("총점:" + totalScore);
		// 총점 260 , 정수 타입
		
		double avgScore = totalScore / 3.0;
		System.out.println("평균:" + avgScore);
		// 평균 86.66666666666667 , 실수 타입 3.0을 쓰면 int 값이 doubble 값으로 변환됨
		
		
		
		
		
		

	}

}
