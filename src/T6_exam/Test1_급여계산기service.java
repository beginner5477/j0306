package T6_exam;

public class Test1_급여계산기service {
	int bonbongCheck(String code)
	{
		if((code.toUpperCase()).equals("B")) return 5000000;
		else if((code.toUpperCase()).equals("K")) return 4000000;
		else if((code.toUpperCase()).equals("D")) return 3000000;
		else if((code.toUpperCase()).equals("S")) return 2000000;
		else return 0;
	}
	int sudangCheck(int sudang, int overtime)
	{
		int res;
		res = sudang * overtime;
		return res;
	}
	int gongjeCheck(int bonbong, int otpayment)
	{
		int res;
		res = (bonbong + otpayment) / 10;
		return res;
	}
	int silCheck(int bonbong, int otpayment, int gongje)
	{
		int res;
		res = bonbong + otpayment - gongje;
		return res;
	}
	void prt(String name, int sil) {
		System.out.println(name+"님의 실수령액은 "+sil+"입니다.");
	}
}
