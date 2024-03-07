package T5_application;

//VO Value Object
//Data Transfer Object 실무에서 같은말 엄밀히 말하면 다르긴함
//set = 저장
//get = 읽어오기 setter, getter
public class StudentVO {
	int no;
	String name;
	int age;
	String job;
	boolean gender;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
