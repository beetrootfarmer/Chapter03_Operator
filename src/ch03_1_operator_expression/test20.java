package ch03_1_operator_expression;

public class test20 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = ( (num1 += 10) < 0 && (num2  += 10) > 0 );
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
//		num1 = 10 인 상태에서 AND연산이 false이기 때문에 &&뒤쪽을 읽지 않음 , 
//		그래서 num2 = 0
		
		result = ((num1 += 10) > 0 || (num2 += 10) > 0);
		System.out.printf("num1=%d, num2=%d\n", num1, num2);
//		num1 = 20 인 상태에서 OR연산이 true이기 때문에 ||뒤쪽을 읽지 않음 ,
		
//		+= 대입연산자
//		num1 += 10
//		num1 = num1 + 10

	}

}
