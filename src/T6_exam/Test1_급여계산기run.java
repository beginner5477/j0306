package T6_exam;

import java.util.Scanner;

/*
	사원코드(no),사원명(name) 
  	직급코드(code)와 초과시간(overtime)을 입력받아서 실수령액을 계산하세요.
  	직급코드: 부장-B/b, 과장-K/k, 대리-D/d, 사원-S/s
  	초과수당(sudang)은 2만5천원
  	공제액(gongje)은 (본봉+초과급여)의 10%
  	본봉(bonbong): 부장-5백만원 과장-4백 대리-3백 사원-2백
  	실수령액 =본봉 + 초과급여 -공제액
  	계산처리부는 비지니스 로직에 처리하여라
 */
public class Test1_급여계산기run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test1_급여계산기service t1 = new Test1_급여계산기service();
		Test1_급여계산기VO vo = new Test1_급여계산기VO();
		System.out.print("사원코드를 입력하세요:");
		vo.setNo(sc.nextInt());
		System.out.print("사원명을 입력하세요:");
		vo.setName(sc.next());
		System.out.print("직급코드를 입력하세요:");
		vo.setCode(sc.next());
		System.out.print("초과시간을 입력하세요:");
		vo.setOvertime(sc.nextInt());
		vo.setBonbong(t1.bonbongCheck(vo.getCode())); //본봉구하기
		vo.setOtpayment(t1.sudangCheck(vo.getSudang(), vo.getOvertime()));//초과급여구하기
		vo.setGongje(t1.gongjeCheck(vo.getBonbong(), vo.getOtpayment()));//공제액 구하기
		vo.setSil(t1.silCheck(vo.getBonbong(),vo.getOtpayment(),vo.getGongje()));//실수령액 구하기
		t1.prt(vo.getName(), vo.getSil());
		
		sc.close();
	}
}
