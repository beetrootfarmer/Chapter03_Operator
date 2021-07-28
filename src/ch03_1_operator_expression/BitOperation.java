package ch03_1_operator_expression;

public class BitOperation {

	public static void main(String[] args) {
		
		/************************************
		 * ��Ʈ������(|, &, ^, ~, <<, >>)
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
//��Ʈ�� &���� 1001 / (OR)||���� 1011 		
		System.out.println("10����: " + (a&b));
		System.out.println("10����: " + (a|b));
		
		System.out.println("3<<2: " + (3<<2));
		// 0011(3)�� �������� ��ĭ �Űܶ� => 1100
		// 1��Ʈ�� �������� �ű�� 2�� ���ϴ� ��
		System.out.println("11<<2: " + (11<<2));
		System.out.println("128>>5 " + (128>>5));
		System.out.println("11>>1: " + (11>>1));


		



		

	}

}
