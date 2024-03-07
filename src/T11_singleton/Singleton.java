package T11_singleton;

public class Singleton {
	//2.자신의 타입으로 정적 필드를 선언하고, 초기값으로 객체를 생성시킨다.
	private static Singleton singleton = new Singleton();
	//1.객체를 외부에서 생성하지 못하도록 생성자 앞에 private 접근 제한자를 붙여준다~
	private Singleton() {}
	//3.외부에서 접근할수 있도록 정적메소드를 만들어준다(getInstance())를 만들어준다.
	static Singleton getInstance() {
		return singleton;
	}
}
