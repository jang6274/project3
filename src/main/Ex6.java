package main;

public class Ex6 {

	public static void main(String[] args) {
		
		boolean result1 = (5 > 0) && (10 > 0); //ture && ture
		boolean result2 = (5 > 0) && (10 < 0); //ture && false
		boolean result3 = 5 > 0; //ture || ture
		boolean result4 = 5 > 0; //ture || false
		boolean result5 = !(5 > 0); //!(ture)
		
		// 논리 곱(&&) 둘다 만족, 논리합(||) 둘 중에 하나라도 틀리면 해당되는 값나옴
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		
		
		
	}

}
