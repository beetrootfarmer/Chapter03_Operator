package ch03_1_operator_expression;

public class CompareOperatorExample2 {
	public static void main(String[] args) throws InterruptedException {
		
		int v2 =1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 =  0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //float���� double���� ���е� ���̷� ���� ���� �ƴ�
		System.out.println((float)v4 == v5); //�ذ���1) �Ѵ� float������ ������ش�
		System.out.println((long)v4 == (long)v5); //�ذ���2) �Ѵ� ������ ������ش�
	
//		_____________________________________________
		System.out.println("___________________________________");
//		_____________________________
		
		
		int count = 10;
		while(count != 0) {
			Thread.sleep(500); //500millis : 0.5��
			System.out.println(count--);
		}
		System.out.println("fire!!!");
	}

}
