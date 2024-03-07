package T5_application;

import java.util.Scanner;

public class Student_run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		String name;
		int age;
		String job;
		boolean gender;
		int choice;
		System.out.print("번호를 입력하세요:");
		no = sc.nextInt();
		System.out.print("이름을 입력하세요:");
		name = sc.next();
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		System.out.print("성별을 입력하세요(1-남자,2-여자):");
		choice = sc.nextInt();
		if(choice == 1) gender = true;
		else gender = false;
		System.out.print("직업을 입력하세요:");
		job = sc.next();
		
		StudentService service = new StudentService();
		service.print(no, name, age, gender, job);
		System.out.println("끝.");
		
		sc.close();
	}

}
