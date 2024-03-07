package T10_gettersetter;

public class T2_service {

	public String setGenderCheck(int sex) {
		if(sex == 1 || sex == 3) return "남자";
		else return "여자";
	}
}
