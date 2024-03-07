package T10_gettersetter;

public class T1_run_점검요 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		System.out.println(t1.getName());
		t1.setName("김도완");
		System.out.println(t1.getName());
		t1.setAge(10);
		System.out.println(t1.getAge());
		
		//false = 여자, true = 남자
		t1.setGender(false);
		System.out.println("gender = "+t1.getSex());
	}
}
