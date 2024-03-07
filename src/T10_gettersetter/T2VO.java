package T10_gettersetter;

public class T2VO {
	private String name;
	private int age;
	private String address;
	private boolean gender;
	
	private String strGender;
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
		if(age >= 15 && age < 70) this.age = age;
		else System.out.println("가입가능 나이 범위가 아닙니다.");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.equals("0")) this.address = "외국인"; 
		else this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getStrGender() {
		return strGender;
	}
	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}
	
}
