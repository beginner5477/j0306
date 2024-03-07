package T4_method;

import java.util.Scanner;

public class Test2_run {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		Scanner sc = new Scanner(System.in);
		int res;
		double res1;
		System.out.print("첫번째 수를 입력하세요:");
		int su1 = sc.nextInt(); 
		System.out.print("두번째 수를 입력하세요:");
		int su2 = sc.nextInt(); 
		t2.mtd1();
		int n1 = t2.mtd2(50);
		System.out.println(n1);
		res = t2.add(su1, su2);
		System.out.println(res);
		res = t2.sub(su1, su2);
		System.out.println(res);
		res = t2.mul(su1, su2);
		System.out.println(res);
		res1 = t2.div(su1, su2);
		System.out.printf("%.1f", res1);

		sc.close();
	}
}
