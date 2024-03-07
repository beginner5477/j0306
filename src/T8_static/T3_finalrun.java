package T8_static;

public class T3_finalrun {
	public static void main(String[] args) {
		T3_final t3 = new T3_final();
		System.out.println("t3.nation = " + t3.nation);
		System.out.println();
		
//		t3.nation = "USA"; 파이널은 한번 입력시키면 수정불가
		
		T3_final t3_2 = new T3_final("12351-6544444");
		System.out.println("t3_2.jumin = " + t3_2.jumin);
	}
}
