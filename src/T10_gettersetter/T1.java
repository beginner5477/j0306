package T10_gettersetter;

public class T1 {
	private String name = "홍길동";
	private int age;
	private boolean gender;
	private String address;
	
	private String sex;
	
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
		if(age >= 20) this.age = age;
		else System.out.println("미성년자는 가입불가능.");
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(gender) this.sex = "남자";
		else this.sex = "여자";
	}
	
}
