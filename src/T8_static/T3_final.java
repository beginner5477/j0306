package T8_static;

public class T3_final {
	final String nation = "Korea";
	String jumin;
	String name;
	
	public T3_final() {}
//	T3_final(String nation) {
//		this.nation = nation; 파이널로 한번값 넣었기 떄문에 다시수정 오류 
//	}
	T3_final(String jumin) {
		this.jumin = jumin;
	}
	public String getNation() {
		return nation;
	}
}
