package T4_method;

public class Test1_run {
	public static void main(String[] args) {
		Test1 t1_1 = new Test1();
		System.out.println("t1_1.n1: " + t1_1.n1);
		System.out.println("t1_1.n2: " + t1_1.n2);
		System.out.println();
		
		Test1 t1_2 = new Test1(100);
		System.out.println("t1_2.n1: " + t1_2.n1);
		System.out.println("t1_2.n2: " + t1_2.n2);
		System.out.println();
		t1_2.mtd1(500);
		t1_2.mtd1(500, 600);
		System.out.println("t1_2.n1: " + t1_2.n1);
		System.out.println("t1_2.n2: " + t1_2.n2);
		System.out.println();
		
		t1_1.mtd2();
		t1_2.mtd2();
		t1_2.mtd3();
		t1_2.mtd3("김도완");
		t1_2.mtd4("남순복");
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			t1_2.mtd5(i + 1);
		}
		System.out.println();
		t1_2.mtd6();
	}
}
