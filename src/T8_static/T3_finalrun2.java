package T8_static;

public class T3_finalrun2 {
	public static void main(String[] args) {
		T3_final2 t3_2 = new T3_final2("12351-6544444");
		System.out.println("t3_2.jumin = " + t3_2.jumin);
		t3_2.name = "김도완";
		System.out.println(t3_2.name);
		t3_2.name = "킴도완";
		System.out.println(t3_2.name);
	}
}
