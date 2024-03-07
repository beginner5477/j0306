package T4_method;

import java.util.Scanner;

public class Test2_2_run2 {
	public static void main(String[] args) {
		Test2_2 t2 = new Test2_2();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요:");
		int su1 = sc.nextInt(); 
		System.out.print("두번째 수를 입력하세요:");
		int su2 = sc.nextInt(); 
		
		t2.add(su1, su2);
		t2.sub(su1, su2);
		t2.mul(su1, su2);
		t2.div(su1, su2);

		sc.close();
	}
}
