package ch03_1_operator_expression;

public class OperatorExpression {
	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b =100;
		//byte result3 = -b; byte타입으로 부호연산을 하면 int타입으로 바뀌므로 에러발생
		int result3 = -b;
		System.out.println("result3= " + result3);
		
	}

}
