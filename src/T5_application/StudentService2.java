package T5_application;

public class StudentService2 {
//	void print(int no, String name, int age, boolean gender, String job) {
//		String genderOk = genderCheck(gender);
//		String ageOk;
//		if(ageCheck(age)) ageOk = "성인";
//		else ageOk = "미성년자";
//		System.out.println("번호:"+no+", 성명:"+name+", 나이:"+age+", 성별:"+genderOk+", 직업:"+job+", 성인유무:"+ageOk);
//	}
	String genderCheck(boolean gender) {
		String res ="";
		if(gender) res = "남자";
		else res = "여자";
		return res;
	}
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}
	public void print(StudentVO vo) {
		String genderOk = genderCheck(vo.isGender());
		String ageOk;
		if(ageCheck(vo.getAge())) ageOk = "성인";
		else ageOk = "미성년자";
		System.out.println("번호:"+vo.getNo()+", 성명:"+vo.getName()+", 나이:"+vo.getAge()+", 성별:"+genderOk+", 직업:"+vo.getJob()+", 성인유무:"+ageOk);
	}
}
