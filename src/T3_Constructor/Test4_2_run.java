package T3_Constructor;

public class Test4_2_run {
	public static void main(String[] args) {
		Test4_2 t4_1 = new Test4_2("그렌져");
		System.out.println("모델명: " + t4_1.model);
		System.out.println("색상명: " + t4_1.color);
		System.out.println("최대속도: " + t4_1.speed);
		System.out.println();
		Test4_2 t4_2 = new Test4_2("제네시스", "은색");
		System.out.println("모델명: " + t4_2.model);
		System.out.println("색상명: " + t4_2.color);
		System.out.println("최대속도: " + t4_2.speed);
		System.out.println();
		Test4_2 t4_3 = new Test4_2("이쿼녹스", "파란색", 300);
		System.out.println("모델명: " + t4_3.model);
		System.out.println("색상명: " + t4_3.color);
		System.out.println("최대속도: " + t4_3.speed);
		System.out.println();
	}
}
