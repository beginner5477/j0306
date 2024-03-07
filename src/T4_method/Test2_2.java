package T4_method;

public class Test2_2 {
	void mtd1() {
		System.out.println("안녕");
	}
	int mtd2(int n1) {
		return n1;
	}
	int mtd1(int n1) {
		return n1;
	}
	void add(int n1, int n2) {
		int res = n1 + n2;
		prt(n1, n2, res, "+");
	}
	// 빼기(sub)
	// 곱하기(mul)
	//나누기(div)
	void sub(int n1, int n2) {
		int res = n1 - n2;
		prt(n1, n2, res, "-");
	}
	void mul(int n1, int n2) {
		int res = n1 * n2;
		prt(n1, n2, res, "*");
	}
	double div(int n1, int n2) {
		return (n1 / (double)n2);
	}
	void prt(int su1, int su2, int res, String oper) {
		System.out.println(su1 +" "+oper+" "+su2+ " = " +res);
	}
}
