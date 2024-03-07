package T9_package;

public class Test_format {
	public static void main(String[] args) {
		int su = 12340000;
		double su2 = 1314400.123;
		String su3 = "1341000";
		System.out.printf("금액 : %,d\n", su);
		System.out.printf("금액 : %,10d\n", su);
		System.out.printf("금액 : %,15.2f\n", su2);
		System.out.println(String.format("%,15d", su));
		System.out.println(String.format("%,15d", Integer.parseInt(su3)));
	}
}
