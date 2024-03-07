package T9_package;

import java.util.Scanner;

public class T_obj_run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T_obj_service service = new T_obj_service();
		T_objVO[] data = new T_objVO[100];
		
		int cnt = 0;
		while(true)
		{
			T_objVO vo = new T_objVO();
			System.out.print("id를 입력하세요:");
			vo.setMid(sc.next());
			System.out.print("패스워드를 입력하세요:");
			vo.setPwd(sc.next());
			System.out.print("성명을 입력하세요:");
			vo.setName(sc.next());
			System.out.print("나이를 입력하세요:");
			vo.setAge(sc.nextInt());
			vo.setAdult(service.adultCheck(vo.getAge()));
			//처리된 자료를 배열에 저장한다
			data[cnt] = vo;
			cnt++;
			
			System.out.print("계속할꺼임?(Y/N):");
			String yn = sc.next().toUpperCase();
			if(yn.equals("N")) break;
		}
		//배열에 저장된걸 출력한다
		service.memberPrint(data, cnt);
		
		sc.close();
	}
}
