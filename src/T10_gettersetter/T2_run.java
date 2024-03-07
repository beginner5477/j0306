package T10_gettersetter;

import java.util.Scanner;

/*
	성명/나이/지역/성별을 입력받아서 저장출력하자
	나이는 15세이상 70세 미만인 사람만 가입가능
	주소입력시 외국인은 0으로 입력된다.
	성별은 남자는 1,3 여자는 2,4로 입력처리후 저장은 남자/여자로 저장한다.
 */
public class T2_run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T2VO vo = new T2VO();
		System.out.print("성명을 입력해주세요:");
		vo.setName(sc.next());
		System.out.print("나이을 입력해주세요:");
		vo.setAge(sc.nextInt());
		System.out.print("지역을 입력해주세요(외국인:0입력):");
		vo.setAddress(sc.next());
		T2_service t2 = new T2_service();
		System.out.print("성별을 입력하세요(남자는1,3여자는2,4입력):");
		int sex = sc.nextInt();
		vo.setStrGender(t2.setGenderCheck(sex));
		System.out.println("등록된 신상정보입니다.");
		System.out.println("성명" + vo.getName());
		System.out.println("나이" + vo.getAge());
		System.out.println("주소" + vo.getAddress());
		System.out.println("성별" + vo.getStrGender());
		
		sc.close();
	}
}
