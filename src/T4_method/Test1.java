package T4_method;

public class Test1 {
	int n1;
	double n2;
	String name = "홍길동";
	public Test1() {
		// TODO Auto-generated constructor stub
	}
	Test1(int n1)
	{
		this.n1 = n1;
	}
	void mtd1() {
		
	}
	void mtd1(int n1) {
		this.n1 = n1;
	}
	void mtd1(int n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	void mtd2() {
		System.out.println("안녕하세요~");
	}
	void mtd3() {
//		System.out.println(this.name +"님 안녕하세요~");
		System.out.println(name +"님 안녕하세요~");
	}
	void mtd3(String name) {
		System.out.println(name +"님 안녕하세요~");
	}
	void mtd4(String name) {
		System.out.println(this.name +"님 안녕하세요~");
		System.out.println(name +"님 안녕하세요~");
	}
	void mtd5(int i) {
		System.out.println(i + ".안녕하세요~");
	}
	//3의 배수가 되면 메소드 종료처리하세요
	void mtd6() {
		int i = 0;
		while(i < 5)
		{
			i++;
			System.out.println(i + ".안녕하세요~");
//			if(i % 3 ==0) break;
			if(i % 3 ==0) return;
			System.out.println("작업중");
		}
		System.out.println("작업끝");
	}
}
