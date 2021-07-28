package ch03_1_operator_expression;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		//사용자가 입력한 문자를 맞출 수 있다
		//사용자로부터 문자 하나를 입력받고 맞추는 코드 만들어보기
		
		int charCode ='A';
		
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		if ((charCode>=97) && (charCode<=122)) {
		System.out.println("소문자군요");
		
		if ( !(charCode<48) && !(charCode>57)) {
			{
				
		int value =6;
		
		if ( (value%2==0) | (value%3 == 0) ) {
			System.out.println("2또는 3의 배수군요");
		
		
		if  ( (value%2==0) || (value%3 == 0) ) {
			System.out.println("2또는 3의 배수군요");
		}
		
		
		
		
		
		}
		}
		
		}
	}

	}}
