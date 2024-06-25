package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		// 본인의 나이가 40세 이하라면 true를 출력하세요
		// 본인의 나이가 40세가 맞다면 true를 출력하세요
		// 본인의 나이가 40세가 아니라면 true를 출력하세요
		
		int myAge = 30;
		
		boolean result1 = (myAge <= 40);
		boolean result2 = (myAge == 40); //비교할때는 ==두개 사용해야 한다
		boolean result3 = (myAge != 40);
		
		System.out.println(result1); // true
		System.out.println(result2); // false
		System.out.println(result3); // true
		
		
		
	}

}
