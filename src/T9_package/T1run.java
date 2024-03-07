package T9_package;

public class T1run {
	public static void main(String[] args) {
		T1 t1 = new T1();
		System.out.println(t1.getNo());
		t1.setNo(10);
		t1.setName("김도완");
		System.out.println(t1.getNo());
		System.out.println(t1.getName());
		double n1 = T8_static.T1.getPi();
		System.out.println(n1);
		T7_instance.Test1 t7 = new T7_instance.Test1();
		double n2 = t7.pi;
		System.out.println(n2);
	}
}