package T8_static;

public class T2_staticblock {
	int field1;
	static int field2;
	
	void method() {}
	static void method2() {}
	
	//정적 블록
	static {
		field2 = 200;
		method2();
		//field1 = 10; static 블록에는 static 만 들어와야댐.
	}
}
