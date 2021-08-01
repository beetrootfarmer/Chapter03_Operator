package ch03_2_operator_type;

import java.util.Scanner;

public class Him_nine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수: ");
			double dv1 =Double.parseDouble(scanner.nextLine());
					
		System.out.println("두번째 수: ");
			double dv2 = Double.parseDouble(scanner.nextLine());
	
		
		if (dv2 == 0 || dv2 == 0.0) {
			System.out.println("결과 : 무한대");
		}
		else {
			System.out.println(dv1/dv2);
		}
		
		
		
	}

}
