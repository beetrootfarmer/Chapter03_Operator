package ch03_1_operator_expression;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++;
		++x; //11+1
		System.out.println("x= " + x); //(10+1)+1
		
		System.out.println("-------------------");
		y--;
		--y; //9-1
		System.out.println("y= " + y); //(10-1)-1
		
		System.out.println("-------------------");
		z= x++; //x=12,y=8 //대입연산이 우선-> 증감연산 x++
		System.out.printf("z= %d\n", z); //12 x값 대입
		System.out.printf("x= %d\n", x); //13 증감연산 적용
		
		System.out.println("-------------------");
		z= ++x; 
		System.out.printf("z= %d\n", z);//14
		System.out.printf("x= %d\n", x); //14
		
		System.out.println("-------------------");
		z= ++x + y++;
		System.out.printf("y= %d\n", y); // 9
		System.out.printf("z= %d\n", z); // (14+1) + 8 = 23
		System.out.printf("x= %d\n", x); // 15
		
	}

}
