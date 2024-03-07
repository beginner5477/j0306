package T4_method;

import java.util.Scanner;

//두수와 연산자를 입력하면 해당결과룰 출력하는 프로그램
public class Calculator_run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			String oper = sc.next();
			Calculator cal = new Calculator();
			cal.cal(su1, su2,oper);
			
			System.out.println("계속하시겠습니까?(Y/N)");
			String ans = sc.next();
			
			if(ans.toUpperCase().equals("N")) break;
		}
		System.out.println("프로그램 종료.");
	}
}
