package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// int형변수 x를 선언하고 80을 대입하세요
		// 논리연산자를 사용하여 x가 50<x<100 범위에 포함되는지 확인하세요
		// boolean result1 x<50 && x<100 둘다 만족
		
		// int형변수 y를 선언하고 5을 대입하세요
		// 논리연산자를 사용하여 y가 10보다 작거나 30보다 큰지 확인하세요
		// boolean result2 논리합 (논리연산자) 둘 중에 하나 만족할 경우
		// 디버그로 값을 하나씩 옮기고 f6눌러서 확인하기
		
		int x = 80;
		boolean result1 = (x>50) && (x<100);
		System.out.println(result1);
		
		int y = 5;
		boolean result2 = (y<10) || (y>30);
		System.out.println(result2);
		
		
		
		
		
		

	}

}
