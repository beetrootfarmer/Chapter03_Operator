package ch03_1_operator_expression;

public class BitOperation {

	public static void main(String[] args) {
		
		/************************************
		 * 비트연산자(|, &, ^, ~, <<, >>)
		 *          or    and    xor
		 * x  y   x | y  x & y  x ^ y
		 * **********************************
		 * 1  1     1      1      0
		 * 1  0     1      0      1 
		 * 0  1     1      0      0 
		 * 0  0     0      0      0
		 * **********************************/
		
		int a =9;
		int b = 11;
		
//		String atr = "71";
//		int num = Integer.parseInt(str);
//		
//		1001 ->9
//		1011 ->11

		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
//비트를 &연산 1001 / (OR)||연산 1011 		
		System.out.println("10진수: " + (a&b));
		System.out.println("10진수: " + (a|b));
		
		System.out.println("3<<2: " + (3<<2));
		// 0011(3)을 왼쪽으로 두칸 옮겨라 => 1100
		// 1비트를 왼쪽으로 옮기면 2배 곱하는 것
		System.out.println("11<<2: " + (11<<2));
		System.out.println("128>>5 " + (128>>5));
		System.out.println("11>>1: " + (11>>1));


		



		

	}

}
